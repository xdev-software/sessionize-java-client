/*
 * Sessionize JSON-REST API
 * Sessionize JSON-REST API documentation by XDEV Software
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.xdev.sessionize.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import software.xdev.sessionize.model.Session;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SessionGroup
 */
@JsonPropertyOrder({
  SessionGroup.JSON_PROPERTY_GROUP_ID,
  SessionGroup.JSON_PROPERTY_GROUP_NAME,
  SessionGroup.JSON_PROPERTY_SESSIONS,
  SessionGroup.JSON_PROPERTY_IS_DEFAULT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SessionGroup {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private Integer groupId;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<Session> sessions;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public SessionGroup() {
  }

  public SessionGroup groupId(Integer groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public SessionGroup groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public SessionGroup sessions(List<Session> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public SessionGroup addSessionsItem(Session sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Session> getSessions() {
    return sessions;
  }


  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessions(List<Session> sessions) {
    this.sessions = sessions;
  }


  public SessionGroup isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionGroup sessionGroup = (SessionGroup) o;
    return Objects.equals(this.groupId, sessionGroup.groupId) &&
        Objects.equals(this.groupName, sessionGroup.groupName) &&
        Objects.equals(this.sessions, sessionGroup.sessions) &&
        Objects.equals(this.isDefault, sessionGroup.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, sessions, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionGroup {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `groupId` to the URL query string
    if (getGroupId() != null) {
      try {
        joiner.add(String.format("%sgroupId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `groupName` to the URL query string
    if (getGroupName() != null) {
      try {
        joiner.add(String.format("%sgroupName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sessions` to the URL query string
    if (getSessions() != null) {
      for (int i = 0; i < getSessions().size(); i++) {
        if (getSessions().get(i) != null) {
          joiner.add(getSessions().get(i).toUrlQueryString(String.format("%ssessions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      try {
        joiner.add(String.format("%sisDefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefault()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

