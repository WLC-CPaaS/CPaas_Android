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
public class CPAASError {
  
  @SerializedName("error_code")
  private Integer errorCode = null;
  @SerializedName("errors")
  private List<Object> errors = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("status_code")
  private Integer statusCode = null;

  /**
   * Error Code
   **/
  @ApiModelProperty(value = "Error Code")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Error details
   **/
  @ApiModelProperty(value = "Error details")
  public List<Object> getErrors() {
    return errors;
  }
  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }

  /**
   * Error Message
   **/
  @ApiModelProperty(value = "Error Message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
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
    CPAASError cPAASError = (CPAASError) o;
    return (this.errorCode == null ? cPAASError.errorCode == null : this.errorCode.equals(cPAASError.errorCode)) &&
        (this.errors == null ? cPAASError.errors == null : this.errors.equals(cPAASError.errors)) &&
        (this.message == null ? cPAASError.message == null : this.message.equals(cPAASError.message)) &&
        (this.statusCode == null ? cPAASError.statusCode == null : this.statusCode.equals(cPAASError.statusCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.errorCode == null ? 0: this.errorCode.hashCode());
    result = 31 * result + (this.errors == null ? 0: this.errors.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.statusCode == null ? 0: this.statusCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CPAASError {\n");
    
    sb.append("  errorCode: ").append(errorCode).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
