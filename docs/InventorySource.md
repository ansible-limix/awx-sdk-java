# InventorySource

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
**source** | [**SourceEnum**](#SourceEnum) |  |  [optional]
**sourcePath** | **String** |  |  [optional]
**sourceVars** | **String** | Inventory source variables in YAML or JSON format. |  [optional]
**credential** | **Integer** | Cloud credential to use for inventory updates. |  [optional]
**enabledVar** | **String** | Retrieve the enabled state from the given dict of host variables. The enabled variable may be specified as \&quot;foo.bar\&quot;, in which case the lookup will traverse into nested dicts, equivalent to: from_dict.get(\&quot;foo\&quot;, {}).get(\&quot;bar\&quot;, default) |  [optional]
**enabledValue** | **String** | Only used when enabled_var is set. Value when the host is considered enabled. For example if enabled_var&#x3D;\&quot;status.power_state\&quot;and enabled_value&#x3D;\&quot;powered_on\&quot; with host variables:{   \&quot;status\&quot;: {     \&quot;power_state\&quot;: \&quot;powered_on\&quot;,     \&quot;created\&quot;: \&quot;2020-08-04T18:13:04+00:00\&quot;,     \&quot;healthy\&quot;: true    },    \&quot;name\&quot;: \&quot;foobar\&quot;,    \&quot;ip_address\&quot;: \&quot;192.168.2.1\&quot;}The host would be marked enabled. If power_state where any value other than powered_on then the host would be disabled when imported. If the key is not found then the host will be enabled |  [optional]
**hostFilter** | **String** | Regex where only matching hosts will be imported. |  [optional]
**overwrite** | **Boolean** | Overwrite local groups and hosts from remote inventory source. |  [optional]
**overwriteVars** | **Boolean** | Overwrite local variables from remote inventory source. |  [optional]
**customVirtualenv** | **String** | Local absolute file path containing a custom Python virtualenv to use |  [optional]
**timeout** | **Integer** | The amount of time (in seconds) to run before the task is canceled. |  [optional]
**verbosity** | **Integer** |  |  [optional]
**lastJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastJobFailed** | **Boolean** |  |  [optional]
**nextJobRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**executionEnvironment** | **Integer** | The container image to be used for execution. |  [optional]
**inventory** | **Integer** |  | 
**updateOnLaunch** | **Boolean** |  |  [optional]
**updateCacheTimeout** | **Integer** |  |  [optional]
**sourceProject** | **String** | Project containing inventory file used as source. |  [optional]
**updateOnProjectUpdate** | **Boolean** |  |  [optional]
**lastUpdateFailed** | **Boolean** |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
FILE | &quot;file&quot;
SCM | &quot;scm&quot;
EC2 | &quot;ec2&quot;
GCE | &quot;gce&quot;
AZURE_RM | &quot;azure_rm&quot;
VMWARE | &quot;vmware&quot;
SATELLITE6 | &quot;satellite6&quot;
OPENSTACK | &quot;openstack&quot;
RHV | &quot;rhv&quot;
CONTROLLER | &quot;controller&quot;
INSIGHTS | &quot;insights&quot;

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
NONE | &quot;none&quot;
