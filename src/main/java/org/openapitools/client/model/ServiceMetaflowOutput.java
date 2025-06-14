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
import org.openapitools.client.model.ServiceMetaflowPattern;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceMetaflowOutput {
  
  @SerializedName("binding_digit")
  private String bindingDigit = null;
  @SerializedName("numbers")
  private Map<String, ServiceMetaflowPattern> numbers = null;
  @SerializedName("patterns")
  private Map<String, ServiceMetaflowPattern> patterns = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBindingDigit() {
    return bindingDigit;
  }
  public void setBindingDigit(String bindingDigit) {
    this.bindingDigit = bindingDigit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, ServiceMetaflowPattern> getNumbers() {
    return numbers;
  }
  public void setNumbers(Map<String, ServiceMetaflowPattern> numbers) {
    this.numbers = numbers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, ServiceMetaflowPattern> getPatterns() {
    return patterns;
  }
  public void setPatterns(Map<String, ServiceMetaflowPattern> patterns) {
    this.patterns = patterns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMetaflowOutput serviceMetaflowOutput = (ServiceMetaflowOutput) o;
    return (this.bindingDigit == null ? serviceMetaflowOutput.bindingDigit == null : this.bindingDigit.equals(serviceMetaflowOutput.bindingDigit)) &&
        (this.numbers == null ? serviceMetaflowOutput.numbers == null : this.numbers.equals(serviceMetaflowOutput.numbers)) &&
        (this.patterns == null ? serviceMetaflowOutput.patterns == null : this.patterns.equals(serviceMetaflowOutput.patterns));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bindingDigit == null ? 0: this.bindingDigit.hashCode());
    result = 31 * result + (this.numbers == null ? 0: this.numbers.hashCode());
    result = 31 * result + (this.patterns == null ? 0: this.patterns.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMetaflowOutput {\n");
    
    sb.append("  bindingDigit: ").append(bindingDigit).append("\n");
    sb.append("  numbers: ").append(numbers).append("\n");
    sb.append("  patterns: ").append(patterns).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
