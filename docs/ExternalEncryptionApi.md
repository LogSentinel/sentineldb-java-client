# ExternalEncryptionApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchDecrypt**](ExternalEncryptionApi.md#batchDecrypt) | **POST** /api/encryption/batch/decrypt | Batch decrypt any data (represented as string) for a given entity type, id and datastore
[**batchEncrypt**](ExternalEncryptionApi.md#batchEncrypt) | **POST** /api/encryption/batch/encrypt | Batch encrypt any data (represented as string) for a given entity type, id and datastore
[**decryptData**](ExternalEncryptionApi.md#decryptData) | **POST** /api/encryption/decrypt | Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
[**encryptData**](ExternalEncryptionApi.md#encryptData) | **POST** /api/encryption/encrypt | Encrypt any data (represented as string) for a given entity type, id and datastore
[**getLookupValue**](ExternalEncryptionApi.md#getLookupValue) | **POST** /api/encryption/getLookupValue | Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore


<a name="batchDecrypt"></a>
# **batchDecrypt**
> List&lt;String&gt; batchDecrypt(request)

Batch decrypt any data (represented as string) for a given entity type, id and datastore

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.ExternalEncryptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ExternalEncryptionApi apiInstance = new ExternalEncryptionApi();
List<BatchDecryptRequest> request = Arrays.asList(new BatchDecryptRequest()); // List<BatchDecryptRequest> | request
try {
    List<String> result = apiInstance.batchDecrypt(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEncryptionApi#batchDecrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**List&lt;BatchDecryptRequest&gt;**](BatchDecryptRequest.md)| request |

### Return type

**List&lt;String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchEncrypt"></a>
# **batchEncrypt**
> List&lt;ExternalEncryptionResult&gt; batchEncrypt(request)

Batch encrypt any data (represented as string) for a given entity type, id and datastore

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.ExternalEncryptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ExternalEncryptionApi apiInstance = new ExternalEncryptionApi();
List<BatchEncryptRequest> request = Arrays.asList(new BatchEncryptRequest()); // List<BatchEncryptRequest> | request
try {
    List<ExternalEncryptionResult> result = apiInstance.batchEncrypt(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEncryptionApi#batchEncrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**List&lt;BatchEncryptRequest&gt;**](BatchEncryptRequest.md)| request |

### Return type

[**List&lt;ExternalEncryptionResult&gt;**](ExternalEncryptionResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="decryptData"></a>
# **decryptData**
> String decryptData(ciphertext, datastoreId, entityId, entityType)

Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.ExternalEncryptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ExternalEncryptionApi apiInstance = new ExternalEncryptionApi();
String ciphertext = "ciphertext_example"; // String | ciphertext
UUID datastoreId = new UUID(); // UUID | datastoreId
String entityId = "entityId_example"; // String | entityId
String entityType = "entityType_example"; // String | entityType
try {
    String result = apiInstance.decryptData(ciphertext, datastoreId, entityId, entityType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEncryptionApi#decryptData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ciphertext** | **String**| ciphertext |
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **entityId** | **String**| entityId |
 **entityType** | **String**| entityType |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="encryptData"></a>
# **encryptData**
> ExternalEncryptionResult encryptData(datastoreId, entityId, entityType, fieldName, payload)

Encrypt any data (represented as string) for a given entity type, id and datastore

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.ExternalEncryptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ExternalEncryptionApi apiInstance = new ExternalEncryptionApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String entityId = "entityId_example"; // String | entityId
String entityType = "entityType_example"; // String | entityType
String fieldName = "fieldName_example"; // String | fieldName
String payload = "payload_example"; // String | payload
try {
    ExternalEncryptionResult result = apiInstance.encryptData(datastoreId, entityId, entityType, fieldName, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEncryptionApi#encryptData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **entityId** | **String**| entityId |
 **entityType** | **String**| entityType |
 **fieldName** | **String**| fieldName |
 **payload** | **String**| payload |

### Return type

[**ExternalEncryptionResult**](ExternalEncryptionResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLookupValue"></a>
# **getLookupValue**
> String getLookupValue(datastoreId, plaintext)

Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.ExternalEncryptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ExternalEncryptionApi apiInstance = new ExternalEncryptionApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String plaintext = "plaintext_example"; // String | plaintext
try {
    String result = apiInstance.getLookupValue(datastoreId, plaintext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEncryptionApi#getLookupValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **plaintext** | **String**| plaintext |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

