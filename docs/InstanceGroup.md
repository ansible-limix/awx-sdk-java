# InstanceGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**type** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**related** | **Object** |  |  [optional]
**name** | **String** |  | 
**created** | **String** |  |  [optional]
**modified** | **String** |  |  [optional]
**capacity** | **String** |  |  [optional]
**committedCapacity** | **String** |  |  [optional]
**consumedCapacity** | **String** |  |  [optional]
**percentCapacityRemaining** | **String** |  |  [optional]
**jobsRunning** | **Integer** | Count of jobs in the running or waiting state that are targeted for this instance group |  [optional]
**jobsTotal** | **Integer** | Count of all jobs that target this instance group |  [optional]
**instances** | **String** |  |  [optional]
**isContainerGroup** | **Boolean** | Indicates whether instances in this group are containerized.Containerized groups have a designated Openshift or Kubernetes cluster. |  [optional]
**credential** | **Integer** |  |  [optional]
**policyInstancePercentage** | **Integer** | Minimum percentage of all instances that will be automatically assigned to this group when new instances come online. |  [optional]
**policyInstanceMinimum** | **Integer** | Static minimum number of Instances that will be automatically assign to this group when new instances come online. |  [optional]
**policyInstanceList** | **List&lt;String&gt;** | List of exact-match Instances that will be assigned to this group |  [optional]
**podSpecOverride** | **String** |  |  [optional]
**summaryFields** | **Object** |  |  [optional]
