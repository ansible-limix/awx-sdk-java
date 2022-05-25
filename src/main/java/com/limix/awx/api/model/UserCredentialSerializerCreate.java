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
 * UserCredentialSerializerCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class UserCredentialSerializerCreate {
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

  @SerializedName("credential_type")
  private Integer credentialType = null;

  @SerializedName("managed")
  private String managed = null;

  @SerializedName("inputs")
  private Object inputs = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("cloud")
  private String cloud = null;

  @SerializedName("kubernetes")
  private String kubernetes = null;

  @SerializedName("user")
  private Integer user = null;

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

  public UserCredentialSerializerCreate related(Object related) {
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

  public UserCredentialSerializerCreate summaryFields(Object summaryFields) {
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

  public UserCredentialSerializerCreate name(String name) {
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

  public UserCredentialSerializerCreate description(String description) {
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

  public UserCredentialSerializerCreate credentialType(Integer credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Specify the type of credential you want to create. Refer to the documentation for details on each type.
   * @return credentialType
  **/
  @Schema(required = true, description = "Specify the type of credential you want to create. Refer to the documentation for details on each type.")
  public Integer getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(Integer credentialType) {
    this.credentialType = credentialType;
  }

   /**
   * Get managed
   * @return managed
  **/
  @Schema(description = "")
  public String getManaged() {
    return managed;
  }

  public UserCredentialSerializerCreate inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax.
   * @return inputs
  **/
  @Schema(description = "Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax.")
  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public String getKind() {
    return kind;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @Schema(description = "")
  public String getCloud() {
    return cloud;
  }

   /**
   * Get kubernetes
   * @return kubernetes
  **/
  @Schema(description = "")
  public String getKubernetes() {
    return kubernetes;
  }

  public UserCredentialSerializerCreate user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * Write-only field used to add user to owner role. If provided, do not give either team or organization. Only valid for creation.
   * @return user
  **/
  @Schema(description = "Write-only field used to add user to owner role. If provided, do not give either team or organization. Only valid for creation.")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCredentialSerializerCreate userCredentialSerializerCreate = (UserCredentialSerializerCreate) o;
    return Objects.equals(this.id, userCredentialSerializerCreate.id) &&
        Objects.equals(this.type, userCredentialSerializerCreate.type) &&
        Objects.equals(this.url, userCredentialSerializerCreate.url) &&
        Objects.equals(this.related, userCredentialSerializerCreate.related) &&
        Objects.equals(this.summaryFields, userCredentialSerializerCreate.summaryFields) &&
        Objects.equals(this.created, userCredentialSerializerCreate.created) &&
        Objects.equals(this.modified, userCredentialSerializerCreate.modified) &&
        Objects.equals(this.name, userCredentialSerializerCreate.name) &&
        Objects.equals(this.description, userCredentialSerializerCreate.description) &&
        Objects.equals(this.credentialType, userCredentialSerializerCreate.credentialType) &&
        Objects.equals(this.managed, userCredentialSerializerCreate.managed) &&
        Objects.equals(this.inputs, userCredentialSerializerCreate.inputs) &&
        Objects.equals(this.kind, userCredentialSerializerCreate.kind) &&
        Objects.equals(this.cloud, userCredentialSerializerCreate.cloud) &&
        Objects.equals(this.kubernetes, userCredentialSerializerCreate.kubernetes) &&
        Objects.equals(this.user, userCredentialSerializerCreate.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, credentialType, managed, inputs, kind, cloud, kubernetes, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCredentialSerializerCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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