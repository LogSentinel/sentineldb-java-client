package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.ChangePasswordRequest;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;

import java.util.UUID;
import com.logsentinel.sentineldb.model.User;
import com.logsentinel.sentineldb.model.UserRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add role to user
   * 
   * @param role role (required)
   * @param userId User identifier (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean addRole(String role, UUID userId) throws ApiException {
    return addRoleWithHttpInfo(role, userId).getData();
      }

  /**
   * Add role to user
   * 
   * @param role role (required)
   * @param userId User identifier (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Boolean> addRoleWithHttpInfo(String role, UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling addRole");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/addRole/{role}"
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Anonymizes user
   * Performs user anonymization by deleting all personal information from the user object, but keeping all the associated records. See &lt;a href&#x3D;\&quot;https://docs.sentineldb.io/en/latest/getting-started.html#anonymization\&quot;&gt;anonymization&lt;/a&gt; 
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object anonymizeUser(UUID userId, String actorId) throws ApiException {
    return anonymizeUserWithHttpInfo(userId, actorId).getData();
      }

  /**
   * Anonymizes user
   * Performs user anonymization by deleting all personal information from the user object, but keeping all the associated records. See &lt;a href&#x3D;\&quot;https://docs.sentineldb.io/en/latest/getting-started.html#anonymization\&quot;&gt;anonymization&lt;/a&gt; 
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> anonymizeUserWithHttpInfo(UUID userId, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling anonymizeUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/anonymize/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Change user password
   * Changes the user password after confirming the existing password
   * @param request request (required)
   * @param userId User identifier (required)
   * @throws ApiException if fails to make API call
   */
  public void changePassword(ChangePasswordRequest request, UUID userId) throws ApiException {

    changePasswordWithHttpInfo(request, userId);
  }

  /**
   * Change user password
   * Changes the user password after confirming the existing password
   * @param request request (required)
   * @param userId User identifier (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changePasswordWithHttpInfo(ChangePasswordRequest request, UUID userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changePassword");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling changePassword");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/changePassword"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Confirms 2 factor authentication
   * 
   * @param code code (required)
   * @param userId User identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object confirm2fa(Integer code, UUID userId) throws ApiException {
    return confirm2faWithHttpInfo(code, userId).getData();
      }

  /**
   * Confirms 2 factor authentication
   * 
   * @param code code (required)
   * @param userId User identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> confirm2faWithHttpInfo(Integer code, UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling confirm2fa");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling confirm2fa");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/2fa/confirm"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a user
   * Creates a new user by specifying basic email and/or username and a custom set of attributes (these attributes are normally equivallent to the other fields in a \&quot;users\&quot; table). Returns the ID of the new user which should be stored inside your database.
   * @param datastoreId datastoreId (required)
   * @param user user (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User createUser(UUID datastoreId, UserRequest user, String actorId) throws ApiException {
    return createUserWithHttpInfo(datastoreId, user, actorId).getData();
      }

  /**
   * Creates a user
   * Creates a new user by specifying basic email and/or username and a custom set of attributes (these attributes are normally equivallent to the other fields in a \&quot;users\&quot; table). Returns the ID of the new user which should be stored inside your database.
   * @param datastoreId datastoreId (required)
   * @param user user (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> createUserWithHttpInfo(UUID datastoreId, UserRequest user, String actorId) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling createUser");
    }
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/datastore/{datastoreId}"
      .replaceAll("\\{" + "datastoreId" + "\\}", apiClient.escapeString(datastoreId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes an existing user
   * Deletes a user. Note that this does not forget the user but simply marks the latest version of the user as deleted.
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteUser(UUID userId, String actorId) throws ApiException {
    return deleteUserWithHttpInfo(userId, actorId).getData();
      }

  /**
   * Deletes an existing user
   * Deletes a user. Note that this does not forget the user but simply marks the latest version of the user as deleted.
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteUserWithHttpInfo(UUID userId, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Disables 2 factor authentication
   * 
   * @param userId User identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object disable2fa(UUID userId) throws ApiException {
    return disable2faWithHttpInfo(userId).getData();
      }

  /**
   * Disables 2 factor authentication
   * 
   * @param userId User identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> disable2faWithHttpInfo(UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling disable2fa");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/2fa/disable"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enrolls user to 2 factor authentication
   * 
   * @param userId User identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object enroll2fa(UUID userId) throws ApiException {
    return enroll2faWithHttpInfo(userId).getData();
      }

  /**
   * Enrolls user to 2 factor authentication
   * 
   * @param userId User identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> enroll2faWithHttpInfo(UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling enroll2fa");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/2fa/enroll"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Forgets user
   * Executes \&quot;the right to be forgotten\&quot; on a specified user. Deletes all user data and associated records and keeps an audit trail of the \&quot;forget me\&quot; event.
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object forgetUser(UUID userId, String actorId) throws ApiException {
    return forgetUserWithHttpInfo(userId, actorId).getData();
      }

  /**
   * Forgets user
   * Executes \&quot;the right to be forgotten\&quot; on a specified user. Deletes all user data and associated records and keeps an audit trail of the \&quot;forget me\&quot; event.
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> forgetUserWithHttpInfo(UUID userId, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling forgetUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/forget/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets user by id
   * Retrieves a user by their ID. The ID is normally stored in a \&quot;users\&quot; table in your system. 
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser(UUID userId, String actorId, List<String> fieldsToAnonymize, UUID pseudonymizationKeyId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    return getUserWithHttpInfo(userId, actorId, fieldsToAnonymize, pseudonymizationKeyId, visibilityLevel).getData();
      }

  /**
   * Gets user by id
   * Retrieves a user by their ID. The ID is normally stored in a \&quot;users\&quot; table in your system. 
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @param fieldsToAnonymize fieldsToAnonymize (optional)
   * @param pseudonymizationKeyId pseudonymizationKeyId (optional)
   * @param visibilityLevel visibilityLevel (optional, default to PUBLIC)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserWithHttpInfo(UUID userId, String actorId, List<String> fieldsToAnonymize, UUID pseudonymizationKeyId, VisibilityLevelEnum visibilityLevel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets concrete user version
   * Retrieves a specific (older) version for a given user.
   * @param userId User identifier (required)
   * @param version version (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserVersion(UUID userId, Integer version, String actorId) throws ApiException {
    return getUserVersionWithHttpInfo(userId, version, actorId).getData();
      }

  /**
   * Gets concrete user version
   * Retrieves a specific (older) version for a given user.
   * @param userId User identifier (required)
   * @param version version (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserVersionWithHttpInfo(UUID userId, Integer version, String actorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserVersion");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getUserVersion");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/versions/{version}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets all record versions by id
   * Retrieves all the versions for a given user. Each version is a historical snapshot of the user object prior to each update.
   * @param userId User identifier (required)
   * @return List&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Integer> getUserVersions(UUID userId) throws ApiException {
    return getUserVersionsWithHttpInfo(userId).getData();
      }

  /**
   * Gets all record versions by id
   * Retrieves all the versions for a given user. Each version is a historical snapshot of the user object prior to each update.
   * @param userId User identifier (required)
   * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Integer>> getUserVersionsWithHttpInfo(UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserVersions");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/versions"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Initiates reset password
   * 
   * @param userId User identifier (required)
   * @param expiryHours expiryHours (optional, default to 24)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String initiateResetPassword(UUID userId, Integer expiryHours) throws ApiException {
    return initiateResetPasswordWithHttpInfo(userId, expiryHours).getData();
      }

  /**
   * Initiates reset password
   * 
   * @param userId User identifier (required)
   * @param expiryHours expiryHours (optional, default to 24)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> initiateResetPasswordWithHttpInfo(UUID userId, Integer expiryHours) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling initiateResetPassword");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/initiatePasswordReset"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiryHours", expiryHours));

    
    
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
  /**
   * Remove user role
   * 
   * @param role role (required)
   * @param userId User identifier (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean removeRole(String role, UUID userId) throws ApiException {
    return removeRoleWithHttpInfo(role, userId).getData();
      }

  /**
   * Remove user role
   * 
   * @param role role (required)
   * @param userId User identifier (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Boolean> removeRoleWithHttpInfo(String role, UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling removeRole");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}/removeRole/{role}"
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates user
   * Updates a user&#39;s details. Note that this creates a newer version of the user, keeping the old value for historical reference.
   * @param user user (required)
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User updateUser(UserRequest user, UUID userId, String actorId) throws ApiException {
    return updateUserWithHttpInfo(user, userId, actorId).getData();
      }

  /**
   * Updates user
   * Updates a user&#39;s details. Note that this creates a newer version of the user, keeping the old value for historical reference.
   * @param user user (required)
   * @param userId User identifier (required)
   * @param actorId Optional ID of the actor that performed the action. If not supplied, it can be inferred (optional)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> updateUserWithHttpInfo(UserRequest user, UUID userId, String actorId) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling updateUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validates reset password token
   * 
   * @param expiration expiration (required)
   * @param resetToken resetToken (required)
   * @param userId User identifier (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean validateResetPasswordToken(Long expiration, String resetToken, UUID userId) throws ApiException {
    return validateResetPasswordTokenWithHttpInfo(expiration, resetToken, userId).getData();
      }

  /**
   * Validates reset password token
   * 
   * @param expiration expiration (required)
   * @param resetToken resetToken (required)
   * @param userId User identifier (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Boolean> validateResetPasswordTokenWithHttpInfo(Long expiration, String resetToken, UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'expiration' is set
    if (expiration == null) {
      throw new ApiException(400, "Missing the required parameter 'expiration' when calling validateResetPasswordToken");
    }
    
    // verify the required parameter 'resetToken' is set
    if (resetToken == null) {
      throw new ApiException(400, "Missing the required parameter 'resetToken' when calling validateResetPasswordToken");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling validateResetPasswordToken");
    }
    
    // create path and map variables
    String localVarPath = "/api/user/validatePasswordReset";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiration", expiration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resetToken", resetToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
