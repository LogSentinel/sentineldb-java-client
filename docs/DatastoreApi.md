# DatastoreApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrUpdateSchema**](DatastoreApi.md#addOrUpdateSchema) | **POST** /api/datastore/{datastoreId}/schema/{type} | addOrUpdateSchema
[**createDatastore**](DatastoreApi.md#createDatastore) | **POST** /api/datastore | Create datastore
[**deleteSchema**](DatastoreApi.md#deleteSchema) | **DELETE** /api/datastore/{datastoreId}/schema/{type} | deleteSchema
[**entitiesByIds**](DatastoreApi.md#entitiesByIds) | **GET** /api/datastore/{datastoreId}/entities/{type} | Gets a list of users or records by list of ids
[**getDatastore**](DatastoreApi.md#getDatastore) | **GET** /api/datastore/{id} | Get datastore
[**getRecordsByDatastore**](DatastoreApi.md#getRecordsByDatastore) | **GET** /api/datastore/{datastoreId}/records | Gets records by datastore with pagination
[**getUsersByDatastore**](DatastoreApi.md#getUsersByDatastore) | **GET** /api/datastore/{datastoreId}/users | Gets users by datastore with pagination
[**listDatastores**](DatastoreApi.md#listDatastores) | **GET** /api/datastore/list | Gets a list of datastores
[**updateDatastore**](DatastoreApi.md#updateDatastore) | **POST** /api/datastore/update | Update datastore


<a name="addOrUpdateSchema"></a>
# **addOrUpdateSchema**
> addOrUpdateSchema(datastoreId, schema, type)

addOrUpdateSchema

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
String schema = "schema_example"; // String | schema
String type = "type_example"; // String | type
try {
    apiInstance.addOrUpdateSchema(datastoreId, schema, type);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#addOrUpdateSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **schema** | **String**| schema |
 **type** | **String**| type |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDatastore"></a>
# **createDatastore**
> Datastore createDatastore(name)

Create datastore

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
String name = "name_example"; // String | name
try {
    Datastore result = apiInstance.createDatastore(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#createDatastore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

[**Datastore**](Datastore.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSchema"></a>
# **deleteSchema**
> deleteSchema(datastoreId, type)

deleteSchema

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
String type = "type_example"; // String | type
try {
    apiInstance.deleteSchema(datastoreId, type);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#deleteSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **type** | **String**| type |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="entitiesByIds"></a>
# **entitiesByIds**
> List&lt;Object&gt; entitiesByIds(datastoreId, ids, type)

Gets a list of users or records by list of ids

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
List<UUID> ids = Arrays.asList(new UUID()); // List<UUID> | ids
String type = "type_example"; // String | type
try {
    List<Object> result = apiInstance.entitiesByIds(datastoreId, ids, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#entitiesByIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **ids** | [**List&lt;UUID&gt;**](UUID.md)| ids |
 **type** | **String**| type | [enum: USER, RECORD]

### Return type

**List&lt;Object&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatastore"></a>
# **getDatastore**
> Datastore getDatastore(id)

Get datastore

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
UUID id = new UUID(); // UUID | id
try {
    Datastore result = apiInstance.getDatastore(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#getDatastore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**Datastore**](Datastore.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecordsByDatastore"></a>
# **getRecordsByDatastore**
> List&lt;Record&gt; getRecordsByDatastore(datastoreId, actor, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId)

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
List<String> fieldsToAnonymize = Arrays.asList("fieldsToAnonymize_example"); // List<String> | fieldsToAnonymize
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
UUID pseudonymizationKeyId = new UUID(); // UUID | pseudonymizationKeyId
try {
    List<Record> result = apiInstance.getRecordsByDatastore(datastoreId, actor, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId);
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
 **fieldsToAnonymize** | [**List&lt;String&gt;**](String.md)| fieldsToAnonymize | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]
 **pseudonymizationKeyId** | [**UUID**](.md)| pseudonymizationKeyId | [optional]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersByDatastore"></a>
# **getUsersByDatastore**
> List&lt;User&gt; getUsersByDatastore(datastoreId, actor, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId)

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
List<String> fieldsToAnonymize = Arrays.asList("fieldsToAnonymize_example"); // List<String> | fieldsToAnonymize
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
UUID pseudonymizationKeyId = new UUID(); // UUID | pseudonymizationKeyId
try {
    List<User> result = apiInstance.getUsersByDatastore(datastoreId, actor, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId);
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
 **fieldsToAnonymize** | [**List&lt;String&gt;**](String.md)| fieldsToAnonymize | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]
 **pseudonymizationKeyId** | [**UUID**](.md)| pseudonymizationKeyId | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDatastore"></a>
# **updateDatastore**
> Object updateDatastore(datastore)

Update datastore

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
Datastore datastore = new Datastore(); // Datastore | datastore
try {
    Object result = apiInstance.updateDatastore(datastore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatastoreApi#updateDatastore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastore** | [**Datastore**](Datastore.md)| datastore |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

