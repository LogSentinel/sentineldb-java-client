# DatastoreApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecordsByDatastore**](DatastoreApi.md#getRecordsByDatastore) | **GET** /api/datastore/{datastoreId}/records | Gets records by datastore with pagination
[**getUsersByDatastore**](DatastoreApi.md#getUsersByDatastore) | **GET** /api/datastore/{datastoreId}/users | Gets users by datastore with pagination
[**listDatastores**](DatastoreApi.md#listDatastores) | **GET** /api/datastore/list | Gets a list of datastores


<a name="getRecordsByDatastore"></a>
# **getRecordsByDatastore**
> List&lt;Record&gt; getRecordsByDatastore(datastoreId, actor, pageNumber, pageSize)

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
UUID datastoreId = new UUID(); // UUID | datastoreId
String actor = "actor_example"; // String | actor
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
try {
    List<Record> result = apiInstance.getRecordsByDatastore(datastoreId, actor, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#getRecordsByDatastore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **actor** | **String**| actor | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getUsersByDatastore"></a>
# **getUsersByDatastore**
> List&lt;User&gt; getUsersByDatastore(datastoreId, actor, pageNumber, pageSize)

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
UUID datastoreId = new UUID(); // UUID | datastoreId
String actor = "actor_example"; // String | actor
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
try {
    List<User> result = apiInstance.getUsersByDatastore(datastoreId, actor, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#getUsersByDatastore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **actor** | **String**| actor | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="listDatastores"></a>
# **listDatastores**
> List&lt;Datastore&gt; listDatastores()

Gets a list of datastores

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
try {
    List<Datastore> result = apiInstance.listDatastores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#listDatastores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Datastore&gt;**](Datastore.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

