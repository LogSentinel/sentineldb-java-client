package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import com.logsentinel.sentineldb.model.BatchRequestItem;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchApi {
  private ApiClient apiClient;

  public BatchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BatchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes a batch of entities. If an error occurs, all operations are rolled back
   * 
   * @param batchRequestItems batchRequestItems (required)
   * @param datastoreId datastoreId (required)
   * @throws ApiException if fails to make API call
   */
  public void batchDelete(List<BatchRequestItem> batchRequestItems, UUID datastoreId) throws ApiException {
    Object localVarPostBody = batchRequestItems;
    
    // verify the required parameter 'batchRequestItems' is set
    if (batchRequestItems == null) {
      throw new ApiException(400, "Missing the required parameter 'batchRequestItems' when calling batchDelete");
    }
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling batchDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/batch/delete/{datastoreId}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Inserts a batch of entities. If an error occurs, all operations are rolled back
   * 
   * @param batchRequestItems batchRequestItems (required)
   * @param datastoreId datastoreId (required)
   * @throws ApiException if fails to make API call
   */
  public void batchInsert(List<BatchRequestItem> batchRequestItems, UUID datastoreId) throws ApiException {
    Object localVarPostBody = batchRequestItems;
    
    // verify the required parameter 'batchRequestItems' is set
    if (batchRequestItems == null) {
      throw new ApiException(400, "Missing the required parameter 'batchRequestItems' when calling batchInsert");
    }
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling batchInsert");
    }
    
    // create path and map variables
    String localVarPath = "/api/batch/insert/{datastoreId}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
