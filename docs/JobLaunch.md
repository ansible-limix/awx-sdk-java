# JobLaunch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canStartWithoutUserInput** | **Boolean** |  |  [optional]
**passwordsNeededToStart** | **String** |  |  [optional]
**extraVars** | **Object** |  |  [optional]
**inventory** | **Integer** |  |  [optional]
**scmBranch** | **String** |  |  [optional]
**limit** | **String** |  |  [optional]
**jobTags** | **String** |  |  [optional]
**skipTags** | **String** |  |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**verbosity** | **Integer** |  |  [optional]
**diffMode** | **Boolean** |  |  [optional]
**credentials** | **List&lt;Integer&gt;** |  |  [optional]
**credentialPasswords** | **String** |  |  [optional]
**askScmBranchOnLaunch** | **Boolean** |  |  [optional]
**askVariablesOnLaunch** | **Boolean** |  |  [optional]
**askTagsOnLaunch** | **Boolean** |  |  [optional]
**askDiffModeOnLaunch** | **Boolean** |  |  [optional]
**askSkipTagsOnLaunch** | **Boolean** |  |  [optional]
**askJobTypeOnLaunch** | **Boolean** |  |  [optional]
**askLimitOnLaunch** | **Boolean** |  |  [optional]
**askVerbosityOnLaunch** | **Boolean** |  |  [optional]
**askInventoryOnLaunch** | **Boolean** |  |  [optional]
**askCredentialOnLaunch** | **Boolean** |  |  [optional]
**surveyEnabled** | **String** |  |  [optional]
**variablesNeededToStart** | **String** |  |  [optional]
**credentialNeededToStart** | **String** |  |  [optional]
**inventoryNeededToStart** | **String** |  |  [optional]
**jobTemplateData** | **String** |  |  [optional]
**defaults** | **String** |  |  [optional]

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
RUN | &quot;run&quot;
CHECK | &quot;check&quot;
