# SearchApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countRecords**](SearchApi.md#countRecords) | **POST** /api/search/records/{type}/datastore/{datastoreId}/count | Count records
[**countUsers**](SearchApi.md#countUsers) | **POST** /api/search/users/datastore/{datastoreId}/count | Count users
[**searchRecords**](SearchApi.md#searchRecords) | **POST** /api/search/records/{type}/datastore/{datastoreId} | Search records
[**searchUsers**](SearchApi.md#searchUsers) | **POST** /api/search/users/datastore/{datastoreId} | Search users


<a name="countRecords"></a>
# **countRecords**
> Long countRecords(datastoreId, request, type, end, ownerId, start)

Count records

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
Object request = null; // Object | request
String type = "type_example"; // String | type
Long end = 789L; // Long | end
UUID ownerId = new UUID(); // UUID | ownerId
Long start = 0L; // Long | start
try {
    Long result = apiInstance.countRecords(datastoreId, request, type, end, ownerId, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#countRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **request** | **Object**| request |
 **type** | **String**| type |
 **end** | **Long**| end | [optional]
 **ownerId** | [**UUID**](.md)| ownerId | [optional]
 **start** | **Long**| start | [optional] [default to 0]

### Return type

**Long**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="countUsers"></a>
# **countUsers**
> Long countUsers(datastoreId, request, end, start)

Count users

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
Object request = null; // Object | request
Long end = 789L; // Long | end
Long start = 0L; // Long | start
try {
    Long result = apiInstance.countUsers(datastoreId, request, end, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#countUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **request** | **Object**| request |
 **end** | **Long**| end | [optional]
 **start** | **Long**| start | [optional] [default to 0]

### Return type

**Long**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchRecords"></a>
# **searchRecords**
> List&lt;Record&gt; searchRecords(datastoreId, request, type, start, end, fieldsToAnonymize, ownerId, pageNumber, pageSize, pseudonymizationKeyId, visibilityLevel)

Search records

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
Object request = null; // Object | request
String type = "type_example"; // String | type
Long end = 789L; // Long | end
List<String> fieldsToAnonymize = Arrays.asList("fieldsToAnonymize_example"); // List<String> | fieldsToAnonymize
UUID ownerId = new UUID(); // UUID | ownerId
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
UUID pseudonymizationKeyId = new UUID(); // UUID | pseudonymizationKeyId
Long start = 0L; // Long | start
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    List<Record> result = apiInstance.searchRecords(datastoreId, request, type, end, fieldsToAnonymize, ownerId, pageNumber, pageSize, pseudonymizationKeyId, start, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **request** | **Map**| request |
 **type** | **String**| type |
 **end** | **Long**| end | [optional]
 **fieldsToAnonymize** | [**List&lt;String&gt;**](String.md)| fieldsToAnonymize | [optional]
 **ownerId** | [**UUID**](.md)| ownerId | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]
 **pseudonymizationKeyId** | [**UUID**](.md)| pseudonymizationKeyId | [optional]
 **start** | **Long**| start | [optional] [default to 0]
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchUsers"></a>
# **searchUsers**
> List&lt;User&gt; searchUsers(datastoreId, request, start, end, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId, basicDataOnly, visibilityLevel)

Search users

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
Object request = null; // Object | request
Boolean basicDataOnly = false; // Boolean | Indicates whether only the basic data (ID, username and last update date) should be included in the response.
Long end = 789L; // Long | end
List<String> fieldsToAnonymize = Arrays.asList("fieldsToAnonymize_example"); // List<String> | fieldsToAnonymize
Integer pageNumber = 0; // Integer | pageNumber
Integer pageSize = 20; // Integer | pageSize
UUID pseudonymizationKeyId = new UUID(); // UUID | pseudonymizationKeyId
Long start = 0L; // Long | start
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    List<User> result = apiInstance.searchUsers(datastoreId, request, start, end, fieldsToAnonymize, pageNumber, pageSize, pseudonymizationKeyId, basicDataOnly, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **request** | **Map**| request |
 **start** | **Long**| start | [optional] [default to 0]
  **end** | **Long**| end | [optional]
 **fieldsToAnonymize** | [**List&lt;String&gt;**](String.md)| fieldsToAnonymize | [optional]
 **pageNumber** | **Integer**| pageNumber | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 20]
 **basicDataOnly** | **Boolean**| Indicates whether only the basic data (ID, username and last update date) should be included in the response. | [optional] [default to false]
 **pseudonymizationKeyId** | [**UUID**](.md)| pseudonymizationKeyId | [optional]
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

