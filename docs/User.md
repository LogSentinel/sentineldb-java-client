
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datastoreId** | [**UUID**](UUID.md) |  |  [optional]
**email** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**password** | **String** |  |  [optional]
**pseudoId** | **String** |  |  [optional]
**roles** | **List&lt;String&gt;** |  |  [optional]
**status** | **String** |  |  [optional]
**systemRoles** | [**List&lt;SystemRolesEnum&gt;**](#List&lt;SystemRolesEnum&gt;) |  |  [optional]
**twoFactorAuthEnabled** | **Boolean** |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**username** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]


<a name="List<SystemRolesEnum>"></a>
## Enum: List&lt;SystemRolesEnum&gt;
Name | Value
---- | -----
ADMIN | &quot;DATASTORE_ADMIN&quot;
USER_ADMIN | &quot;DATASTORE_USER_ADMIN&quot;
VIEWER | &quot;DATASTORE_VIEWER&quot;
USER_VIEWER | &quot;DATASTORE_USER_VIEWER&quot;



