# SearchApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchRecords**](SearchApi.md#searchRecords) | **POST** /api/search/records/{type}/datastore/{datastoreId} | Search records
[**searchUsers**](SearchApi.md#searchUsers) | **POST** /api/search/users/datastore/{datastoreId} | Search users


<a name="searchRecords"></a>
# **searchRecords**
> List&lt;Record&gt; searchRecords(datastoreId, request, type, end, pageNumber, pageSize, start)

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
UUID datastoreId = new UUID(); // UUID | datastoreId
Object request = null; // Object | request
String type = "type_example"; // String | type
Long end = 789L; // Long | end
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
Long start = 0L; // Long | start
try {
    List<Record> result = apiInstance.searchRecords(datastoreId, request, type, end, pageNumber, pageSize, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **request** | **Object**| request |
 **type** | **String**| type |
 **end** | **Long**| end | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]
 **start** | **Long**| start | [optional] [default to 0]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchUsers"></a>
# **searchUsers**
> List&lt;User&gt; searchUsers(datastoreId, request, end, pageNumber, pageSize, start)

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
UUID datastoreId = new UUID(); // UUID | datastoreId
Object request = null; // Object | request
Long end = 789L; // Long | end
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
Long start = 0L; // Long | start
try {
    List<User> result = apiInstance.searchUsers(datastoreId, request, end, pageNumber, pageSize, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **request** | **Object**| request |
 **end** | **Long**| end | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]
 **start** | **Long**| start | [optional] [default to 0]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

