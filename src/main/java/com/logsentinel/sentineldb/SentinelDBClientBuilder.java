package com.logsentinel.sentineldb;

import com.logsentinel.sentineldb.api.*;

/**
 * Builder used to create an instance of the LogSentinel client.
 */
public class SentinelDBClientBuilder {

    private String organizationId;
    private String secret;

    private String basePath;
    private String contentType;

    private String token;
    
    public static SentinelDBClientBuilder createWithToken(String token) {
        return new SentinelDBClientBuilder().setToken(token);
    }
    
    public static SentinelDBClientBuilder create(String organizationId, String secret) {
        SentinelDBClientBuilder builder = new SentinelDBClientBuilder();
        return builder.setOrganizationId(organizationId).setSecret(secret);
    }

    public SentinelDBClient build() {
        ApiClient apiClient = new ApiClient(false);
        if (basePath != null) {
            apiClient.setBasePath(basePath);
        }
        if (organizationId != null && secret != null) {
            apiClient.setUsername(organizationId.trim());
            apiClient.setPassword(secret.trim());
        } else if (token != null){
            apiClient.setAccessToken(token);
        }

        if (contentType == null) {
            contentType = "application/json;charsets=UTF-8";
        }

        DatastoreApi datastoreApi = new DatastoreApi(apiClient);
        RecordsApi recordApi = new RecordsApi(apiClient);
        UsersApi userApi = new UsersApi(apiClient);
        SearchApi searchApi = new SearchApi(apiClient);
        SearchSchemaApi schemaApi = new SearchSchemaApi(apiClient);
        OAuthApi oAuthApi = new OAuthApi(apiClient);
        BatchApi batchApi = new BatchApi(apiClient);
        
        SentinelDBClient client = new SentinelDBClient(datastoreApi, recordApi, userApi, searchApi, schemaApi, oAuthApi, batchApi);
        return client;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public SentinelDBClientBuilder setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public SentinelDBClientBuilder setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getBasePath() {
        return basePath;
    }

    /**
     * Sets a custom base path for the API, other than logsentinel.com. Should
     * be used when running a local/hosted instance rather than using the cloud
     * one
     *
     * @param basePath the root url of the logsentinel installation
     * @return the builder
     */
    public SentinelDBClientBuilder setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * Sets the content type for sending requests
     *
     * @param contentType the value for the Content-Type header
     * @return the builder
     */
    public SentinelDBClientBuilder setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getToken() {
        return token;
    }

    public SentinelDBClientBuilder setToken(String token) {
        this.token = token;
        return this;
    }
}
