/*
 * SentinelDB RESTful API
 * Read more at https://docs.sentineldb.io
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * BatchDecryptRequest
 */

public class BatchDecryptRequest {
  @JsonProperty("ciphertext")
  private String ciphertext = null;

  @JsonProperty("datastoreId")
  private UUID datastoreId = null;

  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("entityType")
  private String entityType = null;

  public BatchDecryptRequest ciphertext(String ciphertext) {
    this.ciphertext = ciphertext;
    return this;
  }

   /**
   * Get ciphertext
   * @return ciphertext
  **/
  @ApiModelProperty(value = "")
  public String getCiphertext() {
    return ciphertext;
  }

  public void setCiphertext(String ciphertext) {
    this.ciphertext = ciphertext;
  }

  public BatchDecryptRequest datastoreId(UUID datastoreId) {
    this.datastoreId = datastoreId;
    return this;
  }

   /**
   * Get datastoreId
   * @return datastoreId
  **/
  @ApiModelProperty(value = "")
  public UUID getDatastoreId() {
    return datastoreId;
  }

  public void setDatastoreId(UUID datastoreId) {
    this.datastoreId = datastoreId;
  }

  public BatchDecryptRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(value = "")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public BatchDecryptRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDecryptRequest batchDecryptRequest = (BatchDecryptRequest) o;
    return Objects.equals(this.ciphertext, batchDecryptRequest.ciphertext) &&
        Objects.equals(this.datastoreId, batchDecryptRequest.datastoreId) &&
        Objects.equals(this.entityId, batchDecryptRequest.entityId) &&
        Objects.equals(this.entityType, batchDecryptRequest.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciphertext, datastoreId, entityId, entityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDecryptRequest {\n");
    
    sb.append("    ciphertext: ").append(toIndentedString(ciphertext)).append("\n");
    sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
