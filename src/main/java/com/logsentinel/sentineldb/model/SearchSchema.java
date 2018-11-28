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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SearchSchema
 */

public class SearchSchema {
  @JsonProperty("analyzedFields")
  private List<String> analyzedFields = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

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

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("indexFields")
  private List<String> indexFields = null;

  @JsonProperty("recordType")
  private String recordType = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  public SearchSchema analyzedFields(List<String> analyzedFields) {
    this.analyzedFields = analyzedFields;
    return this;
  }

  public SearchSchema addAnalyzedFieldsItem(String analyzedFieldsItem) {
    if (this.analyzedFields == null) {
      this.analyzedFields = new ArrayList<>();
    }
    this.analyzedFields.add(analyzedFieldsItem);
    return this;
  }

   /**
   * Get analyzedFields
   * @return analyzedFields
  **/
  @ApiModelProperty(value = "")
  public List<String> getAnalyzedFields() {
    return analyzedFields;
  }

  public void setAnalyzedFields(List<String> analyzedFields) {
    this.analyzedFields = analyzedFields;
  }

  public SearchSchema created(OffsetDateTime created) {
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

  public SearchSchema indexFields(List<String> indexFields) {
    this.indexFields = indexFields;
    return this;
  }

  public SearchSchema addIndexFieldsItem(String indexFieldsItem) {
    if (this.indexFields == null) {
      this.indexFields = new ArrayList<>();
    }
    this.indexFields.add(indexFieldsItem);
    return this;
  }

   /**
   * Get indexFields
   * @return indexFields
  **/
  @ApiModelProperty(value = "")
  public List<String> getIndexFields() {
    return indexFields;
  }

  public void setIndexFields(List<String> indexFields) {
    this.indexFields = indexFields;
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

  public SearchSchema updated(OffsetDateTime updated) {
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
    SearchSchema searchSchema = (SearchSchema) o;
    return Objects.equals(this.analyzedFields, searchSchema.analyzedFields) &&
        Objects.equals(this.created, searchSchema.created) &&
        Objects.equals(this.datastoreId, searchSchema.datastoreId) &&
        Objects.equals(this.entityType, searchSchema.entityType) &&
        Objects.equals(this.id, searchSchema.id) &&
        Objects.equals(this.indexFields, searchSchema.indexFields) &&
        Objects.equals(this.recordType, searchSchema.recordType) &&
        Objects.equals(this.updated, searchSchema.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzedFields, created, datastoreId, entityType, id, indexFields, recordType, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSchema {\n");
    
    sb.append("    analyzedFields: ").append(toIndentedString(analyzedFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexFields: ").append(toIndentedString(indexFields)).append("\n");
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

