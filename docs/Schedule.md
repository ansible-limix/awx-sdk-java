# Schedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rrule** | **String** | A value representing the schedules iCal recurrence rule. | 
**id** | **Integer** |  |  [optional]
**type** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**related** | **Object** |  |  [optional]
**summaryFields** | **Object** |  |  [optional]
**created** | **String** |  |  [optional]
**modified** | **String** |  |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**extraData** | **Object** |  |  [optional]
**inventory** | **Integer** | Inventory applied as a prompt, assuming job template prompts for inventory |  [optional]
**scmBranch** | **String** |  |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**jobTags** | **String** |  |  [optional]
**skipTags** | **String** |  |  [optional]
**limit** | **String** |  |  [optional]
**diffMode** | **Boolean** |  |  [optional]
**verbosity** | [**VerbosityEnum**](#VerbosityEnum) |  |  [optional]
**unifiedJobTemplate** | **Integer** |  | 
**enabled** | **Boolean** | Enables processing of this schedule. |  [optional]
**dtstart** | [**OffsetDateTime**](OffsetDateTime.md) | The first occurrence of the schedule occurs on or after this time. |  [optional]
**dtend** | [**OffsetDateTime**](OffsetDateTime.md) | The last occurrence of the schedule occurs before this time, aftewards the schedule expires. |  [optional]
**nextRun** | [**OffsetDateTime**](OffsetDateTime.md) | The next time that the scheduled action will run. |  [optional]
**timezone** | **String** |  |  [optional]
**until** | **String** |  |  [optional]

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
