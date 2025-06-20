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
public class ModelsVOIPSharedDoNotDisturb {
  
  @SerializedName("enabled")
  private Boolean enabled = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsVOIPSharedDoNotDisturb modelsVOIPSharedDoNotDisturb = (ModelsVOIPSharedDoNotDisturb) o;
    return (this.enabled == null ? modelsVOIPSharedDoNotDisturb.enabled == null : this.enabled.equals(modelsVOIPSharedDoNotDisturb.enabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.enabled == null ? 0: this.enabled.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsVOIPSharedDoNotDisturb {\n");
    
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
