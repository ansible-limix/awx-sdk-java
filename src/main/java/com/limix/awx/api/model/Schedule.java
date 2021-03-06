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
 * Schedule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class Schedule {
  @SerializedName("rrule")
  private String rrule = null;

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

  @SerializedName("extra_data")
  private Object extraData = null;

  @SerializedName("inventory")
  private Integer inventory = null;

  @SerializedName("scm_branch")
  private String scmBranch = null;

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
  private JobTypeEnum jobType = null;

  @SerializedName("job_tags")
  private String jobTags = null;

  @SerializedName("skip_tags")
  private String skipTags = null;

  @SerializedName("limit")
  private String limit = null;

  @SerializedName("diff_mode")
  private Boolean diffMode = null;

  /**
   * Gets or Sets verbosity
   */
  @JsonAdapter(VerbosityEnum.Adapter.class)
  public enum VerbosityEnum {
    _0("0"),
    _1("1"),
    _2("2"),
    _3("3"),
    _4("4"),
    _5("5");

    private String value;

    VerbosityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VerbosityEnum fromValue(String input) {
      for (VerbosityEnum b : VerbosityEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VerbosityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerbosityEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VerbosityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VerbosityEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("verbosity")
  private VerbosityEnum verbosity = null;

  @SerializedName("unified_job_template")
  private Integer unifiedJobTemplate = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("dtstart")
  private OffsetDateTime dtstart = null;

  @SerializedName("dtend")
  private OffsetDateTime dtend = null;

  @SerializedName("next_run")
  private OffsetDateTime nextRun = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("until")
  private String until = null;

  public Schedule rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

   /**
   * A value representing the schedules iCal recurrence rule.
   * @return rrule
  **/
  @Schema(required = true, description = "A value representing the schedules iCal recurrence rule.")
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

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

  public Schedule related(Object related) {
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

  public Schedule summaryFields(Object summaryFields) {
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

  public Schedule name(String name) {
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

  public Schedule description(String description) {
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

  public Schedule extraData(Object extraData) {
    this.extraData = extraData;
    return this;
  }

   /**
   * Get extraData
   * @return extraData
  **/
  @Schema(description = "")
  public Object getExtraData() {
    return extraData;
  }

  public void setExtraData(Object extraData) {
    this.extraData = extraData;
  }

  public Schedule inventory(Integer inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Inventory applied as a prompt, assuming job template prompts for inventory
   * @return inventory
  **/
  @Schema(description = "Inventory applied as a prompt, assuming job template prompts for inventory")
  public Integer getInventory() {
    return inventory;
  }

  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }

  public Schedule scmBranch(String scmBranch) {
    this.scmBranch = scmBranch;
    return this;
  }

   /**
   * Get scmBranch
   * @return scmBranch
  **/
  @Schema(description = "")
  public String getScmBranch() {
    return scmBranch;
  }

  public void setScmBranch(String scmBranch) {
    this.scmBranch = scmBranch;
  }

  public Schedule jobType(JobTypeEnum jobType) {
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

  public Schedule jobTags(String jobTags) {
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

  public Schedule skipTags(String skipTags) {
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

  public Schedule limit(String limit) {
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

  public Schedule diffMode(Boolean diffMode) {
    this.diffMode = diffMode;
    return this;
  }

   /**
   * Get diffMode
   * @return diffMode
  **/
  @Schema(description = "")
  public Boolean isDiffMode() {
    return diffMode;
  }

  public void setDiffMode(Boolean diffMode) {
    this.diffMode = diffMode;
  }

  public Schedule verbosity(VerbosityEnum verbosity) {
    this.verbosity = verbosity;
    return this;
  }

   /**
   * Get verbosity
   * @return verbosity
  **/
  @Schema(description = "")
  public VerbosityEnum getVerbosity() {
    return verbosity;
  }

  public void setVerbosity(VerbosityEnum verbosity) {
    this.verbosity = verbosity;
  }

  public Schedule unifiedJobTemplate(Integer unifiedJobTemplate) {
    this.unifiedJobTemplate = unifiedJobTemplate;
    return this;
  }

   /**
   * Get unifiedJobTemplate
   * @return unifiedJobTemplate
  **/
  @Schema(required = true, description = "")
  public Integer getUnifiedJobTemplate() {
    return unifiedJobTemplate;
  }

  public void setUnifiedJobTemplate(Integer unifiedJobTemplate) {
    this.unifiedJobTemplate = unifiedJobTemplate;
  }

  public Schedule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enables processing of this schedule.
   * @return enabled
  **/
  @Schema(description = "Enables processing of this schedule.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * The first occurrence of the schedule occurs on or after this time.
   * @return dtstart
  **/
  @Schema(description = "The first occurrence of the schedule occurs on or after this time.")
  public OffsetDateTime getDtstart() {
    return dtstart;
  }

   /**
   * The last occurrence of the schedule occurs before this time, aftewards the schedule expires.
   * @return dtend
  **/
  @Schema(description = "The last occurrence of the schedule occurs before this time, aftewards the schedule expires.")
  public OffsetDateTime getDtend() {
    return dtend;
  }

   /**
   * The next time that the scheduled action will run.
   * @return nextRun
  **/
  @Schema(description = "The next time that the scheduled action will run.")
  public OffsetDateTime getNextRun() {
    return nextRun;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @Schema(description = "")
  public String getTimezone() {
    return timezone;
  }

   /**
   * Get until
   * @return until
  **/
  @Schema(description = "")
  public String getUntil() {
    return until;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.rrule, schedule.rrule) &&
        Objects.equals(this.id, schedule.id) &&
        Objects.equals(this.type, schedule.type) &&
        Objects.equals(this.url, schedule.url) &&
        Objects.equals(this.related, schedule.related) &&
        Objects.equals(this.summaryFields, schedule.summaryFields) &&
        Objects.equals(this.created, schedule.created) &&
        Objects.equals(this.modified, schedule.modified) &&
        Objects.equals(this.name, schedule.name) &&
        Objects.equals(this.description, schedule.description) &&
        Objects.equals(this.extraData, schedule.extraData) &&
        Objects.equals(this.inventory, schedule.inventory) &&
        Objects.equals(this.scmBranch, schedule.scmBranch) &&
        Objects.equals(this.jobType, schedule.jobType) &&
        Objects.equals(this.jobTags, schedule.jobTags) &&
        Objects.equals(this.skipTags, schedule.skipTags) &&
        Objects.equals(this.limit, schedule.limit) &&
        Objects.equals(this.diffMode, schedule.diffMode) &&
        Objects.equals(this.verbosity, schedule.verbosity) &&
        Objects.equals(this.unifiedJobTemplate, schedule.unifiedJobTemplate) &&
        Objects.equals(this.enabled, schedule.enabled) &&
        Objects.equals(this.dtstart, schedule.dtstart) &&
        Objects.equals(this.dtend, schedule.dtend) &&
        Objects.equals(this.nextRun, schedule.nextRun) &&
        Objects.equals(this.timezone, schedule.timezone) &&
        Objects.equals(this.until, schedule.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rrule, id, type, url, related, summaryFields, created, modified, name, description, extraData, inventory, scmBranch, jobType, jobTags, skipTags, limit, diffMode, verbosity, unifiedJobTemplate, enabled, dtstart, dtend, nextRun, timezone, until);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
    sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    diffMode: ").append(toIndentedString(diffMode)).append("\n");
    sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
    sb.append("    unifiedJobTemplate: ").append(toIndentedString(unifiedJobTemplate)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dtstart: ").append(toIndentedString(dtstart)).append("\n");
    sb.append("    dtend: ").append(toIndentedString(dtend)).append("\n");
    sb.append("    nextRun: ").append(toIndentedString(nextRun)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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
