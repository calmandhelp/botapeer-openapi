package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-19T13:41:44.166613Z[Etc/UTC]")
public class CreatePostRequest {

  @JsonProperty("formData")
  private CreatePostRequest formData;

  @JsonProperty("imageUrl")
  private org.springframework.core.io.Resource imageUrl;

  public CreatePostRequest formData(CreatePostRequest formData) {
    this.formData = formData;
    return this;
  }

  /**
   * Get formData
   * @return formData
  */
  @Valid 
  @Schema(name = "formData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CreatePostRequest getFormData() {
    return formData;
  }

  public void setFormData(CreatePostRequest formData) {
    this.formData = formData;
  }

  public CreatePostRequest imageUrl(org.springframework.core.io.Resource imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  @NotNull @Valid 
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.REQUIRED)
  public org.springframework.core.io.Resource getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(org.springframework.core.io.Resource imageUrl) {
    this.imageUrl = imageUrl;
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
        Objects.equals(this.imageUrl, createPostRequest.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formData, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostRequest {\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

