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
import com.logsentinel.sentineldb.model.SearchSchemaField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SearchSchema
 */

public class SearchSchema {
  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("datastoreId")
  private UUID datastoreId = null;

  /**
   * Gets or Sets entityType
   */
  public enum EntityTypeEnum {
    USER("USER"),
    
    RECORD("RECORD");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("entityType")
  private EntityTypeEnum entityType = null;

  @JsonProperty("fields")
  private List<SearchSchemaField> fields = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pseudoId")
  private String pseudoId = null;

  @JsonProperty("recordType")
  private String recordType = null;

  @JsonProperty("updated")
  private LocalDateTime updated = null;

  public SearchSchema created(LocalDateTime created) {
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

  public SearchSchema datastoreId(UUID datastoreId) {
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

  public SearchSchema entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public SearchSchema fields(List<SearchSchemaField> fields) {
    this.fields = fields;
    return this;
  }

  public SearchSchema addFieldsItem(SearchSchemaField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public List<SearchSchemaField> getFields() {
    return fields;
  }

  public void setFields(List<SearchSchemaField> fields) {
    this.fields = fields;
  }

  public SearchSchema id(UUID id) {
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

  public SearchSchema name(String name) {
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

  public SearchSchema pseudoId(String pseudoId) {
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

  public SearchSchema recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(value = "")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public SearchSchema updated(LocalDateTime updated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSchema searchSchema = (SearchSchema) o;
    return Objects.equals(this.created, searchSchema.created) &&
        Objects.equals(this.datastoreId, searchSchema.datastoreId) &&
        Objects.equals(this.entityType, searchSchema.entityType) &&
        Objects.equals(this.fields, searchSchema.fields) &&
        Objects.equals(this.id, searchSchema.id) &&
        Objects.equals(this.name, searchSchema.name) &&
        Objects.equals(this.pseudoId, searchSchema.pseudoId) &&
        Objects.equals(this.recordType, searchSchema.recordType) &&
        Objects.equals(this.updated, searchSchema.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, datastoreId, entityType, fields, id, name, pseudoId, recordType, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSchema {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pseudoId: ").append(toIndentedString(pseudoId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

