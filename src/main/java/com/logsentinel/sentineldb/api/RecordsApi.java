package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import com.logsentinel.sentineldb.model.Record;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;

import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RecordsApi {
  private ApiClient apiClient;

  public RecordsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecordsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a binary record
   * 
   * @param body body (required)
   * @param datastoreId datastoreId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param ownerId ownerId (optional)
   * @param type type (optional)
   * @return Record
   * @throws ApiException if fails to make API call
   */
  public Record createBinaryRecord(File body, UUID datastoreId, Object actorId, Object ownerId, Object type) throws ApiException {
    return createBinaryRecordWithHttpInfo(body, datastoreId, actorId, ownerId, type).getData();
      }

  /**
   * Creates a binary record
   * 
   * @param body body (required)
   * @param datastoreId datastoreId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param ownerId ownerId (optional)
   * @param type type (optional)
   * @return ApiResponse&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Record> createBinaryRecordWithHttpInfo(File body, UUID datastoreId, Object actorId, Object ownerId, Object type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createBinaryRecord");
    }
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling createBinaryRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/binary/datastore/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (actorId != null)
      localVarFormParams.put("actorId", actorId);
if (body != null)
      localVarFormParams.put("body", body);
if (ownerId != null)
      localVarFormParams.put("ownerId", ownerId);
if (type != null)
      localVarFormParams.put("type", type);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a record
   * Creates a new record by specifying the record details (arbitrary JSON) as well as the ID of the owning user. 
   * @param body body (required)
   * @param datastoreId datastoreId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param ownerId ownerId (optional)
   * @param type type (optional, default to None)
   * @return Record
   * @throws ApiException if fails to make API call
   */
  public Record createRecord(String body, UUID datastoreId, String actorId, UUID ownerId, String type) throws ApiException {
    return createRecordWithHttpInfo(body, datastoreId, actorId, ownerId, type).getData();
      }

  /**
   * Creates a record
   * Creates a new record by specifying the record details (arbitrary JSON) as well as the ID of the owning user. 
   * @param body body (required)
   * @param datastoreId datastoreId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param ownerId ownerId (optional)
   * @param type type (optional, default to None)
   * @return ApiResponse&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Record> createRecordWithHttpInfo(String body, UUID datastoreId, String actorId, UUID ownerId, String type) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRecord");
    }
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling createRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/datastore/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerId", ownerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes an existing record
   * Deletes a record by marking the latest version as deleted
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteRecord(UUID recordId, String actorId) throws ApiException {
    return deleteRecordWithHttpInfo(recordId, actorId).getData();
      }

  /**
   * Deletes an existing record
   * Deletes a record by marking the latest version as deleted
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteRecordWithHttpInfo(UUID recordId, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling deleteRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/{recordId}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));

    
    
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
   * Gets record by id
   * Retrieves the latest version of a record by ID
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return Record
   * @throws ApiException if fails to make API call
   */
  public Record getRecord(UUID recordId, String actorId, List<String> fieldsToAnonymize, UUID pseudonymizationKeyId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    return getRecordWithHttpInfo(recordId, actorId, fieldsToAnonymize, pseudonymizationKeyId, visibilityLevel).getData();
      }

  /**
   * Gets record by id
   * Retrieves the latest version of a record by ID
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return ApiResponse&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Record> getRecordWithHttpInfo(UUID recordId, String actorId, List<String> fieldsToAnonymize, UUID pseudonymizationKeyId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling getRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/{recordId}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "fieldsToAnonymize", fieldsToAnonymize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pseudonymizationKeyId", pseudonymizationKeyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "visibilityLevel", visibilityLevel));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets record with binary content by id
   * 
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @throws ApiException if fails to make API call
   */
  public void getRecordBinaryContent(UUID recordId, String actorId) throws ApiException {

    getRecordBinaryContentWithHttpInfo(recordId, actorId);
  }

  /**
   * Gets record with binary content by id
   * 
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getRecordBinaryContentWithHttpInfo(UUID recordId, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling getRecordBinaryContent");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/binary/{recordId}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));

    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Gets concrete record version
   * Retrieves a specific (older) version for a given record.
   * @param recordId recordId (required)
   * @param version version (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return Record
   * @throws ApiException if fails to make API call
   */
  public Record getRecordVersion(UUID recordId, Integer version, String actorId) throws ApiException {
    return getRecordVersionWithHttpInfo(recordId, version, actorId).getData();
      }

  /**
   * Gets concrete record version
   * Retrieves a specific (older) version for a given record.
   * @param recordId recordId (required)
   * @param version version (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Record> getRecordVersionWithHttpInfo(UUID recordId, Integer version, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling getRecordVersion");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getRecordVersion");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/{recordId}/versions/{version}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets all record versions by id
   * Retrieves all the versions for a given record. Each version is a historical snapshot of the record object prior to each update.
   * @param recordId recordId (required)
   * @return List&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Integer> getRecordVersions(UUID recordId) throws ApiException {
    return getRecordVersionsWithHttpInfo(recordId).getData();
      }

  /**
   * Gets all record versions by id
   * Retrieves all the versions for a given record. Each version is a historical snapshot of the record object prior to each update.
   * @param recordId recordId (required)
   * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Integer>> getRecordVersionsWithHttpInfo(UUID recordId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling getRecordVersions");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/{recordId}/versions"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

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

    GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates binary content of a record
   * 
   * @param body body (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateBinaryRecord(File body, UUID recordId, String actorId) throws ApiException {

    updateBinaryRecordWithHttpInfo(body, recordId, actorId);
  }

  /**
   * Updates binary content of a record
   * 
   * @param body body (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateBinaryRecordWithHttpInfo(File body, UUID recordId, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBinaryRecord");
    }
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling updateBinaryRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/binary/{recordId}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));

    
    if (body != null)
      localVarFormParams.put("body", body);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Updates metadata of a record with binary content
   * 
   * @param metadata metadata (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateBinaryRecordMetadata(String metadata, UUID recordId, String actorId) throws ApiException {

    updateBinaryRecordMetadataWithHttpInfo(metadata, recordId, actorId);
  }

  /**
   * Updates metadata of a record with binary content
   * 
   * @param metadata metadata (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateBinaryRecordMetadataWithHttpInfo(String metadata, UUID recordId, String actorId) throws ApiException {
    Object localVarPostBody = metadata;
    
    // verify the required parameter 'metadata' is set
    if (metadata == null) {
      throw new ApiException(400, "Missing the required parameter 'metadata' when calling updateBinaryRecordMetadata");
    }
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling updateBinaryRecordMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/binary/metadata/{recordId}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Updates record
   * Updates a record, thus creating a newer version
   * @param record record (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return Record
   * @throws ApiException if fails to make API call
   */
  public Record updateRecord(Record record, UUID recordId, String actorId) throws ApiException {
    return updateRecordWithHttpInfo(record, recordId, actorId).getData();
      }

  /**
   * Updates record
   * Updates a record, thus creating a newer version
   * @param record record (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Record> updateRecordWithHttpInfo(Record record, UUID recordId, String actorId) throws ApiException {
    Object localVarPostBody = record;
    
    // verify the required parameter 'record' is set
    if (record == null) {
      throw new ApiException(400, "Missing the required parameter 'record' when calling updateRecord");
    }
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling updateRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/{recordId}"
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a record&#39;s owner
   * Changes the owner of a given record by passing the ID of another user
   * @param ownerId ownerId (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return Record
   * @throws ApiException if fails to make API call
   */
  public Record updateRecordOwner(UUID ownerId, UUID recordId, String actorId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    return updateRecordOwnerWithHttpInfo(ownerId, recordId, actorId, visibilityLevel).getData();
      }

  /**
   * Updates a record&#39;s owner
   * Changes the owner of a given record by passing the ID of another user
   * @param ownerId ownerId (required)
   * @param recordId recordId (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return ApiResponse&lt;Record&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Record> updateRecordOwnerWithHttpInfo(UUID ownerId, UUID recordId, String actorId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ownerId' is set
    if (ownerId == null) {
      throw new ApiException(400, "Missing the required parameter 'ownerId' when calling updateRecordOwner");
    }
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling updateRecordOwner");
    }
    
    // create path and map variables
    String localVarPath = "/api/record/{recordId}/owner/{ownerId}"
      .replaceAll("\\{" + "ownerId" + "\\}", apiClient.escapeString(ownerId.toString()))
      .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorId", actorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "visibilityLevel", visibilityLevel));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
