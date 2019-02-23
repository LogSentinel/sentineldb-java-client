/*
 * SentinelDB RESTful API
 * Read more at https://logsentinel.com/sentineldb/documentation/
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.sentineldb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SearchSchemaField
 */

public class SearchSchemaField {
  @JsonProperty("analyzed")
  private Boolean analyzed = null;

  @JsonProperty("indexed")
  private Boolean indexed = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets visibilityLevel
   */
  public enum VisibilityLevelEnum {
    PUBLIC("PUBLIC"),
    
    PROTECTED("PROTECTED"),
    
    PRIVATE("PRIVATE"),
    
    SYSTEM("SYSTEM");

    private String value;

    VisibilityLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityLevelEnum fromValue(String text) {
      for (VisibilityLevelEnum b : VisibilityLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("visibilityLevel")
  private VisibilityLevelEnum visibilityLevel = null;

  public SearchSchemaField analyzed(Boolean analyzed) {
    this.analyzed = analyzed;
    return this;
  }

   /**
   * Get analyzed
   * @return analyzed
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnalyzed() {
    return analyzed;
  }

  public void setAnalyzed(Boolean analyzed) {
    this.analyzed = analyzed;
  }

  public SearchSchemaField indexed(Boolean indexed) {
    this.indexed = indexed;
    return this;
  }

   /**
   * Get indexed
   * @return indexed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIndexed() {
    return indexed;
  }

  public void setIndexed(Boolean indexed) {
    this.indexed = indexed;
  }

  public SearchSchemaField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SearchSchemaField visibilityLevel(VisibilityLevelEnum visibilityLevel) {
    this.visibilityLevel = visibilityLevel;
    return this;
  }

   /**
   * Get visibilityLevel
   * @return visibilityLevel
  **/
  @ApiModelProperty(value = "")
  public VisibilityLevelEnum getVisibilityLevel() {
    return visibilityLevel;
  }

  public void setVisibilityLevel(VisibilityLevelEnum visibilityLevel) {
    this.visibilityLevel = visibilityLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSchemaField searchSchemaField = (SearchSchemaField) o;
    return Objects.equals(this.analyzed, searchSchemaField.analyzed) &&
        Objects.equals(this.indexed, searchSchemaField.indexed) &&
        Objects.equals(this.name, searchSchemaField.name) &&
        Objects.equals(this.visibilityLevel, searchSchemaField.visibilityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzed, indexed, name, visibilityLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSchemaField {\n");
    
    sb.append("    analyzed: ").append(toIndentedString(analyzed)).append("\n");
    sb.append("    indexed: ").append(toIndentedString(indexed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
