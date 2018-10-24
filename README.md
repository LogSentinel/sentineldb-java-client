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
        SentinelDBClient client = SentinelDBClientBuilder.create(orgId, secret).build();

        DatastoreApi apiInstance = client.getDatastoreActions();
        String datastoreId = "datastoreId_example"; // String | datastoreId
        String actor = "actor_example"; // String | actor
        Integer pageNumber = 0; // Integer | pageNumber
        Integer pageSize = 20; // Integer | pageSize
        try {
            List<Record> result = apiInstance.getRecordsByDatastore(datastoreId, actor, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatastoreApi#getRecordsByDatastore");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.db.logsentinel.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DatastoreApi* | [**getRecordsByDatastore**](docs/DatastoreApi.md#getRecordsByDatastore) | **GET** /api/datastore/{datastoreId}/records | Gets records by datastore with pagination
*DatastoreApi* | [**getUsersByDatastore**](docs/DatastoreApi.md#getUsersByDatastore) | **GET** /api/datastore/{datastoreId}/users | Gets users by datastore with pagination
*RecordsApi* | [**createRecord**](docs/RecordsApi.md#createRecord) | **POST** /api/record/datastore/{datastoreId} | Creates a record
*RecordsApi* | [**deleteRecord**](docs/RecordsApi.md#deleteRecord) | **DELETE** /api/record/{recordId} | Deletes an existing record
*RecordsApi* | [**getRecord**](docs/RecordsApi.md#getRecord) | **GET** /api/record/{recordId} | Gets record by id
*RecordsApi* | [**getRecordVersion**](docs/RecordsApi.md#getRecordVersion) | **GET** /api/record/{recordId}/versions/{version} | Gets concrete record version
*RecordsApi* | [**getRecordVersions**](docs/RecordsApi.md#getRecordVersions) | **GET** /api/record/{recordId}/versions | Gets all record versions by id
*RecordsApi* | [**updateRecord**](docs/RecordsApi.md#updateRecord) | **PUT** /api/record | Updates record
*RecordsApi* | [**updateRecordOwner**](docs/RecordsApi.md#updateRecordOwner) | **PUT** /api/record/{recordId}/owner/{ownerId} | Updates a record&#39;s owner
*SearchApi* | [**searchRecords**](docs/SearchApi.md#searchRecords) | **POST** /api/search/records/{type}/datastore/{datastoreId} | Search records
*SearchApi* | [**searchUsers**](docs/SearchApi.md#searchUsers) | **POST** /api/search/users/datastore/{datastoreId} | Search users
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /api/user | Creates a user
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /api/user/{userId} | Deletes an existing user
*UserApi* | [**forgetUser**](docs/UserApi.md#forgetUser) | **PUT** /api/user/forget/{userId} | Forgets user
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /api/user/{userId} | Gets user by id
*UserApi* | [**getUserVersion**](docs/UserApi.md#getUserVersion) | **GET** /api/user/{userId}/versions/{version} | Gets concrete user version
*UserApi* | [**getUserVersions**](docs/UserApi.md#getUserVersions) | **GET** /api/user/{userId}/versions | Gets all record versions by id
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /api/user | Updates user


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



