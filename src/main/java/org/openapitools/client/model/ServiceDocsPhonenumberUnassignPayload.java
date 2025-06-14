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
public class ServiceDocsPhonenumberUnassignPayload {
  
  @SerializedName("phonenumber")
  private String phonenumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhonenumber() {
    return phonenumber;
  }
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDocsPhonenumberUnassignPayload serviceDocsPhonenumberUnassignPayload = (ServiceDocsPhonenumberUnassignPayload) o;
    return (this.phonenumber == null ? serviceDocsPhonenumberUnassignPayload.phonenumber == null : this.phonenumber.equals(serviceDocsPhonenumberUnassignPayload.phonenumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.phonenumber == null ? 0: this.phonenumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDocsPhonenumberUnassignPayload {\n");
    
    sb.append("  phonenumber: ").append(phonenumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
