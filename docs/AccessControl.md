
# AccessControl

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datastoreId** | [**UUID**](UUID.md) |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**pseudoId** | **String** |  |  [optional]
**recordIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**recordType** | **String** |  |  [optional]
**roles** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
CREATE | &quot;CREATE&quot;
UPDATE | &quot;UPDATE&quot;
DELETE | &quot;DELETE&quot;
SEARCH | &quot;SEARCH&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ALLOW | &quot;ALLOW&quot;
DENY | &quot;DENY&quot;



