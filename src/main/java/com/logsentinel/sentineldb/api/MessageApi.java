package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MessageApi {
  private ApiClient apiClient;

  public MessageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessageApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Sends Email to user by Id
   * 
   * @param datastoreId datastoreId (required)
   * @param senderEmail senderEmail (required)
   * @param subject subject (required)
   * @param templateId templateId (required)
   * @param recipientRecordId Used to designate a different record than the main one for obtaining the recipient email (or phone) (optional)
   * @param recipientRecordProperty Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. (optional)
   * @param recipientUserId ID of the user whose email will be used to send the message (optional)
   * @param recordId recordId (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendEmail(UUID datastoreId, String senderEmail, String subject, UUID templateId, UUID recipientRecordId, String recipientRecordProperty, UUID recipientUserId, UUID recordId) throws ApiException {

    sendEmailWithHttpInfo(datastoreId, senderEmail, subject, templateId, recipientRecordId, recipientRecordProperty, recipientUserId, recordId);
  }

  /**
   * Sends Email to user by Id
   * 
   * @param datastoreId datastoreId (required)
   * @param senderEmail senderEmail (required)
   * @param subject subject (required)
   * @param templateId templateId (required)
   * @param recipientRecordId Used to designate a different record than the main one for obtaining the recipient email (or phone) (optional)
   * @param recipientRecordProperty Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. (optional)
   * @param recipientUserId ID of the user whose email will be used to send the message (optional)
   * @param recordId recordId (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendEmailWithHttpInfo(UUID datastoreId, String senderEmail, String subject, UUID templateId, UUID recipientRecordId, String recipientRecordProperty, UUID recipientUserId, UUID recordId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling sendEmail");
    }
    
    // verify the required parameter 'senderEmail' is set
    if (senderEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'senderEmail' when calling sendEmail");
    }
    
    // verify the required parameter 'subject' is set
    if (subject == null) {
      throw new ApiException(400, "Missing the required parameter 'subject' when calling sendEmail");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling sendEmail");
    }
    
    // create path and map variables
    String localVarPath = "/api/message/email";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientRecordId", recipientRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientRecordProperty", recipientRecordProperty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientUserId", recipientUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordId", recordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderEmail", senderEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject", subject));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateId", templateId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Sends Email to user using SendGrid custom templates
   * 
   * @param datastoreId datastoreId (required)
   * @param dynamicTemplateId dynamicTemplateId (required)
   * @param recordId recordId (required)
   * @param senderEmail senderEmail (required)
   * @param recipientRecordId Used to designate a different record than the main one for obtaining the recipient email (or phone) (optional)
   * @param recipientRecordProperty Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. (optional)
   * @param recipientUserId ID of the user whose email will be used to send the message (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendEmailWithDynamicTemplate(UUID datastoreId, String dynamicTemplateId, UUID recordId, String senderEmail, UUID recipientRecordId, String recipientRecordProperty, UUID recipientUserId) throws ApiException {

    sendEmailWithDynamicTemplateWithHttpInfo(datastoreId, dynamicTemplateId, recordId, senderEmail, recipientRecordId, recipientRecordProperty, recipientUserId);
  }

  /**
   * Sends Email to user using SendGrid custom templates
   * 
   * @param datastoreId datastoreId (required)
   * @param dynamicTemplateId dynamicTemplateId (required)
   * @param recordId recordId (required)
   * @param senderEmail senderEmail (required)
   * @param recipientRecordId Used to designate a different record than the main one for obtaining the recipient email (or phone) (optional)
   * @param recipientRecordProperty Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. (optional)
   * @param recipientUserId ID of the user whose email will be used to send the message (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendEmailWithDynamicTemplateWithHttpInfo(UUID datastoreId, String dynamicTemplateId, UUID recordId, String senderEmail, UUID recipientRecordId, String recipientRecordProperty, UUID recipientUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling sendEmailWithDynamicTemplate");
    }
    
    // verify the required parameter 'dynamicTemplateId' is set
    if (dynamicTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'dynamicTemplateId' when calling sendEmailWithDynamicTemplate");
    }
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling sendEmailWithDynamicTemplate");
    }
    
    // verify the required parameter 'senderEmail' is set
    if (senderEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'senderEmail' when calling sendEmailWithDynamicTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/message/email/{dynamicTemplateId}"
      .replaceAll("\\{" + "dynamicTemplateId" + "\\}", apiClient.escapeString(dynamicTemplateId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientRecordId", recipientRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientRecordProperty", recipientRecordProperty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientUserId", recipientUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordId", recordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderEmail", senderEmail));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Sends SMS to user by Id
   * 
   * @param datastoreId datastoreId (required)
   * @param templateId templateId (required)
   * @param recipientRecordId Used to designate a different record than the main one for obtaining the recipient email (or phone) (optional)
   * @param recipientRecordProperty Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. (optional)
   * @param recipientUserId ID of the user whose email will be used to send the message (optional)
   * @param recordId recordId (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object sendSMS(UUID datastoreId, UUID templateId, UUID recipientRecordId, String recipientRecordProperty, UUID recipientUserId, UUID recordId) throws ApiException {
    return sendSMSWithHttpInfo(datastoreId, templateId, recipientRecordId, recipientRecordProperty, recipientUserId, recordId).getData();
      }

  /**
   * Sends SMS to user by Id
   * 
   * @param datastoreId datastoreId (required)
   * @param templateId templateId (required)
   * @param recipientRecordId Used to designate a different record than the main one for obtaining the recipient email (or phone) (optional)
   * @param recipientRecordProperty Instead of specifying a recipient user, you can designate a property that contains the email (or phone) for data to be sent to. (optional)
   * @param recipientUserId ID of the user whose email will be used to send the message (optional)
   * @param recordId recordId (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> sendSMSWithHttpInfo(UUID datastoreId, UUID templateId, UUID recipientRecordId, String recipientRecordProperty, UUID recipientUserId, UUID recordId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(400, "Missing the required parameter 'datastoreId' when calling sendSMS");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling sendSMS");
    }
    
    // create path and map variables
    String localVarPath = "/api/message/sms";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datastoreId", datastoreId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientRecordId", recipientRecordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientRecordProperty", recipientRecordProperty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientUserId", recipientUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordId", recordId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateId", templateId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "oAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
