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
import java.util.List;
import software.xdev.sessionize.model.SessionMinimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SpeakerAllOf
 */
@JsonPropertyOrder({
  SpeakerAllOf.JSON_PROPERTY_SESSIONS
})
@JsonTypeName("Speaker_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpeakerAllOf {
  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<SessionMinimal> sessions = new ArrayList<>();

  public SpeakerAllOf() {
  }

  public SpeakerAllOf sessions(List<SessionMinimal> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public SpeakerAllOf addSessionsItem(SessionMinimal sessionsItem) {
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SessionMinimal> getSessions() {
    return sessions;
  }


  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessions(List<SessionMinimal> sessions) {
    this.sessions = sessions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeakerAllOf speakerAllOf = (SpeakerAllOf) o;
    return Objects.equals(this.sessions, speakerAllOf.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeakerAllOf {\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

    // add `sessions` to the URL query string
    if (getSessions() != null) {
      for (int i = 0; i < getSessions().size(); i++) {
        if (getSessions().get(i) != null) {
          joiner.add(getSessions().get(i).toUrlQueryString(String.format("%ssessions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

