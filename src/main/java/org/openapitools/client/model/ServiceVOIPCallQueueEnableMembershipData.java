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
public class ServiceVOIPCallQueueEnableMembershipData {
  
  @SerializedName("accept_charges")
  private Boolean acceptCharges = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getAcceptCharges() {
    return acceptCharges;
  }
  public void setAcceptCharges(Boolean acceptCharges) {
    this.acceptCharges = acceptCharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVOIPCallQueueEnableMembershipData serviceVOIPCallQueueEnableMembershipData = (ServiceVOIPCallQueueEnableMembershipData) o;
    return (this.acceptCharges == null ? serviceVOIPCallQueueEnableMembershipData.acceptCharges == null : this.acceptCharges.equals(serviceVOIPCallQueueEnableMembershipData.acceptCharges));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.acceptCharges == null ? 0: this.acceptCharges.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVOIPCallQueueEnableMembershipData {\n");
    
    sb.append("  acceptCharges: ").append(acceptCharges).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
