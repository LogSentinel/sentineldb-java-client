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
import com.logsentinel.sentineldb.model.User;
import com.logsentinel.sentineldb.model.UserRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Anonymizes user
     *
     * Performs user anonymization by deleting all personal information from the user object, but keeping all the associated records. See &lt;a href&#x3D;\&quot;https://logsentinel.com/sentineldb/getting-started/#anonymization\&quot;&gt;anonymization&lt;/a&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void anonymizeUserTest() throws ApiException {
        UUID userId = null;
        String actorId = null;
        Object response = api.anonymizeUser(userId, actorId);

        // TODO: test validations
    }
    
    /**
     * Confirms 2 factor authentication
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirm2faTest() throws ApiException {
        Integer code = null;
        UUID userId = null;
        Object response = api.confirm2fa(code, userId);

        // TODO: test validations
    }
    
    /**
     * Creates a user
     *
     * Creates a new user by specifying basic email and/or username and a custom set of attributes (these attributes are normally equivallent to the other fields in a \&quot;users\&quot; table). Returns the ID of the new user which should be stored inside your database.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UUID datastoreId = null;
        UserRequest user = null;
        String actorId = null;
        User response = api.createUser(datastoreId, user, actorId);

        // TODO: test validations
    }
    
    /**
     * Deletes an existing user
     *
     * Deletes a user. Note that this does not forget the user but simply marks the latest version of the user as deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        UUID userId = null;
        String actorId = null;
        Object response = api.deleteUser(userId, actorId);

        // TODO: test validations
    }
    
    /**
     * Disables 2 factor authentication
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disable2faTest() throws ApiException {
        UUID userId = null;
        Object response = api.disable2fa(userId);

        // TODO: test validations
    }
    
    /**
     * Enrolls user to 2 factor authentication
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enroll2faTest() throws ApiException {
        UUID userId = null;
        Object response = api.enroll2fa(userId);

        // TODO: test validations
    }
    
    /**
     * Forgets user
     *
     * Executes \&quot;the right to be forgotten\&quot; on a specified user. Deletes all user data and associated records and keeps an audit trail of the \&quot;forget me\&quot; event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forgetUserTest() throws ApiException {
        UUID userId = null;
        String actorId = null;
        Object response = api.forgetUser(userId, actorId);

        // TODO: test validations
    }
    
    /**
     * Gets user by id
     *
     * Retrieves a user by their ID. The ID is normally stored in a \&quot;users\&quot; table in your system. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        UUID userId = null;
        String actorId = null;
        UUID pseudoId = null;
        User response = api.getUser(userId, actorId, null, pseudoId, null);

        // TODO: test validations
    }
    
    /**
     * Gets concrete user version
     *
     * Retrieves a specific (older) version for a given user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserVersionTest() throws ApiException {
        UUID userId = null;
        Integer version = null;
        String actorId = null;
        User response = api.getUserVersion(userId, version, actorId);

        // TODO: test validations
    }
    
    /**
     * Gets all record versions by id
     *
     * Retrieves all the versions for a given user. Each version is a historical snapshot of the user object prior to each update.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserVersionsTest() throws ApiException {
        UUID userId = null;
        List<Integer> response = api.getUserVersions(userId);

        // TODO: test validations
    }
    
    /**
     * Updates user
     *
     * Updates a user&#39;s details. Note that this creates a newer version of the user, keeping the old value for historical reference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        UserRequest user = null;
        UUID userId = null;
        String actorId = null;
        User response = api.updateUser(user, userId, actorId);

        // TODO: test validations
    }
    
}
