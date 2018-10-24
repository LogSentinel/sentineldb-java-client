# UserApi

All URIs are relative to *https://localhost:8090/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST1**](UserApi.md#createUsingPOST1) | **POST** /api/user | Creates a user
[**deleteUsingDELETE1**](UserApi.md#deleteUsingDELETE1) | **DELETE** /api/user/{userId} | Deletes an existing user
[**forgetUserUsingPUT**](UserApi.md#forgetUserUsingPUT) | **PUT** /api/user/forget/{userId} | Forgets user
[**getUsingGET1**](UserApi.md#getUsingGET1) | **GET** /api/user/{userId} | Gets user by id
[**getVersionUsingGET1**](UserApi.md#getVersionUsingGET1) | **GET** /api/user/{userId}/versions/{version} | Gets concrete user version
[**getVersionsUsingGET1**](UserApi.md#getVersionsUsingGET1) | **GET** /api/user/{userId}/versions | Gets all record versions by id
[**updateUsingPUT1**](UserApi.md#updateUsingPUT1) | **PUT** /api/user | Updates user


<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> User createUsingPOST1(user, actorId)

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
User user = new User(); // User | user
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.createUsingPOST1(user, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| user |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> Object deleteUsingDELETE1(userId, actorId)

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
String userId = "userId_example"; // String | userId
String actorId = "actorId_example"; // String | actorId
try {
    Object result = apiInstance.deleteUsingDELETE1(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="forgetUserUsingPUT"></a>
# **forgetUserUsingPUT**
> Object forgetUserUsingPUT(userId, actorId)

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
String userId = "userId_example"; // String | userId
String actorId = "actorId_example"; // String | actorId
try {
    Object result = apiInstance.forgetUserUsingPUT(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#forgetUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

<a name="getUsingGET1"></a>
# **getUsingGET1**
> User getUsingGET1(userId, actorId)

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
String userId = "userId_example"; // String | userId
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.getUsingGET1(userId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="getVersionUsingGET1"></a>
# **getVersionUsingGET1**
> User getVersionUsingGET1(userId, version, actorId)

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
String userId = "userId_example"; // String | userId
Integer version = 56; // Integer | version
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.getVersionUsingGET1(userId, version, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getVersionUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **version** | **Integer**| version |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="getVersionsUsingGET1"></a>
# **getVersionsUsingGET1**
> List&lt;Integer&gt; getVersionsUsingGET1(userId)

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
String userId = "userId_example"; // String | userId
try {
    List<Integer> result = apiInstance.getVersionsUsingGET1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getVersionsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

**List&lt;Integer&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="updateUsingPUT1"></a>
# **updateUsingPUT1**
> User updateUsingPUT1(user, actorId)

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
String actorId = "actorId_example"; // String | actorId
try {
    User result = apiInstance.updateUsingPUT1(user, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| user |
 **actorId** | **String**| actorId | [optional]

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

