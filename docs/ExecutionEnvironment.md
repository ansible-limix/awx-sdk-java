# ExecutionEnvironment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**type** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**related** | **Object** |  |  [optional]
**summaryFields** | **Object** |  |  [optional]
**created** | **String** |  |  [optional]
**modified** | **String** |  |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**organization** | **Integer** | The organization used to determine access to this execution environment. |  [optional]
**image** | **String** | The full image location, including the container registry, image name, and version tag. | 
**managed** | **String** |  |  [optional]
**credential** | **Integer** |  |  [optional]
**pull** | [**PullEnum**](#PullEnum) | Pull image before running? |  [optional]

<a name="PullEnum"></a>
## Enum: PullEnum
Name | Value
---- | -----
ALWAYS | &quot;always&quot;
MISSING | &quot;missing&quot;
NEVER | &quot;never&quot;
