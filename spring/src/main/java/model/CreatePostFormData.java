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
 * CreatePostFormData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-23T06:13:38.992719Z[Etc/UTC]")
public class CreatePostFormData {

  @JsonProperty("title")
  private String title;

  @JsonProperty("article")
  private String article;

  public CreatePostFormData title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreatePostFormData article(String article) {
    this.article = article;
    return this;
  }

  /**
   * Get article
   * @return article
  */
  @NotNull @Size(min = 1, max = 10000) 
  @Schema(name = "article", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getArticle() {
    return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostFormData createPostFormData = (CreatePostFormData) o;
    return Objects.equals(this.title, createPostFormData.title) &&
        Objects.equals(this.article, createPostFormData.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, article);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostFormData {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

