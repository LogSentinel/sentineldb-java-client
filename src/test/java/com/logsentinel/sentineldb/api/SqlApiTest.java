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

import java.util.List;
import java.util.UUID;

import org.junit.Ignore;
import org.junit.Test;

import com.logsentinel.sentineldb.ApiException;
import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;
import com.logsentinel.sentineldb.model.Statement;

/**
 * API tests for SqlApi
 */
@Ignore
public class SqlApiTest {

    private final SqlApi api = new SqlApi();

    
    /**
     * Executes delete query against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeDeleteTest() throws ApiException {
        String query = null;
        VisibilityLevelEnum visibilityLevel = null;
        Integer response = api.executeDelete(query, visibilityLevel);

        // TODO: test validations
    }
    
    /**
     * Executes insert query against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeInsertTest() throws ApiException {
        String query = null;
        UUID response = api.executeInsert(query);

        // TODO: test validations
    }
    
    /**
     * Executes select query against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeSelectTest() throws ApiException {
        String query = null;
        VisibilityLevelEnum visibilityLevel = null;
        List<List<String>> response = api.executeSelect(query, visibilityLevel);

        // TODO: test validations
    }
    
    /**
     * Executes update query against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeUpdateTest() throws ApiException {
        String query = null;
        VisibilityLevelEnum visibilityLevel = null;
        Integer response = api.executeUpdate(query, visibilityLevel);

        // TODO: test validations
    }
    
    /**
     * Prepared delete statement against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prepareDeleteStatementTest() throws ApiException {
        Statement statement = null;
        VisibilityLevelEnum visibilityLevel = null;
        Integer response = api.prepareDeleteStatement(statement, visibilityLevel);

        // TODO: test validations
    }
    
    /**
     * Prepared insert statement against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prepareInsertStatementTest() throws ApiException {
        Statement statement = null;
        UUID response = api.prepareInsertStatement(statement);

        // TODO: test validations
    }
    
    /**
     * Prepared select statement against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prepareSelectStatementTest() throws ApiException {
        Statement statement = null;
        VisibilityLevelEnum visibilityLevel = null;
        List<List<String>> response = api.prepareSelectStatement(statement, visibilityLevel);

        // TODO: test validations
    }
    
    /**
     * Prepared update statement against sentinelDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prepareUpdateStatementTest() throws ApiException {
        Statement statement = null;
        VisibilityLevelEnum visibilityLevel = null;
        Integer response = api.prepareUpdateStatement(statement, visibilityLevel);

        // TODO: test validations
    }
    
}
