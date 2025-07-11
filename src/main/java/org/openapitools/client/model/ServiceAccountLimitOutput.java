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
public class ServiceAccountLimitOutput {
  
  @SerializedName("inbound_trunks")
  private Integer inboundTrunks = null;
  @SerializedName("outbound_trunks")
  private Integer outboundTrunks = null;
  @SerializedName("twoway_trunks")
  private Integer twowayTrunks = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getInboundTrunks() {
    return inboundTrunks;
  }
  public void setInboundTrunks(Integer inboundTrunks) {
    this.inboundTrunks = inboundTrunks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOutboundTrunks() {
    return outboundTrunks;
  }
  public void setOutboundTrunks(Integer outboundTrunks) {
    this.outboundTrunks = outboundTrunks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTwowayTrunks() {
    return twowayTrunks;
  }
  public void setTwowayTrunks(Integer twowayTrunks) {
    this.twowayTrunks = twowayTrunks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountLimitOutput serviceAccountLimitOutput = (ServiceAccountLimitOutput) o;
    return (this.inboundTrunks == null ? serviceAccountLimitOutput.inboundTrunks == null : this.inboundTrunks.equals(serviceAccountLimitOutput.inboundTrunks)) &&
        (this.outboundTrunks == null ? serviceAccountLimitOutput.outboundTrunks == null : this.outboundTrunks.equals(serviceAccountLimitOutput.outboundTrunks)) &&
        (this.twowayTrunks == null ? serviceAccountLimitOutput.twowayTrunks == null : this.twowayTrunks.equals(serviceAccountLimitOutput.twowayTrunks));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.inboundTrunks == null ? 0: this.inboundTrunks.hashCode());
    result = 31 * result + (this.outboundTrunks == null ? 0: this.outboundTrunks.hashCode());
    result = 31 * result + (this.twowayTrunks == null ? 0: this.twowayTrunks.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountLimitOutput {\n");
    
    sb.append("  inboundTrunks: ").append(inboundTrunks).append("\n");
    sb.append("  outboundTrunks: ").append(outboundTrunks).append("\n");
    sb.append("  twowayTrunks: ").append(twowayTrunks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
