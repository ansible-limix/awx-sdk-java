# WorkflowJobTemplate

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
**extraVars** | **String** |  |  [optional]
**organization** | **Integer** | The organization used to determine access to this template. |  [optional]
**surveyEnabled** | **Boolean** |  |  [optional]
**allowSimultaneous** | **Boolean** |  |  [optional]
**askVariablesOnLaunch** | **Boolean** |  |  [optional]
**inventory** | **Integer** | Inventory applied as a prompt, assuming job template prompts for inventory |  [optional]
**limit** | **String** |  |  [optional]
**scmBranch** | **String** |  |  [optional]
**askInventoryOnLaunch** | **Boolean** |  |  [optional]
**askScmBranchOnLaunch** | **Boolean** |  |  [optional]
**askLimitOnLaunch** | **Boolean** |  |  [optional]
**webhookService** | [**WebhookServiceEnum**](#WebhookServiceEnum) | Service that webhook requests will be accepted from |  [optional]
**webhookCredential** | **Integer** | Personal Access Token for posting back the status to the service API |  [optional]

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

<a name="WebhookServiceEnum"></a>
## Enum: WebhookServiceEnum
Name | Value
---- | -----
GITHUB | &quot;github&quot;
GITLAB | &quot;gitlab&quot;
