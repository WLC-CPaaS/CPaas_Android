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

import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceVOIPCallQueueRoleAssignData {
  
  public enum ActionEnum {
     set, 
  };
  @SerializedName("action")
  private ActionEnum action = null;
  @SerializedName("recipients")
  private List<Map<String, List<String>>> recipients = null;
  @SerializedName("set_membership")
  private Boolean setMembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Map<String, List<String>>> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<Map<String, List<String>>> recipients) {
    this.recipients = recipients;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getSetMembership() {
    return setMembership;
  }
  public void setSetMembership(Boolean setMembership) {
    this.setMembership = setMembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVOIPCallQueueRoleAssignData serviceVOIPCallQueueRoleAssignData = (ServiceVOIPCallQueueRoleAssignData) o;
    return (this.action == null ? serviceVOIPCallQueueRoleAssignData.action == null : this.action.equals(serviceVOIPCallQueueRoleAssignData.action)) &&
        (this.recipients == null ? serviceVOIPCallQueueRoleAssignData.recipients == null : this.recipients.equals(serviceVOIPCallQueueRoleAssignData.recipients)) &&
        (this.setMembership == null ? serviceVOIPCallQueueRoleAssignData.setMembership == null : this.setMembership.equals(serviceVOIPCallQueueRoleAssignData.setMembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.action == null ? 0: this.action.hashCode());
    result = 31 * result + (this.recipients == null ? 0: this.recipients.hashCode());
    result = 31 * result + (this.setMembership == null ? 0: this.setMembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVOIPCallQueueRoleAssignData {\n");
    
    sb.append("  action: ").append(action).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  setMembership: ").append(setMembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
