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

import org.openapitools.client.model.ModelsDeviceOutputFullCalleridEmergency;
import org.openapitools.client.model.ModelsDeviceOutputFullCalleridExternal;
import org.openapitools.client.model.ModelsDeviceOutputFullCalleridInternal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModelsDeviceOutputFullCallerid {
  
  @SerializedName("emergency")
  private ModelsDeviceOutputFullCalleridEmergency emergency = null;
  @SerializedName("external")
  private ModelsDeviceOutputFullCalleridExternal external = null;
  @SerializedName("internal")
  private ModelsDeviceOutputFullCalleridInternal internal = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsDeviceOutputFullCalleridEmergency getEmergency() {
    return emergency;
  }
  public void setEmergency(ModelsDeviceOutputFullCalleridEmergency emergency) {
    this.emergency = emergency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsDeviceOutputFullCalleridExternal getExternal() {
    return external;
  }
  public void setExternal(ModelsDeviceOutputFullCalleridExternal external) {
    this.external = external;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsDeviceOutputFullCalleridInternal getInternal() {
    return internal;
  }
  public void setInternal(ModelsDeviceOutputFullCalleridInternal internal) {
    this.internal = internal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsDeviceOutputFullCallerid modelsDeviceOutputFullCallerid = (ModelsDeviceOutputFullCallerid) o;
    return (this.emergency == null ? modelsDeviceOutputFullCallerid.emergency == null : this.emergency.equals(modelsDeviceOutputFullCallerid.emergency)) &&
        (this.external == null ? modelsDeviceOutputFullCallerid.external == null : this.external.equals(modelsDeviceOutputFullCallerid.external)) &&
        (this.internal == null ? modelsDeviceOutputFullCallerid.internal == null : this.internal.equals(modelsDeviceOutputFullCallerid.internal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emergency == null ? 0: this.emergency.hashCode());
    result = 31 * result + (this.external == null ? 0: this.external.hashCode());
    result = 31 * result + (this.internal == null ? 0: this.internal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsDeviceOutputFullCallerid {\n");
    
    sb.append("  emergency: ").append(emergency).append("\n");
    sb.append("  external: ").append(external).append("\n");
    sb.append("  internal: ").append(internal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
