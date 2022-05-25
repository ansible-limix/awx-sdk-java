# SettingSingleton

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ACTIVITY_STREAM_ENABLED** | **Boolean** | Enable capturing activity for the activity stream. | 
**ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC** | **Boolean** | Enable capturing activity for the activity stream when running inventory sync. | 
**ORG_ADMINS_CAN_SEE_ALL_USERS** | **Boolean** | Controls whether any Organization Admin can view all users and teams, even those not associated with their Organization. | 
**MANAGE_ORGANIZATION_AUTH** | **Boolean** | Controls whether any Organization Admin has the privileges to create and manage users and teams. You may want to disable this ability if you are using an LDAP or SAML integration. | 
**TOWER_URL_BASE** | **String** | This setting is used by services like notifications to render a valid url to the service. | 
**REMOTE_HOST_HEADERS** | **List&lt;String&gt;** | HTTP headers and meta keys to search to determine remote host name or IP. Add additional items to this list, such as \&quot;HTTP_X_FORWARDED_FOR\&quot;, if behind a reverse proxy. See the \&quot;Proxy Support\&quot; section of the AAP Installation guide for more details. | 
**PROXY_IP_ALLOWED_LIST** | **List&lt;String&gt;** | If the service is behind a reverse proxy/load balancer, use this setting to configure the proxy IP addresses from which the service should trust custom REMOTE_HOST_HEADERS header values. If this setting is an empty list (the default), the headers specified by REMOTE_HOST_HEADERS will be trusted unconditionally&#x27;) | 
**LICENSE** | **Map&lt;String, String&gt;** | The license controls which features and functionality are enabled. Use /api/v2/config/ to update or change the license. |  [optional]
**REDHAT_USERNAME** | **String** | This username is used to send data to Insights for Ansible Automation Platform |  [optional]
**REDHAT_PASSWORD** | **String** | This password is used to send data to Insights for Ansible Automation Platform |  [optional]
**SUBSCRIPTIONS_USERNAME** | **String** | This username is used to retrieve subscription and content information |  [optional]
**SUBSCRIPTIONS_PASSWORD** | **String** | This password is used to retrieve subscription and content information |  [optional]
**AUTOMATION_ANALYTICS_URL** | **String** | This setting is used to to configure the upload URL for data collection for Red Hat Insights. |  [optional]
**INSTALL_UUID** | **String** |  |  [optional]
**DEFAULT_CONTROL_PLANE_QUEUE_NAME** | **String** |  |  [optional]
**DEFAULT_EXECUTION_QUEUE_NAME** | **String** |  |  [optional]
**DEFAULT_EXECUTION_ENVIRONMENT** | **Integer** | The Execution Environment to be used when one has not been configured for a job template. |  [optional]
**CUSTOM_VENV_PATHS** | **List&lt;String&gt;** | Paths where Tower will look for custom virtual environments (in addition to /var/lib/awx/venv/). Enter one path per line. |  [optional]
**AD_HOC_COMMANDS** | **List&lt;String&gt;** | List of modules allowed to be used by ad-hoc jobs. |  [optional]
**ALLOW_JINJA_IN_EXTRA_VARS** | [**ALLOWJINJAINEXTRAVARSEnum**](#ALLOWJINJAINEXTRAVARSEnum) | Ansible allows variable substitution via the Jinja2 templating language for --extra-vars. This poses a potential security risk where users with the ability to specify extra vars at job launch time can use Jinja2 templates to run arbitrary Python.  It is recommended that this value be set to \&quot;template\&quot; or \&quot;never\&quot;. | 
**AWX_ISOLATION_BASE_PATH** | **String** | The directory in which the service will create new temporary directories for job execution and isolation (such as credential files). | 
**AWX_ISOLATION_SHOW_PATHS** | **List&lt;String&gt;** | List of paths that would otherwise be hidden to expose to isolated jobs. Enter one path per line. Volumes will be mounted from the execution node to the container. The supported format is HOST-DIR[:CONTAINER-DIR[:OPTIONS]].  |  [optional]
**AWX_TASK_ENV** | **Map&lt;String, String&gt;** | Additional environment variables set for playbook runs, inventory updates, project updates, and notification sending. |  [optional]
**INSIGHTS_TRACKING_STATE** | **Boolean** | Enables the service to gather data on automation and send it to Red Hat Insights. |  [optional]
**PROJECT_UPDATE_VVV** | **Boolean** | Adds the CLI -vvv flag to ansible-playbook runs of project_update.yml used for project updates. | 
**AWX_ROLES_ENABLED** | **Boolean** | Allows roles to be dynamically downloaded from a requirements.yml file for SCM projects. |  [optional]
**AWX_COLLECTIONS_ENABLED** | **Boolean** | Allows collections to be dynamically downloaded from a requirements.yml file for SCM projects. |  [optional]
**AWX_SHOW_PLAYBOOK_LINKS** | **Boolean** | Follow symbolic links when scanning for playbooks. Be aware that setting this to True can lead to infinite recursion if a link points to a parent directory of itself. |  [optional]
**awXMOUNTISOLATEDPATHSONK8S** | **Boolean** | Expose paths via hostPath for the Pods created by a Container Group. HostPath volumes present many security risks, and it is a best practice to avoid the use of HostPaths when possible.  |  [optional]
**GALAXY_IGNORE_CERTS** | **Boolean** | If set to true, certificate validation will not be done when installing content from any Galaxy server. |  [optional]
**STDOUT_MAX_BYTES_DISPLAY** | **Integer** | Maximum Size of Standard Output in bytes to display before requiring the output be downloaded. | 
**EVENT_STDOUT_MAX_BYTES_DISPLAY** | **Integer** | Maximum Size of Standard Output in bytes to display for a single job or ad hoc command event. &#x60;stdout&#x60; will end with &#x60;…&#x60; when truncated. | 
**MAX_WEBSOCKET_EVENT_RATE** | **Integer** | Maximum number of messages to update the UI live job output with per second. Value of 0 means no limit. |  [optional]
**SCHEDULE_MAX_JOBS** | **Integer** | Maximum number of the same job template that can be waiting to run when launching from a schedule before no more are created. | 
**AWX_ANSIBLE_CALLBACK_PLUGINS** | **List&lt;String&gt;** | List of paths to search for extra callback plugins to be used when running jobs. Enter one path per line. |  [optional]
**DEFAULT_JOB_TIMEOUT** | **Integer** | Maximum time in seconds to allow jobs to run. Use value of 0 to indicate that no timeout should be imposed. A timeout set on an individual job template will override this. |  [optional]
**DEFAULT_JOB_IDLE_TIMEOUT** | **Integer** | If no output is detected from ansible in this number of seconds the execution will be terminated. Use value of 0 to used default idle_timeout is 600s. |  [optional]
**DEFAULT_INVENTORY_UPDATE_TIMEOUT** | **Integer** | Maximum time in seconds to allow inventory updates to run. Use value of 0 to indicate that no timeout should be imposed. A timeout set on an individual inventory source will override this. |  [optional]
**DEFAULT_PROJECT_UPDATE_TIMEOUT** | **Integer** | Maximum time in seconds to allow project updates to run. Use value of 0 to indicate that no timeout should be imposed. A timeout set on an individual project will override this. |  [optional]
**ANSIBLE_FACT_CACHE_TIMEOUT** | **Integer** | Maximum time, in seconds, that stored Ansible facts are considered valid since the last time they were modified. Only valid, non-stale, facts will be accessible by a playbook. Note, this does not influence the deletion of ansible_facts from the database. Use a value of 0 to indicate that no timeout should be imposed. |  [optional]
**MAX_FORKS** | **Integer** | Saving a Job Template with more than this number of forks will result in an error. When set to 0, no limit is applied. |  [optional]
**LOG_AGGREGATOR_HOST** | **String** | Hostname/IP where external logs will be sent to. |  [optional]
**LOG_AGGREGATOR_PORT** | **Integer** | Port on Logging Aggregator to send logs to (if required and not provided in Logging Aggregator). |  [optional]
**LOG_AGGREGATOR_TYPE** | [**LOGAGGREGATORTYPEEnum**](#LOGAGGREGATORTYPEEnum) | Format messages for the chosen log aggregator. |  [optional]
**LOG_AGGREGATOR_USERNAME** | **String** | Username for external log aggregator (if required; HTTP/s only). |  [optional]
**LOG_AGGREGATOR_PASSWORD** | **String** | Password or authentication token for external log aggregator (if required; HTTP/s only). |  [optional]
**LOG_AGGREGATOR_LOGGERS** | **List&lt;String&gt;** | List of loggers that will send HTTP logs to the collector, these can include any or all of:  awx - service logs activity_stream - activity stream records job_events - callback data from Ansible job events system_tracking - facts gathered from scan jobs. |  [optional]
**LOG_AGGREGATOR_INDIVIDUAL_FACTS** | **Boolean** | If set, system tracking facts will be sent for each package, service, or other item found in a scan, allowing for greater search query granularity. If unset, facts will be sent as a single dictionary, allowing for greater efficiency in fact processing. |  [optional]
**LOG_AGGREGATOR_ENABLED** | **Boolean** | Enable sending logs to external log aggregator. |  [optional]
**LOG_AGGREGATOR_TOWER_UUID** | **String** | Useful to uniquely identify instances. |  [optional]
**LOG_AGGREGATOR_PROTOCOL** | [**LOGAGGREGATORPROTOCOLEnum**](#LOGAGGREGATORPROTOCOLEnum) | Protocol used to communicate with log aggregator.  HTTPS/HTTP assumes HTTPS unless http:// is explicitly used in the Logging Aggregator hostname. |  [optional]
**LOG_AGGREGATOR_TCP_TIMEOUT** | **Integer** | Number of seconds for a TCP connection to external log aggregator to timeout. Applies to HTTPS and TCP log aggregator protocols. |  [optional]
**LOG_AGGREGATOR_VERIFY_CERT** | **Boolean** | Flag to control enable/disable of certificate verification when LOG_AGGREGATOR_PROTOCOL is \&quot;https\&quot;. If enabled, the log handler will verify certificate sent by external log aggregator before establishing connection. |  [optional]
**LOG_AGGREGATOR_LEVEL** | [**LOGAGGREGATORLEVELEnum**](#LOGAGGREGATORLEVELEnum) | Level threshold used by log handler. Severities from lowest to highest are DEBUG, INFO, WARNING, ERROR, CRITICAL. Messages less severe than the threshold will be ignored by log handler. (messages under category awx.anlytics ignore this setting) |  [optional]
**LOG_AGGREGATOR_MAX_DISK_USAGE_GB** | **Integer** | Amount of data to store (in gigabytes) during an outage of the external log aggregator (defaults to 1). Equivalent to the rsyslogd queue.maxdiskspace setting. |  [optional]
**LOG_AGGREGATOR_MAX_DISK_USAGE_PATH** | **String** | Location to persist logs that should be retried after an outage of the external log aggregator (defaults to /var/lib/awx). Equivalent to the rsyslogd queue.spoolDirectory setting. |  [optional]
**LOG_AGGREGATOR_RSYSLOGD_DEBUG** | **Boolean** | Enabled high verbosity debugging for rsyslogd.  Useful for debugging connection issues for external log aggregation. |  [optional]
**apI400ERRORLOGFORMAT** | **String** | The format of logged messages when an API 4XX error occurs, the following variables will be substituted:  status_code - The HTTP status code of the error user_name - The user name attempting to use the API url_path - The URL path to the API endpoint called remote_addr - The remote address seen for the user error - The error set by the api endpoint Variables need to be in the format {&lt;variable name&gt;}. |  [optional]
**AUTOMATION_ANALYTICS_LAST_GATHER** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**AUTOMATION_ANALYTICS_LAST_ENTRIES** | **String** |  |  [optional]
**AUTOMATION_ANALYTICS_GATHER_INTERVAL** | **Integer** | Interval (in seconds) between data gathering. |  [optional]
**isK8S** | **Boolean** | Indicates whether the instance is part of a kubernetes-based deployment. |  [optional]
**SESSION_COOKIE_AGE** | **Integer** | Number of seconds that a user is inactive before they will need to login again. | 
**SESSIONS_PER_USER** | **Integer** | Maximum number of simultaneous logged in sessions a user may have. To disable enter -1. | 
**DISABLE_LOCAL_AUTH** | **Boolean** | Controls whether users are prevented from using the built-in authentication system. You probably want to do this if you are using an LDAP or SAML integration. | 
**AUTH_BASIC_ENABLED** | **Boolean** | Enable HTTP Basic Auth for the API Browser. | 
**oaUTH2PROVIDER** | **Map&lt;String, Integer&gt;** | Dictionary for customizing OAuth 2 timeouts, available items are &#x60;ACCESS_TOKEN_EXPIRE_SECONDS&#x60;, the duration of access tokens in the number of seconds, &#x60;AUTHORIZATION_CODE_EXPIRE_SECONDS&#x60;, the duration of authorization codes in the number of seconds, and &#x60;REFRESH_TOKEN_EXPIRE_SECONDS&#x60;, the duration of refresh tokens, after expired access tokens, in the number of seconds. |  [optional]
**alLOWOAUTH2FOREXTERNALUSERS** | **Boolean** | For security reasons, users from external auth providers (LDAP, SAML, SSO, Radius, and others) are not allowed to create OAuth2 tokens. To change this behavior, enable this setting. Existing tokens will not be deleted when this setting is toggled off. |  [optional]
**LOGIN_REDIRECT_OVERRIDE** | **String** | URL to which unauthorized users will be redirected to log in.  If blank, users will be sent to the login page. |  [optional]
**PENDO_TRACKING_STATE** | [**PENDOTRACKINGSTATEEnum**](#PENDOTRACKINGSTATEEnum) | Enable or Disable User Analytics Tracking. |  [optional]
**CUSTOM_LOGIN_INFO** | **String** | If needed, you can add specific information (such as a legal notice or a disclaimer) to a text box in the login modal using this setting. Any content added must be in plain text or an HTML fragment, as other markup languages are not supported. |  [optional]
**CUSTOM_LOGO** | **String** | To set up a custom logo, provide a file that you create. For the custom logo to look its best, use a .png file with a transparent background. GIF, PNG and JPEG formats are supported. |  [optional]
**MAX_UI_JOB_EVENTS** | **Integer** | Maximum number of job events for the UI to retrieve within a single request. | 
**UI_LIVE_UPDATES_ENABLED** | **Boolean** | If disabled, the page will not refresh when events are received. Reloading the page will be required to get the latest details. | 
**AUTHENTICATION_BACKENDS** | **List&lt;String&gt;** | List of authentication backends that are enabled based on license features and other authentication settings. |  [optional]
**SOCIAL_AUTH_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_USER_FIELDS** | **List&lt;String&gt;** | When set to an empty list &#x60;[]&#x60;, this setting prevents new user accounts from being created. Only users who have previously logged in using social auth or have a user account with a matching email address will be able to login. |  [optional]
**AUTH_LDAP_SERVER_URI** | **String** | URI to connect to LDAP server, such as \&quot;ldap://ldap.example.com:389\&quot; (non-SSL) or \&quot;ldaps://ldap.example.com:636\&quot; (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty. |  [optional]
**AUTH_LDAP_BIND_DN** | **String** | DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax. |  [optional]
**AUTH_LDAP_BIND_PASSWORD** | **String** | Password used to bind LDAP user account. |  [optional]
**AUTH_LDAP_START_TLS** | **Boolean** | Whether to enable TLS when the LDAP connection is not using SSL. |  [optional]
**AUTH_LDAP_CONNECTION_OPTIONS** | **Map&lt;String, String&gt;** | Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \&quot;OPT_REFERRALS\&quot;). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set. |  [optional]
**AUTH_LDAP_USER_SEARCH** | **List&lt;String&gt;** | LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \&quot;LDAPUnion\&quot; is possible. See the documentation for details. |  [optional]
**AUTH_LDAP_USER_DN_TEMPLATE** | **String** | Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH. |  [optional]
**AUTH_LDAP_USER_ATTR_MAP** | **Map&lt;String, String&gt;** | Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details. |  [optional]
**AUTH_LDAP_GROUP_SEARCH** | **List&lt;String&gt;** | Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion. |  [optional]
**AUTH_LDAP_GROUP_TYPE** | [**AUTHLDAPGROUPTYPEEnum**](#AUTHLDAPGROUPTYPEEnum) | The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups |  [optional]
**AUTH_LDAP_GROUP_TYPE_PARAMS** | **Map&lt;String, String&gt;** | Key value parameters to send the chosen group type init method. |  [optional]
**AUTH_LDAP_REQUIRE_GROUP** | **String** | Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported. |  [optional]
**AUTH_LDAP_DENY_GROUP** | **String** | Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported. |  [optional]
**AUTH_LDAP_USER_FLAGS_BY_GROUP** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail. |  [optional]
**AUTH_LDAP_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation. |  [optional]
**AUTH_LDAP_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation. |  [optional]
**auTHLDAP1SERVERURI** | **String** | URI to connect to LDAP server, such as \&quot;ldap://ldap.example.com:389\&quot; (non-SSL) or \&quot;ldaps://ldap.example.com:636\&quot; (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty. |  [optional]
**auTHLDAP1BINDDN** | **String** | DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax. |  [optional]
**auTHLDAP1BINDPASSWORD** | **String** | Password used to bind LDAP user account. |  [optional]
**auTHLDAP1STARTTLS** | **Boolean** | Whether to enable TLS when the LDAP connection is not using SSL. |  [optional]
**auTHLDAP1CONNECTIONOPTIONS** | **Map&lt;String, String&gt;** | Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \&quot;OPT_REFERRALS\&quot;). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set. |  [optional]
**auTHLDAP1USERSEARCH** | **List&lt;String&gt;** | LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \&quot;LDAPUnion\&quot; is possible. See the documentation for details. |  [optional]
**auTHLDAP1USERDNTEMPLATE** | **String** | Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH. |  [optional]
**auTHLDAP1USERATTRMAP** | **Map&lt;String, String&gt;** | Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details. |  [optional]
**auTHLDAP1GROUPSEARCH** | **List&lt;String&gt;** | Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion. |  [optional]
**auTHLDAP1GROUPTYPE** | [**AuTHLDAP1GROUPTYPEEnum**](#AuTHLDAP1GROUPTYPEEnum) | The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups |  [optional]
**auTHLDAP1GROUPTYPEPARAMS** | **Map&lt;String, String&gt;** | Key value parameters to send the chosen group type init method. |  [optional]
**auTHLDAP1REQUIREGROUP** | **String** | Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported. |  [optional]
**auTHLDAP1DENYGROUP** | **String** | Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported. |  [optional]
**auTHLDAP1USERFLAGSBYGROUP** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail. |  [optional]
**auTHLDAP1ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation. |  [optional]
**auTHLDAP1TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation. |  [optional]
**auTHLDAP2SERVERURI** | **String** | URI to connect to LDAP server, such as \&quot;ldap://ldap.example.com:389\&quot; (non-SSL) or \&quot;ldaps://ldap.example.com:636\&quot; (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty. |  [optional]
**auTHLDAP2BINDDN** | **String** | DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax. |  [optional]
**auTHLDAP2BINDPASSWORD** | **String** | Password used to bind LDAP user account. |  [optional]
**auTHLDAP2STARTTLS** | **Boolean** | Whether to enable TLS when the LDAP connection is not using SSL. |  [optional]
**auTHLDAP2CONNECTIONOPTIONS** | **Map&lt;String, String&gt;** | Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \&quot;OPT_REFERRALS\&quot;). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set. |  [optional]
**auTHLDAP2USERSEARCH** | **List&lt;String&gt;** | LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \&quot;LDAPUnion\&quot; is possible. See the documentation for details. |  [optional]
**auTHLDAP2USERDNTEMPLATE** | **String** | Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH. |  [optional]
**auTHLDAP2USERATTRMAP** | **Map&lt;String, String&gt;** | Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details. |  [optional]
**auTHLDAP2GROUPSEARCH** | **List&lt;String&gt;** | Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion. |  [optional]
**auTHLDAP2GROUPTYPE** | [**AuTHLDAP2GROUPTYPEEnum**](#AuTHLDAP2GROUPTYPEEnum) | The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups |  [optional]
**auTHLDAP2GROUPTYPEPARAMS** | **Map&lt;String, String&gt;** | Key value parameters to send the chosen group type init method. |  [optional]
**auTHLDAP2REQUIREGROUP** | **String** | Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported. |  [optional]
**auTHLDAP2DENYGROUP** | **String** | Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported. |  [optional]
**auTHLDAP2USERFLAGSBYGROUP** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail. |  [optional]
**auTHLDAP2ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation. |  [optional]
**auTHLDAP2TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation. |  [optional]
**auTHLDAP3SERVERURI** | **String** | URI to connect to LDAP server, such as \&quot;ldap://ldap.example.com:389\&quot; (non-SSL) or \&quot;ldaps://ldap.example.com:636\&quot; (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty. |  [optional]
**auTHLDAP3BINDDN** | **String** | DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax. |  [optional]
**auTHLDAP3BINDPASSWORD** | **String** | Password used to bind LDAP user account. |  [optional]
**auTHLDAP3STARTTLS** | **Boolean** | Whether to enable TLS when the LDAP connection is not using SSL. |  [optional]
**auTHLDAP3CONNECTIONOPTIONS** | **Map&lt;String, String&gt;** | Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \&quot;OPT_REFERRALS\&quot;). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set. |  [optional]
**auTHLDAP3USERSEARCH** | **List&lt;String&gt;** | LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \&quot;LDAPUnion\&quot; is possible. See the documentation for details. |  [optional]
**auTHLDAP3USERDNTEMPLATE** | **String** | Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH. |  [optional]
**auTHLDAP3USERATTRMAP** | **Map&lt;String, String&gt;** | Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details. |  [optional]
**auTHLDAP3GROUPSEARCH** | **List&lt;String&gt;** | Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion. |  [optional]
**auTHLDAP3GROUPTYPE** | [**AuTHLDAP3GROUPTYPEEnum**](#AuTHLDAP3GROUPTYPEEnum) | The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups |  [optional]
**auTHLDAP3GROUPTYPEPARAMS** | **Map&lt;String, String&gt;** | Key value parameters to send the chosen group type init method. |  [optional]
**auTHLDAP3REQUIREGROUP** | **String** | Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported. |  [optional]
**auTHLDAP3DENYGROUP** | **String** | Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported. |  [optional]
**auTHLDAP3USERFLAGSBYGROUP** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail. |  [optional]
**auTHLDAP3ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation. |  [optional]
**auTHLDAP3TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation. |  [optional]
**auTHLDAP4SERVERURI** | **String** | URI to connect to LDAP server, such as \&quot;ldap://ldap.example.com:389\&quot; (non-SSL) or \&quot;ldaps://ldap.example.com:636\&quot; (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty. |  [optional]
**auTHLDAP4BINDDN** | **String** | DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax. |  [optional]
**auTHLDAP4BINDPASSWORD** | **String** | Password used to bind LDAP user account. |  [optional]
**auTHLDAP4STARTTLS** | **Boolean** | Whether to enable TLS when the LDAP connection is not using SSL. |  [optional]
**auTHLDAP4CONNECTIONOPTIONS** | **Map&lt;String, String&gt;** | Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \&quot;OPT_REFERRALS\&quot;). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set. |  [optional]
**auTHLDAP4USERSEARCH** | **List&lt;String&gt;** | LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \&quot;LDAPUnion\&quot; is possible. See the documentation for details. |  [optional]
**auTHLDAP4USERDNTEMPLATE** | **String** | Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH. |  [optional]
**auTHLDAP4USERATTRMAP** | **Map&lt;String, String&gt;** | Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details. |  [optional]
**auTHLDAP4GROUPSEARCH** | **List&lt;String&gt;** | Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion. |  [optional]
**auTHLDAP4GROUPTYPE** | [**AuTHLDAP4GROUPTYPEEnum**](#AuTHLDAP4GROUPTYPEEnum) | The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups |  [optional]
**auTHLDAP4GROUPTYPEPARAMS** | **Map&lt;String, String&gt;** | Key value parameters to send the chosen group type init method. |  [optional]
**auTHLDAP4REQUIREGROUP** | **String** | Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported. |  [optional]
**auTHLDAP4DENYGROUP** | **String** | Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported. |  [optional]
**auTHLDAP4USERFLAGSBYGROUP** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail. |  [optional]
**auTHLDAP4ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation. |  [optional]
**auTHLDAP4TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation. |  [optional]
**auTHLDAP5SERVERURI** | **String** | URI to connect to LDAP server, such as \&quot;ldap://ldap.example.com:389\&quot; (non-SSL) or \&quot;ldaps://ldap.example.com:636\&quot; (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty. |  [optional]
**auTHLDAP5BINDDN** | **String** | DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax. |  [optional]
**auTHLDAP5BINDPASSWORD** | **String** | Password used to bind LDAP user account. |  [optional]
**auTHLDAP5STARTTLS** | **Boolean** | Whether to enable TLS when the LDAP connection is not using SSL. |  [optional]
**auTHLDAP5CONNECTIONOPTIONS** | **Map&lt;String, String&gt;** | Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \&quot;OPT_REFERRALS\&quot;). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set. |  [optional]
**auTHLDAP5USERSEARCH** | **List&lt;String&gt;** | LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \&quot;LDAPUnion\&quot; is possible. See the documentation for details. |  [optional]
**auTHLDAP5USERDNTEMPLATE** | **String** | Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH. |  [optional]
**auTHLDAP5USERATTRMAP** | **Map&lt;String, String&gt;** | Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details. |  [optional]
**auTHLDAP5GROUPSEARCH** | **List&lt;String&gt;** | Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion. |  [optional]
**auTHLDAP5GROUPTYPE** | [**AuTHLDAP5GROUPTYPEEnum**](#AuTHLDAP5GROUPTYPEEnum) | The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups |  [optional]
**auTHLDAP5GROUPTYPEPARAMS** | **Map&lt;String, String&gt;** | Key value parameters to send the chosen group type init method. |  [optional]
**auTHLDAP5REQUIREGROUP** | **String** | Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported. |  [optional]
**auTHLDAP5DENYGROUP** | **String** | Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported. |  [optional]
**auTHLDAP5USERFLAGSBYGROUP** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail. |  [optional]
**auTHLDAP5ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation. |  [optional]
**auTHLDAP5TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation. |  [optional]
**RADIUS_SERVER** | **String** | Hostname/IP of RADIUS server. RADIUS authentication is disabled if this setting is empty. |  [optional]
**RADIUS_PORT** | **Integer** | Port of RADIUS server. |  [optional]
**RADIUS_SECRET** | **String** | Shared secret for authenticating to RADIUS server. |  [optional]
**TACACSPLUS_HOST** | **String** | Hostname of TACACS+ server. |  [optional]
**TACACSPLUS_PORT** | **Integer** | Port number of TACACS+ server. |  [optional]
**TACACSPLUS_SECRET** | **String** | Shared secret for authenticating to TACACS+ server. |  [optional]
**TACACSPLUS_SESSION_TIMEOUT** | **Integer** | TACACS+ session timeout value in seconds, 0 disables timeout. |  [optional]
**TACACSPLUS_AUTH_PROTOCOL** | [**TACACSPLUSAUTHPROTOCOLEnum**](#TACACSPLUSAUTHPROTOCOLEnum) | Choose the authentication protocol used by TACACS+ client. |  [optional]
**soCIALAUTHGOOGLEOAUTH2CALLBACKURL** | **String** | Provide this URL as the callback URL for your application as part of your registration process. Refer to the documentation for more detail. |  [optional]
**soCIALAUTHGOOGLEOAUTH2KEY** | **String** | The OAuth2 key from your web application. |  [optional]
**soCIALAUTHGOOGLEOAUTH2SECRET** | **String** | The OAuth2 secret from your web application. |  [optional]
**soCIALAUTHGOOGLEOAUTH2WHITELISTEDDOMAINS** | **List&lt;String&gt;** | Update this setting to restrict the domains who are allowed to login using Google OAuth2. |  [optional]
**soCIALAUTHGOOGLEOAUTH2AUTHEXTRAARGUMENTS** | **Map&lt;String, String&gt;** | Extra arguments for Google OAuth2 login. You can restrict it to only allow a single domain to authenticate, even if the user is logged in with multple Google accounts. Refer to the documentation for more detail. |  [optional]
**soCIALAUTHGOOGLEOAUTH2ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**soCIALAUTHGOOGLEOAUTH2TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_CALLBACK_URL** | **String** | Provide this URL as the callback URL for your application as part of your registration process. Refer to the documentation for more detail. |  [optional]
**SOCIAL_AUTH_GITHUB_KEY** | **String** | The OAuth2 key (Client ID) from your GitHub developer application. |  [optional]
**SOCIAL_AUTH_GITHUB_SECRET** | **String** | The OAuth2 secret (Client Secret) from your GitHub developer application. |  [optional]
**SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ORG_CALLBACK_URL** | **String** | Provide this URL as the callback URL for your application as part of your registration process. Refer to the documentation for more detail. |  [optional]
**SOCIAL_AUTH_GITHUB_ORG_KEY** | **String** | The OAuth2 key (Client ID) from your GitHub organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_ORG_SECRET** | **String** | The OAuth2 secret (Client Secret) from your GitHub organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_ORG_NAME** | **String** | The name of your GitHub organization, as used in your organization&#x27;s URL: https://github.com/&lt;yourorg&gt;/. |  [optional]
**SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_CALLBACK_URL** | **String** | Create an organization-owned application at https://github.com/organizations/&lt;yourorg&gt;/settings/applications and obtain an OAuth2 key (Client ID) and secret (Client Secret). Provide this URL as the callback URL for your application. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_KEY** | **String** | The OAuth2 key (Client ID) from your GitHub organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_SECRET** | **String** | The OAuth2 secret (Client Secret) from your GitHub organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_ID** | **String** | Find the numeric team ID using the Github API: http://fabian-kostadinov.github.io/2015/01/16/how-to-find-a-github-team-id/. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_CALLBACK_URL** | **String** | Provide this URL as the callback URL for your application as part of your registration process. Refer to the documentation for more detail. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_URL** | **String** | The URL for your Github Enterprise instance, e.g.: http(s)://hostname/. Refer to Github Enterprise documentation for more details. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL** | **String** | The API URL for your GitHub Enterprise instance, e.g.: http(s)://hostname/api/v3/. Refer to Github Enterprise documentation for more details. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY** | **String** | The OAuth2 key (Client ID) from your GitHub Enterprise developer application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET** | **String** | The OAuth2 secret (Client Secret) from your GitHub Enterprise developer application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_CALLBACK_URL** | **String** | Provide this URL as the callback URL for your application as part of your registration process. Refer to the documentation for more detail. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL** | **String** | The URL for your Github Enterprise instance, e.g.: http(s)://hostname/. Refer to Github Enterprise documentation for more details. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL** | **String** | The API URL for your GitHub Enterprise instance, e.g.: http(s)://hostname/api/v3/. Refer to Github Enterprise documentation for more details. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY** | **String** | The OAuth2 key (Client ID) from your GitHub Enterprise organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET** | **String** | The OAuth2 secret (Client Secret) from your GitHub Enterprise organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME** | **String** | The name of your GitHub Enterprise organization, as used in your organization&#x27;s URL: https://github.com/&lt;yourorg&gt;/. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_CALLBACK_URL** | **String** | Create an organization-owned application at https://github.com/organizations/&lt;yourorg&gt;/settings/applications and obtain an OAuth2 key (Client ID) and secret (Client Secret). Provide this URL as the callback URL for your application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL** | **String** | The URL for your Github Enterprise instance, e.g.: http(s)://hostname/. Refer to Github Enterprise documentation for more details. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL** | **String** | The API URL for your GitHub Enterprise instance, e.g.: http(s)://hostname/api/v3/. Refer to Github Enterprise documentation for more details. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY** | **String** | The OAuth2 key (Client ID) from your GitHub Enterprise organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET** | **String** | The OAuth2 secret (Client Secret) from your GitHub Enterprise organization application. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID** | **String** | Find the numeric team ID using the Github Enterprise API: http://fabian-kostadinov.github.io/2015/01/16/how-to-find-a-github-team-id/. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**soCIALAUTHAZUREADOAUTH2CALLBACKURL** | **String** | Provide this URL as the callback URL for your application as part of your registration process. Refer to the documentation for more detail.  |  [optional]
**soCIALAUTHAZUREADOAUTH2KEY** | **String** | The OAuth2 key (Client ID) from your Azure AD application. |  [optional]
**soCIALAUTHAZUREADOAUTH2SECRET** | **String** | The OAuth2 secret (Client Secret) from your Azure AD application. |  [optional]
**soCIALAUTHAZUREADOAUTH2ORGANIZATIONMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**soCIALAUTHAZUREADOAUTH2TEAMMAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SAML_AUTO_CREATE_OBJECTS** | **Boolean** | When enabled (the default), mapped Organizations and Teams will be created automatically on successful SAML login. |  [optional]
**SOCIAL_AUTH_SAML_CALLBACK_URL** | **String** | Register the service as a service provider (SP) with each identity provider (IdP) you have configured. Provide your SP Entity ID and this ACS URL for your application. |  [optional]
**SOCIAL_AUTH_SAML_METADATA_URL** | **String** | If your identity provider (IdP) allows uploading an XML metadata file, you can download one from this URL. |  [optional]
**SOCIAL_AUTH_SAML_SP_ENTITY_ID** | **String** | The application-defined unique identifier used as the audience of the SAML service provider (SP) configuration. This is usually the URL for the service. |  [optional]
**SOCIAL_AUTH_SAML_SP_PUBLIC_CERT** | **String** | Create a keypair to use as a service provider (SP) and include the certificate content here. | 
**SOCIAL_AUTH_SAML_SP_PRIVATE_KEY** | **String** | Create a keypair to use as a service provider (SP) and include the private key content here. | 
**SOCIAL_AUTH_SAML_ORG_INFO** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Provide the URL, display name, and the name of your app. Refer to the documentation for example syntax. | 
**SOCIAL_AUTH_SAML_TECHNICAL_CONTACT** | **Map&lt;String, String&gt;** | Provide the name and email address of the technical contact for your service provider. Refer to the documentation for example syntax. | 
**SOCIAL_AUTH_SAML_SUPPORT_CONTACT** | **Map&lt;String, String&gt;** | Provide the name and email address of the support contact for your service provider. Refer to the documentation for example syntax. | 
**SOCIAL_AUTH_SAML_ENABLED_IDPS** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Configure the Entity ID, SSO URL and certificate for each identity provider (IdP) in use. Multiple SAML IdPs are supported. Some IdPs may provide user data using attribute names that differ from the default OIDs. Attribute names may be overridden for each IdP. Refer to the Ansible documentation for additional details and syntax. |  [optional]
**SOCIAL_AUTH_SAML_SECURITY_CONFIG** | **Map&lt;String, String&gt;** | A dict of key value pairs that are passed to the underlying python-saml security setting https://github.com/onelogin/python-saml#settings |  [optional]
**SOCIAL_AUTH_SAML_SP_EXTRA** | **Map&lt;String, String&gt;** | A dict of key value pairs to be passed to the underlying python-saml Service Provider configuration setting. |  [optional]
**SOCIAL_AUTH_SAML_EXTRA_DATA** | **List&lt;String&gt;** | A list of tuples that maps IDP attributes to extra_attributes. Each attribute will be a list of values, even if only 1 value. |  [optional]
**SOCIAL_AUTH_SAML_ORGANIZATION_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the  documentation. |  [optional]
**SOCIAL_AUTH_SAML_TEAM_MAP** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation. |  [optional]
**SOCIAL_AUTH_SAML_ORGANIZATION_ATTR** | **Map&lt;String, String&gt;** | Used to translate user organization membership. |  [optional]
**SOCIAL_AUTH_SAML_TEAM_ATTR** | **Map&lt;String, String&gt;** | Used to translate user team membership. |  [optional]
**SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR** | **Map&lt;String, String&gt;** | Used to map super users and system auditors from SAML. |  [optional]
**NAMED_URL_FORMATS** | **Map&lt;String, String&gt;** | Read-only list of key-value pairs that shows the standard format of all available named URLs. |  [optional]
**NAMED_URL_GRAPH_NODES** | **Map&lt;String, String&gt;** | Read-only list of key-value pairs that exposes named URL graph topology. Use this list to programmatically generate named URLs for resources |  [optional]

<a name="ALLOWJINJAINEXTRAVARSEnum"></a>
## Enum: ALLOWJINJAINEXTRAVARSEnum
Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
TEMPLATE | &quot;template&quot;

<a name="LOGAGGREGATORTYPEEnum"></a>
## Enum: LOGAGGREGATORTYPEEnum
Name | Value
---- | -----
LOGSTASH | &quot;logstash&quot;
SPLUNK | &quot;splunk&quot;
LOGGLY | &quot;loggly&quot;
SUMOLOGIC | &quot;sumologic&quot;
OTHER | &quot;other&quot;

<a name="LOGAGGREGATORPROTOCOLEnum"></a>
## Enum: LOGAGGREGATORPROTOCOLEnum
Name | Value
---- | -----
HTTPS | &quot;https&quot;
TCP | &quot;tcp&quot;
UDP | &quot;udp&quot;

<a name="LOGAGGREGATORLEVELEnum"></a>
## Enum: LOGAGGREGATORLEVELEnum
Name | Value
---- | -----
DEBUG | &quot;DEBUG&quot;
INFO | &quot;INFO&quot;
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;
CRITICAL | &quot;CRITICAL&quot;

<a name="PENDOTRACKINGSTATEEnum"></a>
## Enum: PENDOTRACKINGSTATEEnum
Name | Value
---- | -----
OFF | &quot;off&quot;
ANONYMOUS | &quot;anonymous&quot;
DETAILED | &quot;detailed&quot;

<a name="AUTHLDAPGROUPTYPEEnum"></a>
## Enum: AUTHLDAPGROUPTYPEEnum
Name | Value
---- | -----
POSIXGROUPTYPE | &quot;PosixGroupType&quot;
GROUPOFNAMESTYPE | &quot;GroupOfNamesType&quot;
GROUPOFUNIQUENAMESTYPE | &quot;GroupOfUniqueNamesType&quot;
ACTIVEDIRECTORYGROUPTYPE | &quot;ActiveDirectoryGroupType&quot;
ORGANIZATIONALROLEGROUPTYPE | &quot;OrganizationalRoleGroupType&quot;
MEMBERDNGROUPTYPE | &quot;MemberDNGroupType&quot;
NESTEDGROUPOFNAMESTYPE | &quot;NestedGroupOfNamesType&quot;
NESTEDGROUPOFUNIQUENAMESTYPE | &quot;NestedGroupOfUniqueNamesType&quot;
NESTEDACTIVEDIRECTORYGROUPTYPE | &quot;NestedActiveDirectoryGroupType&quot;
NESTEDORGANIZATIONALROLEGROUPTYPE | &quot;NestedOrganizationalRoleGroupType&quot;
NESTEDMEMBERDNGROUPTYPE | &quot;NestedMemberDNGroupType&quot;
POSIXUIDGROUPTYPE | &quot;PosixUIDGroupType&quot;

<a name="AuTHLDAP1GROUPTYPEEnum"></a>
## Enum: AuTHLDAP1GROUPTYPEEnum
Name | Value
---- | -----
POSIXGROUPTYPE | &quot;PosixGroupType&quot;
GROUPOFNAMESTYPE | &quot;GroupOfNamesType&quot;
GROUPOFUNIQUENAMESTYPE | &quot;GroupOfUniqueNamesType&quot;
ACTIVEDIRECTORYGROUPTYPE | &quot;ActiveDirectoryGroupType&quot;
ORGANIZATIONALROLEGROUPTYPE | &quot;OrganizationalRoleGroupType&quot;
MEMBERDNGROUPTYPE | &quot;MemberDNGroupType&quot;
NESTEDGROUPOFNAMESTYPE | &quot;NestedGroupOfNamesType&quot;
NESTEDGROUPOFUNIQUENAMESTYPE | &quot;NestedGroupOfUniqueNamesType&quot;
NESTEDACTIVEDIRECTORYGROUPTYPE | &quot;NestedActiveDirectoryGroupType&quot;
NESTEDORGANIZATIONALROLEGROUPTYPE | &quot;NestedOrganizationalRoleGroupType&quot;
NESTEDMEMBERDNGROUPTYPE | &quot;NestedMemberDNGroupType&quot;
POSIXUIDGROUPTYPE | &quot;PosixUIDGroupType&quot;

<a name="AuTHLDAP2GROUPTYPEEnum"></a>
## Enum: AuTHLDAP2GROUPTYPEEnum
Name | Value
---- | -----
POSIXGROUPTYPE | &quot;PosixGroupType&quot;
GROUPOFNAMESTYPE | &quot;GroupOfNamesType&quot;
GROUPOFUNIQUENAMESTYPE | &quot;GroupOfUniqueNamesType&quot;
ACTIVEDIRECTORYGROUPTYPE | &quot;ActiveDirectoryGroupType&quot;
ORGANIZATIONALROLEGROUPTYPE | &quot;OrganizationalRoleGroupType&quot;
MEMBERDNGROUPTYPE | &quot;MemberDNGroupType&quot;
NESTEDGROUPOFNAMESTYPE | &quot;NestedGroupOfNamesType&quot;
NESTEDGROUPOFUNIQUENAMESTYPE | &quot;NestedGroupOfUniqueNamesType&quot;
NESTEDACTIVEDIRECTORYGROUPTYPE | &quot;NestedActiveDirectoryGroupType&quot;
NESTEDORGANIZATIONALROLEGROUPTYPE | &quot;NestedOrganizationalRoleGroupType&quot;
NESTEDMEMBERDNGROUPTYPE | &quot;NestedMemberDNGroupType&quot;
POSIXUIDGROUPTYPE | &quot;PosixUIDGroupType&quot;

<a name="AuTHLDAP3GROUPTYPEEnum"></a>
## Enum: AuTHLDAP3GROUPTYPEEnum
Name | Value
---- | -----
POSIXGROUPTYPE | &quot;PosixGroupType&quot;
GROUPOFNAMESTYPE | &quot;GroupOfNamesType&quot;
GROUPOFUNIQUENAMESTYPE | &quot;GroupOfUniqueNamesType&quot;
ACTIVEDIRECTORYGROUPTYPE | &quot;ActiveDirectoryGroupType&quot;
ORGANIZATIONALROLEGROUPTYPE | &quot;OrganizationalRoleGroupType&quot;
MEMBERDNGROUPTYPE | &quot;MemberDNGroupType&quot;
NESTEDGROUPOFNAMESTYPE | &quot;NestedGroupOfNamesType&quot;
NESTEDGROUPOFUNIQUENAMESTYPE | &quot;NestedGroupOfUniqueNamesType&quot;
NESTEDACTIVEDIRECTORYGROUPTYPE | &quot;NestedActiveDirectoryGroupType&quot;
NESTEDORGANIZATIONALROLEGROUPTYPE | &quot;NestedOrganizationalRoleGroupType&quot;
NESTEDMEMBERDNGROUPTYPE | &quot;NestedMemberDNGroupType&quot;
POSIXUIDGROUPTYPE | &quot;PosixUIDGroupType&quot;

<a name="AuTHLDAP4GROUPTYPEEnum"></a>
## Enum: AuTHLDAP4GROUPTYPEEnum
Name | Value
---- | -----
POSIXGROUPTYPE | &quot;PosixGroupType&quot;
GROUPOFNAMESTYPE | &quot;GroupOfNamesType&quot;
GROUPOFUNIQUENAMESTYPE | &quot;GroupOfUniqueNamesType&quot;
ACTIVEDIRECTORYGROUPTYPE | &quot;ActiveDirectoryGroupType&quot;
ORGANIZATIONALROLEGROUPTYPE | &quot;OrganizationalRoleGroupType&quot;
MEMBERDNGROUPTYPE | &quot;MemberDNGroupType&quot;
NESTEDGROUPOFNAMESTYPE | &quot;NestedGroupOfNamesType&quot;
NESTEDGROUPOFUNIQUENAMESTYPE | &quot;NestedGroupOfUniqueNamesType&quot;
NESTEDACTIVEDIRECTORYGROUPTYPE | &quot;NestedActiveDirectoryGroupType&quot;
NESTEDORGANIZATIONALROLEGROUPTYPE | &quot;NestedOrganizationalRoleGroupType&quot;
NESTEDMEMBERDNGROUPTYPE | &quot;NestedMemberDNGroupType&quot;
POSIXUIDGROUPTYPE | &quot;PosixUIDGroupType&quot;

<a name="AuTHLDAP5GROUPTYPEEnum"></a>
## Enum: AuTHLDAP5GROUPTYPEEnum
Name | Value
---- | -----
POSIXGROUPTYPE | &quot;PosixGroupType&quot;
GROUPOFNAMESTYPE | &quot;GroupOfNamesType&quot;
GROUPOFUNIQUENAMESTYPE | &quot;GroupOfUniqueNamesType&quot;
ACTIVEDIRECTORYGROUPTYPE | &quot;ActiveDirectoryGroupType&quot;
ORGANIZATIONALROLEGROUPTYPE | &quot;OrganizationalRoleGroupType&quot;
MEMBERDNGROUPTYPE | &quot;MemberDNGroupType&quot;
NESTEDGROUPOFNAMESTYPE | &quot;NestedGroupOfNamesType&quot;
NESTEDGROUPOFUNIQUENAMESTYPE | &quot;NestedGroupOfUniqueNamesType&quot;
NESTEDACTIVEDIRECTORYGROUPTYPE | &quot;NestedActiveDirectoryGroupType&quot;
NESTEDORGANIZATIONALROLEGROUPTYPE | &quot;NestedOrganizationalRoleGroupType&quot;
NESTEDMEMBERDNGROUPTYPE | &quot;NestedMemberDNGroupType&quot;
POSIXUIDGROUPTYPE | &quot;PosixUIDGroupType&quot;

<a name="TACACSPLUSAUTHPROTOCOLEnum"></a>
## Enum: TACACSPLUSAUTHPROTOCOLEnum
Name | Value
---- | -----
ASCII | &quot;ascii&quot;
PAP | &quot;pap&quot;
