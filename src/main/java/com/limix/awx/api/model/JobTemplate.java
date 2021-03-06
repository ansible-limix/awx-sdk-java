/*
 * Snippets API
 * Test description
 *
 * OpenAPI spec version: v1
 * Contact: contact@snippets.local
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.limix.awx.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * JobTemplate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class JobTemplate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("related")
  private Object related = null;

  @SerializedName("summary_fields")
  private Object summaryFields = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("modified")
  private String modified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = "";

  /**
   * Gets or Sets jobType
   */
  @JsonAdapter(JobTypeEnum.Adapter.class)
  public enum JobTypeEnum {
    RUN("run"),
    CHECK("check");

    private String value;

    JobTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static JobTypeEnum fromValue(String input) {
      for (JobTypeEnum b : JobTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<JobTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JobTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public JobTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return JobTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("job_type")
  private JobTypeEnum jobType = JobTypeEnum.RUN;

  @SerializedName("inventory")
  private Integer inventory = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("playbook")
  private String playbook = "";

  @SerializedName("scm_branch")
  private String scmBranch = "";

  @SerializedName("forks")
  private Integer forks = null;

  @SerializedName("limit")
  private String limit = "";

  @SerializedName("verbosity")
  private Integer verbosity = null;

  @SerializedName("extra_vars")
  private String extraVars = "";

  @SerializedName("job_tags")
  private String jobTags = "";

  @SerializedName("force_handlers")
  private Boolean forceHandlers = false;

  @SerializedName("skip_tags")
  private String skipTags = "";

  @SerializedName("start_at_task")
  private String startAtTask = "";

  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("use_fact_cache")
  private Boolean useFactCache = false;

  @SerializedName("organization")
  private Integer organization = null;

  @SerializedName("last_job_run")
  private OffsetDateTime lastJobRun = null;

  @SerializedName("last_job_failed")
  private Boolean lastJobFailed = null;

  @SerializedName("next_job_run")
  private OffsetDateTime nextJobRun = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),
    PENDING("pending"),
    WAITING("waiting"),
    RUNNING("running"),
    SUCCESSFUL("successful"),
    FAILED("failed"),
    ERROR("error"),
    CANCELED("canceled"),
    NEVER_UPDATED("never updated");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("execution_environment")
  private Integer executionEnvironment = null;

  @SerializedName("host_config_key")
  private String hostConfigKey = "";

  @SerializedName("ask_scm_branch_on_launch")
  private Boolean askScmBranchOnLaunch = false;

  @SerializedName("ask_diff_mode_on_launch")
  private Boolean askDiffModeOnLaunch = false;

  @SerializedName("ask_variables_on_launch")
  private Boolean askVariablesOnLaunch = false;

  @SerializedName("ask_limit_on_launch")
  private Boolean askLimitOnLaunch = false;

  @SerializedName("ask_tags_on_launch")
  private Boolean askTagsOnLaunch = false;

  @SerializedName("ask_skip_tags_on_launch")
  private Boolean askSkipTagsOnLaunch = false;

  @SerializedName("ask_job_type_on_launch")
  private Boolean askJobTypeOnLaunch = false;

  @SerializedName("ask_verbosity_on_launch")
  private Boolean askVerbosityOnLaunch = false;

  @SerializedName("ask_inventory_on_launch")
  private Boolean askInventoryOnLaunch = false;

  @SerializedName("ask_credential_on_launch")
  private Boolean askCredentialOnLaunch = false;

  @SerializedName("survey_enabled")
  private Boolean surveyEnabled = false;

  @SerializedName("become_enabled")
  private Boolean becomeEnabled = false;

  @SerializedName("diff_mode")
  private Boolean diffMode = false;

  @SerializedName("allow_simultaneous")
  private Boolean allowSimultaneous = false;

  @SerializedName("custom_virtualenv")
  private String customVirtualenv = null;

  @SerializedName("job_slice_count")
  private Integer jobSliceCount = null;

  /**
   * Service that webhook requests will be accepted from
   */
  @JsonAdapter(WebhookServiceEnum.Adapter.class)
  public enum WebhookServiceEnum {
    GITHUB("github"),
    GITLAB("gitlab");

    private String value;

    WebhookServiceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WebhookServiceEnum fromValue(String input) {
      for (WebhookServiceEnum b : WebhookServiceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WebhookServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookServiceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public WebhookServiceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return WebhookServiceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("webhook_service")
  private WebhookServiceEnum webhookService = null;

  @SerializedName("webhook_credential")
  private Integer webhookCredential = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public JobTemplate related(Object related) {
    this.related = related;
    return this;
  }

   /**
   * Get related
   * @return related
  **/
  @Schema(description = "")
  public Object getRelated() {
    return related;
  }

  public void setRelated(Object related) {
    this.related = related;
  }

  public JobTemplate summaryFields(Object summaryFields) {
    this.summaryFields = summaryFields;
    return this;
  }

   /**
   * Get summaryFields
   * @return summaryFields
  **/
  @Schema(description = "")
  public Object getSummaryFields() {
    return summaryFields;
  }

  public void setSummaryFields(Object summaryFields) {
    this.summaryFields = summaryFields;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(description = "")
  public String getModified() {
    return modified;
  }

  public JobTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobTemplate jobType(JobTypeEnum jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @Schema(description = "")
  public JobTypeEnum getJobType() {
    return jobType;
  }

  public void setJobType(JobTypeEnum jobType) {
    this.jobType = jobType;
  }

  public JobTemplate inventory(Integer inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @Schema(description = "")
  public Integer getInventory() {
    return inventory;
  }

  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }

  public JobTemplate project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public JobTemplate playbook(String playbook) {
    this.playbook = playbook;
    return this;
  }

   /**
   * Get playbook
   * @return playbook
  **/
  @Schema(description = "")
  public String getPlaybook() {
    return playbook;
  }

  public void setPlaybook(String playbook) {
    this.playbook = playbook;
  }

  public JobTemplate scmBranch(String scmBranch) {
    this.scmBranch = scmBranch;
    return this;
  }

   /**
   * Branch to use in job run. Project default used if blank. Only allowed if project allow_override field is set to true.
   * @return scmBranch
  **/
  @Schema(description = "Branch to use in job run. Project default used if blank. Only allowed if project allow_override field is set to true.")
  public String getScmBranch() {
    return scmBranch;
  }

  public void setScmBranch(String scmBranch) {
    this.scmBranch = scmBranch;
  }

  public JobTemplate forks(Integer forks) {
    this.forks = forks;
    return this;
  }

   /**
   * Get forks
   * minimum: 0
   * maximum: 2147483647
   * @return forks
  **/
  @Schema(description = "")
  public Integer getForks() {
    return forks;
  }

  public void setForks(Integer forks) {
    this.forks = forks;
  }

  public JobTemplate limit(String limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }

  public JobTemplate verbosity(Integer verbosity) {
    this.verbosity = verbosity;
    return this;
  }

   /**
   * Get verbosity
   * @return verbosity
  **/
  @Schema(description = "")
  public Integer getVerbosity() {
    return verbosity;
  }

  public void setVerbosity(Integer verbosity) {
    this.verbosity = verbosity;
  }

  public JobTemplate extraVars(String extraVars) {
    this.extraVars = extraVars;
    return this;
  }

   /**
   * Get extraVars
   * @return extraVars
  **/
  @Schema(description = "")
  public String getExtraVars() {
    return extraVars;
  }

  public void setExtraVars(String extraVars) {
    this.extraVars = extraVars;
  }

  public JobTemplate jobTags(String jobTags) {
    this.jobTags = jobTags;
    return this;
  }

   /**
   * Get jobTags
   * @return jobTags
  **/
  @Schema(description = "")
  public String getJobTags() {
    return jobTags;
  }

  public void setJobTags(String jobTags) {
    this.jobTags = jobTags;
  }

  public JobTemplate forceHandlers(Boolean forceHandlers) {
    this.forceHandlers = forceHandlers;
    return this;
  }

   /**
   * Get forceHandlers
   * @return forceHandlers
  **/
  @Schema(description = "")
  public Boolean isForceHandlers() {
    return forceHandlers;
  }

  public void setForceHandlers(Boolean forceHandlers) {
    this.forceHandlers = forceHandlers;
  }

  public JobTemplate skipTags(String skipTags) {
    this.skipTags = skipTags;
    return this;
  }

   /**
   * Get skipTags
   * @return skipTags
  **/
  @Schema(description = "")
  public String getSkipTags() {
    return skipTags;
  }

  public void setSkipTags(String skipTags) {
    this.skipTags = skipTags;
  }

  public JobTemplate startAtTask(String startAtTask) {
    this.startAtTask = startAtTask;
    return this;
  }

   /**
   * Get startAtTask
   * @return startAtTask
  **/
  @Schema(description = "")
  public String getStartAtTask() {
    return startAtTask;
  }

  public void setStartAtTask(String startAtTask) {
    this.startAtTask = startAtTask;
  }

  public JobTemplate timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * The amount of time (in seconds) to run before the task is canceled.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return timeout
  **/
  @Schema(description = "The amount of time (in seconds) to run before the task is canceled.")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public JobTemplate useFactCache(Boolean useFactCache) {
    this.useFactCache = useFactCache;
    return this;
  }

   /**
   * If enabled, the service will act as an Ansible Fact Cache Plugin; persisting facts at the end of a playbook run to the database and caching facts for use by Ansible.
   * @return useFactCache
  **/
  @Schema(description = "If enabled, the service will act as an Ansible Fact Cache Plugin; persisting facts at the end of a playbook run to the database and caching facts for use by Ansible.")
  public Boolean isUseFactCache() {
    return useFactCache;
  }

  public void setUseFactCache(Boolean useFactCache) {
    this.useFactCache = useFactCache;
  }

   /**
   * The organization used to determine access to this template.
   * @return organization
  **/
  @Schema(description = "The organization used to determine access to this template.")
  public Integer getOrganization() {
    return organization;
  }

   /**
   * Get lastJobRun
   * @return lastJobRun
  **/
  @Schema(description = "")
  public OffsetDateTime getLastJobRun() {
    return lastJobRun;
  }

   /**
   * Get lastJobFailed
   * @return lastJobFailed
  **/
  @Schema(description = "")
  public Boolean isLastJobFailed() {
    return lastJobFailed;
  }

   /**
   * Get nextJobRun
   * @return nextJobRun
  **/
  @Schema(description = "")
  public OffsetDateTime getNextJobRun() {
    return nextJobRun;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public JobTemplate executionEnvironment(Integer executionEnvironment) {
    this.executionEnvironment = executionEnvironment;
    return this;
  }

   /**
   * The container image to be used for execution.
   * @return executionEnvironment
  **/
  @Schema(description = "The container image to be used for execution.")
  public Integer getExecutionEnvironment() {
    return executionEnvironment;
  }

  public void setExecutionEnvironment(Integer executionEnvironment) {
    this.executionEnvironment = executionEnvironment;
  }

  public JobTemplate hostConfigKey(String hostConfigKey) {
    this.hostConfigKey = hostConfigKey;
    return this;
  }

   /**
   * Get hostConfigKey
   * @return hostConfigKey
  **/
  @Schema(description = "")
  public String getHostConfigKey() {
    return hostConfigKey;
  }

  public void setHostConfigKey(String hostConfigKey) {
    this.hostConfigKey = hostConfigKey;
  }

  public JobTemplate askScmBranchOnLaunch(Boolean askScmBranchOnLaunch) {
    this.askScmBranchOnLaunch = askScmBranchOnLaunch;
    return this;
  }

   /**
   * Get askScmBranchOnLaunch
   * @return askScmBranchOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskScmBranchOnLaunch() {
    return askScmBranchOnLaunch;
  }

  public void setAskScmBranchOnLaunch(Boolean askScmBranchOnLaunch) {
    this.askScmBranchOnLaunch = askScmBranchOnLaunch;
  }

  public JobTemplate askDiffModeOnLaunch(Boolean askDiffModeOnLaunch) {
    this.askDiffModeOnLaunch = askDiffModeOnLaunch;
    return this;
  }

   /**
   * Get askDiffModeOnLaunch
   * @return askDiffModeOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskDiffModeOnLaunch() {
    return askDiffModeOnLaunch;
  }

  public void setAskDiffModeOnLaunch(Boolean askDiffModeOnLaunch) {
    this.askDiffModeOnLaunch = askDiffModeOnLaunch;
  }

  public JobTemplate askVariablesOnLaunch(Boolean askVariablesOnLaunch) {
    this.askVariablesOnLaunch = askVariablesOnLaunch;
    return this;
  }

   /**
   * Get askVariablesOnLaunch
   * @return askVariablesOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskVariablesOnLaunch() {
    return askVariablesOnLaunch;
  }

  public void setAskVariablesOnLaunch(Boolean askVariablesOnLaunch) {
    this.askVariablesOnLaunch = askVariablesOnLaunch;
  }

  public JobTemplate askLimitOnLaunch(Boolean askLimitOnLaunch) {
    this.askLimitOnLaunch = askLimitOnLaunch;
    return this;
  }

   /**
   * Get askLimitOnLaunch
   * @return askLimitOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskLimitOnLaunch() {
    return askLimitOnLaunch;
  }

  public void setAskLimitOnLaunch(Boolean askLimitOnLaunch) {
    this.askLimitOnLaunch = askLimitOnLaunch;
  }

  public JobTemplate askTagsOnLaunch(Boolean askTagsOnLaunch) {
    this.askTagsOnLaunch = askTagsOnLaunch;
    return this;
  }

   /**
   * Get askTagsOnLaunch
   * @return askTagsOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskTagsOnLaunch() {
    return askTagsOnLaunch;
  }

  public void setAskTagsOnLaunch(Boolean askTagsOnLaunch) {
    this.askTagsOnLaunch = askTagsOnLaunch;
  }

  public JobTemplate askSkipTagsOnLaunch(Boolean askSkipTagsOnLaunch) {
    this.askSkipTagsOnLaunch = askSkipTagsOnLaunch;
    return this;
  }

   /**
   * Get askSkipTagsOnLaunch
   * @return askSkipTagsOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskSkipTagsOnLaunch() {
    return askSkipTagsOnLaunch;
  }

  public void setAskSkipTagsOnLaunch(Boolean askSkipTagsOnLaunch) {
    this.askSkipTagsOnLaunch = askSkipTagsOnLaunch;
  }

  public JobTemplate askJobTypeOnLaunch(Boolean askJobTypeOnLaunch) {
    this.askJobTypeOnLaunch = askJobTypeOnLaunch;
    return this;
  }

   /**
   * Get askJobTypeOnLaunch
   * @return askJobTypeOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskJobTypeOnLaunch() {
    return askJobTypeOnLaunch;
  }

  public void setAskJobTypeOnLaunch(Boolean askJobTypeOnLaunch) {
    this.askJobTypeOnLaunch = askJobTypeOnLaunch;
  }

  public JobTemplate askVerbosityOnLaunch(Boolean askVerbosityOnLaunch) {
    this.askVerbosityOnLaunch = askVerbosityOnLaunch;
    return this;
  }

   /**
   * Get askVerbosityOnLaunch
   * @return askVerbosityOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskVerbosityOnLaunch() {
    return askVerbosityOnLaunch;
  }

  public void setAskVerbosityOnLaunch(Boolean askVerbosityOnLaunch) {
    this.askVerbosityOnLaunch = askVerbosityOnLaunch;
  }

  public JobTemplate askInventoryOnLaunch(Boolean askInventoryOnLaunch) {
    this.askInventoryOnLaunch = askInventoryOnLaunch;
    return this;
  }

   /**
   * Get askInventoryOnLaunch
   * @return askInventoryOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskInventoryOnLaunch() {
    return askInventoryOnLaunch;
  }

  public void setAskInventoryOnLaunch(Boolean askInventoryOnLaunch) {
    this.askInventoryOnLaunch = askInventoryOnLaunch;
  }

  public JobTemplate askCredentialOnLaunch(Boolean askCredentialOnLaunch) {
    this.askCredentialOnLaunch = askCredentialOnLaunch;
    return this;
  }

   /**
   * Get askCredentialOnLaunch
   * @return askCredentialOnLaunch
  **/
  @Schema(description = "")
  public Boolean isAskCredentialOnLaunch() {
    return askCredentialOnLaunch;
  }

  public void setAskCredentialOnLaunch(Boolean askCredentialOnLaunch) {
    this.askCredentialOnLaunch = askCredentialOnLaunch;
  }

  public JobTemplate surveyEnabled(Boolean surveyEnabled) {
    this.surveyEnabled = surveyEnabled;
    return this;
  }

   /**
   * Get surveyEnabled
   * @return surveyEnabled
  **/
  @Schema(description = "")
  public Boolean isSurveyEnabled() {
    return surveyEnabled;
  }

  public void setSurveyEnabled(Boolean surveyEnabled) {
    this.surveyEnabled = surveyEnabled;
  }

  public JobTemplate becomeEnabled(Boolean becomeEnabled) {
    this.becomeEnabled = becomeEnabled;
    return this;
  }

   /**
   * Get becomeEnabled
   * @return becomeEnabled
  **/
  @Schema(description = "")
  public Boolean isBecomeEnabled() {
    return becomeEnabled;
  }

  public void setBecomeEnabled(Boolean becomeEnabled) {
    this.becomeEnabled = becomeEnabled;
  }

  public JobTemplate diffMode(Boolean diffMode) {
    this.diffMode = diffMode;
    return this;
  }

   /**
   * If enabled, textual changes made to any templated files on the host are shown in the standard output
   * @return diffMode
  **/
  @Schema(description = "If enabled, textual changes made to any templated files on the host are shown in the standard output")
  public Boolean isDiffMode() {
    return diffMode;
  }

  public void setDiffMode(Boolean diffMode) {
    this.diffMode = diffMode;
  }

  public JobTemplate allowSimultaneous(Boolean allowSimultaneous) {
    this.allowSimultaneous = allowSimultaneous;
    return this;
  }

   /**
   * Get allowSimultaneous
   * @return allowSimultaneous
  **/
  @Schema(description = "")
  public Boolean isAllowSimultaneous() {
    return allowSimultaneous;
  }

  public void setAllowSimultaneous(Boolean allowSimultaneous) {
    this.allowSimultaneous = allowSimultaneous;
  }

   /**
   * Local absolute file path containing a custom Python virtualenv to use
   * @return customVirtualenv
  **/
  @Schema(description = "Local absolute file path containing a custom Python virtualenv to use")
  public String getCustomVirtualenv() {
    return customVirtualenv;
  }

  public JobTemplate jobSliceCount(Integer jobSliceCount) {
    this.jobSliceCount = jobSliceCount;
    return this;
  }

   /**
   * The number of jobs to slice into at runtime. Will cause the Job Template to launch a workflow if value is greater than 1.
   * minimum: 0
   * maximum: 2147483647
   * @return jobSliceCount
  **/
  @Schema(description = "The number of jobs to slice into at runtime. Will cause the Job Template to launch a workflow if value is greater than 1.")
  public Integer getJobSliceCount() {
    return jobSliceCount;
  }

  public void setJobSliceCount(Integer jobSliceCount) {
    this.jobSliceCount = jobSliceCount;
  }

  public JobTemplate webhookService(WebhookServiceEnum webhookService) {
    this.webhookService = webhookService;
    return this;
  }

   /**
   * Service that webhook requests will be accepted from
   * @return webhookService
  **/
  @Schema(description = "Service that webhook requests will be accepted from")
  public WebhookServiceEnum getWebhookService() {
    return webhookService;
  }

  public void setWebhookService(WebhookServiceEnum webhookService) {
    this.webhookService = webhookService;
  }

  public JobTemplate webhookCredential(Integer webhookCredential) {
    this.webhookCredential = webhookCredential;
    return this;
  }

   /**
   * Personal Access Token for posting back the status to the service API
   * @return webhookCredential
  **/
  @Schema(description = "Personal Access Token for posting back the status to the service API")
  public Integer getWebhookCredential() {
    return webhookCredential;
  }

  public void setWebhookCredential(Integer webhookCredential) {
    this.webhookCredential = webhookCredential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTemplate jobTemplate = (JobTemplate) o;
    return Objects.equals(this.id, jobTemplate.id) &&
        Objects.equals(this.type, jobTemplate.type) &&
        Objects.equals(this.url, jobTemplate.url) &&
        Objects.equals(this.related, jobTemplate.related) &&
        Objects.equals(this.summaryFields, jobTemplate.summaryFields) &&
        Objects.equals(this.created, jobTemplate.created) &&
        Objects.equals(this.modified, jobTemplate.modified) &&
        Objects.equals(this.name, jobTemplate.name) &&
        Objects.equals(this.description, jobTemplate.description) &&
        Objects.equals(this.jobType, jobTemplate.jobType) &&
        Objects.equals(this.inventory, jobTemplate.inventory) &&
        Objects.equals(this.project, jobTemplate.project) &&
        Objects.equals(this.playbook, jobTemplate.playbook) &&
        Objects.equals(this.scmBranch, jobTemplate.scmBranch) &&
        Objects.equals(this.forks, jobTemplate.forks) &&
        Objects.equals(this.limit, jobTemplate.limit) &&
        Objects.equals(this.verbosity, jobTemplate.verbosity) &&
        Objects.equals(this.extraVars, jobTemplate.extraVars) &&
        Objects.equals(this.jobTags, jobTemplate.jobTags) &&
        Objects.equals(this.forceHandlers, jobTemplate.forceHandlers) &&
        Objects.equals(this.skipTags, jobTemplate.skipTags) &&
        Objects.equals(this.startAtTask, jobTemplate.startAtTask) &&
        Objects.equals(this.timeout, jobTemplate.timeout) &&
        Objects.equals(this.useFactCache, jobTemplate.useFactCache) &&
        Objects.equals(this.organization, jobTemplate.organization) &&
        Objects.equals(this.lastJobRun, jobTemplate.lastJobRun) &&
        Objects.equals(this.lastJobFailed, jobTemplate.lastJobFailed) &&
        Objects.equals(this.nextJobRun, jobTemplate.nextJobRun) &&
        Objects.equals(this.status, jobTemplate.status) &&
        Objects.equals(this.executionEnvironment, jobTemplate.executionEnvironment) &&
        Objects.equals(this.hostConfigKey, jobTemplate.hostConfigKey) &&
        Objects.equals(this.askScmBranchOnLaunch, jobTemplate.askScmBranchOnLaunch) &&
        Objects.equals(this.askDiffModeOnLaunch, jobTemplate.askDiffModeOnLaunch) &&
        Objects.equals(this.askVariablesOnLaunch, jobTemplate.askVariablesOnLaunch) &&
        Objects.equals(this.askLimitOnLaunch, jobTemplate.askLimitOnLaunch) &&
        Objects.equals(this.askTagsOnLaunch, jobTemplate.askTagsOnLaunch) &&
        Objects.equals(this.askSkipTagsOnLaunch, jobTemplate.askSkipTagsOnLaunch) &&
        Objects.equals(this.askJobTypeOnLaunch, jobTemplate.askJobTypeOnLaunch) &&
        Objects.equals(this.askVerbosityOnLaunch, jobTemplate.askVerbosityOnLaunch) &&
        Objects.equals(this.askInventoryOnLaunch, jobTemplate.askInventoryOnLaunch) &&
        Objects.equals(this.askCredentialOnLaunch, jobTemplate.askCredentialOnLaunch) &&
        Objects.equals(this.surveyEnabled, jobTemplate.surveyEnabled) &&
        Objects.equals(this.becomeEnabled, jobTemplate.becomeEnabled) &&
        Objects.equals(this.diffMode, jobTemplate.diffMode) &&
        Objects.equals(this.allowSimultaneous, jobTemplate.allowSimultaneous) &&
        Objects.equals(this.customVirtualenv, jobTemplate.customVirtualenv) &&
        Objects.equals(this.jobSliceCount, jobTemplate.jobSliceCount) &&
        Objects.equals(this.webhookService, jobTemplate.webhookService) &&
        Objects.equals(this.webhookCredential, jobTemplate.webhookCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, jobType, inventory, project, playbook, scmBranch, forks, limit, verbosity, extraVars, jobTags, forceHandlers, skipTags, startAtTask, timeout, useFactCache, organization, lastJobRun, lastJobFailed, nextJobRun, status, executionEnvironment, hostConfigKey, askScmBranchOnLaunch, askDiffModeOnLaunch, askVariablesOnLaunch, askLimitOnLaunch, askTagsOnLaunch, askSkipTagsOnLaunch, askJobTypeOnLaunch, askVerbosityOnLaunch, askInventoryOnLaunch, askCredentialOnLaunch, surveyEnabled, becomeEnabled, diffMode, allowSimultaneous, customVirtualenv, jobSliceCount, webhookService, webhookCredential);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    playbook: ").append(toIndentedString(playbook)).append("\n");
    sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
    sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
    sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
    sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
    sb.append("    forceHandlers: ").append(toIndentedString(forceHandlers)).append("\n");
    sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
    sb.append("    startAtTask: ").append(toIndentedString(startAtTask)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    useFactCache: ").append(toIndentedString(useFactCache)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    lastJobRun: ").append(toIndentedString(lastJobRun)).append("\n");
    sb.append("    lastJobFailed: ").append(toIndentedString(lastJobFailed)).append("\n");
    sb.append("    nextJobRun: ").append(toIndentedString(nextJobRun)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
    sb.append("    hostConfigKey: ").append(toIndentedString(hostConfigKey)).append("\n");
    sb.append("    askScmBranchOnLaunch: ").append(toIndentedString(askScmBranchOnLaunch)).append("\n");
    sb.append("    askDiffModeOnLaunch: ").append(toIndentedString(askDiffModeOnLaunch)).append("\n");
    sb.append("    askVariablesOnLaunch: ").append(toIndentedString(askVariablesOnLaunch)).append("\n");
    sb.append("    askLimitOnLaunch: ").append(toIndentedString(askLimitOnLaunch)).append("\n");
    sb.append("    askTagsOnLaunch: ").append(toIndentedString(askTagsOnLaunch)).append("\n");
    sb.append("    askSkipTagsOnLaunch: ").append(toIndentedString(askSkipTagsOnLaunch)).append("\n");
    sb.append("    askJobTypeOnLaunch: ").append(toIndentedString(askJobTypeOnLaunch)).append("\n");
    sb.append("    askVerbosityOnLaunch: ").append(toIndentedString(askVerbosityOnLaunch)).append("\n");
    sb.append("    askInventoryOnLaunch: ").append(toIndentedString(askInventoryOnLaunch)).append("\n");
    sb.append("    askCredentialOnLaunch: ").append(toIndentedString(askCredentialOnLaunch)).append("\n");
    sb.append("    surveyEnabled: ").append(toIndentedString(surveyEnabled)).append("\n");
    sb.append("    becomeEnabled: ").append(toIndentedString(becomeEnabled)).append("\n");
    sb.append("    diffMode: ").append(toIndentedString(diffMode)).append("\n");
    sb.append("    allowSimultaneous: ").append(toIndentedString(allowSimultaneous)).append("\n");
    sb.append("    customVirtualenv: ").append(toIndentedString(customVirtualenv)).append("\n");
    sb.append("    jobSliceCount: ").append(toIndentedString(jobSliceCount)).append("\n");
    sb.append("    webhookService: ").append(toIndentedString(webhookService)).append("\n");
    sb.append("    webhookCredential: ").append(toIndentedString(webhookCredential)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
