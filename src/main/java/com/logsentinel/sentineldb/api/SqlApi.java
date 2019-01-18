package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.Statement;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SqlApi {
  private ApiClient apiClient;

  public SqlApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SqlApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Executes delete query against sentinelDB
   * 
   * @param query query (required)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer executeDelete(String query, String visibilityLevel) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling executeDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Executes insert query against sentinelDB
   * 
   * @param query query (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID executeInsert(String query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling executeInsert");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/insert";

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

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Executes select query against sentinelDB
   * 
   * @param query query (required)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return List&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public List<List<String>> executeSelect(String query, String visibilityLevel) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling executeSelect");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/select";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<List<List<String>>> localVarReturnType = new GenericType<List<List<String>>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Executes update query against sentinelDB
   * 
   * @param query query (required)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer executeUpdate(String query, String visibilityLevel) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling executeUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/update";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Prepared delete statement against sentinelDB
   * 
   * @param statement statement (required)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer prepareDeleteStatement(Statement statement, String visibilityLevel) throws ApiException {
    Object localVarPostBody = statement;
    
    // verify the required parameter 'statement' is set
    if (statement == null) {
      throw new ApiException(400, "Missing the required parameter 'statement' when calling prepareDeleteStatement");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/delete/prepared";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Prepared insert statement against sentinelDB
   * 
   * @param statement statement (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID prepareInsertStatement(Statement statement) throws ApiException {
    Object localVarPostBody = statement;
    
    // verify the required parameter 'statement' is set
    if (statement == null) {
      throw new ApiException(400, "Missing the required parameter 'statement' when calling prepareInsertStatement");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/insert/prepared";

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

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Prepared select statement against sentinelDB
   * 
   * @param statement statement (required)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return List&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public List<List<String>> prepareSelectStatement(Statement statement, String visibilityLevel) throws ApiException {
    Object localVarPostBody = statement;
    
    // verify the required parameter 'statement' is set
    if (statement == null) {
      throw new ApiException(400, "Missing the required parameter 'statement' when calling prepareSelectStatement");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/select/prepared";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<List<List<String>>> localVarReturnType = new GenericType<List<List<String>>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Prepared update statement against sentinelDB
   * 
   * @param statement statement (required)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer prepareUpdateStatement(Statement statement, String visibilityLevel) throws ApiException {
    Object localVarPostBody = statement;
    
    // verify the required parameter 'statement' is set
    if (statement == null) {
      throw new ApiException(400, "Missing the required parameter 'statement' when calling prepareUpdateStatement");
    }
    
    // create path and map variables
    String localVarPath = "/api/sql/update/prepared";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
