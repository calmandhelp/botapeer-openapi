package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-19T12:57:22.758459Z[Etc/UTC]")
public class CreatePostRequest {

  @JsonProperty("title")
  private String title;

  @JsonProperty("article")
  private String article;

  @JsonProperty("imageUrl")
  private String imageUrl;

  public CreatePostRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreatePostRequest article(String article) {
    this.article = article;
    return this;
  }

  /**
   * Get article
   * @return article
  */
  
  @Schema(name = "article", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getArticle() {
    return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  public CreatePostRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
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
    return Objects.equals(this.title, createPostRequest.title) &&
        Objects.equals(this.article, createPostRequest.article) &&
        Objects.equals(this.imageUrl, createPostRequest.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, article, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

