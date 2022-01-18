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
 * Artist
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-18T11:26:47.365079+05:30[Asia/Kolkata]")
public class Artist   {
  @JsonProperty("artist_name")
  private String artistName;

  @JsonProperty("artist_genre")
  private String artistGenre;

  @JsonProperty("albums_recorded")
  private Integer albumsRecorded;

  @JsonProperty("username")
  private String username;

  public Artist artistName(String artistName) {
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

  public Artist artistGenre(String artistGenre) {
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

  public Artist albumsRecorded(Integer albumsRecorded) {
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

  public Artist username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artist artist = (Artist) o;
    return Objects.equals(this.artistName, artist.artistName) &&
        Objects.equals(this.artistGenre, artist.artistGenre) &&
        Objects.equals(this.albumsRecorded, artist.albumsRecorded) &&
        Objects.equals(this.username, artist.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistName, artistGenre, albumsRecorded, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artist {\n");
    
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    artistGenre: ").append(toIndentedString(artistGenre)).append("\n");
    sb.append("    albumsRecorded: ").append(toIndentedString(albumsRecorded)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

