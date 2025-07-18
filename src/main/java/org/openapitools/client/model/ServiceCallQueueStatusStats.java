/**
 * White Label Communications CPaas API Documentation
 * A CPaaS platform API
 *
 * The version of the OpenAPI document: 1.1
 * Contact: support@whitelabelcomm.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceCallQueueStatusStats {
  
  @SerializedName("abandoned_sessions")
  private Integer abandonedSessions = null;
  @SerializedName("active_session_count")
  private Integer activeSessionCount = null;
  @SerializedName("average_wait")
  private Integer averageWait = null;
  @SerializedName("estimated_wait")
  private Integer estimatedWait = null;
  @SerializedName("longest_wait")
  private Integer longestWait = null;
  @SerializedName("missed_sessions")
  private Integer missedSessions = null;
  @SerializedName("recipient_count")
  private Integer recipientCount = null;
  @SerializedName("total_sessions")
  private Integer totalSessions = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAbandonedSessions() {
    return abandonedSessions;
  }
  public void setAbandonedSessions(Integer abandonedSessions) {
    this.abandonedSessions = abandonedSessions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getActiveSessionCount() {
    return activeSessionCount;
  }
  public void setActiveSessionCount(Integer activeSessionCount) {
    this.activeSessionCount = activeSessionCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAverageWait() {
    return averageWait;
  }
  public void setAverageWait(Integer averageWait) {
    this.averageWait = averageWait;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedWait() {
    return estimatedWait;
  }
  public void setEstimatedWait(Integer estimatedWait) {
    this.estimatedWait = estimatedWait;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLongestWait() {
    return longestWait;
  }
  public void setLongestWait(Integer longestWait) {
    this.longestWait = longestWait;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMissedSessions() {
    return missedSessions;
  }
  public void setMissedSessions(Integer missedSessions) {
    this.missedSessions = missedSessions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRecipientCount() {
    return recipientCount;
  }
  public void setRecipientCount(Integer recipientCount) {
    this.recipientCount = recipientCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalSessions() {
    return totalSessions;
  }
  public void setTotalSessions(Integer totalSessions) {
    this.totalSessions = totalSessions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCallQueueStatusStats serviceCallQueueStatusStats = (ServiceCallQueueStatusStats) o;
    return (this.abandonedSessions == null ? serviceCallQueueStatusStats.abandonedSessions == null : this.abandonedSessions.equals(serviceCallQueueStatusStats.abandonedSessions)) &&
        (this.activeSessionCount == null ? serviceCallQueueStatusStats.activeSessionCount == null : this.activeSessionCount.equals(serviceCallQueueStatusStats.activeSessionCount)) &&
        (this.averageWait == null ? serviceCallQueueStatusStats.averageWait == null : this.averageWait.equals(serviceCallQueueStatusStats.averageWait)) &&
        (this.estimatedWait == null ? serviceCallQueueStatusStats.estimatedWait == null : this.estimatedWait.equals(serviceCallQueueStatusStats.estimatedWait)) &&
        (this.longestWait == null ? serviceCallQueueStatusStats.longestWait == null : this.longestWait.equals(serviceCallQueueStatusStats.longestWait)) &&
        (this.missedSessions == null ? serviceCallQueueStatusStats.missedSessions == null : this.missedSessions.equals(serviceCallQueueStatusStats.missedSessions)) &&
        (this.recipientCount == null ? serviceCallQueueStatusStats.recipientCount == null : this.recipientCount.equals(serviceCallQueueStatusStats.recipientCount)) &&
        (this.totalSessions == null ? serviceCallQueueStatusStats.totalSessions == null : this.totalSessions.equals(serviceCallQueueStatusStats.totalSessions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.abandonedSessions == null ? 0: this.abandonedSessions.hashCode());
    result = 31 * result + (this.activeSessionCount == null ? 0: this.activeSessionCount.hashCode());
    result = 31 * result + (this.averageWait == null ? 0: this.averageWait.hashCode());
    result = 31 * result + (this.estimatedWait == null ? 0: this.estimatedWait.hashCode());
    result = 31 * result + (this.longestWait == null ? 0: this.longestWait.hashCode());
    result = 31 * result + (this.missedSessions == null ? 0: this.missedSessions.hashCode());
    result = 31 * result + (this.recipientCount == null ? 0: this.recipientCount.hashCode());
    result = 31 * result + (this.totalSessions == null ? 0: this.totalSessions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCallQueueStatusStats {\n");
    
    sb.append("  abandonedSessions: ").append(abandonedSessions).append("\n");
    sb.append("  activeSessionCount: ").append(activeSessionCount).append("\n");
    sb.append("  averageWait: ").append(averageWait).append("\n");
    sb.append("  estimatedWait: ").append(estimatedWait).append("\n");
    sb.append("  longestWait: ").append(longestWait).append("\n");
    sb.append("  missedSessions: ").append(missedSessions).append("\n");
    sb.append("  recipientCount: ").append(recipientCount).append("\n");
    sb.append("  totalSessions: ").append(totalSessions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
