# UsersApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRole**](UsersApi.md#addRole) | **POST** /api/user/{userId}/addRole/{role} | Add role to user
[**anonymizeUser**](UsersApi.md#anonymizeUser) | **POST** /api/user/anonymize/{userId} | Anonymizes user
[**changePassword**](UsersApi.md#changePassword) | **POST** /api/user/{userId}/changePassword | Change user password
[**confirm2fa**](UsersApi.md#confirm2fa) | **POST** /api/user/{userId}/2fa/confirm | Confirms 2 factor authentication
[**createUser**](UsersApi.md#createUser) | **POST** /api/user/datastore/{datastoreId} | Creates a user
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /api/user/{userId} | Deletes an existing user
[**disable2fa**](UsersApi.md#disable2fa) | **POST** /api/user/{userId}/2fa/disable | Disables 2 factor authentication
[**enroll2fa**](UsersApi.md#enroll2fa) | **POST** /api/user/{userId}/2fa/enroll | Enrolls user to 2 factor authentication
[**exportUserData**](UsersApi.md#exportUserData) | **GET** /api/user/{userId}/exportUserData | Gets all user records and user data
[**forgetUser**](UsersApi.md#forgetUser) | **POST** /api/user/forget/{userId} | Forgets user
[**getUser**](UsersApi.md#getUser) | **GET** /api/user/{userId} | Gets user by id
[**getUserVersion**](UsersApi.md#getUserVersion) | **GET** /api/user/{userId}/versions/{version} | Gets concrete user version
[**getUserVersions**](UsersApi.md#getUserVersions) | **GET** /api/user/{userId}/versions | Gets all record versions by id
[**initiateResetPassword**](UsersApi.md#initiateResetPassword) | **POST** /api/user/{userId}/initiatePasswordReset | Initiates reset password
[**removeRole**](UsersApi.md#removeRole) | **POST** /api/user/{userId}/removeRole/{role} | Remove user role
[**updateUser**](UsersApi.md#updateUser) | **PUT** /api/user/{userId} | Updates user
[**validateResetPasswordToken**](UsersApi.md#validateResetPasswordToken) | **POST** /api/user/validatePasswordReset | Validates reset password token


<a name="addRole"></a>
# **addRole**
> Boolean addRole(role, userId)

Add role to user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String role = "role_example"; // String | role
UUID userId = new UUID(); // UUID | User identifier
try {
    Boolean result = apiInstance.addRole(role, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| role |
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="anonymizeUser"></a>
# **anonymizeUser**
> Object anonymizeUser(userId, actorId)

Anonymizes user

Performs user anonymization by deleting all personal information from the user object, but keeping all the associated records. See &lt;a href&#x3D;\&quot;https://docs.sentineldb.io/en/latest/getting-started.html#anonymization\&quot;&gt;anonymization&lt;/a&gt; 

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    Object result = apiInstance.anonymizeUser(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#anonymizeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changePassword"></a>
# **changePassword**
> changePassword(request, userId)

Change user password

Changes the user password after confirming the existing password

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
ChangePasswordRequest request = new ChangePasswordRequest(); // ChangePasswordRequest | request
UUID userId = new UUID(); // UUID | User identifier
try {
    apiInstance.changePassword(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| request |
 **userId** | [**UUID**](.md)| User identifier |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirm2fa"></a>
# **confirm2fa**
> Object confirm2fa(code, userId)

Confirms 2 factor authentication

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
Integer code = 56; // Integer | code
UUID userId = new UUID(); // UUID | User identifier
try {
    Object result = apiInstance.confirm2fa(code, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#confirm2fa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **Integer**| code |
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> User createUser(datastoreId, user, actorId)

Creates a user

Creates a new user by specifying basic email and/or username and a custom set of attributes (these attributes are normally equivallent to the other fields in a \&quot;users\&quot; table). Returns the ID of the new user which should be stored inside your database.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
UserRequest user = new UserRequest(); // UserRequest | user
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    User result = apiInstance.createUser(datastoreId, user, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **user** | [**UserRequest**](UserRequest.md)| user |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> Object deleteUser(userId, actorId)

Deletes an existing user

Deletes a user. Note that this does not forget the user but simply marks the latest version of the user as deleted.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    Object result = apiInstance.deleteUser(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disable2fa"></a>
# **disable2fa**
> Object disable2fa(userId)

Disables 2 factor authentication

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
try {
    Object result = apiInstance.disable2fa(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#disable2fa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enroll2fa"></a>
# **enroll2fa**
> Object enroll2fa(userId)

Enrolls user to 2 factor authentication

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
try {
    Object result = apiInstance.enroll2fa(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#enroll2fa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportUserData"></a>
# **exportUserData**
> Object exportUserData(userId)

Gets all user records and user data

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
try {
    Object result = apiInstance.exportUserData(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#exportUserData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forgetUser"></a>
# **forgetUser**
> Object forgetUser(userId, actorId)

Forgets user

Executes \&quot;the right to be forgotten\&quot; on a specified user. Deletes all user data and associated records and keeps an audit trail of the \&quot;forget me\&quot; event.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    Object result = apiInstance.forgetUser(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#forgetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> User getUser(userId, actorId, fieldsToAnonymize, pseudonymizationKeyId, visibilityLevel)

Gets user by id

Retrieves a user by their ID. The ID is normally stored in a \&quot;users\&quot; table in your system. 

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
List<String> fieldsToAnonymize = Arrays.asList("fieldsToAnonymize_example"); // List<String> | fieldsToAnonymize
UUID pseudonymizationKeyId = new UUID(); // UUID | pseudonymizationKeyId
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    User result = apiInstance.getUser(userId, actorId, fieldsToAnonymize, pseudonymizationKeyId, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]
 **fieldsToAnonymize** | [**List&lt;String&gt;**](String.md)| fieldsToAnonymize | [optional]
 **pseudonymizationKeyId** | [**UUID**](.md)| pseudonymizationKeyId | [optional]
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserVersion"></a>
# **getUserVersion**
> User getUserVersion(userId, version, actorId)

Gets concrete user version

Retrieves a specific (older) version for a given user.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
Integer version = 56; // Integer | version
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    User result = apiInstance.getUserVersion(userId, version, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |
 **version** | **Integer**| version |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserVersions"></a>
# **getUserVersions**
> List&lt;Integer&gt; getUserVersions(userId)

Gets all record versions by id

Retrieves all the versions for a given user. Each version is a historical snapshot of the user object prior to each update.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
try {
    List<Integer> result = apiInstance.getUserVersions(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**List&lt;Integer&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="initiateResetPassword"></a>
# **initiateResetPassword**
> String initiateResetPassword(userId, expiryHours)

Initiates reset password

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | User identifier
Integer expiryHours = 24; // Integer | expiryHours
try {
    String result = apiInstance.initiateResetPassword(userId, expiryHours);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#initiateResetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| User identifier |
 **expiryHours** | **Integer**| expiryHours | [optional] [default to 24]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeRole"></a>
# **removeRole**
> Boolean removeRole(role, userId)

Remove user role

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String role = "role_example"; // String | role
UUID userId = new UUID(); // UUID | User identifier
try {
    Boolean result = apiInstance.removeRole(role, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#removeRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| role |
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(user, userId, actorId)

Updates user

Updates a user&#39;s details. Note that this creates a newer version of the user, keeping the old value for historical reference.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
UserRequest user = new UserRequest(); // UserRequest | user
UUID userId = new UUID(); // UUID | User identifier
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    User result = apiInstance.updateUser(user, userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserRequest**](UserRequest.md)| user |
 **userId** | [**UUID**](.md)| User identifier |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateResetPasswordToken"></a>
# **validateResetPasswordToken**
> Boolean validateResetPasswordToken(expiration, resetToken, userId)

Validates reset password token

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
Long expiration = 789L; // Long | expiration
String resetToken = "resetToken_example"; // String | resetToken
UUID userId = new UUID(); // UUID | User identifier
try {
    Boolean result = apiInstance.validateResetPasswordToken(expiration, resetToken, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#validateResetPasswordToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiration** | **Long**| expiration |
 **resetToken** | **String**| resetToken |
 **userId** | [**UUID**](.md)| User identifier |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

