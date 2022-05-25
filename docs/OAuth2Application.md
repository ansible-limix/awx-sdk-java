# OAuth2Application

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
**clientId** | **String** |  |  [optional]
**clientSecret** | **String** | Used for more stringent verification of access to an application when creating a token. |  [optional]
**clientType** | [**ClientTypeEnum**](#ClientTypeEnum) | Set to Public or Confidential depending on how secure the client device is. | 
**redirectUris** | **String** | Allowed URIs list, space separated |  [optional]
**authorizationGrantType** | [**AuthorizationGrantTypeEnum**](#AuthorizationGrantTypeEnum) | The Grant type the user must use for acquire tokens for this application. | 
**skipAuthorization** | **Boolean** | Set True to skip authorization step for completely trusted applications. |  [optional]
**organization** | **Integer** | Organization containing this application. | 

<a name="ClientTypeEnum"></a>
## Enum: ClientTypeEnum
Name | Value
---- | -----
CONFIDENTIAL | &quot;confidential&quot;
PUBLIC | &quot;public&quot;

<a name="AuthorizationGrantTypeEnum"></a>
## Enum: AuthorizationGrantTypeEnum
Name | Value
---- | -----
AUTHORIZATION_CODE | &quot;authorization-code&quot;
PASSWORD | &quot;password&quot;
