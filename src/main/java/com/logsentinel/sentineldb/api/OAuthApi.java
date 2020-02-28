package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.OAuthToken;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;

import java.util.UUID;
import com.logsentinel.sentineldb.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OAuthApi {
  private ApiClient apiClient;

  public OAuthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Obtain a token for a given username/password pair
   * Obtains a token for a given username/password pair. This is the standard password grant flow of OAuth with additional support for 2-factor authentication. The obtaind token can then be used to access API endpoints for the particular user (i.e. User and Record endpoints) 
   * @param username username (required)
   * @param password password (required)
   * @param datastoreId datastoreId (required)
   * @param code code (optional, default to 0)
   * @param grantType An OAuth grant type. Only \&quot;password\&quot; is supported. (optional, default to password)
   * @param scope An optional OAuth scope parameter. Client code can pass any scope. When making further API calls, the scope is checked against the scope with which the token was created. (optional)
   * @return OAuthToken
   * @throws ApiException if fails to make API call
   */
  public OAuthToken getOAuthToken(String username, String password, UUID datastoreId, Integer code, String grantType, String scope) throws ApiException {
    return getOAuthTokenWithHttpInfo(datastoreId, password, username, code, grantType, scope).getData();
      }

  /**
   * Obtain a token for a given username/password pair
   * Obtains a token for a given username/password pair. This is the standard password grant flow of OAuth with additional support for 2-factor authentication. The obtaind token can then be used to access API endpoints for the particular user (i.e. User and Record endpoints) 
   * @param datastoreId datastoreId (required)
   * @param password password (required)
   * @param username username (required)
   * @param code code (optional, default to 0)
   * @param grantType An OAuth grant type. Only \&quot;password\&quot; is supported. (optional, default to password)
   * @param scope An optional OAuth scope parameter. Client code can pass any scope. When making further API calls, the scope is checked against the scope with which the token was created. (optional)
   * @return ApiResponse&lt;OAuthToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthToken> getOAuthTokenWithHttpInfo(UUID datastoreId, String password, String username, Integer code, String grantType, String scope) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling getOAuthToken");
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
      throw new ApiException(400, "Missing the required parameter 'password' when calling getOAuthToken");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getOAuthToken");
    }
    
    // create path and map variables
    String localVarPath = "/api/oauth/token";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (code != null)
      localVarFormParams.put("code", code);
if (datastoreId != null)
      localVarFormParams.put("datastoreId", datastoreId);
if (grantType != null)
      localVarFormParams.put("grant_type", grantType);
if (password != null)
      localVarFormParams.put("password", password);
if (scope != null)
      localVarFormParams.put("scope", scope);
if (username != null)
      localVarFormParams.put("username", username);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<OAuthToken> localVarReturnType = new GenericType<OAuthToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Obtain the user details for the currently authenticated user
   * 
   * @param visibilityLevel visibilityLevel (optional, default to PRIVATE)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserDetails(VisibilityLevelEnum visibilityLevel) throws ApiException {
    return getUserDetailsWithHttpInfo(visibilityLevel).getData();
      }

  /**
   * Obtain the user details for the currently authenticated user
   * 
   * @param visibilityLevel visibilityLevel (optional, default to PRIVATE)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserDetailsWithHttpInfo(VisibilityLevelEnum visibilityLevel) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/oauth/me";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Obtain a token for a given username/password pair
   * 
   * @param token token (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String invalidateOAuthToken(String token) throws ApiException {
    return invalidateOAuthTokenWithHttpInfo(token).getData();
      }

  /**
   * Obtain a token for a given username/password pair
   * 
   * @param token token (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> invalidateOAuthTokenWithHttpInfo(String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling invalidateOAuthToken");
    }
    
    // create path and map variables
    String localVarPath = "/api/oauth/token/revoke";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

    
    
    final String[] localVarAccepts = {
      "application/json"
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
