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

import org.openapitools.client.model.ServiceQueueRecipientOutputFullFeatures;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceQueueRecipientOutputFullRecipient {
  
  @SerializedName("features")
  private ServiceQueueRecipientOutputFullFeatures features = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceQueueRecipientOutputFullFeatures getFeatures() {
    return features;
  }
  public void setFeatures(ServiceQueueRecipientOutputFullFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceQueueRecipientOutputFullRecipient serviceQueueRecipientOutputFullRecipient = (ServiceQueueRecipientOutputFullRecipient) o;
    return (this.features == null ? serviceQueueRecipientOutputFullRecipient.features == null : this.features.equals(serviceQueueRecipientOutputFullRecipient.features));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.features == null ? 0: this.features.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceQueueRecipientOutputFullRecipient {\n");
    
    sb.append("  features: ").append(features).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
