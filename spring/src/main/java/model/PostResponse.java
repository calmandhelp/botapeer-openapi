package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-19T02:29:48.695909Z[Etc/UTC]")
public class PostResponse {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("plantRecordId")
  private Integer plantRecordId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("article")
  private String article;

  @JsonProperty("image_url")
  private String imageUrl;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("created_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public PostResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PostResponse plantRecordId(Integer plantRecordId) {
    this.plantRecordId = plantRecordId;
    return this;
  }

  /**
   * Get plantRecordId
   * @return plantRecordId
  */
  
  @Schema(name = "plantRecordId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getPlantRecordId() {
    return plantRecordId;
  }

  public void setPlantRecordId(Integer plantRecordId) {
    this.plantRecordId = plantRecordId;
  }

  public PostResponse title(String title) {
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

  public PostResponse article(String article) {
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

  public PostResponse imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "image_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PostResponse status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PostResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PostResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
    PostResponse postResponse = (PostResponse) o;
    return Objects.equals(this.id, postResponse.id) &&
        Objects.equals(this.plantRecordId, postResponse.plantRecordId) &&
        Objects.equals(this.title, postResponse.title) &&
        Objects.equals(this.article, postResponse.article) &&
        Objects.equals(this.imageUrl, postResponse.imageUrl) &&
        Objects.equals(this.status, postResponse.status) &&
        Objects.equals(this.createdAt, postResponse.createdAt) &&
        Objects.equals(this.updatedAt, postResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plantRecordId, title, article, imageUrl, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plantRecordId: ").append(toIndentedString(plantRecordId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

