# BatchApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchDelete**](BatchApi.md#batchDelete) | **POST** /api/batch/delete/{datastoreId} | Deletes a batch of entities. If an error occurs, all operations are rolled back
[**batchInsert**](BatchApi.md#batchInsert) | **POST** /api/batch/insert/{datastoreId} | Inserts a batch of entities. If an error occurs, all operations are rolled back


<a name="batchDelete"></a>
# **batchDelete**
> batchDelete(batchRequestItems, datastoreId)

Deletes a batch of entities. If an error occurs, all operations are rolled back

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.BatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BatchApi apiInstance = new BatchApi();
List<BatchRequestItem> batchRequestItems = Arrays.asList(new BatchRequestItem()); // List<BatchRequestItem> | batchRequestItems
UUID datastoreId = new UUID(); // UUID | datastoreId
try {
    apiInstance.batchDelete(batchRequestItems, datastoreId);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#batchDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchRequestItems** | [**List&lt;BatchRequestItem&gt;**](BatchRequestItem.md)| batchRequestItems |
 **datastoreId** | [**UUID**](.md)| datastoreId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchInsert"></a>
# **batchInsert**
> batchInsert(batchRequestItems, datastoreId)

Inserts a batch of entities. If an error occurs, all operations are rolled back

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.BatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BatchApi apiInstance = new BatchApi();
List<BatchRequestItem> batchRequestItems = Arrays.asList(new BatchRequestItem()); // List<BatchRequestItem> | batchRequestItems
UUID datastoreId = new UUID(); // UUID | datastoreId
try {
    apiInstance.batchInsert(batchRequestItems, datastoreId);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#batchInsert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchRequestItems** | [**List&lt;BatchRequestItem&gt;**](BatchRequestItem.md)| batchRequestItems |
 **datastoreId** | [**UUID**](.md)| datastoreId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

