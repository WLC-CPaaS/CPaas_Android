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

import org.openapitools.client.model.ModelsCallForward;
import org.openapitools.client.model.ModelsCallRecordingSettings;
import org.openapitools.client.model.ModelsMusicOnHold;
import org.openapitools.client.model.ModelsUserOutputFullCallerid;
import org.openapitools.client.model.ModelsVOIPSharedDoNotDisturb;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceVOIPUserAdd2 {
  
  @SerializedName("call_forward")
  private ModelsCallForward callForward = null;
  @SerializedName("call_recording")
  private ModelsCallRecordingSettings callRecording = null;
  @SerializedName("caller_id")
  private ModelsUserOutputFullCallerid callerId = null;
  @SerializedName("do_not_disturb")
  private ModelsVOIPSharedDoNotDisturb doNotDisturb = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("enabled")
  private Boolean enabled = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("music_on_hold")
  private ModelsMusicOnHold musicOnHold = null;
  @SerializedName("presence_id")
  private String presenceId = null;
  @SerializedName("timezone")
  private String timezone = null;
  @SerializedName("verified")
  private Boolean verified = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsCallForward getCallForward() {
    return callForward;
  }
  public void setCallForward(ModelsCallForward callForward) {
    this.callForward = callForward;
  }

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
  public ModelsUserOutputFullCallerid getCallerId() {
    return callerId;
  }
  public void setCallerId(ModelsUserOutputFullCallerid callerId) {
    this.callerId = callerId;
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelsMusicOnHold getMusicOnHold() {
    return musicOnHold;
  }
  public void setMusicOnHold(ModelsMusicOnHold musicOnHold) {
    this.musicOnHold = musicOnHold;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVOIPUserAdd2 serviceVOIPUserAdd2 = (ServiceVOIPUserAdd2) o;
    return (this.callForward == null ? serviceVOIPUserAdd2.callForward == null : this.callForward.equals(serviceVOIPUserAdd2.callForward)) &&
        (this.callRecording == null ? serviceVOIPUserAdd2.callRecording == null : this.callRecording.equals(serviceVOIPUserAdd2.callRecording)) &&
        (this.callerId == null ? serviceVOIPUserAdd2.callerId == null : this.callerId.equals(serviceVOIPUserAdd2.callerId)) &&
        (this.doNotDisturb == null ? serviceVOIPUserAdd2.doNotDisturb == null : this.doNotDisturb.equals(serviceVOIPUserAdd2.doNotDisturb)) &&
        (this.email == null ? serviceVOIPUserAdd2.email == null : this.email.equals(serviceVOIPUserAdd2.email)) &&
        (this.enabled == null ? serviceVOIPUserAdd2.enabled == null : this.enabled.equals(serviceVOIPUserAdd2.enabled)) &&
        (this.firstName == null ? serviceVOIPUserAdd2.firstName == null : this.firstName.equals(serviceVOIPUserAdd2.firstName)) &&
        (this.lastName == null ? serviceVOIPUserAdd2.lastName == null : this.lastName.equals(serviceVOIPUserAdd2.lastName)) &&
        (this.musicOnHold == null ? serviceVOIPUserAdd2.musicOnHold == null : this.musicOnHold.equals(serviceVOIPUserAdd2.musicOnHold)) &&
        (this.presenceId == null ? serviceVOIPUserAdd2.presenceId == null : this.presenceId.equals(serviceVOIPUserAdd2.presenceId)) &&
        (this.timezone == null ? serviceVOIPUserAdd2.timezone == null : this.timezone.equals(serviceVOIPUserAdd2.timezone)) &&
        (this.verified == null ? serviceVOIPUserAdd2.verified == null : this.verified.equals(serviceVOIPUserAdd2.verified));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.callForward == null ? 0: this.callForward.hashCode());
    result = 31 * result + (this.callRecording == null ? 0: this.callRecording.hashCode());
    result = 31 * result + (this.callerId == null ? 0: this.callerId.hashCode());
    result = 31 * result + (this.doNotDisturb == null ? 0: this.doNotDisturb.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.enabled == null ? 0: this.enabled.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.musicOnHold == null ? 0: this.musicOnHold.hashCode());
    result = 31 * result + (this.presenceId == null ? 0: this.presenceId.hashCode());
    result = 31 * result + (this.timezone == null ? 0: this.timezone.hashCode());
    result = 31 * result + (this.verified == null ? 0: this.verified.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVOIPUserAdd2 {\n");
    
    sb.append("  callForward: ").append(callForward).append("\n");
    sb.append("  callRecording: ").append(callRecording).append("\n");
    sb.append("  callerId: ").append(callerId).append("\n");
    sb.append("  doNotDisturb: ").append(doNotDisturb).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  musicOnHold: ").append(musicOnHold).append("\n");
    sb.append("  presenceId: ").append(presenceId).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  verified: ").append(verified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
