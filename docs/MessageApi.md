# MessageApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmail**](MessageApi.md#sendEmail) | **POST** /api/message/email | Sends Email to user by Id
[**sendEmailWithDynamicTemplate**](MessageApi.md#sendEmailWithDynamicTemplate) | **POST** /api/message/email/{dynamicTemplateId} | Sends Email to user using SendGrid custom templates
[**sendSMS**](MessageApi.md#sendSMS) | **POST** /api/message/sms | Sends SMS to user by Id


<a name="sendEmail"></a>
# **sendEmail**
> sendEmail(datastoreId, senderEmail, subject, templateId, recipientRecordId, recipientRecordProperty, recipientUserId, recordId)

Sends Email to user by Id

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MessageApi apiInstance = new MessageApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String senderEmail = "senderEmail_example"; // String | senderEmail
String subject = "subject_example"; // String | subject
UUID templateId = new UUID(); // UUID | templateId
UUID recipientRecordId = new UUID(); // UUID | Used to designate a different record than the main one for obtaining the recipient email (or phone)
String recipientRecordProperty = "recipientRecordProperty_example"; // String | Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to.
UUID recipientUserId = new UUID(); // UUID | ID of the user whose email will be used to send the message
UUID recordId = new UUID(); // UUID | recordId
try {
    apiInstance.sendEmail(datastoreId, senderEmail, subject, templateId, recipientRecordId, recipientRecordProperty, recipientUserId, recordId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **senderEmail** | **String**| senderEmail |
 **subject** | **String**| subject |
 **templateId** | [**UUID**](.md)| templateId |
 **recipientRecordId** | [**UUID**](.md)| Used to designate a different record than the main one for obtaining the recipient email (or phone) | [optional]
 **recipientRecordProperty** | **String**| Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. | [optional]
 **recipientUserId** | [**UUID**](.md)| ID of the user whose email will be used to send the message | [optional]
 **recordId** | [**UUID**](.md)| recordId | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendEmailWithDynamicTemplate"></a>
# **sendEmailWithDynamicTemplate**
> sendEmailWithDynamicTemplate(datastoreId, dynamicTemplateId, recordId, senderEmail, recipientRecordId, recipientRecordProperty, recipientUserId)

Sends Email to user using SendGrid custom templates

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MessageApi apiInstance = new MessageApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
String dynamicTemplateId = "dynamicTemplateId_example"; // String | dynamicTemplateId
UUID recordId = new UUID(); // UUID | recordId
String senderEmail = "senderEmail_example"; // String | senderEmail
UUID recipientRecordId = new UUID(); // UUID | Used to designate a different record than the main one for obtaining the recipient email (or phone)
String recipientRecordProperty = "recipientRecordProperty_example"; // String | Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to.
UUID recipientUserId = new UUID(); // UUID | ID of the user whose email will be used to send the message
try {
    apiInstance.sendEmailWithDynamicTemplate(datastoreId, dynamicTemplateId, recordId, senderEmail, recipientRecordId, recipientRecordProperty, recipientUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#sendEmailWithDynamicTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **dynamicTemplateId** | **String**| dynamicTemplateId |
 **recordId** | [**UUID**](.md)| recordId |
 **senderEmail** | **String**| senderEmail |
 **recipientRecordId** | [**UUID**](.md)| Used to designate a different record than the main one for obtaining the recipient email (or phone) | [optional]
 **recipientRecordProperty** | **String**| Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. | [optional]
 **recipientUserId** | [**UUID**](.md)| ID of the user whose email will be used to send the message | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendSMS"></a>
# **sendSMS**
> Object sendSMS(datastoreId, templateId, recipientRecordId, recipientRecordProperty, recipientUserId, recordId)

Sends SMS to user by Id

### Example
```java
// Import classes:
//import com.logsentinel.sentineldb.ApiClient;
//import com.logsentinel.sentineldb.ApiException;
//import com.logsentinel.sentineldb.Configuration;
//import com.logsentinel.sentineldb.auth.*;
//import com.logsentinel.sentineldb.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MessageApi apiInstance = new MessageApi();
UUID datastoreId = new UUID(); // UUID | datastoreId
UUID templateId = new UUID(); // UUID | templateId
UUID recipientRecordId = new UUID(); // UUID | Used to designate a different record than the main one for obtaining the recipient email (or phone)
String recipientRecordProperty = "recipientRecordProperty_example"; // String | Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to.
UUID recipientUserId = new UUID(); // UUID | ID of the user whose email will be used to send the message
UUID recordId = new UUID(); // UUID | recordId
try {
    Object result = apiInstance.sendSMS(datastoreId, templateId, recipientRecordId, recipientRecordProperty, recipientUserId, recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#sendSMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datastoreId** | [**UUID**](.md)| datastoreId |
 **templateId** | [**UUID**](.md)| templateId |
 **recipientRecordId** | [**UUID**](.md)| Used to designate a different record than the main one for obtaining the recipient email (or phone) | [optional]
 **recipientRecordProperty** | **String**| Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. | [optional]
 **recipientUserId** | [**UUID**](.md)| ID of the user whose email will be used to send the message | [optional]
 **recordId** | [**UUID**](.md)| recordId | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

