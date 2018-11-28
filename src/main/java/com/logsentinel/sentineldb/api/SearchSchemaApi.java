package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.SearchSchema;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
   * @param analyzed analyzed (optional, default to true)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addSearchSchemaField(String field, UUID id, Boolean analyzed) throws ApiException {
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

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create search schema
   * Creates a search schema. A search schema is required for indexing and searching records and users. Only fields that are part of the schema are indexed and searcheable.
   * @param datastoreId datastoreId (required)
   * @param entityType entityType (required)
   * @param fields fields (required)
   * @param recordType recordType (optional)
   * @return SearchSchema
   * @throws ApiException if fails to make API call
   */
  public SearchSchema createSearchSchema(UUID datastoreId, String entityType, Object fields, String recordType) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordType", recordType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add field to search schema
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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
