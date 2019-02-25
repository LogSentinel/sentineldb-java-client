# OAuthApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOAuthToken**](OAuthApi.md#getOAuthToken) | **GET** /api/oauth/token | Obtain a token for a given username/password pair
[**getUserDetails**](OAuthApi.md#getUserDetails) | **GET** /api/oauth/me | Obtain the user details for the currently authenticated user


<a name="getOAuthToken"></a>
# **getOAuthToken**
> String getOAuthToken(datastoreId, password, username, code, grantType, scope)

Obtain a token for a given username/password pair

Obtains a token for a given username/password pair. This is the standard password grant flow of OAuth with additional support for 2-factor authentication. The obtaind token can then be used to access API endpoints for the particular user (i.e. User and Record endpoints) 

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OAuthApi apiInstance = new OAuthApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String username = "username_example"; // String | username
String password = "password_example"; // String | password
Integer code = 0; // Integer | code
String grantType = "password"; // String | An OAuth grant type. Only \"password\" is supported.
String scope = "scope_example"; // String | An optional OAuth scope parameter. Client code can pass any scope. When making further API calls, the scope is checked against the scope with which the token was created.
try {
    String result = apiInstance.getOAuthToken(username, password, datastoreId, code, grantType, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |
 **password** | **String**| password |
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **code** | **Integer**| code | [optional] [default to 0]
 **grantType** | **String**| An OAuth grant type. Only \&quot;password\&quot; is supported. | [optional] [default to password]
 **scope** | **String**| An optional OAuth scope parameter. Client code can pass any scope. When making further API calls, the scope is checked against the scope with which the token was created. | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserDetails"></a>
# **getUserDetails**
> User getUserDetails()

Obtain the user details for the currently authenticated user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OAuthApi apiInstance = new OAuthApi();
try {
    User result = apiInstance.getUserDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getUserDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

