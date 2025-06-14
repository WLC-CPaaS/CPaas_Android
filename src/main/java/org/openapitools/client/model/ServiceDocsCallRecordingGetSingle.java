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

import org.openapitools.client.model.ServiceCallRecordingOutput;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceDocsCallRecordingGetSingle {
  
  @SerializedName("data")
  private ServiceCallRecordingOutput data = null;
  @SerializedName("request_id")
  private String requestId = null;
  @SerializedName("status_code")
  private Integer statusCode = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceCallRecordingOutput getData() {
    return data;
  }
  public void setData(ServiceCallRecordingOutput data) {
    this.data = data;
  }

  /**
   * Unique id for each request
   **/
  @ApiModelProperty(value = "Unique id for each request")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * HTTP response status code
   **/
  @ApiModelProperty(value = "HTTP response status code")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDocsCallRecordingGetSingle serviceDocsCallRecordingGetSingle = (ServiceDocsCallRecordingGetSingle) o;
    return (this.data == null ? serviceDocsCallRecordingGetSingle.data == null : this.data.equals(serviceDocsCallRecordingGetSingle.data)) &&
        (this.requestId == null ? serviceDocsCallRecordingGetSingle.requestId == null : this.requestId.equals(serviceDocsCallRecordingGetSingle.requestId)) &&
        (this.statusCode == null ? serviceDocsCallRecordingGetSingle.statusCode == null : this.statusCode.equals(serviceDocsCallRecordingGetSingle.statusCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.requestId == null ? 0: this.requestId.hashCode());
    result = 31 * result + (this.statusCode == null ? 0: this.statusCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDocsCallRecordingGetSingle {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  requestId: ").append(requestId).append("\n");
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
