package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.ApiClient;
import com.logsentinel.sentineldb.ApiResponse;
import com.logsentinel.sentineldb.Configuration;
import com.logsentinel.sentineldb.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.sentineldb.model.MessageTemplate;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TemplatesApi {
  private ApiClient apiClient;

  public TemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * createTemplate
   * 
   * @param content content (required)
   * @param name name (required)
   * @return MessageTemplate
   * @throws ApiException if fails to make API call
   */
  public MessageTemplate createTemplate(String content, String name) throws ApiException {
    return createTemplateWithHttpInfo(content, name).getData();
      }

  /**
   * createTemplate
   * 
   * @param content content (required)
   * @param name name (required)
   * @return ApiResponse&lt;MessageTemplate&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MessageTemplate> createTemplateWithHttpInfo(String content, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'content' is set
    if (content == null) {
      throw new ApiException(400, "Missing the required parameter 'content' when calling createTemplate");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/template";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content", content));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MessageTemplate> localVarReturnType = new GenericType<MessageTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * deleteTemplate
   * 
   * @param templateId templateId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplate(UUID templateId) throws ApiException {

    deleteTemplateWithHttpInfo(templateId);
  }

  /**
   * deleteTemplate
   * 
   * @param templateId templateId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteTemplateWithHttpInfo(UUID templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/template";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateId", templateId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * template
   * 
   * @param templateName templateName (required)
   * @return MessageTemplate
   * @throws ApiException if fails to make API call
   */
  public MessageTemplate template(String templateName) throws ApiException {
    return templateWithHttpInfo(templateName).getData();
      }

  /**
   * template
   * 
   * @param templateName templateName (required)
   * @return ApiResponse&lt;MessageTemplate&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MessageTemplate> templateWithHttpInfo(String templateName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateName' is set
    if (templateName == null) {
      throw new ApiException(400, "Missing the required parameter 'templateName' when calling template");
    }
    
    // create path and map variables
    String localVarPath = "/api/template";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateName", templateName));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MessageTemplate> localVarReturnType = new GenericType<MessageTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateTemplate
   * 
   * @param content content (required)
   * @param name name (required)
   * @param templateId templateId (required)
   * @throws ApiException if fails to make API call
   */
  public void updateTemplate(String content, String name, UUID templateId) throws ApiException {

    updateTemplateWithHttpInfo(content, name, templateId);
  }

  /**
   * updateTemplate
   * 
   * @param content content (required)
   * @param name name (required)
   * @param templateId templateId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateTemplateWithHttpInfo(String content, String name, UUID templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'content' is set
    if (content == null) {
      throw new ApiException(400, "Missing the required parameter 'content' when calling updateTemplate");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateTemplate");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/template";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content", content));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateId", templateId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
