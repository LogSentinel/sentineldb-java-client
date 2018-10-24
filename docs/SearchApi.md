# SearchApi

All URIs are relative to *https://localhost:8090/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchRecordsUsingPOST**](SearchApi.md#searchRecordsUsingPOST) | **POST** /api/search/records/{type}/datastore/{datastoreId} | Search records
[**searchUsersUsingPOST**](SearchApi.md#searchUsersUsingPOST) | **POST** /api/search/users/datastore/{datastoreId} | Search users


<a name="searchRecordsUsingPOST"></a>
# **searchRecordsUsingPOST**
> List&lt;Record&gt; searchRecordsUsingPOST(datastoreId, request, type, pageNumber, pageSize)

Search records

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
String datastoreId = "datastoreId_example"; // String | datastoreId
Object request = null; // Object | request
String type = "type_example"; // String | type
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
try {
    List<Record> result = apiInstance.searchRecordsUsingPOST(datastoreId, request, type, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchRecordsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | **String**| datastoreId |
 **request** | **Object**| request |
 **type** | **String**| type |
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

<a name="searchUsersUsingPOST"></a>
# **searchUsersUsingPOST**
> List&lt;User&gt; searchUsersUsingPOST(datastoreId, request, pageNumber, pageSize)

Search users

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
String datastoreId = "datastoreId_example"; // String | datastoreId
Object request = null; // Object | request
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
try {
    List<User> result = apiInstance.searchUsersUsingPOST(datastoreId, request, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchUsersUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | **String**| datastoreId |
 **request** | **Object**| request |
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

