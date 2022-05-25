# ActivityStream

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**type** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**related** | **Object** |  |  [optional]
**summaryFields** | **Object** |  |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) | The action taken with respect to the given object(s). | 
**changes** | **String** | A summary of the new and changed values when an object is created, updated, or deleted |  [optional]
**object1** | **String** | For create, update, and delete events this is the object type that was affected. For associate and disassociate events this is the object type associated or disassociated with object2. | 
**object2** | **String** | Unpopulated for create, update, and delete events. For associate and disassociate events this is the object type that object1 is being associated with. | 
**objectAssociation** | **String** | When present, shows the field name of the role or relationship that changed. |  [optional]
**actionNode** | **String** | The cluster node the activity took place on. |  [optional]
**objectType** | **String** | When present, shows the model on which the role or relationship was defined. |  [optional]

<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CREATE | &quot;create&quot;
UPDATE | &quot;update&quot;
DELETE | &quot;delete&quot;
ASSOCIATE | &quot;associate&quot;
DISASSOCIATE | &quot;disassociate&quot;
