package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.Record;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;

import java.util.UUID;
import com.logsentinel.sentineldb.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Count records
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param type type (required)
   * @param end end (optional)
   * @param ownerId ownerId (optional)
   * @param start start (optional, default to 0)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long countRecords(UUID datastoreId, Object request, String type, Long end, UUID ownerId, Long start) throws ApiException {
    return countRecordsWithHttpInfo(datastoreId, request, type, end, ownerId, start).getData();
      }

  /**
   * Count records
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param type type (required)
   * @param end end (optional)
   * @param ownerId ownerId (optional)
   * @param start start (optional, default to 0)
   * @return ApiResponse&lt;Long&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Long> countRecordsWithHttpInfo(UUID datastoreId, Object request, String type, Long end, UUID ownerId, Long start) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling countRecords");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling countRecords");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling countRecords");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/records/{type}/datastore/{datastoreId}/count"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerId", ownerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Count users
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param end end (optional)
   * @param start start (optional, default to 0)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long countUsers(UUID datastoreId, Object request, Long end, Long start) throws ApiException {
    return countUsersWithHttpInfo(datastoreId, request, end, start).getData();
      }

  /**
   * Count users
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param end end (optional)
   * @param start start (optional, default to 0)
   * @return ApiResponse&lt;Long&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Long> countUsersWithHttpInfo(UUID datastoreId, Object request, Long end, Long start) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling countUsers");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling countUsers");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/users/datastore/{datastoreId}/count"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search records
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param type type (required)
   * @param end end (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param ownerId ownerId (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param start start (optional, default to 0)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return List&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Record> searchRecords(UUID datastoreId, Map<String, String> request, String type, UUID ownerId, Long start, Long end, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    return searchRecordsWithHttpInfo(datastoreId, request, type, end, fieldsToAnonymize, ownerId, pageNumber, pageSize, pseudonymizationKeyId, start, visibilityLevel).getData();
      }

  /**
   * Search records
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param type type (required)
   * @param end end (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param ownerId ownerId (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param start start (optional, default to 0)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return ApiResponse&lt;List&lt;Record&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Record>> searchRecordsWithHttpInfo(UUID datastoreId, Map<String, String> request, String type, Long end, List<String> fieldsToAnonymize, UUID ownerId, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId, Long start, VisibilityLevelEnum visibilityLevel) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling searchRecords");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling searchRecords");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchRecords");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/records/{type}/datastore/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "fieldsToAnonymize", fieldsToAnonymize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerId", ownerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pseudonymizationKeyId", pseudonymizationKeyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "visibilityLevel", visibilityLevel));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<List<Record>> localVarReturnType = new GenericType<List<Record>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search users
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param start start (optional, default to 0)
   * @param end end (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param basicDataOnly Indicates whether only the basic data (ID, username and last update date) should be included in the response. (optional, default to false)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> searchUsers(UUID datastoreId, Map<String, String> request, Long start, Long end, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId, Boolean basicDataOnly, VisibilityLevelEnum visibilityLevel) throws ApiException {
    return searchUsersWithHttpInfo(datastoreId, request, basicDataOnly, end, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId, start, visibilityLevel).getData();
      }

  /**
   * Search users
   * 
   * @param datastoreId datastoreId (required)
   * @param request request (required)
   * @param basicDataOnly Indicates whether only the basic data (ID, username and last update date) should be included in the response. (optional, default to false)
   * @param end end (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pageNumber pageNumber (optional, default to 0)
   * @param pageSize pageSize (optional, default to 20)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param start start (optional, default to 0)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return ApiResponse&lt;List&lt;User&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<User>> searchUsersWithHttpInfo(UUID datastoreId, Map<String, String> request, Boolean basicDataOnly, Long end, List<String> fieldsToAnonymize, Integer pageNumber, Integer pageSize, UUID pseudonymizationKeyId, Long start, VisibilityLevelEnum visibilityLevel) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling searchUsers");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling searchUsers");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/users/datastore/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "basicDataOnly", basicDataOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "fieldsToAnonymize", fieldsToAnonymize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pseudonymizationKeyId", pseudonymizationKeyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "visibilityLevel", visibilityLevel));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
