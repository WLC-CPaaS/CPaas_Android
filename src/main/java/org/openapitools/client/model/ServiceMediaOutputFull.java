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

import org.openapitools.client.model.ServiceTTS;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceMediaOutputFull {
  
  @SerializedName("content_length")
  private Integer contentLength = null;
  @SerializedName("content_type")
  private String contentType = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("language")
  private String language = null;
  @SerializedName("media_source")
  private String mediaSource = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("streamable")
  private Boolean streamable = null;
  @SerializedName("tts")
  private ServiceTTS tts = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getContentLength() {
    return contentLength;
  }
  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMediaSource() {
    return mediaSource;
  }
  public void setMediaSource(String mediaSource) {
    this.mediaSource = mediaSource;
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
  public Boolean getStreamable() {
    return streamable;
  }
  public void setStreamable(Boolean streamable) {
    this.streamable = streamable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceTTS getTts() {
    return tts;
  }
  public void setTts(ServiceTTS tts) {
    this.tts = tts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMediaOutputFull serviceMediaOutputFull = (ServiceMediaOutputFull) o;
    return (this.contentLength == null ? serviceMediaOutputFull.contentLength == null : this.contentLength.equals(serviceMediaOutputFull.contentLength)) &&
        (this.contentType == null ? serviceMediaOutputFull.contentType == null : this.contentType.equals(serviceMediaOutputFull.contentType)) &&
        (this.description == null ? serviceMediaOutputFull.description == null : this.description.equals(serviceMediaOutputFull.description)) &&
        (this.id == null ? serviceMediaOutputFull.id == null : this.id.equals(serviceMediaOutputFull.id)) &&
        (this.language == null ? serviceMediaOutputFull.language == null : this.language.equals(serviceMediaOutputFull.language)) &&
        (this.mediaSource == null ? serviceMediaOutputFull.mediaSource == null : this.mediaSource.equals(serviceMediaOutputFull.mediaSource)) &&
        (this.name == null ? serviceMediaOutputFull.name == null : this.name.equals(serviceMediaOutputFull.name)) &&
        (this.streamable == null ? serviceMediaOutputFull.streamable == null : this.streamable.equals(serviceMediaOutputFull.streamable)) &&
        (this.tts == null ? serviceMediaOutputFull.tts == null : this.tts.equals(serviceMediaOutputFull.tts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.contentLength == null ? 0: this.contentLength.hashCode());
    result = 31 * result + (this.contentType == null ? 0: this.contentType.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    result = 31 * result + (this.mediaSource == null ? 0: this.mediaSource.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.streamable == null ? 0: this.streamable.hashCode());
    result = 31 * result + (this.tts == null ? 0: this.tts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMediaOutputFull {\n");
    
    sb.append("  contentLength: ").append(contentLength).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  mediaSource: ").append(mediaSource).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  streamable: ").append(streamable).append("\n");
    sb.append("  tts: ").append(tts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
