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

import org.openapitools.client.model.ServiceStoragePlanDatabase;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceStoragePlan {
  
  @SerializedName("account")
  private ServiceStoragePlanDatabase account = null;
  @SerializedName("aggregate")
  private ServiceStoragePlanDatabase aggregate = null;
  @SerializedName("modb")
  private ServiceStoragePlanDatabase modb = null;
  @SerializedName("system")
  private ServiceStoragePlanDatabase system = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceStoragePlanDatabase getAccount() {
    return account;
  }
  public void setAccount(ServiceStoragePlanDatabase account) {
    this.account = account;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceStoragePlanDatabase getAggregate() {
    return aggregate;
  }
  public void setAggregate(ServiceStoragePlanDatabase aggregate) {
    this.aggregate = aggregate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceStoragePlanDatabase getModb() {
    return modb;
  }
  public void setModb(ServiceStoragePlanDatabase modb) {
    this.modb = modb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceStoragePlanDatabase getSystem() {
    return system;
  }
  public void setSystem(ServiceStoragePlanDatabase system) {
    this.system = system;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStoragePlan serviceStoragePlan = (ServiceStoragePlan) o;
    return (this.account == null ? serviceStoragePlan.account == null : this.account.equals(serviceStoragePlan.account)) &&
        (this.aggregate == null ? serviceStoragePlan.aggregate == null : this.aggregate.equals(serviceStoragePlan.aggregate)) &&
        (this.modb == null ? serviceStoragePlan.modb == null : this.modb.equals(serviceStoragePlan.modb)) &&
        (this.system == null ? serviceStoragePlan.system == null : this.system.equals(serviceStoragePlan.system));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.account == null ? 0: this.account.hashCode());
    result = 31 * result + (this.aggregate == null ? 0: this.aggregate.hashCode());
    result = 31 * result + (this.modb == null ? 0: this.modb.hashCode());
    result = 31 * result + (this.system == null ? 0: this.system.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStoragePlan {\n");
    
    sb.append("  account: ").append(account).append("\n");
    sb.append("  aggregate: ").append(aggregate).append("\n");
    sb.append("  modb: ").append(modb).append("\n");
    sb.append("  system: ").append(system).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
