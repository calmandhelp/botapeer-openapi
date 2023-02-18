package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import model.UpdateUserFormData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateUserRequest
 */

@JsonTypeName("updateUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-18T07:34:06.370582Z[Etc/UTC]")
public class UpdateUserRequest {

  @JsonProperty("formData")
  private UpdateUserFormData formData;

  @JsonProperty("profileImage")
  private org.springframework.core.io.Resource profileImage;

  @JsonProperty("coverImage")
  private org.springframework.core.io.Resource coverImage;

  public UpdateUserRequest formData(UpdateUserFormData formData) {
    this.formData = formData;
    return this;
  }

  /**
   * Get formData
   * @return formData
  */
  @Valid 
  @Schema(name = "formData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UpdateUserFormData getFormData() {
    return formData;
  }

  public void setFormData(UpdateUserFormData formData) {
    this.formData = formData;
  }

  public UpdateUserRequest profileImage(org.springframework.core.io.Resource profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
  */
  @Valid 
  @Schema(name = "profileImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public org.springframework.core.io.Resource getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(org.springframework.core.io.Resource profileImage) {
    this.profileImage = profileImage;
  }

  public UpdateUserRequest coverImage(org.springframework.core.io.Resource coverImage) {
    this.coverImage = coverImage;
    return this;
  }

  /**
   * Get coverImage
   * @return coverImage
  */
  @Valid 
  @Schema(name = "coverImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public org.springframework.core.io.Resource getCoverImage() {
    return coverImage;
  }

  public void setCoverImage(org.springframework.core.io.Resource coverImage) {
    this.coverImage = coverImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.formData, updateUserRequest.formData) &&
        Objects.equals(this.profileImage, updateUserRequest.profileImage) &&
        Objects.equals(this.coverImage, updateUserRequest.coverImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formData, profileImage, coverImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    coverImage: ").append(toIndentedString(coverImage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

