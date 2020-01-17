# RecordsApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBinaryRecord**](RecordsApi.md#createBinaryRecord) | **POST** /api/record/binary/datastore/{datastoreId} | Creates a binary record
[**createRecord**](RecordsApi.md#createRecord) | **POST** /api/record/datastore/{datastoreId} | Creates a record
[**deleteRecord**](RecordsApi.md#deleteRecord) | **DELETE** /api/record/{recordId} | Deletes an existing record
[**getRecord**](RecordsApi.md#getRecord) | **GET** /api/record/{recordId} | Gets record by id
[**getRecordBinaryContent**](RecordsApi.md#getRecordBinaryContent) | **GET** /api/record/binary/{recordId} | Gets record with binary content by id
[**getRecordVersion**](RecordsApi.md#getRecordVersion) | **GET** /api/record/{recordId}/versions/{version} | Gets concrete record version
[**getRecordVersions**](RecordsApi.md#getRecordVersions) | **GET** /api/record/{recordId}/versions | Gets all record versions by id
[**updateBinaryRecord**](RecordsApi.md#updateBinaryRecord) | **PUT** /api/record/binary/{recordId} | Updates binary content of a record
[**updateBinaryRecordMetadata**](RecordsApi.md#updateBinaryRecordMetadata) | **PUT** /api/record/binary/metadata/{recordId} | Updates metadata of a record with binary content
[**updateRecord**](RecordsApi.md#updateRecord) | **PUT** /api/record/{recordId} | Updates record
[**updateRecordOwner**](RecordsApi.md#updateRecordOwner) | **POST** /api/record/{recordId}/owner/{ownerId} | Updates a record&#39;s owner


<a name="createBinaryRecord"></a>
# **createBinaryRecord**
> Record createBinaryRecord(body, datastoreId, actorId, ownerId, type)

Creates a binary record

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
File body = new File("/path/to/file.txt"); // File | body
UUID datastoreId = new UUID(); // UUID | datastoreId
Object actorId = null; // Object | Optional ID of the actor that performed the action. If not supplied, it can be inferred
Object ownerId = null; // Object | ownerId
Object type = null; // Object | type
try {
    Record result = apiInstance.createBinaryRecord(body, datastoreId, actorId, ownerId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#createBinaryRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **File**| body |
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **actorId** | [**Object**](.md)| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]
 **ownerId** | [**Object**](.md)| ownerId | [optional]
 **type** | [**Object**](.md)| type | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createRecord"></a>
# **createRecord**
> Record createRecord(body, datastoreId, actorId, ownerId, type)

Creates a record

Creates a new record by specifying the record details (arbitrary JSON) as well as the ID of the owning user. 

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String body = "body_example"; // String | body
UUID datastoreId = new UUID(); // UUID | datastoreId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
UUID ownerId = new UUID(); // UUID | ownerId
String type = "None"; // String | type
try {
    Record result = apiInstance.createRecord(body, datastoreId, actorId, ownerId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#createRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]
 **ownerId** | [**UUID**](.md)| ownerId | [optional]
 **type** | **String**| type | [optional] [default to None]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRecord"></a>
# **deleteRecord**
> Object deleteRecord(recordId, actorId)

Deletes an existing record

Deletes a record by marking the latest version as deleted

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    Object result = apiInstance.deleteRecord(recordId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#deleteRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecord"></a>
# **getRecord**
> Record getRecord(recordId, actorId, fieldsToAnonymize, pseudonymizationKeyId, visibilityLevel)

Gets record by id

Retrieves the latest version of a record by ID

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
List<String> fieldsToAnonymize = Arrays.asList("fieldsToAnonymize_example"); // List<String> | fieldsToAnonymize
UUID pseudonymizationKeyId = new UUID(); // UUID | pseudonymizationKeyId
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    Record result = apiInstance.getRecord(recordId, actorId, fieldsToAnonymize, pseudonymizationKeyId, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]
 **fieldsToAnonymize** | [**List&lt;String&gt;**](String.md)| fieldsToAnonymize | [optional]
 **pseudonymizationKeyId** | [**UUID**](.md)| pseudonymizationKeyId | [optional]
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecordBinaryContent"></a>
# **getRecordBinaryContent**
> getRecordBinaryContent(recordId, actorId)

Gets record with binary content by id

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    apiInstance.getRecordBinaryContent(recordId, actorId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getRecordBinaryContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getRecordVersion"></a>
# **getRecordVersion**
> Record getRecordVersion(recordId, version, actorId)

Gets concrete record version

Retrieves a specific (older) version for a given record.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
UUID recordId = new UUID(); // UUID | recordId
Integer version = 56; // Integer | version
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    Record result = apiInstance.getRecordVersion(recordId, version, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getRecordVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | [**UUID**](.md)| recordId |
 **version** | **Integer**| version |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecordVersions"></a>
# **getRecordVersions**
> List&lt;Integer&gt; getRecordVersions(recordId)

Gets all record versions by id

Retrieves all the versions for a given record. Each version is a historical snapshot of the record object prior to each update.

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
UUID recordId = new UUID(); // UUID | recordId
try {
    List<Integer> result = apiInstance.getRecordVersions(recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getRecordVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | [**UUID**](.md)| recordId |

### Return type

**List&lt;Integer&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBinaryRecord"></a>
# **updateBinaryRecord**
> updateBinaryRecord(body, recordId, actorId)

Updates binary content of a record

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
File body = new File("/path/to/file.txt"); // File | body
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    apiInstance.updateBinaryRecord(body, recordId, actorId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateBinaryRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **File**| body |
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateBinaryRecordMetadata"></a>
# **updateBinaryRecordMetadata**
> updateBinaryRecordMetadata(metadata, recordId, actorId)

Updates metadata of a record with binary content

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
String metadata = "metadata_example"; // String | metadata
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    apiInstance.updateBinaryRecordMetadata(metadata, recordId, actorId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateBinaryRecordMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadata** | **String**| metadata |
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRecord"></a>
# **updateRecord**
> Record updateRecord(record, recordId, actorId)

Updates record

Updates a record, thus creating a newer version

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
Record record = new Record(); // Record | record
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
try {
    Record result = apiInstance.updateRecord(record, recordId, actorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**Record**](Record.md)| record |
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRecordOwner"></a>
# **updateRecordOwner**
> Record updateRecordOwner(ownerId, recordId, actorId, visibilityLevel)

Updates a record&#39;s owner

Changes the owner of a given record by passing the ID of another user

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecordsApi apiInstance = new RecordsApi();
UUID ownerId = new UUID(); // UUID | ownerId
UUID recordId = new UUID(); // UUID | recordId
String actorId = "actorId_example"; // String | Optional ID of the actor that performed the action. If not supplied, it can be inferred
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    Record result = apiInstance.updateRecordOwner(ownerId, recordId, actorId, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateRecordOwner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownerId** | [**UUID**](.md)| ownerId |
 **recordId** | [**UUID**](.md)| recordId |
 **actorId** | **String**| Optional ID of the actor that performed the action. If not supplied, it can be inferred | [optional]
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**Record**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

