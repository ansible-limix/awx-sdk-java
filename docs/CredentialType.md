# CredentialType

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
**kind** | [**KindEnum**](#KindEnum) |  | 
**namespace** | **String** |  |  [optional]
**managed** | **String** |  |  [optional]
**inputs** | **Object** | Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax. |  [optional]
**injectors** | **Object** | Enter injectors using either JSON or YAML syntax. Refer to the documentation for example syntax. |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
SSH | &quot;ssh&quot;
VAULT | &quot;vault&quot;
NET | &quot;net&quot;
SCM | &quot;scm&quot;
CLOUD | &quot;cloud&quot;
REGISTRY | &quot;registry&quot;
TOKEN | &quot;token&quot;
INSIGHTS | &quot;insights&quot;
EXTERNAL | &quot;external&quot;
KUBERNETES | &quot;kubernetes&quot;
GALAXY | &quot;galaxy&quot;
