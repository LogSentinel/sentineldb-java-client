# RecordsApi

All URIs are relative to *https://localhost:8090/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST**](RecordsApi.md#createUsingPOST) | **POST** /api/record/datastore/{datastoreId} | Creates a record
[**deleteUsingDELETE**](RecordsApi.md#deleteUsingDELETE) | **DELETE** /api/record/{recordId} | Deletes an existing record
[**getUsingGET**](RecordsApi.md#getUsingGET) | **GET** /api/record/{recordId} | Gets record by id
[**getVersionUsingGET**](RecordsApi.md#getVersionUsingGET) | **GET** /api/record/{recordId}/versions/{version} | Gets concrete record version
[**getVersionsUsingGET**](RecordsApi.md#getVersionsUsingGET) | **GET** /api/record/{recordId}/versions | Gets all record versions by id
[**updateOwnerUsingPUT**](RecordsApi.md#updateOwnerUsingPUT) | **PUT** /api/record/{recordId}/owner/{ownerId} | Updates a record&#39;s owner
[**updateUsingPUT**](RecordsApi.md#updateUsingPUT) | **PUT** /api/record | Updates record


<a name="createUsingPOST"></a>
# **createUsingPOST**
> Record createUsingPOST(body, datastoreId, actorId, ownerId, type)

Creates a record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String body = "body_example"; // String | body
String datastoreId = "datastoreId_example"; // String | datastoreId
String actorId = "actorId_example"; // String | actorId
String ownerId = "ownerId_example"; // String | ownerId
String type = "type_example"; // String | type
try {
    Record result = apiInstance.createUsingPOST(body, datastoreId, actorId, ownerId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **datastoreId** | **String**| datastoreId |
 **actorId** | **String**| actorId | [optional]
 **ownerId** | **String**| ownerId | [optional]
 **type** | **String**| type | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> Object deleteUsingDELETE(recordId, actorId)

Deletes an existing record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String recordId = "recordId_example"; // String | recordId
String actorId = "actorId_example"; // String | actorId
try {
    Object result = apiInstance.deleteUsingDELETE(recordId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **String**| recordId |
 **actorId** | **String**| actorId | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="getUsingGET"></a>
# **getUsingGET**
> Record getUsingGET(recordId, actorId)

Gets record by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String recordId = "recordId_example"; // String | recordId
String actorId = "actorId_example"; // String | actorId
try {
    Record result = apiInstance.getUsingGET(recordId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **String**| recordId |
 **actorId** | **String**| actorId | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="getVersionUsingGET"></a>
# **getVersionUsingGET**
> Record getVersionUsingGET(recordId, version, actorId)

Gets concrete record version

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String recordId = "recordId_example"; // String | recordId
Integer version = 56; // Integer | version
String actorId = "actorId_example"; // String | actorId
try {
    Record result = apiInstance.getVersionUsingGET(recordId, version, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getVersionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **String**| recordId |
 **version** | **Integer**| version |
 **actorId** | **String**| actorId | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="getVersionsUsingGET"></a>
# **getVersionsUsingGET**
> List&lt;Integer&gt; getVersionsUsingGET(recordId)

Gets all record versions by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String recordId = "recordId_example"; // String | recordId
try {
    List<Integer> result = apiInstance.getVersionsUsingGET(recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getVersionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **String**| recordId |

### Return type

**List&lt;Integer&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/xml, application/json

<a name="updateOwnerUsingPUT"></a>
# **updateOwnerUsingPUT**
> Record updateOwnerUsingPUT(ownerId, recordId, actorId)

Updates a record&#39;s owner

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String ownerId = "ownerId_example"; // String | ownerId
String recordId = "recordId_example"; // String | recordId
String actorId = "actorId_example"; // String | actorId
try {
    Record result = apiInstance.updateOwnerUsingPUT(ownerId, recordId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateOwnerUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownerId** | **String**| ownerId |
 **recordId** | **String**| recordId |
 **actorId** | **String**| actorId | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Record updateUsingPUT(record, actorId)

Updates record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
Record record = new Record(); // Record | record
String actorId = "actorId_example"; // String | actorId
try {
    Record result = apiInstance.updateUsingPUT(record, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**Record**](Record.md)| record |
 **actorId** | **String**| actorId | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, *_/_*
 - **Accept**: application/xml, application/json

