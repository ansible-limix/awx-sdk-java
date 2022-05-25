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
 * ExecutionEnvironment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class ExecutionEnvironment {
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

  @SerializedName("organization")
  private Integer organization = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("managed")
  private String managed = null;

  @SerializedName("credential")
  private Integer credential = null;

  /**
   * Pull image before running?
   */
  @JsonAdapter(PullEnum.Adapter.class)
  public enum PullEnum {
    ALWAYS("always"),
    MISSING("missing"),
    NEVER("never");

    private String value;

    PullEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PullEnum fromValue(String input) {
      for (PullEnum b : PullEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PullEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PullEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PullEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PullEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("pull")
  private PullEnum pull = null;

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

  public ExecutionEnvironment related(Object related) {
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

  public ExecutionEnvironment summaryFields(Object summaryFields) {
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

  public ExecutionEnvironment name(String name) {
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

  public ExecutionEnvironment description(String description) {
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

  public ExecutionEnvironment organization(Integer organization) {
    this.organization = organization;
    return this;
  }

   /**
   * The organization used to determine access to this execution environment.
   * @return organization
  **/
  @Schema(description = "The organization used to determine access to this execution environment.")
  public Integer getOrganization() {
    return organization;
  }

  public void setOrganization(Integer organization) {
    this.organization = organization;
  }

  public ExecutionEnvironment image(String image) {
    this.image = image;
    return this;
  }

   /**
   * The full image location, including the container registry, image name, and version tag.
   * @return image
  **/
  @Schema(required = true, description = "The full image location, including the container registry, image name, and version tag.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

   /**
   * Get managed
   * @return managed
  **/
  @Schema(description = "")
  public String getManaged() {
    return managed;
  }

  public ExecutionEnvironment credential(Integer credential) {
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

  public ExecutionEnvironment pull(PullEnum pull) {
    this.pull = pull;
    return this;
  }

   /**
   * Pull image before running?
   * @return pull
  **/
  @Schema(description = "Pull image before running?")
  public PullEnum getPull() {
    return pull;
  }

  public void setPull(PullEnum pull) {
    this.pull = pull;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionEnvironment executionEnvironment = (ExecutionEnvironment) o;
    return Objects.equals(this.id, executionEnvironment.id) &&
        Objects.equals(this.type, executionEnvironment.type) &&
        Objects.equals(this.url, executionEnvironment.url) &&
        Objects.equals(this.related, executionEnvironment.related) &&
        Objects.equals(this.summaryFields, executionEnvironment.summaryFields) &&
        Objects.equals(this.created, executionEnvironment.created) &&
        Objects.equals(this.modified, executionEnvironment.modified) &&
        Objects.equals(this.name, executionEnvironment.name) &&
        Objects.equals(this.description, executionEnvironment.description) &&
        Objects.equals(this.organization, executionEnvironment.organization) &&
        Objects.equals(this.image, executionEnvironment.image) &&
        Objects.equals(this.managed, executionEnvironment.managed) &&
        Objects.equals(this.credential, executionEnvironment.credential) &&
        Objects.equals(this.pull, executionEnvironment.pull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, organization, image, managed, credential, pull);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionEnvironment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
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
