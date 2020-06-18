# ExternalEncryptionApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**decryptData**](ExternalEncryptionApi.md#decryptData) | **POST** /api/encryption/decrypt | Decrypt any data (represented as base64-encoded string) for a given entity type, id and datastore
[**encryptData**](ExternalEncryptionApi.md#encryptData) | **POST** /api/encryption/encrypt | Encrypt any data (represented as string) for a given entity type, id and datastore


<a name="decryptData"></a>
# **decryptData**
> String decryptData(ciphertext, datastoreId, entityId, entityType, id, organizationId, secret)

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
UUID id = new UUID(); // UUID | 
UUID organizationId = new UUID(); // UUID | 
String secret = "secret_example"; // String | 
try {
    String result = apiInstance.decryptData(ciphertext, datastoreId, entityId, entityType, id, organizationId, secret);
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
 **id** | [**UUID**](.md)|  | [optional]
 **organizationId** | [**UUID**](.md)|  | [optional]
 **secret** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="encryptData"></a>
# **encryptData**
> ExternalEncryptionResult encryptData(datastoreId, entityId, entityType, fieldName, payload, id, organizationId, secret)

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
UUID id = new UUID(); // UUID | 
UUID organizationId = new UUID(); // UUID | 
String secret = "secret_example"; // String | 
try {
    ExternalEncryptionResult result = apiInstance.encryptData(datastoreId, entityId, entityType, fieldName, payload, id, organizationId, secret);
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
 **id** | [**UUID**](.md)|  | [optional]
 **organizationId** | [**UUID**](.md)|  | [optional]
 **secret** | **String**|  | [optional]

### Return type

[**ExternalEncryptionResult**](ExternalEncryptionResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

