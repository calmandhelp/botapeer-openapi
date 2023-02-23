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
 * LikeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-23T12:58:42.929602Z[Etc/UTC]")
public class LikeResponse {

  @JsonProperty("count")
  private Long count;

  @JsonProperty("isLikeWithRequestUser")
  private Boolean isLikeWithRequestUser;

  public LikeResponse count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public LikeResponse isLikeWithRequestUser(Boolean isLikeWithRequestUser) {
    this.isLikeWithRequestUser = isLikeWithRequestUser;
    return this;
  }

  /**
   * Get isLikeWithRequestUser
   * @return isLikeWithRequestUser
  */
  
  @Schema(name = "isLikeWithRequestUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsLikeWithRequestUser() {
    return isLikeWithRequestUser;
  }

  public void setIsLikeWithRequestUser(Boolean isLikeWithRequestUser) {
    this.isLikeWithRequestUser = isLikeWithRequestUser;
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
    return Objects.equals(this.count, likeResponse.count) &&
        Objects.equals(this.isLikeWithRequestUser, likeResponse.isLikeWithRequestUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, isLikeWithRequestUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LikeResponse {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    isLikeWithRequestUser: ").append(toIndentedString(isLikeWithRequestUser)).append("\n");
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

