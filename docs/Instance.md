# Instance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**type** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**related** | **Object** |  |  [optional]
**uuid** | **String** |  |  [optional]
**hostname** | **String** |  |  [optional]
**created** | **String** |  |  [optional]
**modified** | **String** |  |  [optional]
**lastSeen** | [**OffsetDateTime**](OffsetDateTime.md) | Last time instance ran its heartbeat task for main cluster nodes. Last known connection to receptor mesh for execution nodes. |  [optional]
**lastHealthCheck** | [**OffsetDateTime**](OffsetDateTime.md) | Last time a health check was ran on this instance to refresh cpu, memory, and capacity. |  [optional]
**errors** | **String** | Any error details from the last health check. |  [optional]
**capacityAdjustment** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**capacity** | **Integer** |  |  [optional]
**consumedCapacity** | **String** |  |  [optional]
**percentCapacityRemaining** | **String** |  |  [optional]
**jobsRunning** | **Integer** | Count of jobs in the running or waiting state that are targeted for this instance |  [optional]
**jobsTotal** | **Integer** | Count of all jobs that target this instance |  [optional]
**cpu** | **String** |  |  [optional]
**memory** | **Integer** | Total system memory of this instance in bytes. |  [optional]
**cpuCapacity** | **Integer** |  |  [optional]
**memCapacity** | **Integer** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**managedByPolicy** | **Boolean** |  |  [optional]
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) |  |  [optional]

<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
CONTROL | &quot;control&quot;
EXECUTION | &quot;execution&quot;
HYBRID | &quot;hybrid&quot;
HOP | &quot;hop&quot;
