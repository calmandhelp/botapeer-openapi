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
 * LikeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T07:46:44.548866Z[Etc/UTC]")
public class LikeResponse {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("postId")
  private Integer postId;

  @JsonProperty("commentId")
  private String commentId;

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public LikeResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LikeResponse userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public LikeResponse postId(Integer postId) {
    this.postId = postId;
    return this;
  }

  /**
   * Get postId
   * @return postId
  */
  
  @Schema(name = "postId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getPostId() {
    return postId;
  }

  public void setPostId(Integer postId) {
    this.postId = postId;
  }

  public LikeResponse commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   * @return commentId
  */
  
  @Schema(name = "commentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public LikeResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LikeResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    LikeResponse likeResponse = (LikeResponse) o;
    return Objects.equals(this.id, likeResponse.id) &&
        Objects.equals(this.userId, likeResponse.userId) &&
        Objects.equals(this.postId, likeResponse.postId) &&
        Objects.equals(this.commentId, likeResponse.commentId) &&
        Objects.equals(this.createdAt, likeResponse.createdAt) &&
        Objects.equals(this.updatedAt, likeResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, postId, commentId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LikeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
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

