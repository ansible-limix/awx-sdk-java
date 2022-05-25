# AdHocCommandList

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
**name** | **String** |  |  [optional]
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
**limit** | **String** |  |  [optional]
**credential** | **Integer** |  |  [optional]
**moduleName** | [**ModuleNameEnum**](#ModuleNameEnum) |  |  [optional]
**moduleArgs** | **String** |  |  [optional]
**forks** | **Integer** |  |  [optional]
**verbosity** | **Integer** |  |  [optional]
**extraVars** | **String** |  |  [optional]
**becomeEnabled** | **Boolean** |  |  [optional]
**diffMode** | **Boolean** |  |  [optional]

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

<a name="ModuleNameEnum"></a>
## Enum: ModuleNameEnum
Name | Value
---- | -----
COMMAND | &quot;command&quot;
SHELL | &quot;shell&quot;
YUM | &quot;yum&quot;
APT | &quot;apt&quot;
APT_KEY | &quot;apt_key&quot;
APT_REPOSITORY | &quot;apt_repository&quot;
APT_RPM | &quot;apt_rpm&quot;
SERVICE | &quot;service&quot;
GROUP | &quot;group&quot;
USER | &quot;user&quot;
MOUNT | &quot;mount&quot;
PING | &quot;ping&quot;
SELINUX | &quot;selinux&quot;
SETUP | &quot;setup&quot;
WIN_PING | &quot;win_ping&quot;
WIN_SERVICE | &quot;win_service&quot;
WIN_UPDATES | &quot;win_updates&quot;
WIN_GROUP | &quot;win_group&quot;
WIN_USER | &quot;win_user&quot;
