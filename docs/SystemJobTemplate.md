# SystemJobTemplate

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
**lastJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastJobFailed** | **Boolean** |  |  [optional]
**nextJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**executionEnvironment** | **Integer** | The container image to be used for execution. |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;new&quot;
PENDING | &quot;pending&quot;
WAITING | &quot;waiting&quot;
RUNNING | &quot;running&quot;
SUCCESSFUL | &quot;successful&quot;
FAILED | &quot;failed&quot;
ERROR | &quot;error&quot;
CANCELED | &quot;canceled&quot;
NEVER_UPDATED | &quot;never updated&quot;
OK | &quot;ok&quot;
MISSING | &quot;missing&quot;
NONE | &quot;none&quot;
UPDATING | &quot;updating&quot;

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
JOBS | &quot;cleanup_jobs&quot;
ACTIVITYSTREAM | &quot;cleanup_activitystream&quot;
SESSIONS | &quot;cleanup_sessions&quot;
TOKENS | &quot;cleanup_tokens&quot;
