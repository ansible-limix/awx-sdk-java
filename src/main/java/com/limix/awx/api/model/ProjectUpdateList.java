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
import com.limix.awx.api.model.LaunchedBy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ProjectUpdateList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class ProjectUpdateList {
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

  @SerializedName("unified_job_template")
  private String unifiedJobTemplate = null;

  /**
   * Gets or Sets launchType
   */
  @JsonAdapter(LaunchTypeEnum.Adapter.class)
  public enum LaunchTypeEnum {
    MANUAL("manual"),
    RELAUNCH("relaunch"),
    CALLBACK("callback"),
    SCHEDULED("scheduled"),
    DEPENDENCY("dependency"),
    WORKFLOW("workflow"),
    WEBHOOK("webhook"),
    SYNC("sync"),
    SCM("scm");

    private String value;

    LaunchTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LaunchTypeEnum fromValue(String input) {
      for (LaunchTypeEnum b : LaunchTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LaunchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LaunchTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LaunchTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LaunchTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("launch_type")
  private LaunchTypeEnum launchType = null;

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
    CANCELED("canceled");

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

  @SerializedName("failed")
  private Boolean failed = null;

  @SerializedName("started")
  private OffsetDateTime started = null;

  @SerializedName("finished")
  private OffsetDateTime finished = null;

  @SerializedName("canceled_on")
  private OffsetDateTime canceledOn = null;

  @SerializedName("elapsed")
  private String elapsed = null;

  @SerializedName("job_explanation")
  private String jobExplanation = null;

  @SerializedName("execution_node")
  private String executionNode = null;

  @SerializedName("launched_by")
  private LaunchedBy launchedBy = null;

  @SerializedName("work_unit_id")
  private String workUnitId = null;

  @SerializedName("local_path")
  private String localPath = null;

  /**
   * Specifies the source control system used to store the project.
   */
  @JsonAdapter(ScmTypeEnum.Adapter.class)
  public enum ScmTypeEnum {
    EMPTY(""),
    GIT("git"),
    SVN("svn"),
    INSIGHTS("insights"),
    ARCHIVE("archive");

    private String value;

    ScmTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScmTypeEnum fromValue(String input) {
      for (ScmTypeEnum b : ScmTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScmTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScmTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScmTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScmTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("scm_type")
  private ScmTypeEnum scmType = ScmTypeEnum.EMPTY;

  @SerializedName("scm_url")
  private String scmUrl = "";

  @SerializedName("scm_branch")
  private String scmBranch = "";

  @SerializedName("scm_refspec")
  private String scmRefspec = "";

  @SerializedName("scm_clean")
  private Boolean scmClean = false;

  @SerializedName("scm_track_submodules")
  private Boolean scmTrackSubmodules = false;

  @SerializedName("scm_delete_on_update")
  private Boolean scmDeleteOnUpdate = false;

  @SerializedName("credential")
  private Integer credential = null;

  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("scm_revision")
  private String scmRevision = null;

  @SerializedName("project")
  private String project = null;

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
  private JobTypeEnum jobType = JobTypeEnum.CHECK;

  @SerializedName("job_tags")
  private String jobTags = "";

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

  public ProjectUpdateList related(Object related) {
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

  public ProjectUpdateList summaryFields(Object summaryFields) {
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

  public ProjectUpdateList name(String name) {
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

  public ProjectUpdateList description(String description) {
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

   /**
   * Get unifiedJobTemplate
   * @return unifiedJobTemplate
  **/
  @Schema(description = "")
  public String getUnifiedJobTemplate() {
    return unifiedJobTemplate;
  }

   /**
   * Get launchType
   * @return launchType
  **/
  @Schema(description = "")
  public LaunchTypeEnum getLaunchType() {
    return launchType;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public ProjectUpdateList executionEnvironment(Integer executionEnvironment) {
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

   /**
   * Get failed
   * @return failed
  **/
  @Schema(description = "")
  public Boolean isFailed() {
    return failed;
  }

   /**
   * The date and time the job was queued for starting.
   * @return started
  **/
  @Schema(description = "The date and time the job was queued for starting.")
  public OffsetDateTime getStarted() {
    return started;
  }

   /**
   * The date and time the job finished execution.
   * @return finished
  **/
  @Schema(description = "The date and time the job finished execution.")
  public OffsetDateTime getFinished() {
    return finished;
  }

   /**
   * The date and time when the cancel request was sent.
   * @return canceledOn
  **/
  @Schema(description = "The date and time when the cancel request was sent.")
  public OffsetDateTime getCanceledOn() {
    return canceledOn;
  }

   /**
   * Elapsed time in seconds that the job ran.
   * @return elapsed
  **/
  @Schema(description = "Elapsed time in seconds that the job ran.")
  public String getElapsed() {
    return elapsed;
  }

   /**
   * A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout
   * @return jobExplanation
  **/
  @Schema(description = "A status field to indicate the state of the job if it wasn't able to run and capture stdout")
  public String getJobExplanation() {
    return jobExplanation;
  }

   /**
   * The node the job executed on.
   * @return executionNode
  **/
  @Schema(description = "The node the job executed on.")
  public String getExecutionNode() {
    return executionNode;
  }

  public ProjectUpdateList launchedBy(LaunchedBy launchedBy) {
    this.launchedBy = launchedBy;
    return this;
  }

   /**
   * Get launchedBy
   * @return launchedBy
  **/
  @Schema(description = "")
  public LaunchedBy getLaunchedBy() {
    return launchedBy;
  }

  public void setLaunchedBy(LaunchedBy launchedBy) {
    this.launchedBy = launchedBy;
  }

   /**
   * The Receptor work unit ID associated with this job.
   * @return workUnitId
  **/
  @Schema(description = "The Receptor work unit ID associated with this job.")
  public String getWorkUnitId() {
    return workUnitId;
  }

  public ProjectUpdateList localPath(String localPath) {
    this.localPath = localPath;
    return this;
  }

   /**
   * Local path (relative to PROJECTS_ROOT) containing playbooks and related files for this project.
   * @return localPath
  **/
  @Schema(description = "Local path (relative to PROJECTS_ROOT) containing playbooks and related files for this project.")
  public String getLocalPath() {
    return localPath;
  }

  public void setLocalPath(String localPath) {
    this.localPath = localPath;
  }

  public ProjectUpdateList scmType(ScmTypeEnum scmType) {
    this.scmType = scmType;
    return this;
  }

   /**
   * Specifies the source control system used to store the project.
   * @return scmType
  **/
  @Schema(description = "Specifies the source control system used to store the project.")
  public ScmTypeEnum getScmType() {
    return scmType;
  }

  public void setScmType(ScmTypeEnum scmType) {
    this.scmType = scmType;
  }

  public ProjectUpdateList scmUrl(String scmUrl) {
    this.scmUrl = scmUrl;
    return this;
  }

   /**
   * The location where the project is stored.
   * @return scmUrl
  **/
  @Schema(description = "The location where the project is stored.")
  public String getScmUrl() {
    return scmUrl;
  }

  public void setScmUrl(String scmUrl) {
    this.scmUrl = scmUrl;
  }

  public ProjectUpdateList scmBranch(String scmBranch) {
    this.scmBranch = scmBranch;
    return this;
  }

   /**
   * Specific branch, tag or commit to checkout.
   * @return scmBranch
  **/
  @Schema(description = "Specific branch, tag or commit to checkout.")
  public String getScmBranch() {
    return scmBranch;
  }

  public void setScmBranch(String scmBranch) {
    this.scmBranch = scmBranch;
  }

  public ProjectUpdateList scmRefspec(String scmRefspec) {
    this.scmRefspec = scmRefspec;
    return this;
  }

   /**
   * For git projects, an additional refspec to fetch.
   * @return scmRefspec
  **/
  @Schema(description = "For git projects, an additional refspec to fetch.")
  public String getScmRefspec() {
    return scmRefspec;
  }

  public void setScmRefspec(String scmRefspec) {
    this.scmRefspec = scmRefspec;
  }

  public ProjectUpdateList scmClean(Boolean scmClean) {
    this.scmClean = scmClean;
    return this;
  }

   /**
   * Discard any local changes before syncing the project.
   * @return scmClean
  **/
  @Schema(description = "Discard any local changes before syncing the project.")
  public Boolean isScmClean() {
    return scmClean;
  }

  public void setScmClean(Boolean scmClean) {
    this.scmClean = scmClean;
  }

  public ProjectUpdateList scmTrackSubmodules(Boolean scmTrackSubmodules) {
    this.scmTrackSubmodules = scmTrackSubmodules;
    return this;
  }

   /**
   * Track submodules latest commits on defined branch.
   * @return scmTrackSubmodules
  **/
  @Schema(description = "Track submodules latest commits on defined branch.")
  public Boolean isScmTrackSubmodules() {
    return scmTrackSubmodules;
  }

  public void setScmTrackSubmodules(Boolean scmTrackSubmodules) {
    this.scmTrackSubmodules = scmTrackSubmodules;
  }

  public ProjectUpdateList scmDeleteOnUpdate(Boolean scmDeleteOnUpdate) {
    this.scmDeleteOnUpdate = scmDeleteOnUpdate;
    return this;
  }

   /**
   * Delete the project before syncing.
   * @return scmDeleteOnUpdate
  **/
  @Schema(description = "Delete the project before syncing.")
  public Boolean isScmDeleteOnUpdate() {
    return scmDeleteOnUpdate;
  }

  public void setScmDeleteOnUpdate(Boolean scmDeleteOnUpdate) {
    this.scmDeleteOnUpdate = scmDeleteOnUpdate;
  }

  public ProjectUpdateList credential(Integer credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @Schema(description = "")
  public Integer getCredential() {
    return credential;
  }

  public void setCredential(Integer credential) {
    this.credential = credential;
  }

  public ProjectUpdateList timeout(Integer timeout) {
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

   /**
   * The SCM Revision discovered by this update for the given project and branch.
   * @return scmRevision
  **/
  @Schema(description = "The SCM Revision discovered by this update for the given project and branch.")
  public String getScmRevision() {
    return scmRevision;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public ProjectUpdateList jobType(JobTypeEnum jobType) {
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

  public ProjectUpdateList jobTags(String jobTags) {
    this.jobTags = jobTags;
    return this;
  }

   /**
   * Parts of the project update playbook that will be run.
   * @return jobTags
  **/
  @Schema(description = "Parts of the project update playbook that will be run.")
  public String getJobTags() {
    return jobTags;
  }

  public void setJobTags(String jobTags) {
    this.jobTags = jobTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateList projectUpdateList = (ProjectUpdateList) o;
    return Objects.equals(this.id, projectUpdateList.id) &&
        Objects.equals(this.type, projectUpdateList.type) &&
        Objects.equals(this.url, projectUpdateList.url) &&
        Objects.equals(this.related, projectUpdateList.related) &&
        Objects.equals(this.summaryFields, projectUpdateList.summaryFields) &&
        Objects.equals(this.created, projectUpdateList.created) &&
        Objects.equals(this.modified, projectUpdateList.modified) &&
        Objects.equals(this.name, projectUpdateList.name) &&
        Objects.equals(this.description, projectUpdateList.description) &&
        Objects.equals(this.unifiedJobTemplate, projectUpdateList.unifiedJobTemplate) &&
        Objects.equals(this.launchType, projectUpdateList.launchType) &&
        Objects.equals(this.status, projectUpdateList.status) &&
        Objects.equals(this.executionEnvironment, projectUpdateList.executionEnvironment) &&
        Objects.equals(this.failed, projectUpdateList.failed) &&
        Objects.equals(this.started, projectUpdateList.started) &&
        Objects.equals(this.finished, projectUpdateList.finished) &&
        Objects.equals(this.canceledOn, projectUpdateList.canceledOn) &&
        Objects.equals(this.elapsed, projectUpdateList.elapsed) &&
        Objects.equals(this.jobExplanation, projectUpdateList.jobExplanation) &&
        Objects.equals(this.executionNode, projectUpdateList.executionNode) &&
        Objects.equals(this.launchedBy, projectUpdateList.launchedBy) &&
        Objects.equals(this.workUnitId, projectUpdateList.workUnitId) &&
        Objects.equals(this.localPath, projectUpdateList.localPath) &&
        Objects.equals(this.scmType, projectUpdateList.scmType) &&
        Objects.equals(this.scmUrl, projectUpdateList.scmUrl) &&
        Objects.equals(this.scmBranch, projectUpdateList.scmBranch) &&
        Objects.equals(this.scmRefspec, projectUpdateList.scmRefspec) &&
        Objects.equals(this.scmClean, projectUpdateList.scmClean) &&
        Objects.equals(this.scmTrackSubmodules, projectUpdateList.scmTrackSubmodules) &&
        Objects.equals(this.scmDeleteOnUpdate, projectUpdateList.scmDeleteOnUpdate) &&
        Objects.equals(this.credential, projectUpdateList.credential) &&
        Objects.equals(this.timeout, projectUpdateList.timeout) &&
        Objects.equals(this.scmRevision, projectUpdateList.scmRevision) &&
        Objects.equals(this.project, projectUpdateList.project) &&
        Objects.equals(this.jobType, projectUpdateList.jobType) &&
        Objects.equals(this.jobTags, projectUpdateList.jobTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, unifiedJobTemplate, launchType, status, executionEnvironment, failed, started, finished, canceledOn, elapsed, jobExplanation, executionNode, launchedBy, workUnitId, localPath, scmType, scmUrl, scmBranch, scmRefspec, scmClean, scmTrackSubmodules, scmDeleteOnUpdate, credential, timeout, scmRevision, project, jobType, jobTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unifiedJobTemplate: ").append(toIndentedString(unifiedJobTemplate)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    canceledOn: ").append(toIndentedString(canceledOn)).append("\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    jobExplanation: ").append(toIndentedString(jobExplanation)).append("\n");
    sb.append("    executionNode: ").append(toIndentedString(executionNode)).append("\n");
    sb.append("    launchedBy: ").append(toIndentedString(launchedBy)).append("\n");
    sb.append("    workUnitId: ").append(toIndentedString(workUnitId)).append("\n");
    sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
    sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
    sb.append("    scmUrl: ").append(toIndentedString(scmUrl)).append("\n");
    sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
    sb.append("    scmRefspec: ").append(toIndentedString(scmRefspec)).append("\n");
    sb.append("    scmClean: ").append(toIndentedString(scmClean)).append("\n");
    sb.append("    scmTrackSubmodules: ").append(toIndentedString(scmTrackSubmodules)).append("\n");
    sb.append("    scmDeleteOnUpdate: ").append(toIndentedString(scmDeleteOnUpdate)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    scmRevision: ").append(toIndentedString(scmRevision)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
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