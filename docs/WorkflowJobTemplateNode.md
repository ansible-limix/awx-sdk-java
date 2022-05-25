# WorkflowJobTemplateNode

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
**workflowJobTemplate** | **String** |  | 
**unifiedJobTemplate** | **Integer** |  |  [optional]
**successNodes** | **List&lt;Integer&gt;** |  |  [optional]
**failureNodes** | **List&lt;Integer&gt;** |  |  [optional]
**alwaysNodes** | **List&lt;Integer&gt;** |  |  [optional]
**allParentsMustConverge** | **Boolean** | If enabled then the node will only run if all of the parent nodes have met the criteria to reach this node |  [optional]
**identifier** | **String** | An identifier for this node that is unique within its workflow. It is copied to workflow job nodes corresponding to this node. |  [optional]

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
