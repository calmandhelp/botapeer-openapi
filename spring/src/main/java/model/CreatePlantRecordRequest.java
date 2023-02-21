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
 * CreatePlantRecordRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-21T10:14:43.845601Z[Etc/UTC]")
public class CreatePlantRecordRequest {

  @JsonProperty("title")
  private String title;

  @JsonProperty("placeId")
  private Long placeId;

  public CreatePlantRecordRequest title(String title) {
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

  public CreatePlantRecordRequest placeId(Long placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * Get placeId
   * @return placeId
  */
  
  @Schema(name = "placeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getPlaceId() {
    return placeId;
  }

  public void setPlaceId(Long placeId) {
    this.placeId = placeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlantRecordRequest createPlantRecordRequest = (CreatePlantRecordRequest) o;
    return Objects.equals(this.title, createPlantRecordRequest.title) &&
        Objects.equals(this.placeId, createPlantRecordRequest.placeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, placeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlantRecordRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
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

