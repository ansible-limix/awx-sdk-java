# InstanceHealthCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** |  |  [optional]
**hostname** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**lastHealthCheck** | [**OffsetDateTime**](OffsetDateTime.md) | Last time a health check was ran on this instance to refresh cpu, memory, and capacity. |  [optional]
**errors** | **String** | Any error details from the last health check. |  [optional]
**cpu** | **String** |  |  [optional]
**memory** | **Integer** | Total system memory of this instance in bytes. |  [optional]
**cpuCapacity** | **Integer** |  |  [optional]
**memCapacity** | **Integer** |  |  [optional]
**capacity** | **Integer** |  |  [optional]
