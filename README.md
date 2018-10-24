# sentineldb-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.logsentinel.sentineldb</groupId>
    <artifactId>sentineldb-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.logsentinel.sentineldb:sentineldb-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/sentineldb-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.logsentinel.sentineldb.*;
import com.logsentinel.sentineldb.auth.*;
import com.logsentinel.sentineldb.model.*;
import com.logsentinel.sentineldb.api.DatastoreApi;

import java.io.File;
import java.util.*;

public class DatastoreApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DatastoreApi apiInstance = new DatastoreApi();
        String datastoreId = "datastoreId_example"; // String | datastoreId
        String actor = "actor_example"; // String | actor
        Integer pageNumber = 0; // Integer | pageNumber
        Integer pageSize = 20; // Integer | pageSize
        try {
            List<Record> result = apiInstance.getRecordsByDatastoreUsingGET(datastoreId, actor, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatastoreApi#getRecordsByDatastoreUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8090/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DatastoreApi* | [**getRecordsByDatastoreUsingGET**](docs/DatastoreApi.md#getRecordsByDatastoreUsingGET) | **GET** /api/datastore/{datastoreId}/records | Gets records by datastore with pagination
*DatastoreApi* | [**getUsersByDatastoreUsingGET**](docs/DatastoreApi.md#getUsersByDatastoreUsingGET) | **GET** /api/datastore/{datastoreId}/users | Gets users by datastore with pagination
*RecordsApi* | [**createUsingPOST**](docs/RecordsApi.md#createUsingPOST) | **POST** /api/record/datastore/{datastoreId} | Creates a record
*RecordsApi* | [**deleteUsingDELETE**](docs/RecordsApi.md#deleteUsingDELETE) | **DELETE** /api/record/{recordId} | Deletes an existing record
*RecordsApi* | [**getUsingGET**](docs/RecordsApi.md#getUsingGET) | **GET** /api/record/{recordId} | Gets record by id
*RecordsApi* | [**getVersionUsingGET**](docs/RecordsApi.md#getVersionUsingGET) | **GET** /api/record/{recordId}/versions/{version} | Gets concrete record version
*RecordsApi* | [**getVersionsUsingGET**](docs/RecordsApi.md#getVersionsUsingGET) | **GET** /api/record/{recordId}/versions | Gets all record versions by id
*RecordsApi* | [**updateOwnerUsingPUT**](docs/RecordsApi.md#updateOwnerUsingPUT) | **PUT** /api/record/{recordId}/owner/{ownerId} | Updates a record&#39;s owner
*RecordsApi* | [**updateUsingPUT**](docs/RecordsApi.md#updateUsingPUT) | **PUT** /api/record | Updates record
*SearchApi* | [**searchRecordsUsingPOST**](docs/SearchApi.md#searchRecordsUsingPOST) | **POST** /api/search/records/{type}/datastore/{datastoreId} | Search records
*SearchApi* | [**searchUsersUsingPOST**](docs/SearchApi.md#searchUsersUsingPOST) | **POST** /api/search/users/datastore/{datastoreId} | Search users
*UserApi* | [**createUsingPOST1**](docs/UserApi.md#createUsingPOST1) | **POST** /api/user | Creates a user
*UserApi* | [**deleteUsingDELETE1**](docs/UserApi.md#deleteUsingDELETE1) | **DELETE** /api/user/{userId} | Deletes an existing user
*UserApi* | [**forgetUserUsingPUT**](docs/UserApi.md#forgetUserUsingPUT) | **PUT** /api/user/forget/{userId} | Forgets user
*UserApi* | [**getUsingGET1**](docs/UserApi.md#getUsingGET1) | **GET** /api/user/{userId} | Gets user by id
*UserApi* | [**getVersionUsingGET1**](docs/UserApi.md#getVersionUsingGET1) | **GET** /api/user/{userId}/versions/{version} | Gets concrete user version
*UserApi* | [**getVersionsUsingGET1**](docs/UserApi.md#getVersionsUsingGET1) | **GET** /api/user/{userId}/versions | Gets all record versions by id
*UserApi* | [**updateUsingPUT1**](docs/UserApi.md#updateUsingPUT1) | **PUT** /api/user | Updates user


## Documentation for Models

 - [Record](docs/Record.md)
 - [User](docs/User.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



