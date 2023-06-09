/*
 * Sessionize JSON-REST API
 * Sessionize JSON-REST API documentation by XDEV Software
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package software.xdev.sessionize.api;

import com.fasterxml.jackson.core.type.TypeReference;

import software.xdev.sessionize.client.ApiException;
import software.xdev.sessionize.client.ApiClient;
import software.xdev.sessionize.client.Configuration;
import software.xdev.sessionize.model.*;
import software.xdev.sessionize.client.Pair;

import software.xdev.sessionize.model.SessionGroup;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-26T17:30:53.867882+02:00[Europe/Berlin]")
public class SessionsApi {


  private ApiClient apiClient;

  public SessionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SessionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param endpointId  (required)
   * @return List&lt;SessionGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SessionGroup> getAllSessions(String endpointId) throws ApiException {
    return this.getAllSessions(endpointId, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param endpointId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;SessionGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SessionGroup> getAllSessions(String endpointId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling getAllSessions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/{endpointId}/view/Sessions"
      .replaceAll("\\{" + "endpointId" + "\\}", apiClient.escapeString(endpointId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<List<SessionGroup>> localVarReturnType = new TypeReference<List<SessionGroup>>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}