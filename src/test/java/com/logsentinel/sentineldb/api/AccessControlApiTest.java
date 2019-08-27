/*
 * SentinelDB RESTful API
 * Read more at https://docs.sentineldb.io
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
import com.logsentinel.sentineldb.model.AccessControl;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessControlApi
 */
@Ignore
public class AccessControlApiTest {

    private final AccessControlApi api = new AccessControlApi();

    
    /**
     * Creates access control rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String action = null;
        UUID datastoreId = null;
        String type = null;
        List<UUID> recordIds = null;
        String recordType = null;
        List<String> roles = null;
        UUID response = api.create(action, datastoreId, type, recordIds, recordType, roles);

        // TODO: test validations
    }
    
    /**
     * Deletes access control rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        UUID id = null;
        api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Lists access control rules of organization or filtered by datastore
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        UUID datastoreId = null;
        List<AccessControl> response = api.list(datastoreId);

        // TODO: test validations
    }
    
}
