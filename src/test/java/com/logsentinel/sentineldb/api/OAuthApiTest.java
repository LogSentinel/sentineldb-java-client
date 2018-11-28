/*
 * SentinelDB RESTful API
 * Read more at https://logsentinel.com/sentineldb/documentation/
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.sentineldb.api;

import com.logsentinel.sentineldb.ApiException;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
@Ignore
public class OAuthApiTest {

    private final OAuthApi api = new OAuthApi();

    
    /**
     * Obtain a token for a given username/password pair
     *
     * Obtains a token for a given username/password pair. This is the standard password grant flow of OAuth with additional support for 2-factor authentication. The obtaind token can then be used to access API endpoints for the particular user (i.e. User and Record endpoints) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOAuthTokenTest() throws ApiException {
        UUID datastoreId = null;
        String grantType = null;
        String password = null;
        String username = null;
        Integer code = null;
        String scope = null;
        String response = api.getOAuthToken(datastoreId, grantType, password, username, code, scope);

        // TODO: test validations
    }
    
}
