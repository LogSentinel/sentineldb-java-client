# TemplatesApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplatesApi.md#createTemplate) | **POST** /api/template | createTemplate
[**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /api/template | deleteTemplate
[**template**](TemplatesApi.md#template) | **GET** /api/template | template
[**updateTemplate**](TemplatesApi.md#updateTemplate) | **PUT** /api/template | updateTemplate


<a name="createTemplate"></a>
# **createTemplate**
> MessageTemplate createTemplate(content, name)

createTemplate

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
String content = "content_example"; // String | content
String name = "name_example"; // String | name
try {
    MessageTemplate result = apiInstance.createTemplate(content, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| content |
 **name** | **String**| name |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(templateId)

deleteTemplate

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
UUID templateId = new UUID(); // UUID | templateId
try {
    apiInstance.deleteTemplate(templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#deleteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**UUID**](.md)| templateId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="template"></a>
# **template**
> MessageTemplate template(templateName)

template

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
String templateName = "templateName_example"; // String | templateName
try {
    MessageTemplate result = apiInstance.template(templateName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| templateName |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateTemplate"></a>
# **updateTemplate**
> updateTemplate(content, name, templateId)

updateTemplate

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
String content = "content_example"; // String | content
String name = "name_example"; // String | name
UUID templateId = new UUID(); // UUID | templateId
try {
    apiInstance.updateTemplate(content, name, templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#updateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| content |
 **name** | **String**| name |
 **templateId** | [**UUID**](.md)| templateId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

