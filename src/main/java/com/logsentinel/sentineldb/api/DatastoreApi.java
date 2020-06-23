package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.Datastore;
import com.logsentinel.sentineldb.model.Record;
import java.util.UUID;
import com.logsentinel.sentineldb.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DatastoreApi {
  private ApiClient apiClient;

  public DatastoreApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DatastoreApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * addOrUpdateSchema
   * 
   * @param datastoreId datastoreId (required)
   * @param schema schema (required)
   * @param type type (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrUpdateSchema(UUID datastoreId, String schema, String type) throws ApiException {

    addOrUpdateSchemaWithHttpInfo(datastoreId, schema, type);
  }

  /**
   * addOrUpdateSchema
   * 
   * @param datastoreId datastoreId (required)
   * @param schema schema (required)
   * @param type type (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addOrUpdateSchemaWithHttpInfo(UUID datastoreId, String schema, String type) throws ApiException {
    Object localVarPostBody = schema;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling addOrUpdateSchema");
    }
    
    // verify the required parameter 'schema' is set
    if (schema == null) {
      throw new ApiException(400, "Missing the required parameter 'schema' when calling addOrUpdateSchema");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling addOrUpdateSchema");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/{datastoreId}/schema/{type}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create datastore
   * 
   * @param name name (required)
   * @return Datastore
   * @throws ApiException if fails to make API call
   */
  public Datastore createDatastore(String name) throws ApiException {
    return createDatastoreWithHttpInfo(name).getData();
      }

  /**
   * Create datastore
   * 
   * @param name name (required)
   * @return ApiResponse&lt;Datastore&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Datastore> createDatastoreWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createDatastore");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Datastore> localVarReturnType = new GenericType<Datastore>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * deleteSchema
   * 
   * @param datastoreId datastoreId (required)
   * @param type type (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSchema(UUID datastoreId, String type) throws ApiException {

    deleteSchemaWithHttpInfo(datastoreId, type);
  }

  /**
   * deleteSchema
   * 
   * @param datastoreId datastoreId (required)
   * @param type type (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteSchemaWithHttpInfo(UUID datastoreId, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling deleteSchema");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling deleteSchema");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/{datastoreId}/schema/{type}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Gets a list of users or records by list of ids
   * 
   * @param datastoreId datastoreId (required)
   * @param ids ids (required)
   * @param type type (required)
   * @return List&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Object> entitiesByIds(UUID datastoreId, List<UUID> ids, String type) throws ApiException {
    return entitiesByIdsWithHttpInfo(datastoreId, ids, type).getData();
      }

  /**
   * Gets a list of users or records by list of ids
   * 
   * @param datastoreId datastoreId (required)
   * @param ids ids (required)
   * @param type type (required)
   * @return ApiResponse&lt;List&lt;Object&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Object>> entitiesByIdsWithHttpInfo(UUID datastoreId, List<UUID> ids, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling entitiesByIds");
    }
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling entitiesByIds");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling entitiesByIds");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/{datastoreId}/entities/{type}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<List<Object>> localVarReturnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get datastore
   * 
   * @param id id (required)
   * @return Datastore
   * @throws ApiException if fails to make API call
   */
  public Datastore getDatastore(UUID id) throws ApiException {
    return getDatastoreWithHttpInfo(id).getData();
      }

  /**
   * Get datastore
   * 
   * @param id id (required)
   * @return ApiResponse&lt;Datastore&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Datastore> getDatastoreWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDatastore");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/{id}"
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

    GenericType<Datastore> localVarReturnType = new GenericType<Datastore>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets records by datastore with pagination
   * 
   * @param datastoreId datastoreId (required)
   * @param actor actor (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @return List&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Record> getRecordsByDatastore(UUID datastoreId, String actor, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId) throws ApiException {
    return getRecordsByDatastoreWithHttpInfo(datastoreId, actor, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId).getData();
      }

  /**
   * Gets records by datastore with pagination
   * 
   * @param datastoreId datastoreId (required)
   * @param actor actor (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @return ApiResponse&lt;List&lt;Record&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Record>> getRecordsByDatastoreWithHttpInfo(UUID datastoreId, String actor, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling getRecordsByDatastore");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/{datastoreId}/records"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actor", actor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "fieldsToAnonymize", fieldsToAnonymize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pseudonymizationKeyId", pseudonymizationKeyId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<List<Record>> localVarReturnType = new GenericType<List<Record>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets users by datastore with pagination
   * 
   * @param datastoreId datastoreId (required)
   * @param actor actor (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> getUsersByDatastore(UUID datastoreId, String actor, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId) throws ApiException {
    return getUsersByDatastoreWithHttpInfo(datastoreId, actor, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId).getData();
      }

  /**
   * Gets users by datastore with pagination
   * 
   * @param datastoreId datastoreId (required)
   * @param actor actor (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @return ApiResponse&lt;List&lt;User&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<User>> getUsersByDatastoreWithHttpInfo(UUID datastoreId, String actor, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling getUsersByDatastore");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/{datastoreId}/users"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actor", actor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "fieldsToAnonymize", fieldsToAnonymize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pseudonymizationKeyId", pseudonymizationKeyId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of datastores
   * 
   * @return List&lt;Datastore&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Datastore> listDatastores() throws ApiException {
    return listDatastoresWithHttpInfo().getData();
      }

  /**
   * Gets a list of datastores
   * 
   * @return ApiResponse&lt;List&lt;Datastore&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Datastore>> listDatastoresWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/datastore/list";

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

    GenericType<List<Datastore>> localVarReturnType = new GenericType<List<Datastore>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update datastore
   * 
   * @param datastore datastore (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateDatastore(Datastore datastore) throws ApiException {
    return updateDatastoreWithHttpInfo(datastore).getData();
      }

  /**
   * Update datastore
   * 
   * @param datastore datastore (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateDatastoreWithHttpInfo(Datastore datastore) throws ApiException {
    Object localVarPostBody = datastore;
    
    // verify the required parameter 'datastore' is set
    if (datastore == null) {
      throw new ApiException(400, "Missing the required parameter 'datastore' when calling updateDatastore");
    }
    
    // create path and map variables
    String localVarPath = "/api/datastore/update";

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
