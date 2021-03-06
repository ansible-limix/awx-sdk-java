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
 * OAuth2Token
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class OAuth2Token {
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

  @SerializedName("description")
  private String description = "";

  @SerializedName("user")
  private Integer user = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("application")
  private Integer application = null;

  @SerializedName("expires")
  private OffsetDateTime expires = null;

  @SerializedName("scope")
  private String scope = "write";

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

  public OAuth2Token related(Object related) {
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

  public OAuth2Token summaryFields(Object summaryFields) {
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

  public OAuth2Token description(String description) {
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
   * The user representing the token owner
   * @return user
  **/
  @Schema(description = "The user representing the token owner")
  public Integer getUser() {
    return user;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(description = "")
  public String getToken() {
    return token;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @Schema(description = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public OAuth2Token application(Integer application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public Integer getApplication() {
    return application;
  }

  public void setApplication(Integer application) {
    this.application = application;
  }

   /**
   * Get expires
   * @return expires
  **/
  @Schema(description = "")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public OAuth2Token scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Allowed scopes, further restricts user&#x27;s permissions. Must be a simple space-separated string with allowed scopes [&#x27;read&#x27;, &#x27;write&#x27;].
   * @return scope
  **/
  @Schema(description = "Allowed scopes, further restricts user's permissions. Must be a simple space-separated string with allowed scopes ['read', 'write'].")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Token oauth2Token = (OAuth2Token) o;
    return Objects.equals(this.id, oauth2Token.id) &&
        Objects.equals(this.type, oauth2Token.type) &&
        Objects.equals(this.url, oauth2Token.url) &&
        Objects.equals(this.related, oauth2Token.related) &&
        Objects.equals(this.summaryFields, oauth2Token.summaryFields) &&
        Objects.equals(this.created, oauth2Token.created) &&
        Objects.equals(this.modified, oauth2Token.modified) &&
        Objects.equals(this.description, oauth2Token.description) &&
        Objects.equals(this.user, oauth2Token.user) &&
        Objects.equals(this.token, oauth2Token.token) &&
        Objects.equals(this.refreshToken, oauth2Token.refreshToken) &&
        Objects.equals(this.application, oauth2Token.application) &&
        Objects.equals(this.expires, oauth2Token.expires) &&
        Objects.equals(this.scope, oauth2Token.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, related, summaryFields, created, modified, description, user, token, refreshToken, application, expires, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Token {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    summaryFields: ").append(toIndentedString(summaryFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
