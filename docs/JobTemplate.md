# JobTemplate

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
**organization** | **Integer** | The organization used to determine access to this template. |  [optional]
**lastJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastJobFailed** | **Boolean** |  |  [optional]
**nextJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**executionEnvironment** | **Integer** | The container image to be used for execution. |  [optional]
**hostConfigKey** | **String** |  |  [optional]
**askScmBranchOnLaunch** | **Boolean** |  |  [optional]
**askDiffModeOnLaunch** | **Boolean** |  |  [optional]
**askVariablesOnLaunch** | **Boolean** |  |  [optional]
**askLimitOnLaunch** | **Boolean** |  |  [optional]
**askTagsOnLaunch** | **Boolean** |  |  [optional]
**askSkipTagsOnLaunch** | **Boolean** |  |  [optional]
**askJobTypeOnLaunch** | **Boolean** |  |  [optional]
**askVerbosityOnLaunch** | **Boolean** |  |  [optional]
**askInventoryOnLaunch** | **Boolean** |  |  [optional]
**askCredentialOnLaunch** | **Boolean** |  |  [optional]
**surveyEnabled** | **Boolean** |  |  [optional]
**becomeEnabled** | **Boolean** |  |  [optional]
**diffMode** | **Boolean** | If enabled, textual changes made to any templated files on the host are shown in the standard output |  [optional]
**allowSimultaneous** | **Boolean** |  |  [optional]
**customVirtualenv** | **String** | Local absolute file path containing a custom Python virtualenv to use |  [optional]
**jobSliceCount** | **Integer** | The number of jobs to slice into at runtime. Will cause the Job Template to launch a workflow if value is greater than 1. |  [optional]
**webhookService** | [**WebhookServiceEnum**](#WebhookServiceEnum) | Service that webhook requests will be accepted from |  [optional]
**webhookCredential** | **Integer** | Personal Access Token for posting back the status to the service API |  [optional]

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
RUN | &quot;run&quot;
CHECK | &quot;check&quot;

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

<a name="WebhookServiceEnum"></a>
## Enum: WebhookServiceEnum
Name | Value
---- | -----
GITHUB | &quot;github&quot;
GITLAB | &quot;gitlab&quot;
