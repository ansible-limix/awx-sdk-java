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
 * AdHocCommandEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class AdHocCommandEvent {
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

  @SerializedName("ad_hoc_command")
  private String adHocCommand = null;

  /**
   * Gets or Sets event
   */
  @JsonAdapter(EventEnum.Adapter.class)
  public enum EventEnum {
    RUNNER_ON_FAILED("runner_on_failed"),
    RUNNER_ON_OK("runner_on_ok"),
    RUNNER_ON_UNREACHABLE("runner_on_unreachable"),
    RUNNER_ON_SKIPPED("runner_on_skipped"),
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
  private Object eventData = null;

  @SerializedName("failed")
  private Boolean failed = null;

  @SerializedName("changed")
  private Boolean changed = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("host")
  private Integer host = null;

  @SerializedName("host_name")
  private String hostName = null;

  @SerializedName("stdout")
  private String stdout = null;

  @SerializedName("start_line")
  private Integer startLine = null;

  @SerializedName("end_line")
  private Integer endLine = null;

  @SerializedName("verbosity")
  private Integer verbosity = null;

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

  public AdHocCommandEvent related(Object related) {
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

  public AdHocCommandEvent summaryFields(Object summaryFields) {
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

   /**
   * Get adHocCommand
   * @return adHocCommand
  **/
  @Schema(description = "")
  public String getAdHocCommand() {
    return adHocCommand;
  }

  public AdHocCommandEvent event(EventEnum event) {
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

  public AdHocCommandEvent eventData(Object eventData) {
    this.eventData = eventData;
    return this;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  @Schema(description = "")
  public Object getEventData() {
    return eventData;
  }

  public void setEventData(Object eventData) {
    this.eventData = eventData;
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
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public Integer getHost() {
    return host;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdHocCommandEvent adHocCommandEvent = (AdHocCommandEvent) o;
    return Objects.equals(this.id, adHocCommandEvent.id) &&
        Objects.equals(this.type, adHocCommandEvent.type) &&
        Objects.equals(this.url, adHocCommandEvent.url) &&
        Objects.equals(this.related, adHocCommandEvent.related) &&
        Objects.equals(this.summaryFields, adHocCommandEvent.summaryFields) &&
        Objects.equals(this.created, adHocCommandEvent.created) &&
        Objects.equals(this.modified, adHocCommandEvent.modified) &&
        Objects.equals(this.adHocCommand, adHocCommandEvent.adHocCommand) &&
        Objects.equals(this.event, adHocCommandEvent.event) &&
        Objects.equals(this.counter, adHocCommandEvent.counter) &&
        Objects.equals(this.eventDisplay, adHocCommandEvent.eventDisplay) &&
        Objects.equals(this.eventData, adHocCommandEvent.eventData) &&
        Objects.equals(this.failed, adHocCommandEvent.failed) &&
        Objects.equals(this.changed, adHocCommandEvent.changed) &&
        Objects.equals(this.uuid, adHocCommandEvent.uuid) &&
        Objects.equals(this.host, adHocCommandEvent.host) &&
        Objects.equals(this.hostName, adHocCommandEvent.hostName) &&
        Objects.equals(this.stdout, adHocCommandEvent.stdout) &&
        Objects.equals(this.startLine, adHocCommandEvent.startLine) &&
        Objects.equals(this.endLine, adHocCommandEvent.endLine) &&
        Objects.equals(this.verbosity, adHocCommandEvent.verbosity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, adHocCommand, event, counter, eventDisplay, eventData, failed, changed, uuid, host, hostName, stdout, startLine, endLine, verbosity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdHocCommandEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    adHocCommand: ").append(toIndentedString(adHocCommand)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    eventDisplay: ").append(toIndentedString(eventDisplay)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
    sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
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
