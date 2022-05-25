# User

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
**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. | 
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**isSuperuser** | **Boolean** | Designates that this user has all permissions without explicitly assigning them. |  [optional]
**isSystemAuditor** | **Boolean** |  |  [optional]
**password** | **String** | Write-only field used to change the password. |  [optional]
**ldapDn** | **String** |  |  [optional]
**lastLogin** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**externalAccount** | **String** | Set if the account is managed by an external service |  [optional]
