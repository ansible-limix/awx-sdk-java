# UserAuthorizedToken

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
**description** | **String** |  |  [optional]
**user** | **Integer** | The user representing the token owner |  [optional]
**token** | **String** |  |  [optional]
**refreshToken** | **String** |  |  [optional]
**application** | **Integer** |  | 
**expires** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**scope** | **String** | Allowed scopes, further restricts user&#x27;s permissions. Must be a simple space-separated string with allowed scopes [&#x27;read&#x27;, &#x27;write&#x27;]. |  [optional]
