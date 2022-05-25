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
 * WorkflowApprovalList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class WorkflowApprovalList {
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

  @SerializedName("launched_by")
  private LaunchedBy launchedBy = null;

  @SerializedName("work_unit_id")
  private String workUnitId = null;

  @SerializedName("can_approve_or_deny")
  private String canApproveOrDeny = null;

  @SerializedName("approval_expiration")
  private String approvalExpiration = null;

  @SerializedName("timed_out")
  private String timedOut = null;

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

  public WorkflowApprovalList related(Object related) {
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

  public WorkflowApprovalList summaryFields(Object summaryFields) {
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

  public WorkflowApprovalList name(String name) {
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

  public WorkflowApprovalList description(String description) {
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

  public WorkflowApprovalList executionEnvironment(Integer executionEnvironment) {
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

  public WorkflowApprovalList launchedBy(LaunchedBy launchedBy) {
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

   /**
   * Get canApproveOrDeny
   * @return canApproveOrDeny
  **/
  @Schema(description = "")
  public String getCanApproveOrDeny() {
    return canApproveOrDeny;
  }

   /**
   * Get approvalExpiration
   * @return approvalExpiration
  **/
  @Schema(description = "")
  public String getApprovalExpiration() {
    return approvalExpiration;
  }

   /**
   * Get timedOut
   * @return timedOut
  **/
  @Schema(description = "")
  public String getTimedOut() {
    return timedOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowApprovalList workflowApprovalList = (WorkflowApprovalList) o;
    return Objects.equals(this.id, workflowApprovalList.id) &&
        Objects.equals(this.type, workflowApprovalList.type) &&
        Objects.equals(this.url, workflowApprovalList.url) &&
        Objects.equals(this.related, workflowApprovalList.related) &&
        Objects.equals(this.summaryFields, workflowApprovalList.summaryFields) &&
        Objects.equals(this.created, workflowApprovalList.created) &&
        Objects.equals(this.modified, workflowApprovalList.modified) &&
        Objects.equals(this.name, workflowApprovalList.name) &&
        Objects.equals(this.description, workflowApprovalList.description) &&
        Objects.equals(this.unifiedJobTemplate, workflowApprovalList.unifiedJobTemplate) &&
        Objects.equals(this.launchType, workflowApprovalList.launchType) &&
        Objects.equals(this.status, workflowApprovalList.status) &&
        Objects.equals(this.executionEnvironment, workflowApprovalList.executionEnvironment) &&
        Objects.equals(this.failed, workflowApprovalList.failed) &&
        Objects.equals(this.started, workflowApprovalList.started) &&
        Objects.equals(this.finished, workflowApprovalList.finished) &&
        Objects.equals(this.canceledOn, workflowApprovalList.canceledOn) &&
        Objects.equals(this.elapsed, workflowApprovalList.elapsed) &&
        Objects.equals(this.jobExplanation, workflowApprovalList.jobExplanation) &&
        Objects.equals(this.launchedBy, workflowApprovalList.launchedBy) &&
        Objects.equals(this.workUnitId, workflowApprovalList.workUnitId) &&
        Objects.equals(this.canApproveOrDeny, workflowApprovalList.canApproveOrDeny) &&
        Objects.equals(this.approvalExpiration, workflowApprovalList.approvalExpiration) &&
        Objects.equals(this.timedOut, workflowApprovalList.timedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, unifiedJobTemplate, launchType, status, executionEnvironment, failed, started, finished, canceledOn, elapsed, jobExplanation, launchedBy, workUnitId, canApproveOrDeny, approvalExpiration, timedOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowApprovalList {\n");
    
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
    sb.append("    launchedBy: ").append(toIndentedString(launchedBy)).append("\n");
    sb.append("    workUnitId: ").append(toIndentedString(workUnitId)).append("\n");
    sb.append("    canApproveOrDeny: ").append(toIndentedString(canApproveOrDeny)).append("\n");
    sb.append("    approvalExpiration: ").append(toIndentedString(approvalExpiration)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
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
