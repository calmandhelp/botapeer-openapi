package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import model.CreatePostFormData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreatePostRequest
 */

@JsonTypeName("createPost_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T07:46:44.548866Z[Etc/UTC]")
public class CreatePostRequest {

  @JsonProperty("formData")
  private CreatePostFormData formData;

  @JsonProperty("image")
  private org.springframework.core.io.Resource image;

  public CreatePostRequest formData(CreatePostFormData formData) {
    this.formData = formData;
    return this;
  }

  /**
   * Get formData
   * @return formData
  */
  @Valid 
  @Schema(name = "formData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CreatePostFormData getFormData() {
    return formData;
  }

  public void setFormData(CreatePostFormData formData) {
    this.formData = formData;
  }

  public CreatePostRequest image(org.springframework.core.io.Resource image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @NotNull @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.REQUIRED)
  public org.springframework.core.io.Resource getImage() {
    return image;
  }

  public void setImage(org.springframework.core.io.Resource image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostRequest createPostRequest = (CreatePostRequest) o;
    return Objects.equals(this.formData, createPostRequest.formData) &&
        Objects.equals(this.image, createPostRequest.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formData, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostRequest {\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

