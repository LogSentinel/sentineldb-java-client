package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.PseudonymizationKey;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PseudonymizationApi {
  private ApiClient apiClient;

  public PseudonymizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PseudonymizationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a pseudonymization key
   * 
   * @param datastoreId datastoreId (required)
   * @param description description (required)
   * @return PseudonymizationKey
   * @throws ApiException if fails to make API call
   */
  public PseudonymizationKey create(UUID datastoreId, String description) throws ApiException {
    return createWithHttpInfo(datastoreId, description).getData();
      }

  /**
   * Creates a pseudonymization key
   * 
   * @param datastoreId datastoreId (required)
   * @param description description (required)
   * @return ApiResponse&lt;PseudonymizationKey&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PseudonymizationKey> createWithHttpInfo(UUID datastoreId, String description) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling create");
    }
    
    // verify the required parameter 'description' is set
    if (description == null) {
      throw new ApiException(400, "Missing the required parameter 'description' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/api/pseudonymization/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<PseudonymizationKey> localVarReturnType = new GenericType<PseudonymizationKey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a pseudonymization key
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(UUID id) throws ApiException {

    deleteWithHttpInfo(id);
  }

  /**
   * Deletes a pseudonymization key
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling delete1");
    }
    
    // create path and map variables
    String localVarPath = "/api/pseudonymization/{id}"
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
   * Gets a pseudonymization key by id
   * 
   * @param id id (required)
   * @return PseudonymizationKey
   * @throws ApiException if fails to make API call
   */
  public PseudonymizationKey get(UUID id) throws ApiException {
    return getWithHttpInfo(id).getData();
      }

  /**
   * Gets a pseudonymization key by id
   * 
   * @param id id (required)
   * @return ApiResponse&lt;PseudonymizationKey&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PseudonymizationKey> getWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/api/pseudonymization/{id}"
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

    GenericType<PseudonymizationKey> localVarReturnType = new GenericType<PseudonymizationKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a pseudonymization keys by datastoreId
   * 
   * @param datastoreId datastoreId (required)
   * @return List&lt;PseudonymizationKey&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PseudonymizationKey> listist(UUID datastoreId) throws ApiException {
    return lististWithHttpInfo(datastoreId).getData();
      }

  /**
   * Gets a pseudonymization keys by datastoreId
   * 
   * @param datastoreId datastoreId (required)
   * @return ApiResponse&lt;List&lt;PseudonymizationKey&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<PseudonymizationKey>> lististWithHttpInfo(UUID datastoreId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling listist");
    }
    
    // create path and map variables
    String localVarPath = "/api/pseudonymization/list/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

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

    GenericType<List<PseudonymizationKey>> localVarReturnType = new GenericType<List<PseudonymizationKey>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
