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
 * Inventory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class Inventory {
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

  /**
   * Kind of inventory being represented.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    EMPTY(""),
    SMART("smart");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KindEnum fromValue(String input) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return KindEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("kind")
  private KindEnum kind = KindEnum.EMPTY;

  @SerializedName("host_filter")
  private String hostFilter = null;

  @SerializedName("variables")
  private String variables = "";

  @SerializedName("has_active_failures")
  private Boolean hasActiveFailures = null;

  @SerializedName("total_hosts")
  private Integer totalHosts = null;

  @SerializedName("hosts_with_active_failures")
  private Integer hostsWithActiveFailures = null;

  @SerializedName("total_groups")
  private Integer totalGroups = null;

  @SerializedName("has_inventory_sources")
  private Boolean hasInventorySources = null;

  @SerializedName("total_inventory_sources")
  private Integer totalInventorySources = null;

  @SerializedName("inventory_sources_with_failures")
  private Integer inventorySourcesWithFailures = null;

  @SerializedName("pending_deletion")
  private Boolean pendingDeletion = null;

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

  public Inventory related(Object related) {
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

  public Inventory summaryFields(Object summaryFields) {
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

  public Inventory name(String name) {
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

  public Inventory description(String description) {
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

  public Inventory organization(Integer organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Organization containing this inventory.
   * @return organization
  **/
  @Schema(required = true, description = "Organization containing this inventory.")
  public Integer getOrganization() {
    return organization;
  }

  public void setOrganization(Integer organization) {
    this.organization = organization;
  }

  public Inventory kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of inventory being represented.
   * @return kind
  **/
  @Schema(description = "Kind of inventory being represented.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Inventory hostFilter(String hostFilter) {
    this.hostFilter = hostFilter;
    return this;
  }

   /**
   * Filter that will be applied to the hosts of this inventory.
   * @return hostFilter
  **/
  @Schema(description = "Filter that will be applied to the hosts of this inventory.")
  public String getHostFilter() {
    return hostFilter;
  }

  public void setHostFilter(String hostFilter) {
    this.hostFilter = hostFilter;
  }

  public Inventory variables(String variables) {
    this.variables = variables;
    return this;
  }

   /**
   * Inventory variables in JSON or YAML format.
   * @return variables
  **/
  @Schema(description = "Inventory variables in JSON or YAML format.")
  public String getVariables() {
    return variables;
  }

  public void setVariables(String variables) {
    this.variables = variables;
  }

   /**
   * This field is deprecated and will be removed in a future release. Flag indicating whether any hosts in this inventory have failed.
   * @return hasActiveFailures
  **/
  @Schema(description = "This field is deprecated and will be removed in a future release. Flag indicating whether any hosts in this inventory have failed.")
  public Boolean isHasActiveFailures() {
    return hasActiveFailures;
  }

   /**
   * This field is deprecated and will be removed in a future release. Total number of hosts in this inventory.
   * minimum: 0
   * @return totalHosts
  **/
  @Schema(description = "This field is deprecated and will be removed in a future release. Total number of hosts in this inventory.")
  public Integer getTotalHosts() {
    return totalHosts;
  }

   /**
   * This field is deprecated and will be removed in a future release. Number of hosts in this inventory with active failures.
   * minimum: 0
   * @return hostsWithActiveFailures
  **/
  @Schema(description = "This field is deprecated and will be removed in a future release. Number of hosts in this inventory with active failures.")
  public Integer getHostsWithActiveFailures() {
    return hostsWithActiveFailures;
  }

   /**
   * This field is deprecated and will be removed in a future release. Total number of groups in this inventory.
   * minimum: 0
   * @return totalGroups
  **/
  @Schema(description = "This field is deprecated and will be removed in a future release. Total number of groups in this inventory.")
  public Integer getTotalGroups() {
    return totalGroups;
  }

   /**
   * This field is deprecated and will be removed in a future release. Flag indicating whether this inventory has any external inventory sources.
   * @return hasInventorySources
  **/
  @Schema(description = "This field is deprecated and will be removed in a future release. Flag indicating whether this inventory has any external inventory sources.")
  public Boolean isHasInventorySources() {
    return hasInventorySources;
  }

   /**
   * Total number of external inventory sources configured within this inventory.
   * minimum: 0
   * @return totalInventorySources
  **/
  @Schema(description = "Total number of external inventory sources configured within this inventory.")
  public Integer getTotalInventorySources() {
    return totalInventorySources;
  }

   /**
   * Number of external inventory sources in this inventory with failures.
   * minimum: 0
   * @return inventorySourcesWithFailures
  **/
  @Schema(description = "Number of external inventory sources in this inventory with failures.")
  public Integer getInventorySourcesWithFailures() {
    return inventorySourcesWithFailures;
  }

   /**
   * Flag indicating the inventory is being deleted.
   * @return pendingDeletion
  **/
  @Schema(description = "Flag indicating the inventory is being deleted.")
  public Boolean isPendingDeletion() {
    return pendingDeletion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventory inventory = (Inventory) o;
    return Objects.equals(this.id, inventory.id) &&
        Objects.equals(this.type, inventory.type) &&
        Objects.equals(this.url, inventory.url) &&
        Objects.equals(this.related, inventory.related) &&
        Objects.equals(this.summaryFields, inventory.summaryFields) &&
        Objects.equals(this.created, inventory.created) &&
        Objects.equals(this.modified, inventory.modified) &&
        Objects.equals(this.name, inventory.name) &&
        Objects.equals(this.description, inventory.description) &&
        Objects.equals(this.organization, inventory.organization) &&
        Objects.equals(this.kind, inventory.kind) &&
        Objects.equals(this.hostFilter, inventory.hostFilter) &&
        Objects.equals(this.variables, inventory.variables) &&
        Objects.equals(this.hasActiveFailures, inventory.hasActiveFailures) &&
        Objects.equals(this.totalHosts, inventory.totalHosts) &&
        Objects.equals(this.hostsWithActiveFailures, inventory.hostsWithActiveFailures) &&
        Objects.equals(this.totalGroups, inventory.totalGroups) &&
        Objects.equals(this.hasInventorySources, inventory.hasInventorySources) &&
        Objects.equals(this.totalInventorySources, inventory.totalInventorySources) &&
        Objects.equals(this.inventorySourcesWithFailures, inventory.inventorySourcesWithFailures) &&
        Objects.equals(this.pendingDeletion, inventory.pendingDeletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, name, description, organization, kind, hostFilter, variables, hasActiveFailures, totalHosts, hostsWithActiveFailures, totalGroups, hasInventorySources, totalInventorySources, inventorySourcesWithFailures, pendingDeletion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inventory {\n");
    
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
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    hostFilter: ").append(toIndentedString(hostFilter)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    hasActiveFailures: ").append(toIndentedString(hasActiveFailures)).append("\n");
    sb.append("    totalHosts: ").append(toIndentedString(totalHosts)).append("\n");
    sb.append("    hostsWithActiveFailures: ").append(toIndentedString(hostsWithActiveFailures)).append("\n");
    sb.append("    totalGroups: ").append(toIndentedString(totalGroups)).append("\n");
    sb.append("    hasInventorySources: ").append(toIndentedString(hasInventorySources)).append("\n");
    sb.append("    totalInventorySources: ").append(toIndentedString(totalInventorySources)).append("\n");
    sb.append("    inventorySourcesWithFailures: ").append(toIndentedString(inventorySourcesWithFailures)).append("\n");
    sb.append("    pendingDeletion: ").append(toIndentedString(pendingDeletion)).append("\n");
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
