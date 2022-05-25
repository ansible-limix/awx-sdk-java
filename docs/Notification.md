# Notification

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
**notificationTemplate** | **Integer** |  |  [optional]
**error** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**notificationsSent** | **Integer** |  |  [optional]
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) |  | 
**recipients** | **String** |  |  [optional]
**subject** | **String** |  |  [optional]
**body** | **String** | Notification body |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESSFUL | &quot;successful&quot;
FAILED | &quot;failed&quot;

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
