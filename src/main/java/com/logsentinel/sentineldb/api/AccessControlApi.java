package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.AccessControl;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AccessControlApi {
  private ApiClient apiClient;

  public AccessControlApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccessControlApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates access control rule
   * 
   * @param action action (required)
   * @param datastoreId datastoreId (required)
   * @param type type (required)
   * @param recordIds recordIds (optional)
   * @param recordType recordType (optional)
   * @param roles roles (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID create(String action, UUID datastoreId, String type, List<UUID> recordIds, String recordType, List<String> roles) throws ApiException {
    return createWithHttpInfo(action, datastoreId, type, recordIds, recordType, roles).getData();
      }

  /**
   * Creates access control rule
   * 
   * @param action action (required)
   * @param datastoreId datastoreId (required)
   * @param type type (required)
   * @param recordIds recordIds (optional)
   * @param recordType recordType (optional)
   * @param roles roles (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UUID> createWithHttpInfo(String action, UUID datastoreId, String type, List<UUID> recordIds, String recordType, List<String> roles) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling create");
    }
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling create");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/api/accessControl";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "action", action));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "recordIds", recordIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordType", recordType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "roles", roles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes access control rule
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(UUID id) throws ApiException {

    deleteWithHttpInfo(id);
  }

  /**
   * Deletes access control rule
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/api/accessControl/{id}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Lists access control rules of organization or filtered by datastore
   * 
   * @param datastoreId datastoreId (optional)
   * @return List&lt;AccessControl&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AccessControl> list(UUID datastoreId) throws ApiException {
    return listWithHttpInfo(datastoreId).getData();
      }

  /**
   * Lists access control rules of organization or filtered by datastore
   * 
   * @param datastoreId datastoreId (optional)
   * @return ApiResponse&lt;List&lt;AccessControl&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AccessControl>> listWithHttpInfo(UUID datastoreId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/accessControl";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<List<AccessControl>> localVarReturnType = new GenericType<List<AccessControl>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
