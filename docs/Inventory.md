# Inventory

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
**organization** | **Integer** | Organization containing this inventory. | 
**kind** | [**KindEnum**](#KindEnum) | Kind of inventory being represented. |  [optional]
**hostFilter** | **String** | Filter that will be applied to the hosts of this inventory. |  [optional]
**variables** | **String** | Inventory variables in JSON or YAML format. |  [optional]
**hasActiveFailures** | **Boolean** | This field is deprecated and will be removed in a future release. Flag indicating whether any hosts in this inventory have failed. |  [optional]
**totalHosts** | **Integer** | This field is deprecated and will be removed in a future release. Total number of hosts in this inventory. |  [optional]
**hostsWithActiveFailures** | **Integer** | This field is deprecated and will be removed in a future release. Number of hosts in this inventory with active failures. |  [optional]
**totalGroups** | **Integer** | This field is deprecated and will be removed in a future release. Total number of groups in this inventory. |  [optional]
**hasInventorySources** | **Boolean** | This field is deprecated and will be removed in a future release. Flag indicating whether this inventory has any external inventory sources. |  [optional]
**totalInventorySources** | **Integer** | Total number of external inventory sources configured within this inventory. |  [optional]
**inventorySourcesWithFailures** | **Integer** | Number of external inventory sources in this inventory with failures. |  [optional]
**pendingDeletion** | **Boolean** | Flag indicating the inventory is being deleted. |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
SMART | &quot;smart&quot;
