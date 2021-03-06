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

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Record
 */

public class Record implements Serializable {
  @JsonProperty("binary")
  private Boolean binary = null;

  @JsonProperty("body")
  @JsonRawValue
  private String body = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("datastoreId")
  private UUID datastoreId = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("ownerId")
  private UUID ownerId = null;

  @JsonProperty("pseudoId")
  private String pseudoId = null;

  @JsonProperty("pseudoOwnerId")
  private String pseudoOwnerId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("updated")
  private LocalDateTime updated = null;

  @JsonProperty("version")
  private Integer version = null;

  public Record binary(Boolean binary) {
    this.binary = binary;
    return this;
  }

   /**
   * Get binary
   * @return binary
  **/
  @ApiModelProperty(value = "")
  public Boolean isBinary() {
    return binary;
  }

  public void setBinary(Boolean binary) {
    this.binary = binary;
  }

  public Record body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Record created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public Record datastoreId(UUID datastoreId) {
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

  public Record id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Record ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  public Record pseudoId(String pseudoId) {
    this.pseudoId = pseudoId;
    return this;
  }

   /**
   * Get pseudoId
   * @return pseudoId
  **/
  @ApiModelProperty(value = "")
  public String getPseudoId() {
    return pseudoId;
  }

  public void setPseudoId(String pseudoId) {
    this.pseudoId = pseudoId;
  }

  public Record pseudoOwnerId(String pseudoOwnerId) {
    this.pseudoOwnerId = pseudoOwnerId;
    return this;
  }

   /**
   * Get pseudoOwnerId
   * @return pseudoOwnerId
  **/
  @ApiModelProperty(value = "")
  public String getPseudoOwnerId() {
    return pseudoOwnerId;
  }

  public void setPseudoOwnerId(String pseudoOwnerId) {
    this.pseudoOwnerId = pseudoOwnerId;
  }

  public Record type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Record updated(LocalDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public Record version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Record record = (Record) o;
    return Objects.equals(this.binary, record.binary) &&
        Objects.equals(this.body, record.body) &&
        Objects.equals(this.created, record.created) &&
        Objects.equals(this.datastoreId, record.datastoreId) &&
        Objects.equals(this.id, record.id) &&
        Objects.equals(this.ownerId, record.ownerId) &&
        Objects.equals(this.pseudoId, record.pseudoId) &&
        Objects.equals(this.pseudoOwnerId, record.pseudoOwnerId) &&
        Objects.equals(this.type, record.type) &&
        Objects.equals(this.updated, record.updated) &&
        Objects.equals(this.version, record.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binary, body, created, datastoreId, id, ownerId, pseudoId, pseudoOwnerId, type, updated, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Record {\n");
    
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    pseudoId: ").append(toIndentedString(pseudoId)).append("\n");
    sb.append("    pseudoOwnerId: ").append(toIndentedString(pseudoOwnerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

