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

import java.util.Map;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceMetaflowPattern {
  
  @SerializedName("children")
  private Map<String, ServiceMetaflowPattern> children = null;
  @SerializedName("data")
  private Map<String, OasAnyTypeNotMapped> data = null;
  public enum ModuleEnum {
     transfer,  hold,  record_call, 
  };
  @SerializedName("module")
  private ModuleEnum module = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, ServiceMetaflowPattern> getChildren() {
    return children;
  }
  public void setChildren(Map<String, ServiceMetaflowPattern> children) {
    this.children = children;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getData() {
    return data;
  }
  public void setData(Map<String, OasAnyTypeNotMapped> data) {
    this.data = data;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ModuleEnum getModule() {
    return module;
  }
  public void setModule(ModuleEnum module) {
    this.module = module;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMetaflowPattern serviceMetaflowPattern = (ServiceMetaflowPattern) o;
    return (this.children == null ? serviceMetaflowPattern.children == null : this.children.equals(serviceMetaflowPattern.children)) &&
        (this.data == null ? serviceMetaflowPattern.data == null : this.data.equals(serviceMetaflowPattern.data)) &&
        (this.module == null ? serviceMetaflowPattern.module == null : this.module.equals(serviceMetaflowPattern.module));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.children == null ? 0: this.children.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.module == null ? 0: this.module.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMetaflowPattern {\n");
    
    sb.append("  children: ").append(children).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  module: ").append(module).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
