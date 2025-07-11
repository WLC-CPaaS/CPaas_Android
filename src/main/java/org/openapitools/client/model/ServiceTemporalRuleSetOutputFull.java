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
public class ServiceTemporalRuleSetOutputFull {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("temporal_rules")
  private List<String> temporalRules = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTemporalRules() {
    return temporalRules;
  }
  public void setTemporalRules(List<String> temporalRules) {
    this.temporalRules = temporalRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTemporalRuleSetOutputFull serviceTemporalRuleSetOutputFull = (ServiceTemporalRuleSetOutputFull) o;
    return (this.id == null ? serviceTemporalRuleSetOutputFull.id == null : this.id.equals(serviceTemporalRuleSetOutputFull.id)) &&
        (this.name == null ? serviceTemporalRuleSetOutputFull.name == null : this.name.equals(serviceTemporalRuleSetOutputFull.name)) &&
        (this.temporalRules == null ? serviceTemporalRuleSetOutputFull.temporalRules == null : this.temporalRules.equals(serviceTemporalRuleSetOutputFull.temporalRules));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.temporalRules == null ? 0: this.temporalRules.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTemporalRuleSetOutputFull {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  temporalRules: ").append(temporalRules).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
