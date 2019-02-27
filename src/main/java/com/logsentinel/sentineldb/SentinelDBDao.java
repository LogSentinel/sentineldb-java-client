package com.logsentinel.sentineldb;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.logsentinel.sentineldb.model.OAuthToken;
import com.logsentinel.sentineldb.model.UserRequest;
import com.logsentinel.sentineldb.model.generic.Record;
import com.logsentinel.sentineldb.model.generic.User;

/**
 * Convenient method that takes an uses annotated POJOs to interact with SentinelDB (similar to ORMs)
 */
public class SentinelDBDao {
    
    private static final int NOT_FOUND_STATUS = 404;

    private SentinelDBClient client;
    
    private ObjectMapper mapper = new ObjectMapper();
    
    public SentinelDBDao(SentinelDBClient client) {
        this.client = client;
    }
    
    public <T> Optional<User<T>> getUser(UUID id, Class<T> attributesType, String actorId) {
        try {
            com.logsentinel.sentineldb.model.User user = client.getUserActions().getUser(id, actorId, null);
            User<T> result = toGenericUser(attributesType, user);
            return Optional.of(result);
        } catch (ApiException ex) {
            if (ex.getCode() == NOT_FOUND_STATUS) {
                return Optional.empty();
            } else {
                throw ex;
            }
        }
    }

    public <T> Optional<Record<T>> getRecord(UUID id, Class<T> bodyType, String actorId) {
        try {
            com.logsentinel.sentineldb.model.Record record = client.getRecordActions().getRecord(id, actorId, null);
            Record<T> result = toGenericRecord(bodyType, record);
            return Optional.of(result);
        } catch (ApiException ex) {
            if (ex.getCode() == NOT_FOUND_STATUS) {
                return Optional.empty();
            } else {
                throw ex;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public <T> User<T> createUser(UserRequest user, T attributes, UUID datastoreId, String actorId) {
        try {
            user.setAttributes(mapper.writeValueAsString(attributes));
            com.logsentinel.sentineldb.model.User result = client.getUserActions().createUser(datastoreId, user, actorId);
            return toGenericUser((Class<T>) attributes.getClass(), result);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot serialize attributes to JSON", e);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T> Record<T> createRecord(T body, String type, UUID ownerId, UUID datastoreId, String actorId) {
        try {
            String jsonBody = mapper.writeValueAsString(body);
            com.logsentinel.sentineldb.model.Record record = client.getRecordActions().createRecord(jsonBody, datastoreId, actorId, ownerId, type);
            return toGenericRecord((Class<T>) body.getClass(), record);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot serialize body to JSON", e);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T> User<T> updateUser(UUID userId, UserRequest user, T attributes, String actorId) {
        try {
            user.setAttributes(mapper.writeValueAsString(attributes));
            com.logsentinel.sentineldb.model.User result = client.getUserActions().updateUser(user, userId, actorId);
            return toGenericUser((Class<T>) attributes.getClass(), result);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot serialize attributes to JSON", e);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T> Record<T> updateRecord(Record<T> record, String actorId) {
        com.logsentinel.sentineldb.model.Record result = 
                client.getRecordActions().updateRecord(toPlainRecord(record), record.getId(), actorId);
        return toGenericRecord((Class<T>) record.getBody().getClass(), result);
    }
    
    public <T> User<T> login(String username, String password, UUID datastoreId, Class<T> attributesClass) {
        OAuthToken token = client.getOAuthActions().getOAuthToken(username, password, datastoreId, 0, "password", null);
        return toGenericUser(attributesClass, SentinelDBClientBuilder
                .createWithToken(token.getAccessToken())
                .setBasePath(client.getOAuthActions().getApiClient().getBasePath())
                .build().getOAuthActions().getUserDetails());
    }
    
    public <T> List<User<T>> searchUsers(Map<String, String> request, UUID datastoreId, Class<T> attributesClass) {
        List<com.logsentinel.sentineldb.model.User> users = client.getSearchActions().searchUsers(datastoreId, request, null, null, null, null, null, null);
        return users.stream()
                .map(u -> toGenericUser(attributesClass, u))
                .collect(Collectors.toList());
    }
    
    private <T> User<T> toGenericUser(Class<T> attributesType, com.logsentinel.sentineldb.model.User user) {
        User<T> result = new User<T>();
        try {
            T attributes = mapper.readValue(user.getAttributes(), attributesType);
            result.setAttributes(attributes);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot serialize attributes from JSON", e);
        }
        
        result.setCreated(user.getCreated());
        result.setDatastoreId(user.getDatastoreId());
        result.setEmail(user.getEmail());
        result.setStatus(user.getStatus());
        result.setId(user.getId());
        result.setPassword(user.getPassword());
        result.setPseudoId(user.getPseudoId());
        result.setRoles(user.getRoles());
        result.setTwoFactorAuthEnabled(user.isTwoFactorAuthEnabled());
        result.setUpdated(user.getUpdated());
        result.setUsername(user.getUsername());
        result.setVersion(user.getVersion());
        return result;
    }
    
    private <T> Record<T> toGenericRecord(Class<T> bodyType, com.logsentinel.sentineldb.model.Record record) {
        Record<T> result = new Record<T>();
        try {
            T body = mapper.readValue(record.getBody(), bodyType);
            result.setBody(body);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot deserialize record from JSON", e);
        }
        
        result.setCreated(record.getCreated());
        result.setDatastoreId(record.getDatastoreId());
        result.setId(record.getId());
        result.setOwnerId(record.getOwnerId());
        result.setPseudoId(record.getPseudoId());
        result.setPseudoOwnerId(record.getPseudoOwnerId());
        result.setType(record.getType());
        result.setUpdated(record.getUpdated());
        result.setVersion(record.getVersion());
        return result;
    }
    

    private <T> com.logsentinel.sentineldb.model.Record toPlainRecord(Record<T> record) {
        com.logsentinel.sentineldb.model.Record result = new com.logsentinel.sentineldb.model.Record();
        try {
            String body = mapper.writeValueAsString(record.getBody());
            result.setBody(body);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot serialize record to JSON", e);
        }
        result.setCreated(record.getCreated());
        result.setDatastoreId(record.getDatastoreId());
        result.setId(record.getId());
        result.setOwnerId(record.getOwnerId());
        result.setPseudoId(record.getPseudoId());
        result.setPseudoOwnerId(record.getPseudoOwnerId());
        result.setType(record.getType());
        result.setUpdated(record.getUpdated());
        result.setVersion(record.getVersion());
        return result;
    }
}
