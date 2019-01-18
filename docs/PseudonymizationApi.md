# PseudonymizationApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PseudonymizationApi.md#create) | **POST** /api/pseudonymization/{datastoreId} | Creates a pseudonymization key
[**delete**](PseudonymizationApi.md#delete) | **DELETE** /api/pseudonymization/{id} | Deletes a pseudonymization key
[**get**](PseudonymizationApi.md#get) | **GET** /api/pseudonymization/{id} | Gets a pseudonymization key by id
[**listist**](PseudonymizationApi.md#listist) | **GET** /api/pseudonymization/list/{datastoreId} | Gets a pseudonymization keys by datastoreId


<a name="create"></a>
# **create**
> PseudonymizationKey create(datastoreId, description)

Creates a pseudonymization key

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.PseudonymizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PseudonymizationApi apiInstance = new PseudonymizationApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String description = "description_example"; // String | description
try {
    PseudonymizationKey result = apiInstance.create(datastoreId, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PseudonymizationApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **description** | **String**| description |

### Return type

[**PseudonymizationKey**](PseudonymizationKey.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id)

Deletes a pseudonymization key

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.PseudonymizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PseudonymizationApi apiInstance = new PseudonymizationApi();
UUID id = new UUID(); // UUID | id
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PseudonymizationApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="get"></a>
# **get**
> PseudonymizationKey get(id)

Gets a pseudonymization key by id

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.PseudonymizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PseudonymizationApi apiInstance = new PseudonymizationApi();
UUID id = new UUID(); // UUID | id
try {
    PseudonymizationKey result = apiInstance.get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PseudonymizationApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**PseudonymizationKey**](PseudonymizationKey.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listist"></a>
# **listist**
> List&lt;PseudonymizationKey&gt; listist(datastoreId)

Gets a pseudonymization keys by datastoreId

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.PseudonymizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PseudonymizationApi apiInstance = new PseudonymizationApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
try {
    List<PseudonymizationKey> result = apiInstance.listist(datastoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PseudonymizationApi#listist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |

### Return type

[**List&lt;PseudonymizationKey&gt;**](PseudonymizationKey.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

