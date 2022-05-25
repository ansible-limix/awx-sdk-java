# CredentialSerializerCreate

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
**organization** | **Integer** | Inherit permissions from organization roles. If provided on creation, do not give either user or team. |  [optional]
**credentialType** | **Integer** | Specify the type of credential you want to create. Refer to the documentation for details on each type. | 
**managed** | **String** |  |  [optional]
**inputs** | **Object** | Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax. |  [optional]
**kind** | **String** |  |  [optional]
**cloud** | **String** |  |  [optional]
**kubernetes** | **String** |  |  [optional]
**user** | **Integer** | Write-only field used to add user to owner role. If provided, do not give either team or organization. Only valid for creation. |  [optional]
**team** | **Integer** | Write-only field used to add team to owner role. If provided, do not give either user or organization. Only valid for creation. |  [optional]
