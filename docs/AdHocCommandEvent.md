# AdHocCommandEvent

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
**adHocCommand** | **String** |  |  [optional]
**event** | [**EventEnum**](#EventEnum) |  | 
**counter** | **Integer** |  |  [optional]
**eventDisplay** | **String** |  |  [optional]
**eventData** | **Object** |  |  [optional]
**failed** | **Boolean** |  |  [optional]
**changed** | **Boolean** |  |  [optional]
**uuid** | **String** |  |  [optional]
**host** | **Integer** |  |  [optional]
**hostName** | **String** |  |  [optional]
**stdout** | **String** |  |  [optional]
**startLine** | **Integer** |  |  [optional]
**endLine** | **Integer** |  |  [optional]
**verbosity** | **Integer** |  |  [optional]

<a name="EventEnum"></a>
## Enum: EventEnum
Name | Value
---- | -----
RUNNER_ON_FAILED | &quot;runner_on_failed&quot;
RUNNER_ON_OK | &quot;runner_on_ok&quot;
RUNNER_ON_UNREACHABLE | &quot;runner_on_unreachable&quot;
RUNNER_ON_SKIPPED | &quot;runner_on_skipped&quot;
DEBUG | &quot;debug&quot;
VERBOSE | &quot;verbose&quot;
DEPRECATED | &quot;deprecated&quot;
WARNING | &quot;warning&quot;
SYSTEM_WARNING | &quot;system_warning&quot;
ERROR | &quot;error&quot;
