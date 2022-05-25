# JobEvent

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
**job** | **String** |  |  [optional]
**event** | [**EventEnum**](#EventEnum) |  | 
**counter** | **Integer** |  |  [optional]
**eventDisplay** | **String** |  |  [optional]
**eventData** | **Object** |  |  [optional]
**eventLevel** | **Integer** |  |  [optional]
**failed** | **Boolean** |  |  [optional]
**changed** | **Boolean** |  |  [optional]
**uuid** | **String** |  |  [optional]
**parentUuid** | **String** |  |  [optional]
**host** | **Integer** |  |  [optional]
**hostName** | **String** |  |  [optional]
**playbook** | **String** |  |  [optional]
**play** | **String** |  |  [optional]
**task** | **String** |  |  [optional]
**role** | **String** |  |  [optional]
**stdout** | **String** |  |  [optional]
**startLine** | **Integer** |  |  [optional]
**endLine** | **Integer** |  |  [optional]
**verbosity** | **Integer** |  |  [optional]

<a name="EventEnum"></a>
## Enum: EventEnum
Name | Value
---- | -----
RUNNER_ON_FAILED | &quot;runner_on_failed&quot;
RUNNER_ON_START | &quot;runner_on_start&quot;
RUNNER_ON_OK | &quot;runner_on_ok&quot;
RUNNER_ON_ERROR | &quot;runner_on_error&quot;
RUNNER_ON_SKIPPED | &quot;runner_on_skipped&quot;
RUNNER_ON_UNREACHABLE | &quot;runner_on_unreachable&quot;
RUNNER_ON_NO_HOSTS | &quot;runner_on_no_hosts&quot;
RUNNER_ON_ASYNC_POLL | &quot;runner_on_async_poll&quot;
RUNNER_ON_ASYNC_OK | &quot;runner_on_async_ok&quot;
RUNNER_ON_ASYNC_FAILED | &quot;runner_on_async_failed&quot;
RUNNER_ITEM_ON_OK | &quot;runner_item_on_ok&quot;
RUNNER_ITEM_ON_FAILED | &quot;runner_item_on_failed&quot;
RUNNER_ITEM_ON_SKIPPED | &quot;runner_item_on_skipped&quot;
RUNNER_RETRY | &quot;runner_retry&quot;
RUNNER_ON_FILE_DIFF | &quot;runner_on_file_diff&quot;
PLAYBOOK_ON_START | &quot;playbook_on_start&quot;
PLAYBOOK_ON_NOTIFY | &quot;playbook_on_notify&quot;
PLAYBOOK_ON_INCLUDE | &quot;playbook_on_include&quot;
PLAYBOOK_ON_NO_HOSTS_MATCHED | &quot;playbook_on_no_hosts_matched&quot;
PLAYBOOK_ON_NO_HOSTS_REMAINING | &quot;playbook_on_no_hosts_remaining&quot;
PLAYBOOK_ON_TASK_START | &quot;playbook_on_task_start&quot;
PLAYBOOK_ON_VARS_PROMPT | &quot;playbook_on_vars_prompt&quot;
PLAYBOOK_ON_SETUP | &quot;playbook_on_setup&quot;
PLAYBOOK_ON_IMPORT_FOR_HOST | &quot;playbook_on_import_for_host&quot;
PLAYBOOK_ON_NOT_IMPORT_FOR_HOST | &quot;playbook_on_not_import_for_host&quot;
PLAYBOOK_ON_PLAY_START | &quot;playbook_on_play_start&quot;
PLAYBOOK_ON_STATS | &quot;playbook_on_stats&quot;
DEBUG | &quot;debug&quot;
VERBOSE | &quot;verbose&quot;
DEPRECATED | &quot;deprecated&quot;
WARNING | &quot;warning&quot;
SYSTEM_WARNING | &quot;system_warning&quot;
ERROR | &quot;error&quot;
