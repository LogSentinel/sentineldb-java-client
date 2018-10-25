# UserApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /api/user/{datastoreId} | Creates a user
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /api/user/{userId} | Deletes an existing user
[**forgetUser**](UserApi.md#forgetUser) | **PUT** /api/user/forget/{userId} | Forgets user
[**getUser**](UserApi.md#getUser) | **GET** /api/user/{userId} | Gets user by id
[**getUserVersion**](UserApi.md#getUserVersion) | **GET** /api/user/{userId}/versions/{version} | Gets concrete user version
[**getUserVersions**](UserApi.md#getUserVersions) | **GET** /api/user/{userId}/versions | Gets all record versions by id
[**updateUser**](UserApi.md#updateUser) | **PUT** /api/user/{userId} | Updates user


<a name="createUser"></a>
# **createUser**
> User createUser(datastoreId, user, actorId)

Creates a user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
User user = new User(); // User | user
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.createUser(datastoreId, user, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **user** | [**User**](User.md)| user |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="deleteUser"></a>
# **deleteUser**
> Object deleteUser(userId, actorId)

Deletes an existing user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UUID userId = new UUID(); // UUID | userId
String actorId = "actorId_example"; // String | actorId
try {
    Object result = apiInstance.deleteUser(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="forgetUser"></a>
# **forgetUser**
> Object forgetUser(userId, actorId)

Forgets user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UUID userId = new UUID(); // UUID | userId
String actorId = "actorId_example"; // String | actorId
try {
    Object result = apiInstance.forgetUser(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#forgetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="getUser"></a>
# **getUser**
> User getUser(userId, actorId)

Gets user by id

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UUID userId = new UUID(); // UUID | userId
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.getUser(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getUserVersion"></a>
# **getUserVersion**
> User getUserVersion(userId, version, actorId)

Gets concrete user version

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UUID userId = new UUID(); // UUID | userId
Integer version = 56; // Integer | version
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.getUserVersion(userId, version, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |
 **version** | **Integer**| version |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getUserVersions"></a>
# **getUserVersions**
> List&lt;Integer&gt; getUserVersions(userId)

Gets all record versions by id

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UUID userId = new UUID(); // UUID | userId
try {
    List<Integer> result = apiInstance.getUserVersions(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |

### Return type

**List&lt;Integer&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(user, userId, actorId)

Updates user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
User user = new User(); // User | user
UUID userId = new UUID(); // UUID | userId
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.updateUser(user, userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| user |
 **userId** | [**UUID**](.md)| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

