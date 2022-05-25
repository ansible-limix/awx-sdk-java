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
 * GroupTree
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class GroupTree {
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

  @SerializedName("inventory")
  private Integer inventory = null;

  @SerializedName("variables")
  private String variables = "";

  @SerializedName("children")
  private String children = null;

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

  public GroupTree related(Object related) {
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

  public GroupTree summaryFields(Object summaryFields) {
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

  public GroupTree name(String name) {
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

  public GroupTree description(String description) {
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

  public GroupTree inventory(Integer inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @Schema(required = true, description = "")
  public Integer getInventory() {
    return inventory;
  }

  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }

  public GroupTree variables(String variables) {
    this.variables = variables;
    return this;
  }

   /**
   * Group variables in JSON or YAML format.
   * @return variables
  **/
  @Schema(description = "Group variables in JSON or YAML format.")
  public String getVariables() {
    return variables;
  }

  public void setVariables(String variables) {
    this.variables = variables;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public String getChildren() {
    return children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupTree groupTree = (GroupTree) o;
    return Objects.equals(this.id, groupTree.id) &&
        Objects.equals(this.type, groupTree.type) &&
        Objects.equals(this.url, groupTree.url) &&
        Objects.equals(this.related, groupTree.related) &&
        Objects.equals(this.summaryFields, groupTree.summaryFields) &&
        Objects.equals(this.created, groupTree.created) &&
        Objects.equals(this.modified, groupTree.modified) &&
        Objects.equals(this.name, groupTree.name) &&
        Objects.equals(this.description, groupTree.description) &&
        Objects.equals(this.inventory, groupTree.inventory) &&
        Objects.equals(this.variables, groupTree.variables) &&
        Objects.equals(this.children, groupTree.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, inventory, variables, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupTree {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
