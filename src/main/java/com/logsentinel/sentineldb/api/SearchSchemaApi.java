package com.logsentinel.sentineldb.api;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;
import com.logsentinel.sentineldb.model.SchemaField;
import com.logsentinel.sentineldb.model.SearchSchema;
import com.logsentinel.sentineldb.model.SearchSchema.EntityTypeEnum;
import com.logsentinel.sentineldb.model.SearchSchemaField;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;


public class SearchSchemaApi {
  private ApiClient apiClient;

  public SearchSchemaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchSchemaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add field to search schema
   * 
   * @param field field (required)
   * @param id id (required)
   * @param analyzed analyzed (optional, default to false)
   * @param indexed indexed (optional, default to true)
   * @param visibility visibility (optional, default to PUBLIC)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addSearchSchemaField(String field, UUID id, Boolean analyzed, Boolean indexed, VisibilityLevelEnum visibility) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'field' is set
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling addSearchSchemaField");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addSearchSchemaField");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{id}/addField/{field}"
      .replaceAll("\\{" + "field" + "\\}", apiClient.escapeString(field.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "analyzed", analyzed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexed", indexed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "visibility", visibility));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create/Update visibility restrictions of schema
   * 
   * @param id id (required)
   * @param visibility visibility (required)
   * @throws ApiException if fails to make API call
   */
  public void changeVisibility(UUID id, Object visibility) throws ApiException {
    Object localVarPostBody = visibility;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling changeVisibility");
    }
    
    // verify the required parameter 'visibility' is set
    if (visibility == null) {
      throw new ApiException(400, "Missing the required parameter 'visibility' when calling changeVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{id}/visibility/change"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Clears visibility restrictions of schema
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void clearVisibilityRestrictions(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling clearVisibilityRestrictions");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{id}/visibility/clear"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create search schema
   * Creates a search schema. A search schema is required for indexing and searching records and users. Only fields that are part of the schema are indexed and searcheable.
   * @param datastoreId datastoreId (required)
   * @param entityClass entityClass (required)
   * @param entityType entityType (required)
   * @param name name (optional)
   * @param <T> the type of the entity
   * @return SearchSchema
   * @throws ApiException if fails to make API call
   */
  
  public <T> SearchSchema createSearchSchema(UUID datastoreId, Class<T> entityClass, EntityTypeEnum entityType, String name) throws ApiException {
      String recordType = entityType == EntityTypeEnum.RECORD ? entityClass.getSimpleName() : "";
      List<SearchSchemaField> schemaFields = getSearchSchemaFields(entityClass);
      return createSearchSchema(datastoreId, entityType, schemaFields, recordType, name);
  }

  /**
   * Create search schema
   * Creates a search schema. A search schema is required for indexing and searching records and users. Only fields that are part of the schema are indexed and searcheable.
   * @param datastoreId datastoreId (required)
   * @param entityType entityType (required)
   * @param fields fields (required)
   * @param recordType recordType (optional)
   * @param name name (optional)
   * @return SearchSchema
   * @throws ApiException if fails to make API call
   */
  public SearchSchema createSearchSchema(UUID datastoreId, EntityTypeEnum entityType, List<SearchSchemaField> fields, String recordType, String name) throws ApiException {
    Object localVarPostBody = fields;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling createSearchSchema");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling createSearchSchema");
    }
    
    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(400, "Missing the required parameter 'fields' when calling createSearchSchema");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{datastoreId}/{entityType}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()))
      .replaceAll("\\{" + "entityType" + "\\}", apiClient.escapeString(entityType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordType", recordType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<SearchSchema> localVarReturnType = new GenericType<SearchSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete search schema
   * 
   * @param id id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteSearchSchema(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSearchSchema");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get search schema
   * 
   * @param entityType entityType (required)
   * @param recordType recordType (required)
   * @return SearchSchema
   * @throws ApiException if fails to make API call
   */
  public SearchSchema findSearchSchema(EntityTypeEnum entityType, String recordType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling findSearchSchema");
    }
    
    // verify the required parameter 'recordType' is set
    if (recordType == null) {
      throw new ApiException(400, "Missing the required parameter 'recordType' when calling findSearchSchema");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/find";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordType", recordType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<SearchSchema> localVarReturnType = new GenericType<SearchSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  
  /**
   * Get search schema
   * 
   * @param id id (required)
   * @return SearchSchema
   * @throws ApiException if fails to make API call
   */
  public SearchSchema getSearchSchema(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSearchSchema");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<SearchSchema> localVarReturnType = new GenericType<SearchSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove field from search schema
   * 
   * @param field field (required)
   * @param id id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object removeSearchSchemaField(String field, UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'field' is set
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling removeSearchSchemaField");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSearchSchemaField");
    }
    
    // create path and map variables
    String localVarPath = "/api/search-schema/{id}/removeField/{field}"
      .replaceAll("\\{" + "field" + "\\}", apiClient.escapeString(field.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public <T> void updateSearchSchema(UUID datastoreId, Class<T> entityClass, EntityTypeEnum entityType) {
      String recordType = entityType == EntityTypeEnum.RECORD ? entityClass.getSimpleName() : "";
      SearchSchema existingSchema = findSearchSchema(entityType, recordType);
      if (existingSchema == null) {
          createSearchSchema(datastoreId, entityClass, entityType, null);
      } else {
          List<SearchSchemaField> newSchemaFields = getSearchSchemaFields(entityClass);
          List<SearchSchemaField> existingFields = existingSchema.getFields();
          
          Map<String, SearchSchemaField> newFieldsByName = newSchemaFields.stream()
                  .collect(Collectors.toMap(SearchSchemaField::getName, Function.identity()));
          
          Map<String, SearchSchemaField> existingFieldsByName = existingFields.stream()
                  .collect(Collectors.toMap(SearchSchemaField::getName, Function.identity()));
          
          Set<String> toAdd = new HashSet<>(newFieldsByName.keySet());
          toAdd.removeAll(existingFieldsByName.keySet());
          
          Set<String> toRemove = new HashSet<>(existingFieldsByName.keySet());
          toRemove.removeAll(newFieldsByName.keySet());
          
          for (String fieldName : toAdd) {
              SearchSchemaField field = newFieldsByName.get(fieldName);
              addSearchSchemaField(fieldName, existingSchema.getId(), 
                      field.isAnalyzed(), field.isIndexed(), field.getVisibilityLevel());
          }
          
          for (String fieldName : toRemove) {
              removeSearchSchemaField(fieldName, existingSchema.getId());
          }
      }
            
  }
  
  private static List<Field> getAllFieldsList(Class<?> cls) {
      List<Field> allFields = new ArrayList<>();

      for(Class<?> currentClass = cls; currentClass != null; currentClass = currentClass.getSuperclass()) {
          Field[] declaredFields = currentClass.getDeclaredFields();
          Collections.addAll(allFields, declaredFields);
      }

      return allFields;
  }
  
  private <T> List<SearchSchemaField> getSearchSchemaFields(Class<T> entityClass) {
      List<SearchSchemaField> schemaFields = new ArrayList<>();
        List<Field> fields = getAllFieldsList(entityClass);
        for (Field field : fields) {
            SchemaField annotation = field.getAnnotation(SchemaField.class);
            SearchSchemaField schemaField = new SearchSchemaField();
            schemaField.setName(field.getName());
            if (annotation != null) {
                schemaField.setIndexed(annotation.indexed());
                schemaField.setAnalyzed(annotation.analyzed());
                schemaField.setVisibilityLevel(annotation.visibility());
            } else {
                schemaField.setIndexed(false);
                schemaField.setVisibilityLevel(VisibilityLevelEnum.PUBLIC);
            }
            schemaFields.add(schemaField);
        }
      return schemaFields;
  }
}
