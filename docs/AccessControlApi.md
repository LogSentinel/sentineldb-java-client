# AccessControlApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createACLRules**](AccessControlApi.md#createACLRules) | **POST** /api/accessControl | Creates access control rule
[**deleteACLRule**](AccessControlApi.md#deleteACLRule) | **DELETE** /api/accessControl/{id} | Deletes access control rule
[**listACLRules**](AccessControlApi.md#listACLRules) | **GET** /api/accessControl | Lists access control rules of organization or filtered by datastore


<a name="createACLRules"></a>
# **createACLRules**
> UUID createACLRules(action, datastoreId, type, recordIds, recordType, roles)

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
    UUID result = apiInstance.createACLRules(action, datastoreId, type, recordIds, recordType, roles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessControlApi#createACLRules");
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

<a name="deleteACLRule"></a>
# **deleteACLRule**
> deleteACLRule(id)

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
    apiInstance.deleteACLRule(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessControlApi#deleteACLRule");
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

<a name="listACLRules"></a>
# **listACLRules**
> List&lt;AccessControl&gt; listACLRules(datastoreId)

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
    List<AccessControl> result = apiInstance.listACLRules(datastoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessControlApi#listACLRules");
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

