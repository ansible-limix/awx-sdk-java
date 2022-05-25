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
 * CredentialSerializerCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class CredentialSerializerCreate {
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

  @SerializedName("team")
  private Integer team = null;

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

  public CredentialSerializerCreate related(Object related) {
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

  public CredentialSerializerCreate summaryFields(Object summaryFields) {
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

  public CredentialSerializerCreate name(String name) {
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

  public CredentialSerializerCreate description(String description) {
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

  public CredentialSerializerCreate organization(Integer organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Inherit permissions from organization roles. If provided on creation, do not give either user or team.
   * @return organization
  **/
  @Schema(description = "Inherit permissions from organization roles. If provided on creation, do not give either user or team.")
  public Integer getOrganization() {
    return organization;
  }

  public void setOrganization(Integer organization) {
    this.organization = organization;
  }

  public CredentialSerializerCreate credentialType(Integer credentialType) {
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

  public CredentialSerializerCreate inputs(Object inputs) {
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

  public CredentialSerializerCreate user(Integer user) {
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

  public CredentialSerializerCreate team(Integer team) {
    this.team = team;
    return this;
  }

   /**
   * Write-only field used to add team to owner role. If provided, do not give either user or organization. Only valid for creation.
   * @return team
  **/
  @Schema(description = "Write-only field used to add team to owner role. If provided, do not give either user or organization. Only valid for creation.")
  public Integer getTeam() {
    return team;
  }

  public void setTeam(Integer team) {
    this.team = team;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialSerializerCreate credentialSerializerCreate = (CredentialSerializerCreate) o;
    return Objects.equals(this.id, credentialSerializerCreate.id) &&
        Objects.equals(this.type, credentialSerializerCreate.type) &&
        Objects.equals(this.url, credentialSerializerCreate.url) &&
        Objects.equals(this.related, credentialSerializerCreate.related) &&
        Objects.equals(this.summaryFields, credentialSerializerCreate.summaryFields) &&
        Objects.equals(this.created, credentialSerializerCreate.created) &&
        Objects.equals(this.modified, credentialSerializerCreate.modified) &&
        Objects.equals(this.name, credentialSerializerCreate.name) &&
        Objects.equals(this.description, credentialSerializerCreate.description) &&
        Objects.equals(this.organization, credentialSerializerCreate.organization) &&
        Objects.equals(this.credentialType, credentialSerializerCreate.credentialType) &&
        Objects.equals(this.managed, credentialSerializerCreate.managed) &&
        Objects.equals(this.inputs, credentialSerializerCreate.inputs) &&
        Objects.equals(this.kind, credentialSerializerCreate.kind) &&
        Objects.equals(this.cloud, credentialSerializerCreate.cloud) &&
        Objects.equals(this.kubernetes, credentialSerializerCreate.kubernetes) &&
        Objects.equals(this.user, credentialSerializerCreate.user) &&
        Objects.equals(this.team, credentialSerializerCreate.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, organization, credentialType, managed, inputs, kind, cloud, kubernetes, user, team);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialSerializerCreate {\n");
    
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
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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