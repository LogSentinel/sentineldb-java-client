# UsersApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anonymizeUser**](UsersApi.md#anonymizeUser) | **PUT** /api/user/anonymize/{userId} | Anonymizes user
[**confirm2fa**](UsersApi.md#confirm2fa) | **PUT** /api/user/{userId}/2fa/confirm | Confirms 2 factor authentication
[**createUser**](UsersApi.md#createUser) | **POST** /api/user/{datastoreId} | Creates a user
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /api/user/{userId} | Deletes an existing user
[**disable2fa**](UsersApi.md#disable2fa) | **PUT** /api/user/{userId}/2fa/disable | Disables 2 factor authentication
[**enroll2fa**](UsersApi.md#enroll2fa) | **PUT** /api/user/{userId}/2fa/enroll | Enrolls user to 2 factor authentication
[**forgetUser**](UsersApi.md#forgetUser) | **PUT** /api/user/forget/{userId} | Forgets user
[**getUser**](UsersApi.md#getUser) | **GET** /api/user/{userId} | Gets user by id
[**getUserVersion**](UsersApi.md#getUserVersion) | **GET** /api/user/{userId}/versions/{version} | Gets concrete user version
[**getUserVersions**](UsersApi.md#getUserVersions) | **GET** /api/user/{userId}/versions | Gets all record versions by id
[**updateUser**](UsersApi.md#updateUser) | **PUT** /api/user/{userId} | Updates user


<a name="anonymizeUser"></a>
# **anonymizeUser**
> Object anonymizeUser(userId, actorId)

Anonymizes user

Performs user anonymization by deleting all personal information from the user object, but keeping all the associated records. See &lt;a href&#x3D;\&quot;https://logsentinel.com/sentineldb/getting-started/#anonymization\&quot;&gt;anonymization&lt;/a&gt; 

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
> User getUser(userId, actorId)

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
try {
    User result = apiInstance.getUser(userId, actorId);
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

