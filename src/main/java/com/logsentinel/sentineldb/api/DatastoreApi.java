package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
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

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * deleteSchema
   * 
   * @param datastoreId datastoreId (required)
   * @param type type (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSchema(UUID datastoreId, String type) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Gets a list of datastores
   * 
   * @param datastoreId datastoreId (required)
   * @param ids ids (required)
   * @param type type (required)
   * @return List&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Object> entitiesByIds(UUID datastoreId, List<UUID> ids, String type) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<Object>> localVarReturnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets records by datastore with pagination
   * 
   * @param datastoreId datastoreId (required)
   * @param actor actor (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @return List&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Record> getRecordsByDatastore(UUID datastoreId, String actor, Integer pageNumber, Integer pageSize) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<Record>> localVarReturnType = new GenericType<List<Record>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets users by datastore with pagination
   * 
   * @param datastoreId datastoreId (required)
   * @param actor actor (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> getUsersByDatastore(UUID datastoreId, String actor, Integer pageNumber, Integer pageSize) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<Datastore>> localVarReturnType = new GenericType<List<Datastore>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
