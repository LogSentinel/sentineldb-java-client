# SearchSchemaApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSearchSchemaField**](SearchSchemaApi.md#addSearchSchemaField) | **PUT** /api/search-schema/{id}/addField/{field} | Add field to search schema
[**createSearchSchema**](SearchSchemaApi.md#createSearchSchema) | **POST** /api/search-schema/{datastoreId}/{entityType} | Create search schema
[**deleteSearchSchema**](SearchSchemaApi.md#deleteSearchSchema) | **DELETE** /api/search-schema/{id} | Delete search schema
[**removeSearchSchemaField**](SearchSchemaApi.md#removeSearchSchemaField) | **PUT** /api/search-schema/{id}/removeField/{field} | Add field to search schema


<a name="addSearchSchemaField"></a>
# **addSearchSchemaField**
> Object addSearchSchemaField(field, id, analyzed)

Add field to search schema

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchSchemaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchSchemaApi apiInstance = new SearchSchemaApi();
String field = "field_example"; // String | field
UUID id = new UUID(); // UUID | id
Boolean analyzed = true; // Boolean | analyzed
try {
    Object result = apiInstance.addSearchSchemaField(field, id, analyzed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchSchemaApi#addSearchSchemaField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **String**| field |
 **id** | [**UUID**](.md)| id |
 **analyzed** | **Boolean**| analyzed | [optional] [default to true]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSearchSchema"></a>
# **createSearchSchema**
> SearchSchema createSearchSchema(datastoreId, entityType, fields, recordType)

Create search schema

Creates a search schema. A search schema is required for indexing and searching records and users. Only fields that are part of the schema are indexed and searcheable.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchSchemaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchSchemaApi apiInstance = new SearchSchemaApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String entityType = "entityType_example"; // String | entityType
Object fields = null; // Object | fields
String recordType = "recordType_example"; // String | recordType
try {
    SearchSchema result = apiInstance.createSearchSchema(datastoreId, entityType, fields, recordType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchSchemaApi#createSearchSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **entityType** | **String**| entityType | [enum: USER, RECORD]
 **fields** | **Object**| fields |
 **recordType** | **String**| recordType | [optional]

### Return type

[**SearchSchema**](SearchSchema.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSearchSchema"></a>
# **deleteSearchSchema**
> Object deleteSearchSchema(id)

Delete search schema

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchSchemaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchSchemaApi apiInstance = new SearchSchemaApi();
UUID id = new UUID(); // UUID | id
try {
    Object result = apiInstance.deleteSearchSchema(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchSchemaApi#deleteSearchSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSearchSchemaField"></a>
# **removeSearchSchemaField**
> Object removeSearchSchemaField(field, id)

Add field to search schema

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchSchemaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchSchemaApi apiInstance = new SearchSchemaApi();
String field = "field_example"; // String | field
UUID id = new UUID(); // UUID | id
try {
    Object result = apiInstance.removeSearchSchemaField(field, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchSchemaApi#removeSearchSchemaField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **String**| field |
 **id** | [**UUID**](.md)| id |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

