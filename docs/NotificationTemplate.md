# NotificationTemplate

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
**organization** | **Integer** |  | 
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) |  | 
**notificationConfiguration** | **Object** |  |  [optional]
**messages** | **Object** | Optional custom messages for notification template. |  [optional]

<a name="NotificationTypeEnum"></a>
## Enum: NotificationTypeEnum
Name | Value
---- | -----
EMAIL | &quot;email&quot;
GRAFANA | &quot;grafana&quot;
IRC | &quot;irc&quot;
MATTERMOST | &quot;mattermost&quot;
PAGERDUTY | &quot;pagerduty&quot;
ROCKETCHAT | &quot;rocketchat&quot;
SLACK | &quot;slack&quot;
TWILIO | &quot;twilio&quot;
WEBHOOK | &quot;webhook&quot;
