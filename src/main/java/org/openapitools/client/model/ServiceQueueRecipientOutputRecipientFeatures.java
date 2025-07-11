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
public class ServiceQueueRecipientOutputRecipientFeatures {
  
  @SerializedName("account_upgrade")
  private String accountUpgrade = null;
  @SerializedName("pro")
  private Boolean pro = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAccountUpgrade() {
    return accountUpgrade;
  }
  public void setAccountUpgrade(String accountUpgrade) {
    this.accountUpgrade = accountUpgrade;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPro() {
    return pro;
  }
  public void setPro(Boolean pro) {
    this.pro = pro;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceQueueRecipientOutputRecipientFeatures serviceQueueRecipientOutputRecipientFeatures = (ServiceQueueRecipientOutputRecipientFeatures) o;
    return (this.accountUpgrade == null ? serviceQueueRecipientOutputRecipientFeatures.accountUpgrade == null : this.accountUpgrade.equals(serviceQueueRecipientOutputRecipientFeatures.accountUpgrade)) &&
        (this.pro == null ? serviceQueueRecipientOutputRecipientFeatures.pro == null : this.pro.equals(serviceQueueRecipientOutputRecipientFeatures.pro));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accountUpgrade == null ? 0: this.accountUpgrade.hashCode());
    result = 31 * result + (this.pro == null ? 0: this.pro.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceQueueRecipientOutputRecipientFeatures {\n");
    
    sb.append("  accountUpgrade: ").append(accountUpgrade).append("\n");
    sb.append("  pro: ").append(pro).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
