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
import com.logsentinel.sentineldb.model.SearchSchema;
import com.logsentinel.sentineldb.model.SearchSchema.EntityTypeEnum;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;
import com.logsentinel.sentineldb.model.SearchSchemaField;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchSchemaApi
 */
@Ignore
public class SearchSchemaApiTest {

    private final SearchSchemaApi api = new SearchSchemaApi();

    
    /**
     * Add field to search schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSearchSchemaFieldTest() throws ApiException {
        String field = null;
        UUID id = null;
        Boolean analyzed = null;
        UUID pseudoId = null;
        Object response = api.addSearchSchemaField(field, id, analyzed, analyzed, VisibilityLevelEnum.PUBLIC);

        // TODO: test validations
    }
    
    /**
     * Create search schema
     *
     * Creates a search schema. A search schema is required for indexing and searching records and users. Only fields that are part of the schema are indexed and searcheable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSearchSchemaTest() throws ApiException {
        UUID datastoreId = null;
        EntityTypeEnum entityType = null;
        String recordType = null;
        List<SearchSchemaField> fields = null;
        SearchSchema response = api.createSearchSchema(datastoreId, entityType, fields, recordType, null);

        // TODO: test validations
    }
    
    /**
     * Delete search schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSearchSchemaTest() throws ApiException {
        UUID id = null;
        Object response = api.deleteSearchSchema(id);

        // TODO: test validations
    }
    
    /**
     * Add field to search schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSearchSchemaFieldTest() throws ApiException {
        String field = null;
        UUID id = null;
        Object response = api.removeSearchSchemaField(field, id);

        // TODO: test validations
    }
    
}
