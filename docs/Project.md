# Project

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
**localPath** | **String** | Local path (relative to PROJECTS_ROOT) containing playbooks and related files for this project. |  [optional]
**scmType** | [**ScmTypeEnum**](#ScmTypeEnum) | Specifies the source control system used to store the project. |  [optional]
**scmUrl** | **String** | The location where the project is stored. |  [optional]
**scmBranch** | **String** | Specific branch, tag or commit to checkout. |  [optional]
**scmRefspec** | **String** | For git projects, an additional refspec to fetch. |  [optional]
**scmClean** | **Boolean** | Discard any local changes before syncing the project. |  [optional]
**scmTrackSubmodules** | **Boolean** | Track submodules latest commits on defined branch. |  [optional]
**scmDeleteOnUpdate** | **Boolean** | Delete the project before syncing. |  [optional]
**credential** | **Integer** |  |  [optional]
**timeout** | **Integer** | The amount of time (in seconds) to run before the task is canceled. |  [optional]
**scmRevision** | **String** | The last revision fetched by a project update |  [optional]
**lastJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastJobFailed** | **Boolean** |  |  [optional]
**nextJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**organization** | **Integer** | The organization used to determine access to this template. |  [optional]
**scmUpdateOnLaunch** | **Boolean** | Update the project when a job is launched that uses the project. |  [optional]
**scmUpdateCacheTimeout** | **Integer** | The number of seconds after the last project update ran that a new project update will be launched as a job dependency. |  [optional]
**allowOverride** | **Boolean** | Allow changing the SCM branch or revision in a job template that uses this project. |  [optional]
**customVirtualenv** | **String** | Local absolute file path containing a custom Python virtualenv to use |  [optional]
**defaultEnvironment** | **Integer** | The default execution environment for jobs run using this project. |  [optional]
**lastUpdateFailed** | **Boolean** |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="ScmTypeEnum"></a>
## Enum: ScmTypeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
GIT | &quot;git&quot;
SVN | &quot;svn&quot;
INSIGHTS | &quot;insights&quot;
ARCHIVE | &quot;archive&quot;

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
