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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * MessageTemplate
 */

public class MessageTemplate {
  @JsonProperty("content")
  private String content = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("pseudoId")
  private String pseudoId = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  public MessageTemplate content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessageTemplate created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public MessageTemplate deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public MessageTemplate id(UUID id) {
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

  public MessageTemplate name(String name) {
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

  public MessageTemplate organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  public MessageTemplate pseudoId(String pseudoId) {
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

  public MessageTemplate updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplate messageTemplate = (MessageTemplate) o;
    return Objects.equals(this.content, messageTemplate.content) &&
        Objects.equals(this.created, messageTemplate.created) &&
        Objects.equals(this.deleted, messageTemplate.deleted) &&
        Objects.equals(this.id, messageTemplate.id) &&
        Objects.equals(this.name, messageTemplate.name) &&
        Objects.equals(this.organizationId, messageTemplate.organizationId) &&
        Objects.equals(this.pseudoId, messageTemplate.pseudoId) &&
        Objects.equals(this.updated, messageTemplate.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, created, deleted, id, name, organizationId, pseudoId, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplate {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    pseudoId: ").append(toIndentedString(pseudoId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

