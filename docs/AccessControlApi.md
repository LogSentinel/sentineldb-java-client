# AccessControlApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AccessControlApi.md#create) | **POST** /api/accessControl | Creates access control rule
[**delete**](AccessControlApi.md#delete) | **DELETE** /api/accessControl/{id} | Deletes access control rule
[**list**](AccessControlApi.md#list) | **GET** /api/accessControl | Lists access control rules of organization or filtered by datastore


<a name="create"></a>
# **create**
> UUID create(action, datastoreId, type, recordIds, recordType, roles)

Creates access control rule

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.AccessControlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccessControlApi apiInstance = new AccessControlApi();
String action = "action_example"; // String | action
UUID datastoreId = new UUID(); // UUID | datastoreId
String type = "type_example"; // String | type
List<UUID> recordIds = Arrays.asList(new UUID()); // List<UUID> | recordIds
String recordType = "recordType_example"; // String | recordType
List<String> roles = Arrays.asList("roles_example"); // List<String> | roles
try {
    UUID result = apiInstance.create(action, datastoreId, type, recordIds, recordType, roles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessControlApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| action | [enum: CREATE, UPDATE, DELETE, SEARCH]
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **type** | **String**| type | [enum: ALLOW, DENY]
 **recordIds** | [**List&lt;UUID&gt;**](UUID.md)| recordIds | [optional]
 **recordType** | **String**| recordType | [optional]
 **roles** | [**List&lt;String&gt;**](String.md)| roles | [optional]

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id)

Deletes access control rule

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.AccessControlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccessControlApi apiInstance = new AccessControlApi();
UUID id = new UUID(); // UUID | id
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessControlApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;AccessControl&gt; list(datastoreId)

Lists access control rules of organization or filtered by datastore

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.AccessControlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccessControlApi apiInstance = new AccessControlApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
try {
    List<AccessControl> result = apiInstance.list(datastoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessControlApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId | [optional]

### Return type

[**List&lt;AccessControl&gt;**](AccessControl.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

