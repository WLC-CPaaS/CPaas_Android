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
import org.openapitools.client.model.ModelsCallRecordingSettings;
import org.openapitools.client.model.ModelsVOIPSharedDoNotDisturb;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceUserOutputShort {
  
  @SerializedName("call_recording")
  private ModelsCallRecordingSettings callRecording = null;
  @SerializedName("do_not_disturb")
  private ModelsVOIPSharedDoNotDisturb doNotDisturb = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("enabled")
  private Boolean enabled = null;
  @SerializedName("features")
  private List<String> features = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("flags")
  private List<String> flags = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("presence_id")
  private String presenceId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsCallRecordingSettings getCallRecording() {
    return callRecording;
  }
  public void setCallRecording(ModelsCallRecordingSettings callRecording) {
    this.callRecording = callRecording;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsVOIPSharedDoNotDisturb getDoNotDisturb() {
    return doNotDisturb;
  }
  public void setDoNotDisturb(ModelsVOIPSharedDoNotDisturb doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getFeatures() {
    return features;
  }
  public void setFeatures(List<String> features) {
    this.features = features;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getFlags() {
    return flags;
  }
  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

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
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPresenceId() {
    return presenceId;
  }
  public void setPresenceId(String presenceId) {
    this.presenceId = presenceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUserOutputShort serviceUserOutputShort = (ServiceUserOutputShort) o;
    return (this.callRecording == null ? serviceUserOutputShort.callRecording == null : this.callRecording.equals(serviceUserOutputShort.callRecording)) &&
        (this.doNotDisturb == null ? serviceUserOutputShort.doNotDisturb == null : this.doNotDisturb.equals(serviceUserOutputShort.doNotDisturb)) &&
        (this.email == null ? serviceUserOutputShort.email == null : this.email.equals(serviceUserOutputShort.email)) &&
        (this.enabled == null ? serviceUserOutputShort.enabled == null : this.enabled.equals(serviceUserOutputShort.enabled)) &&
        (this.features == null ? serviceUserOutputShort.features == null : this.features.equals(serviceUserOutputShort.features)) &&
        (this.firstName == null ? serviceUserOutputShort.firstName == null : this.firstName.equals(serviceUserOutputShort.firstName)) &&
        (this.flags == null ? serviceUserOutputShort.flags == null : this.flags.equals(serviceUserOutputShort.flags)) &&
        (this.id == null ? serviceUserOutputShort.id == null : this.id.equals(serviceUserOutputShort.id)) &&
        (this.lastName == null ? serviceUserOutputShort.lastName == null : this.lastName.equals(serviceUserOutputShort.lastName)) &&
        (this.presenceId == null ? serviceUserOutputShort.presenceId == null : this.presenceId.equals(serviceUserOutputShort.presenceId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.callRecording == null ? 0: this.callRecording.hashCode());
    result = 31 * result + (this.doNotDisturb == null ? 0: this.doNotDisturb.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.enabled == null ? 0: this.enabled.hashCode());
    result = 31 * result + (this.features == null ? 0: this.features.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.flags == null ? 0: this.flags.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.presenceId == null ? 0: this.presenceId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUserOutputShort {\n");
    
    sb.append("  callRecording: ").append(callRecording).append("\n");
    sb.append("  doNotDisturb: ").append(doNotDisturb).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  features: ").append(features).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  flags: ").append(flags).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  presenceId: ").append(presenceId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
