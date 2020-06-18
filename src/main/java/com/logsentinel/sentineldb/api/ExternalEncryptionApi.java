package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.ExternalEncryptionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExternalEncryptionApi {
  private ApiClient apiClient;

  public ExternalEncryptionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalEncryptionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
   * 
   * @param ciphertext ciphertext (required)
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @param id  (optional)
   * @param organizationId  (optional)
   * @param secret  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String decryptData(String ciphertext, UUID datastoreId, String entityId, String entityType, UUID id, UUID organizationId, String secret) throws ApiException {
    return decryptDataWithHttpInfo(ciphertext, datastoreId, entityId, entityType, id, organizationId, secret).getData();
      }

  /**
   * Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
   * 
   * @param ciphertext ciphertext (required)
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @param id  (optional)
   * @param organizationId  (optional)
   * @param secret  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> decryptDataWithHttpInfo(String ciphertext, UUID datastoreId, String entityId, String entityType, UUID id, UUID organizationId, String secret) throws ApiException {
    Object localVarPostBody = ciphertext;
    
    // verify the required parameter 'ciphertext' is set
    if (ciphertext == null) {
      throw new ApiException(400, "Missing the required parameter 'ciphertext' when calling decryptData");
    }
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling decryptData");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling decryptData");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling decryptData");
    }
    
    // create path and map variables
    String localVarPath = "/api/encryption/decrypt";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secret", secret));

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Encrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @param fieldName fieldName (required)
   * @param payload payload (required)
   * @param id  (optional)
   * @param organizationId  (optional)
   * @param secret  (optional)
   * @return ExternalEncryptionResult
   * @throws ApiException if fails to make API call
   */
  public ExternalEncryptionResult encryptData(UUID datastoreId, String entityId, String entityType, String fieldName, String payload, UUID id, UUID organizationId, String secret) throws ApiException {
    return encryptDataWithHttpInfo(datastoreId, entityId, entityType, fieldName, payload, id, organizationId, secret).getData();
      }

  /**
   * Encrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @param fieldName fieldName (required)
   * @param payload payload (required)
   * @param id  (optional)
   * @param organizationId  (optional)
   * @param secret  (optional)
   * @return ApiResponse&lt;ExternalEncryptionResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalEncryptionResult> encryptDataWithHttpInfo(UUID datastoreId, String entityId, String entityType, String fieldName, String payload, UUID id, UUID organizationId, String secret) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling encryptData");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling encryptData");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling encryptData");
    }
    
    // verify the required parameter 'fieldName' is set
    if (fieldName == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldName' when calling encryptData");
    }
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling encryptData");
    }
    
    // create path and map variables
    String localVarPath = "/api/encryption/encrypt";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldName", fieldName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secret", secret));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<ExternalEncryptionResult> localVarReturnType = new GenericType<ExternalEncryptionResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
