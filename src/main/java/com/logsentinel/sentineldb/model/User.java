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
import com.fasterxml.jackson.annotation.JsonRawValue;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * User
 */

public class User {
  @JsonProperty("attributes")
  @JsonRawValue
  private String attributes = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("datastoreId")
  private UUID datastoreId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("pseudoId")
  private String pseudoId = null;

  @JsonProperty("roles")
  private List<String> roles = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("twoFactorAuthEnabled")
  private Boolean twoFactorAuthEnabled = null;

  @JsonProperty("updated")
  private LocalDateTime updated = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("version")
  private Integer version = null;

  public User attributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }

  public User created(LocalDateTime created) {
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

  public User datastoreId(UUID datastoreId) {
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

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User id(UUID id) {
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

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User pseudoId(String pseudoId) {
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

  public User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public User status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public User twoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
    this.twoFactorAuthEnabled = twoFactorAuthEnabled;
    return this;
  }

   /**
   * Get twoFactorAuthEnabled
   * @return twoFactorAuthEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isTwoFactorAuthEnabled() {
    return twoFactorAuthEnabled;
  }

  public void setTwoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
    this.twoFactorAuthEnabled = twoFactorAuthEnabled;
  }

  public User updated(LocalDateTime updated) {
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

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User version(Integer version) {
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
    User user = (User) o;
    return Objects.equals(this.attributes, user.attributes) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.datastoreId, user.datastoreId) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.pseudoId, user.pseudoId) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.twoFactorAuthEnabled, user.twoFactorAuthEnabled) &&
        Objects.equals(this.updated, user.updated) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.version, user.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, created, datastoreId, email, id, password, pseudoId, roles, status, twoFactorAuthEnabled, updated, username, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pseudoId: ").append(toIndentedString(pseudoId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    twoFactorAuthEnabled: ").append(toIndentedString(twoFactorAuthEnabled)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

