# WorkflowJob

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
**failed** | **Boolean** |  |  [optional]
**started** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job was queued for starting. |  [optional]
**finished** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job finished execution. |  [optional]
**canceledOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the cancel request was sent. |  [optional]
**elapsed** | **String** | Elapsed time in seconds that the job ran. |  [optional]
**jobArgs** | **String** |  |  [optional]
**jobCwd** | **String** |  |  [optional]
**jobEnv** | **Object** |  |  [optional]
**jobExplanation** | **String** | A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout |  [optional]
**resultTraceback** | **String** |  |  [optional]
**launchedBy** | [**LaunchedBy**](LaunchedBy.md) |  |  [optional]
**workUnitId** | **String** | The Receptor work unit ID associated with this job. |  [optional]
**workflowJobTemplate** | **String** |  |  [optional]
**extraVars** | **String** |  |  [optional]
**allowSimultaneous** | **Boolean** |  |  [optional]
**jobTemplate** | **String** | If automatically created for a sliced job run, the job template the workflow job was created from. |  [optional]
**isSlicedJob** | **Boolean** |  |  [optional]
**inventory** | **Integer** | Inventory applied as a prompt, assuming job template prompts for inventory |  [optional]
**limit** | **String** |  |  [optional]
**scmBranch** | **String** |  |  [optional]
**webhookService** | [**WebhookServiceEnum**](#WebhookServiceEnum) | Service that webhook requests will be accepted from |  [optional]
**webhookCredential** | **Integer** | Personal Access Token for posting back the status to the service API |  [optional]
**webhookGuid** | **String** | Unique identifier of the event that triggered this webhook |  [optional]

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

<a name="WebhookServiceEnum"></a>
## Enum: WebhookServiceEnum
Name | Value
---- | -----
GITHUB | &quot;github&quot;
GITLAB | &quot;gitlab&quot;
