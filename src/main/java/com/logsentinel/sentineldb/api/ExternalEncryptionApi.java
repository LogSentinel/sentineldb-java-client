package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.BatchDecryptRequest;
import com.logsentinel.sentineldb.model.BatchEncryptRequest;
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
   * Batch decrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param request request (required)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public List<String> batchDecrypt(List<BatchDecryptRequest> request) throws ApiException {
    return batchDecryptWithHttpInfo(request).getData();
      }

  /**
   * Batch decrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param request request (required)
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> batchDecryptWithHttpInfo(List<BatchDecryptRequest> request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling batchDecrypt");
    }
    
    // create path and map variables
    String localVarPath = "/api/encryption/batch/decrypt";

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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Batch encrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param request request (required)
   * @return List&lt;ExternalEncryptionResult&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ExternalEncryptionResult> batchEncrypt(List<BatchEncryptRequest> request) throws ApiException {
    return batchEncryptWithHttpInfo(request).getData();
      }

  /**
   * Batch encrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param request request (required)
   * @return ApiResponse&lt;List&lt;ExternalEncryptionResult&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ExternalEncryptionResult>> batchEncryptWithHttpInfo(List<BatchEncryptRequest> request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling batchEncrypt");
    }
    
    // create path and map variables
    String localVarPath = "/api/encryption/batch/encrypt";

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

    GenericType<List<ExternalEncryptionResult>> localVarReturnType = new GenericType<List<ExternalEncryptionResult>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
   * 
   * @param ciphertext ciphertext (required)
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String decryptData(String ciphertext, UUID datastoreId, String entityId, String entityType) throws ApiException {
    return decryptDataWithHttpInfo(ciphertext, datastoreId, entityId, entityType).getData();
      }

  /**
   * Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
   * 
   * @param ciphertext ciphertext (required)
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> decryptDataWithHttpInfo(String ciphertext, UUID datastoreId, String entityId, String entityType) throws ApiException {
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
   * @return ExternalEncryptionResult
   * @throws ApiException if fails to make API call
   */
  public ExternalEncryptionResult encryptData(UUID datastoreId, String entityId, String entityType, String fieldName, String payload) throws ApiException {
    return encryptDataWithHttpInfo(datastoreId, entityId, entityType, fieldName, payload).getData();
      }

  /**
   * Encrypt any data (represented as string) for a given entity type, id and datastore
   * 
   * @param datastoreId datastoreId (required)
   * @param entityId entityId (required)
   * @param entityType entityType (required)
   * @param fieldName fieldName (required)
   * @param payload payload (required)
   * @return ApiResponse&lt;ExternalEncryptionResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalEncryptionResult> encryptDataWithHttpInfo(UUID datastoreId, String entityId, String entityType, String fieldName, String payload) throws ApiException {
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
  /**
   * Transform a given plaintext to a lookup key
   * 
   * @param datastoreId datastoreId (required)
   * @param plaintext plaintext (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getLookupValue(UUID datastoreId, String plaintext) throws ApiException {
    return getLookupValueWithHttpInfo(datastoreId, plaintext).getData();
      }

  /**
   * Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
   * 
   * @param datastoreId datastoreId (required)
   * @param plaintext plaintext (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> getLookupValueWithHttpInfo(UUID datastoreId, String plaintext) throws ApiException {
    Object localVarPostBody = plaintext;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling getLookupValue");
    }
    
    // verify the required parameter 'plaintext' is set
    if (plaintext == null) {
      throw new ApiException(400, "Missing the required parameter 'plaintext' when calling getLookupValue");
    }
    
    // create path and map variables
    String localVarPath = "/api/encryption/getLookupValue";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));

    
    
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
}
