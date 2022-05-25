# WorkflowJobNodeDetail

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
**extraData** | **Object** |  |  [optional]
**inventory** | **Integer** | Inventory applied as a prompt, assuming job template prompts for inventory |  [optional]
**scmBranch** | **String** |  |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**jobTags** | **String** |  |  [optional]
**skipTags** | **String** |  |  [optional]
**limit** | **String** |  |  [optional]
**diffMode** | **Boolean** |  |  [optional]
**verbosity** | [**VerbosityEnum**](#VerbosityEnum) |  |  [optional]
**job** | **Integer** |  |  [optional]
**workflowJob** | **String** |  |  [optional]
**unifiedJobTemplate** | **Integer** |  |  [optional]
**successNodes** | **List&lt;Integer&gt;** |  |  [optional]
**failureNodes** | **List&lt;Integer&gt;** |  |  [optional]
**alwaysNodes** | **List&lt;Integer&gt;** |  |  [optional]
**allParentsMustConverge** | **Boolean** | If enabled then the node will only run if all of the parent nodes have met the criteria to reach this node |  [optional]
**doNotRun** | **Boolean** | Indicates that a job will not be created when True. Workflow runtime semantics will mark this True if the node is in a path that will decidedly not be ran. A value of False means the node may not run. |  [optional]
**identifier** | **String** | An identifier coresponding to the workflow job template node that this node was created from. |  [optional]

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
RUN | &quot;run&quot;
CHECK | &quot;check&quot;

<a name="VerbosityEnum"></a>
## Enum: VerbosityEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;
