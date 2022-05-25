# JobList

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
**executionNode** | **String** | The node the job executed on. |  [optional]
**controllerNode** | **String** | The instance that managed the execution environment. |  [optional]
**launchedBy** | [**LaunchedBy**](LaunchedBy.md) |  |  [optional]
**workUnitId** | **String** | The Receptor work unit ID associated with this job. |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**inventory** | **Integer** |  |  [optional]
**project** | **String** |  |  [optional]
**playbook** | **String** |  |  [optional]
**scmBranch** | **String** | Branch to use in job run. Project default used if blank. Only allowed if project allow_override field is set to true. |  [optional]
**forks** | **Integer** |  |  [optional]
**limit** | **String** |  |  [optional]
**verbosity** | **Integer** |  |  [optional]
**extraVars** | **String** |  |  [optional]
**jobTags** | **String** |  |  [optional]
**forceHandlers** | **Boolean** |  |  [optional]
**skipTags** | **String** |  |  [optional]
**startAtTask** | **String** |  |  [optional]
**timeout** | **Integer** | The amount of time (in seconds) to run before the task is canceled. |  [optional]
**useFactCache** | **Boolean** | If enabled, the service will act as an Ansible Fact Cache Plugin; persisting facts at the end of a playbook run to the database and caching facts for use by Ansible. |  [optional]
**organization** | **Integer** | The organization used to determine access to this unified job. |  [optional]
**jobTemplate** | **String** |  |  [optional]
**passwordsNeededToStart** | **String** |  |  [optional]
**allowSimultaneous** | **Boolean** |  |  [optional]
**artifacts** | **String** |  |  [optional]
**scmRevision** | **String** | The SCM Revision from the Project used for this job, if available |  [optional]
**instanceGroup** | **Integer** | The Instance group the job was run under |  [optional]
**diffMode** | **Boolean** | If enabled, textual changes made to any templated files on the host are shown in the standard output |  [optional]
**jobSliceNumber** | **Integer** | If part of a sliced job, the ID of the inventory slice operated on. If not part of sliced job, parameter is not used. |  [optional]
**jobSliceCount** | **Integer** | If ran as part of sliced jobs, the total number of slices. If 1, job is not part of a sliced job. |  [optional]
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

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
RUN | &quot;run&quot;
CHECK | &quot;check&quot;
SCAN | &quot;scan&quot;

<a name="WebhookServiceEnum"></a>
## Enum: WebhookServiceEnum
Name | Value
---- | -----
GITHUB | &quot;github&quot;
GITLAB | &quot;gitlab&quot;
