# WorkflowApprovalList

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
**unifiedJobTemplate** | **String** |  |  [optional]
**launchType** | [**LaunchTypeEnum**](#LaunchTypeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**executionEnvironment** | **Integer** | The container image to be used for execution. |  [optional]
**failed** | **Boolean** |  |  [optional]
**started** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job was queued for starting. |  [optional]
**finished** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job finished execution. |  [optional]
**canceledOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the cancel request was sent. |  [optional]
**elapsed** | **String** | Elapsed time in seconds that the job ran. |  [optional]
**jobExplanation** | **String** | A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout |  [optional]
**launchedBy** | [**LaunchedBy**](LaunchedBy.md) |  |  [optional]
**workUnitId** | **String** | The Receptor work unit ID associated with this job. |  [optional]
**canApproveOrDeny** | **String** |  |  [optional]
**approvalExpiration** | **String** |  |  [optional]
**timedOut** | **String** |  |  [optional]

<a name="LaunchTypeEnum"></a>
## Enum: LaunchTypeEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
RELAUNCH | &quot;relaunch&quot;
CALLBACK | &quot;callback&quot;
SCHEDULED | &quot;scheduled&quot;
DEPENDENCY | &quot;dependency&quot;
WORKFLOW | &quot;workflow&quot;
WEBHOOK | &quot;webhook&quot;
SYNC | &quot;sync&quot;
SCM | &quot;scm&quot;

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
