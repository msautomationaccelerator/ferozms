package com.amzn.ms.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-18T11:26:47.365079+05:30[Asia/Kolkata]")
public class InlineResponse200   {
  @JsonProperty("artist_name")
  private String artistName;

  @JsonProperty("artist_genre")
  private String artistGenre;

  @JsonProperty("albums_recorded")
  private Integer albumsRecorded;

  public InlineResponse200 artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  /**
   * Get artistName
   * @return artistName
  */
  @ApiModelProperty(value = "")


  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public InlineResponse200 artistGenre(String artistGenre) {
    this.artistGenre = artistGenre;
    return this;
  }

  /**
   * Get artistGenre
   * @return artistGenre
  */
  @ApiModelProperty(value = "")


  public String getArtistGenre() {
    return artistGenre;
  }

  public void setArtistGenre(String artistGenre) {
    this.artistGenre = artistGenre;
  }

  public InlineResponse200 albumsRecorded(Integer albumsRecorded) {
    this.albumsRecorded = albumsRecorded;
    return this;
  }

  /**
   * Get albumsRecorded
   * @return albumsRecorded
  */
  @ApiModelProperty(value = "")


  public Integer getAlbumsRecorded() {
    return albumsRecorded;
  }

  public void setAlbumsRecorded(Integer albumsRecorded) {
    this.albumsRecorded = albumsRecorded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.artistName, inlineResponse200.artistName) &&
        Objects.equals(this.artistGenre, inlineResponse200.artistGenre) &&
        Objects.equals(this.albumsRecorded, inlineResponse200.albumsRecorded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistName, artistGenre, albumsRecorded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    artistGenre: ").append(toIndentedString(artistGenre)).append("\n");
    sb.append("    albumsRecorded: ").append(toIndentedString(albumsRecorded)).append("\n");
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

