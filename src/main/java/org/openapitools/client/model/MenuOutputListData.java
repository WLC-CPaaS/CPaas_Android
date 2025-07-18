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
public class MenuOutputListData {
  
  @SerializedName("features")
  private List<String> features = null;
  @SerializedName("flags")
  private List<String> flags = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;

  /**
   * Features used in this menu
   **/
  @ApiModelProperty(value = "Features used in this menu")
  public List<String> getFeatures() {
    return features;
  }
  public void setFeatures(List<String> features) {
    this.features = features;
  }

  /**
   * Flags set by external applications
   **/
  @ApiModelProperty(value = "Flags set by external applications")
  public List<String> getFlags() {
    return flags;
  }
  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  /**
   * ID of the menu
   **/
  @ApiModelProperty(value = "ID of the menu")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A friendly name for the menu
   **/
  @ApiModelProperty(value = "A friendly name for the menu")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuOutputListData menuOutputListData = (MenuOutputListData) o;
    return (this.features == null ? menuOutputListData.features == null : this.features.equals(menuOutputListData.features)) &&
        (this.flags == null ? menuOutputListData.flags == null : this.flags.equals(menuOutputListData.flags)) &&
        (this.id == null ? menuOutputListData.id == null : this.id.equals(menuOutputListData.id)) &&
        (this.name == null ? menuOutputListData.name == null : this.name.equals(menuOutputListData.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.features == null ? 0: this.features.hashCode());
    result = 31 * result + (this.flags == null ? 0: this.flags.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuOutputListData {\n");
    
    sb.append("  features: ").append(features).append("\n");
    sb.append("  flags: ").append(flags).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
