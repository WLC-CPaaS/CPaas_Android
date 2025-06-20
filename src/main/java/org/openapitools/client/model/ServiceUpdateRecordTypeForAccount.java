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
public class ServiceUpdateRecordTypeForAccount {
  
  @SerializedName("record_type")
  private String recordType = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRecordType() {
    return recordType;
  }
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUpdateRecordTypeForAccount serviceUpdateRecordTypeForAccount = (ServiceUpdateRecordTypeForAccount) o;
    return (this.recordType == null ? serviceUpdateRecordTypeForAccount.recordType == null : this.recordType.equals(serviceUpdateRecordTypeForAccount.recordType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.recordType == null ? 0: this.recordType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUpdateRecordTypeForAccount {\n");
    
    sb.append("  recordType: ").append(recordType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
