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
public class ModelsModel {
  
  @SerializedName("brand_name")
  private String brandName = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("family_name")
  private String familyName = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("is_active")
  private Boolean isActive = null;
  @SerializedName("model_name")
  private String modelName = null;
  @SerializedName("updated_at")
  private String updatedAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBrandName() {
    return brandName;
  }
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
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
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModelName() {
    return modelName;
  }
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsModel modelsModel = (ModelsModel) o;
    return (this.brandName == null ? modelsModel.brandName == null : this.brandName.equals(modelsModel.brandName)) &&
        (this.createdAt == null ? modelsModel.createdAt == null : this.createdAt.equals(modelsModel.createdAt)) &&
        (this.familyName == null ? modelsModel.familyName == null : this.familyName.equals(modelsModel.familyName)) &&
        (this.id == null ? modelsModel.id == null : this.id.equals(modelsModel.id)) &&
        (this.isActive == null ? modelsModel.isActive == null : this.isActive.equals(modelsModel.isActive)) &&
        (this.modelName == null ? modelsModel.modelName == null : this.modelName.equals(modelsModel.modelName)) &&
        (this.updatedAt == null ? modelsModel.updatedAt == null : this.updatedAt.equals(modelsModel.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.brandName == null ? 0: this.brandName.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.familyName == null ? 0: this.familyName.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.isActive == null ? 0: this.isActive.hashCode());
    result = 31 * result + (this.modelName == null ? 0: this.modelName.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsModel {\n");
    
    sb.append("  brandName: ").append(brandName).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  familyName: ").append(familyName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isActive: ").append(isActive).append("\n");
    sb.append("  modelName: ").append(modelName).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
