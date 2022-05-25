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
/**
 * ProjectUpdateEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class ProjectUpdateEvent {
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

  /**
   * Gets or Sets event
   */
  @JsonAdapter(EventEnum.Adapter.class)
  public enum EventEnum {
    RUNNER_ON_FAILED("runner_on_failed"),
    RUNNER_ON_START("runner_on_start"),
    RUNNER_ON_OK("runner_on_ok"),
    RUNNER_ON_ERROR("runner_on_error"),
    RUNNER_ON_SKIPPED("runner_on_skipped"),
    RUNNER_ON_UNREACHABLE("runner_on_unreachable"),
    RUNNER_ON_NO_HOSTS("runner_on_no_hosts"),
    RUNNER_ON_ASYNC_POLL("runner_on_async_poll"),
    RUNNER_ON_ASYNC_OK("runner_on_async_ok"),
    RUNNER_ON_ASYNC_FAILED("runner_on_async_failed"),
    RUNNER_ITEM_ON_OK("runner_item_on_ok"),
    RUNNER_ITEM_ON_FAILED("runner_item_on_failed"),
    RUNNER_ITEM_ON_SKIPPED("runner_item_on_skipped"),
    RUNNER_RETRY("runner_retry"),
    RUNNER_ON_FILE_DIFF("runner_on_file_diff"),
    PLAYBOOK_ON_START("playbook_on_start"),
    PLAYBOOK_ON_NOTIFY("playbook_on_notify"),
    PLAYBOOK_ON_INCLUDE("playbook_on_include"),
    PLAYBOOK_ON_NO_HOSTS_MATCHED("playbook_on_no_hosts_matched"),
    PLAYBOOK_ON_NO_HOSTS_REMAINING("playbook_on_no_hosts_remaining"),
    PLAYBOOK_ON_TASK_START("playbook_on_task_start"),
    PLAYBOOK_ON_VARS_PROMPT("playbook_on_vars_prompt"),
    PLAYBOOK_ON_SETUP("playbook_on_setup"),
    PLAYBOOK_ON_IMPORT_FOR_HOST("playbook_on_import_for_host"),
    PLAYBOOK_ON_NOT_IMPORT_FOR_HOST("playbook_on_not_import_for_host"),
    PLAYBOOK_ON_PLAY_START("playbook_on_play_start"),
    PLAYBOOK_ON_STATS("playbook_on_stats"),
    DEBUG("debug"),
    VERBOSE("verbose"),
    DEPRECATED("deprecated"),
    WARNING("warning"),
    SYSTEM_WARNING("system_warning"),
    ERROR("error");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EventEnum fromValue(String input) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EventEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("event")
  private EventEnum event = null;

  @SerializedName("counter")
  private Integer counter = null;

  @SerializedName("event_display")
  private String eventDisplay = null;

  @SerializedName("event_data")
  private String eventData = null;

  @SerializedName("event_level")
  private Integer eventLevel = null;

  @SerializedName("failed")
  private Boolean failed = null;

  @SerializedName("changed")
  private Boolean changed = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("host_name")
  private String hostName = null;

  @SerializedName("playbook")
  private String playbook = null;

  @SerializedName("play")
  private String play = null;

  @SerializedName("task")
  private String task = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("stdout")
  private String stdout = null;

  @SerializedName("start_line")
  private Integer startLine = null;

  @SerializedName("end_line")
  private Integer endLine = null;

  @SerializedName("verbosity")
  private Integer verbosity = null;

  @SerializedName("project_update")
  private String projectUpdate = null;

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

  public ProjectUpdateEvent related(Object related) {
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

  public ProjectUpdateEvent summaryFields(Object summaryFields) {
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

  public ProjectUpdateEvent event(EventEnum event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(required = true, description = "")
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

   /**
   * Get counter
   * minimum: 0
   * @return counter
  **/
  @Schema(description = "")
  public Integer getCounter() {
    return counter;
  }

   /**
   * Get eventDisplay
   * @return eventDisplay
  **/
  @Schema(description = "")
  public String getEventDisplay() {
    return eventDisplay;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  @Schema(description = "")
  public String getEventData() {
    return eventData;
  }

   /**
   * Get eventLevel
   * @return eventLevel
  **/
  @Schema(description = "")
  public Integer getEventLevel() {
    return eventLevel;
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
   * Get changed
   * @return changed
  **/
  @Schema(description = "")
  public Boolean isChanged() {
    return changed;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @Schema(description = "")
  public String getHostName() {
    return hostName;
  }

   /**
   * Get playbook
   * @return playbook
  **/
  @Schema(description = "")
  public String getPlaybook() {
    return playbook;
  }

   /**
   * Get play
   * @return play
  **/
  @Schema(description = "")
  public String getPlay() {
    return play;
  }

   /**
   * Get task
   * @return task
  **/
  @Schema(description = "")
  public String getTask() {
    return task;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public String getRole() {
    return role;
  }

   /**
   * Get stdout
   * @return stdout
  **/
  @Schema(description = "")
  public String getStdout() {
    return stdout;
  }

   /**
   * Get startLine
   * minimum: 0
   * @return startLine
  **/
  @Schema(description = "")
  public Integer getStartLine() {
    return startLine;
  }

   /**
   * Get endLine
   * minimum: 0
   * @return endLine
  **/
  @Schema(description = "")
  public Integer getEndLine() {
    return endLine;
  }

   /**
   * Get verbosity
   * minimum: 0
   * @return verbosity
  **/
  @Schema(description = "")
  public Integer getVerbosity() {
    return verbosity;
  }

   /**
   * Get projectUpdate
   * @return projectUpdate
  **/
  @Schema(description = "")
  public String getProjectUpdate() {
    return projectUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateEvent projectUpdateEvent = (ProjectUpdateEvent) o;
    return Objects.equals(this.id, projectUpdateEvent.id) &&
        Objects.equals(this.type, projectUpdateEvent.type) &&
        Objects.equals(this.url, projectUpdateEvent.url) &&
        Objects.equals(this.related, projectUpdateEvent.related) &&
        Objects.equals(this.summaryFields, projectUpdateEvent.summaryFields) &&
        Objects.equals(this.created, projectUpdateEvent.created) &&
        Objects.equals(this.modified, projectUpdateEvent.modified) &&
        Objects.equals(this.event, projectUpdateEvent.event) &&
        Objects.equals(this.counter, projectUpdateEvent.counter) &&
        Objects.equals(this.eventDisplay, projectUpdateEvent.eventDisplay) &&
        Objects.equals(this.eventData, projectUpdateEvent.eventData) &&
        Objects.equals(this.eventLevel, projectUpdateEvent.eventLevel) &&
        Objects.equals(this.failed, projectUpdateEvent.failed) &&
        Objects.equals(this.changed, projectUpdateEvent.changed) &&
        Objects.equals(this.uuid, projectUpdateEvent.uuid) &&
        Objects.equals(this.hostName, projectUpdateEvent.hostName) &&
        Objects.equals(this.playbook, projectUpdateEvent.playbook) &&
        Objects.equals(this.play, projectUpdateEvent.play) &&
        Objects.equals(this.task, projectUpdateEvent.task) &&
        Objects.equals(this.role, projectUpdateEvent.role) &&
        Objects.equals(this.stdout, projectUpdateEvent.stdout) &&
        Objects.equals(this.startLine, projectUpdateEvent.startLine) &&
        Objects.equals(this.endLine, projectUpdateEvent.endLine) &&
        Objects.equals(this.verbosity, projectUpdateEvent.verbosity) &&
        Objects.equals(this.projectUpdate, projectUpdateEvent.projectUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, event, counter, eventDisplay, eventData, eventLevel, failed, changed, uuid, hostName, playbook, play, task, role, stdout, startLine, endLine, verbosity, projectUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    eventDisplay: ").append(toIndentedString(eventDisplay)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    playbook: ").append(toIndentedString(playbook)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
    sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
    sb.append("    projectUpdate: ").append(toIndentedString(projectUpdate)).append("\n");
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
