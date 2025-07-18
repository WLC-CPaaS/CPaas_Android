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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModelsDeviceOutputFullMediaAudio {
  
  @SerializedName("codecs")
  private List<String> codecs = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getCodecs() {
    return codecs;
  }
  public void setCodecs(List<String> codecs) {
    this.codecs = codecs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsDeviceOutputFullMediaAudio modelsDeviceOutputFullMediaAudio = (ModelsDeviceOutputFullMediaAudio) o;
    return (this.codecs == null ? modelsDeviceOutputFullMediaAudio.codecs == null : this.codecs.equals(modelsDeviceOutputFullMediaAudio.codecs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.codecs == null ? 0: this.codecs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsDeviceOutputFullMediaAudio {\n");
    
    sb.append("  codecs: ").append(codecs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
