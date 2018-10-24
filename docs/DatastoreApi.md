# DatastoreApi

All URIs are relative to *https://localhost:8090/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecordsByDatastoreUsingGET**](DatastoreApi.md#getRecordsByDatastoreUsingGET) | **GET** /api/datastore/{datastoreId}/records | Gets records by datastore with pagination
[**getUsersByDatastoreUsingGET**](DatastoreApi.md#getUsersByDatastoreUsingGET) | **GET** /api/datastore/{datastoreId}/users | Gets users by datastore with pagination


<a name="getRecordsByDatastoreUsingGET"></a>
# **getRecordsByDatastoreUsingGET**
> List&lt;Record&gt; getRecordsByDatastoreUsingGET(datastoreId, actor, pageNumber, pageSize)

Gets records by datastore with pagination

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.DatastoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DatastoreApi apiInstance = new DatastoreApi();
String datastoreId = "datastoreId_example"; // String | datastoreId
String actor = "actor_example"; // String | actor
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
try {
    List<Record> result = apiInstance.getRecordsByDatastoreUsingGET(datastoreId, actor, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#getRecordsByDatastoreUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | **String**| datastoreId |
 **actor** | **String**| actor | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="getUsersByDatastoreUsingGET"></a>
# **getUsersByDatastoreUsingGET**
> List&lt;User&gt; getUsersByDatastoreUsingGET(datastoreId, actor, pageNumber, pageSize)

Gets users by datastore with pagination

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.DatastoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DatastoreApi apiInstance = new DatastoreApi();
String datastoreId = "datastoreId_example"; // String | datastoreId
String actor = "actor_example"; // String | actor
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
try {
    List<User> result = apiInstance.getUsersByDatastoreUsingGET(datastoreId, actor, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#getUsersByDatastoreUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | **String**| datastoreId |
 **actor** | **String**| actor | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

