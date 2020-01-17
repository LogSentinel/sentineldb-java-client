# SqlApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeDelete**](SqlApi.md#executeDelete) | **POST** /api/sql/delete | Executes delete query against sentinelDB
[**executeInsert**](SqlApi.md#executeInsert) | **POST** /api/sql/insert | Executes insert query against sentinelDB
[**executeSelect**](SqlApi.md#executeSelect) | **POST** /api/sql/select | Executes select query against sentinelDB
[**executeUpdate**](SqlApi.md#executeUpdate) | **POST** /api/sql/update | Executes update query against sentinelDB
[**prepareDeleteStatement**](SqlApi.md#prepareDeleteStatement) | **POST** /api/sql/delete/prepared | Prepared delete statement against sentinelDB
[**prepareInsertStatement**](SqlApi.md#prepareInsertStatement) | **POST** /api/sql/insert/prepared | Prepared insert statement against sentinelDB
[**prepareSelectStatement**](SqlApi.md#prepareSelectStatement) | **POST** /api/sql/select/prepared | Prepared select statement against sentinelDB
[**prepareUpdateStatement**](SqlApi.md#prepareUpdateStatement) | **POST** /api/sql/update/prepared | Prepared update statement against sentinelDB


<a name="executeDelete"></a>
# **executeDelete**
> Integer executeDelete(query, visibilityLevel)

Executes delete query against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
String query = "query_example"; // String | query
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    Integer result = apiInstance.executeDelete(query, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#executeDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query |
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

**Integer**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeInsert"></a>
# **executeInsert**
> UUID executeInsert(query)

Executes insert query against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
String query = "query_example"; // String | query
try {
    UUID result = apiInstance.executeInsert(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#executeInsert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query |

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeSelect"></a>
# **executeSelect**
> List&lt;List&lt;String&gt;&gt; executeSelect(query, visibilityLevel)

Executes select query against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
String query = "query_example"; // String | query
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    List<List<String>> result = apiInstance.executeSelect(query, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#executeSelect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query |
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**List&lt;List&lt;String&gt;&gt;**](List.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeUpdate"></a>
# **executeUpdate**
> Integer executeUpdate(query, visibilityLevel)

Executes update query against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
String query = "query_example"; // String | query
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    Integer result = apiInstance.executeUpdate(query, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#executeUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query |
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

**Integer**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareDeleteStatement"></a>
# **prepareDeleteStatement**
> Integer prepareDeleteStatement(statement, visibilityLevel)

Prepared delete statement against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
Statement statement = new Statement(); // Statement | statement
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    Integer result = apiInstance.prepareDeleteStatement(statement, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#prepareDeleteStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement** | [**Statement**](Statement.md)| statement |
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

**Integer**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareInsertStatement"></a>
# **prepareInsertStatement**
> UUID prepareInsertStatement(statement)

Prepared insert statement against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
Statement statement = new Statement(); // Statement | statement
try {
    UUID result = apiInstance.prepareInsertStatement(statement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#prepareInsertStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement** | [**Statement**](Statement.md)| statement |

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareSelectStatement"></a>
# **prepareSelectStatement**
> List&lt;List&lt;String&gt;&gt; prepareSelectStatement(statement, visibilityLevel)

Prepared select statement against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
Statement statement = new Statement(); // Statement | statement
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    List<List<String>> result = apiInstance.prepareSelectStatement(statement, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#prepareSelectStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement** | [**Statement**](Statement.md)| statement |
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

[**List&lt;List&lt;String&gt;&gt;**](List.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareUpdateStatement"></a>
# **prepareUpdateStatement**
> Integer prepareUpdateStatement(statement, visibilityLevel)

Prepared update statement against sentinelDB

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.SqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SqlApi apiInstance = new SqlApi();
Statement statement = new Statement(); // Statement | statement
VisibilityLevelEnum visibilityLevel = "PUBLIC"; // String | visibilityLevel
try {
    Integer result = apiInstance.prepareUpdateStatement(statement, visibilityLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#prepareUpdateStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement** | [**Statement**](Statement.md)| statement |
 **visibilityLevel** | **String**| visibilityLevel | [optional] [default to PUBLIC] [enum: PUBLIC, PROTECTED, PRIVATE, SYSTEM]

### Return type

**Integer**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

