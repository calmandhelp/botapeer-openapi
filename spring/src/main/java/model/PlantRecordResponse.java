package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import model.PlaceResponse;
import model.PostResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlantRecordResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-23T12:58:42.929602Z[Etc/UTC]")
public class PlantRecordResponse {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("alive")
  private Integer alive;

  @JsonProperty("endDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @JsonProperty("place")
  private PlaceResponse place;

  @JsonProperty("posts")
  @Valid
  private List<PostResponse> posts = null;

  public PlantRecordResponse id(Long id) {
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

  public PlantRecordResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PlantRecordResponse alive(Integer alive) {
    this.alive = alive;
    return this;
  }

  /**
   * Get alive
   * @return alive
  */
  
  @Schema(name = "alive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getAlive() {
    return alive;
  }

  public void setAlive(Integer alive) {
    this.alive = alive;
  }

  public PlantRecordResponse endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public PlantRecordResponse createdAt(OffsetDateTime createdAt) {
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

  public PlantRecordResponse updatedAt(OffsetDateTime updatedAt) {
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

  public PlantRecordResponse place(PlaceResponse place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  */
  @Valid 
  @Schema(name = "place", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PlaceResponse getPlace() {
    return place;
  }

  public void setPlace(PlaceResponse place) {
    this.place = place;
  }

  public PlantRecordResponse posts(List<PostResponse> posts) {
    this.posts = posts;
    return this;
  }

  public PlantRecordResponse addPostsItem(PostResponse postsItem) {
    if (this.posts == null) {
      this.posts = new ArrayList<>();
    }
    this.posts.add(postsItem);
    return this;
  }

  /**
   * Get posts
   * @return posts
  */
  @Valid 
  @Schema(name = "posts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PostResponse> getPosts() {
    return posts;
  }

  public void setPosts(List<PostResponse> posts) {
    this.posts = posts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlantRecordResponse plantRecordResponse = (PlantRecordResponse) o;
    return Objects.equals(this.id, plantRecordResponse.id) &&
        Objects.equals(this.title, plantRecordResponse.title) &&
        Objects.equals(this.alive, plantRecordResponse.alive) &&
        Objects.equals(this.endDate, plantRecordResponse.endDate) &&
        Objects.equals(this.createdAt, plantRecordResponse.createdAt) &&
        Objects.equals(this.updatedAt, plantRecordResponse.updatedAt) &&
        Objects.equals(this.place, plantRecordResponse.place) &&
        Objects.equals(this.posts, plantRecordResponse.posts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, alive, endDate, createdAt, updatedAt, place, posts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlantRecordResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
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

