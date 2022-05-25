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
import com.limix.awx.api.model.JobHostSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * JobHostSummaryResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-25T17:26:39.970+08:00[Asia/Shanghai]")
public class JobHostSummaryResult {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("results")
  private List<JobHostSummary> results = new ArrayList<JobHostSummary>();

  public JobHostSummaryResult count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(required = true, description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public JobHostSummaryResult next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @Schema(description = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public JobHostSummaryResult previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @Schema(description = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public JobHostSummaryResult results(List<JobHostSummary> results) {
    this.results = results;
    return this;
  }

  public JobHostSummaryResult addResultsItem(JobHostSummary resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(required = true, description = "")
  public List<JobHostSummary> getResults() {
    return results;
  }

  public void setResults(List<JobHostSummary> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobHostSummaryResult jobHostSummaryResult = (JobHostSummaryResult) o;
    return Objects.equals(this.count, jobHostSummaryResult.count) &&
        Objects.equals(this.next, jobHostSummaryResult.next) &&
        Objects.equals(this.previous, jobHostSummaryResult.previous) &&
        Objects.equals(this.results, jobHostSummaryResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobHostSummaryResult {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
