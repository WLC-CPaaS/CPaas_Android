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

import org.openapitools.client.model.ModelsCallRecordingSource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModelsCallRecordingSettings {
  
  @SerializedName("any")
  private ModelsCallRecordingSource any = null;
  @SerializedName("inbound")
  private ModelsCallRecordingSource inbound = null;
  @SerializedName("outbound")
  private ModelsCallRecordingSource outbound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsCallRecordingSource getAny() {
    return any;
  }
  public void setAny(ModelsCallRecordingSource any) {
    this.any = any;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsCallRecordingSource getInbound() {
    return inbound;
  }
  public void setInbound(ModelsCallRecordingSource inbound) {
    this.inbound = inbound;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsCallRecordingSource getOutbound() {
    return outbound;
  }
  public void setOutbound(ModelsCallRecordingSource outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCallRecordingSettings modelsCallRecordingSettings = (ModelsCallRecordingSettings) o;
    return (this.any == null ? modelsCallRecordingSettings.any == null : this.any.equals(modelsCallRecordingSettings.any)) &&
        (this.inbound == null ? modelsCallRecordingSettings.inbound == null : this.inbound.equals(modelsCallRecordingSettings.inbound)) &&
        (this.outbound == null ? modelsCallRecordingSettings.outbound == null : this.outbound.equals(modelsCallRecordingSettings.outbound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.any == null ? 0: this.any.hashCode());
    result = 31 * result + (this.inbound == null ? 0: this.inbound.hashCode());
    result = 31 * result + (this.outbound == null ? 0: this.outbound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCallRecordingSettings {\n");
    
    sb.append("  any: ").append(any).append("\n");
    sb.append("  inbound: ").append(inbound).append("\n");
    sb.append("  outbound: ").append(outbound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
