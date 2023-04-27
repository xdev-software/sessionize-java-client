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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import software.xdev.sessionize.model.QuestionAnswer;
import software.xdev.sessionize.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SessionAll
 */
@JsonPropertyOrder({
  SessionAll.JSON_PROPERTY_TITLE,
  SessionAll.JSON_PROPERTY_DESCRIPTION,
  SessionAll.JSON_PROPERTY_STARTS_AT,
  SessionAll.JSON_PROPERTY_ENDS_AT,
  SessionAll.JSON_PROPERTY_IS_SERVICE_SESSION,
  SessionAll.JSON_PROPERTY_IS_PLENUM_SESSION,
  SessionAll.JSON_PROPERTY_CATEGORY_ITEMS,
  SessionAll.JSON_PROPERTY_ROOM_ID,
  SessionAll.JSON_PROPERTY_LIVE_URL,
  SessionAll.JSON_PROPERTY_RECORDING_URL,
  SessionAll.JSON_PROPERTY_STATUS,
  SessionAll.JSON_PROPERTY_ID,
  SessionAll.JSON_PROPERTY_SPEAKERS,
  SessionAll.JSON_PROPERTY_QUESTION_ANSWERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-26T17:30:53.867882+02:00[Europe/Berlin]")
public class SessionAll {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STARTS_AT = "startsAt";
  private OffsetDateTime startsAt;

  public static final String JSON_PROPERTY_ENDS_AT = "endsAt";
  private OffsetDateTime endsAt;

  public static final String JSON_PROPERTY_IS_SERVICE_SESSION = "isServiceSession";
  private Boolean isServiceSession;

  public static final String JSON_PROPERTY_IS_PLENUM_SESSION = "isPlenumSession";
  private Boolean isPlenumSession;

  public static final String JSON_PROPERTY_CATEGORY_ITEMS = "categoryItems";
  private List<Integer> categoryItems = new ArrayList<>();

  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  private Integer roomId;

  public static final String JSON_PROPERTY_LIVE_URL = "liveUrl";
  private JsonNullable<URI> liveUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_RECORDING_URL = "recordingUrl";
  private JsonNullable<URI> recordingUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPEAKERS = "speakers";
  private List<String> speakers = new ArrayList<>();

  public static final String JSON_PROPERTY_QUESTION_ANSWERS = "questionAnswers";
  private List<QuestionAnswer> questionAnswers = new ArrayList<>();

  public SessionAll() {
  }

  public SessionAll title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public SessionAll description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public SessionAll startsAt(OffsetDateTime startsAt) {
    
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Get startsAt
   * @return startsAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartsAt() {
    return startsAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }


  public SessionAll endsAt(OffsetDateTime endsAt) {
    
    this.endsAt = endsAt;
    return this;
  }

   /**
   * Get endsAt
   * @return endsAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEndsAt() {
    return endsAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }


  public SessionAll isServiceSession(Boolean isServiceSession) {
    
    this.isServiceSession = isServiceSession;
    return this;
  }

   /**
   * Get isServiceSession
   * @return isServiceSession
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_SERVICE_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsServiceSession() {
    return isServiceSession;
  }


  @JsonProperty(JSON_PROPERTY_IS_SERVICE_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsServiceSession(Boolean isServiceSession) {
    this.isServiceSession = isServiceSession;
  }


  public SessionAll isPlenumSession(Boolean isPlenumSession) {
    
    this.isPlenumSession = isPlenumSession;
    return this;
  }

   /**
   * Get isPlenumSession
   * @return isPlenumSession
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PLENUM_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPlenumSession() {
    return isPlenumSession;
  }


  @JsonProperty(JSON_PROPERTY_IS_PLENUM_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPlenumSession(Boolean isPlenumSession) {
    this.isPlenumSession = isPlenumSession;
  }


  public SessionAll categoryItems(List<Integer> categoryItems) {
    
    this.categoryItems = categoryItems;
    return this;
  }

  public SessionAll addCategoryItemsItem(Integer categoryItemsItem) {
    if (this.categoryItems == null) {
      this.categoryItems = new ArrayList<>();
    }
    this.categoryItems.add(categoryItemsItem);
    return this;
  }

   /**
   * Get categoryItems
   * @return categoryItems
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Integer> getCategoryItems() {
    return categoryItems;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategoryItems(List<Integer> categoryItems) {
    this.categoryItems = categoryItems;
  }


  public SessionAll roomId(Integer roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }


  public SessionAll liveUrl(URI liveUrl) {
    this.liveUrl = JsonNullable.<URI>of(liveUrl);
    
    return this;
  }

   /**
   * Get liveUrl
   * @return liveUrl
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public URI getLiveUrl() {
        return liveUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIVE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getLiveUrl_JsonNullable() {
    return liveUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_LIVE_URL)
  public void setLiveUrl_JsonNullable(JsonNullable<URI> liveUrl) {
    this.liveUrl = liveUrl;
  }

  public void setLiveUrl(URI liveUrl) {
    this.liveUrl = JsonNullable.<URI>of(liveUrl);
  }


  public SessionAll recordingUrl(URI recordingUrl) {
    this.recordingUrl = JsonNullable.<URI>of(recordingUrl);
    
    return this;
  }

   /**
   * Get recordingUrl
   * @return recordingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public URI getRecordingUrl() {
        return recordingUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECORDING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getRecordingUrl_JsonNullable() {
    return recordingUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_RECORDING_URL)
  public void setRecordingUrl_JsonNullable(JsonNullable<URI> recordingUrl) {
    this.recordingUrl = recordingUrl;
  }

  public void setRecordingUrl(URI recordingUrl) {
    this.recordingUrl = JsonNullable.<URI>of(recordingUrl);
  }


  public SessionAll status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Status status) {
    this.status = status;
  }


  public SessionAll id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public SessionAll speakers(List<String> speakers) {
    
    this.speakers = speakers;
    return this;
  }

  public SessionAll addSpeakersItem(String speakersItem) {
    if (this.speakers == null) {
      this.speakers = new ArrayList<>();
    }
    this.speakers.add(speakersItem);
    return this;
  }

   /**
   * Get speakers
   * @return speakers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SPEAKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSpeakers() {
    return speakers;
  }


  @JsonProperty(JSON_PROPERTY_SPEAKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpeakers(List<String> speakers) {
    this.speakers = speakers;
  }


  public SessionAll questionAnswers(List<QuestionAnswer> questionAnswers) {
    
    this.questionAnswers = questionAnswers;
    return this;
  }

  public SessionAll addQuestionAnswersItem(QuestionAnswer questionAnswersItem) {
    if (this.questionAnswers == null) {
      this.questionAnswers = new ArrayList<>();
    }
    this.questionAnswers.add(questionAnswersItem);
    return this;
  }

   /**
   * Get questionAnswers
   * @return questionAnswers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<QuestionAnswer> getQuestionAnswers() {
    return questionAnswers;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestionAnswers(List<QuestionAnswer> questionAnswers) {
    this.questionAnswers = questionAnswers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionAll sessionAll = (SessionAll) o;
    return Objects.equals(this.title, sessionAll.title) &&
        equalsNullable(this.description, sessionAll.description) &&
        Objects.equals(this.startsAt, sessionAll.startsAt) &&
        Objects.equals(this.endsAt, sessionAll.endsAt) &&
        Objects.equals(this.isServiceSession, sessionAll.isServiceSession) &&
        Objects.equals(this.isPlenumSession, sessionAll.isPlenumSession) &&
        Objects.equals(this.categoryItems, sessionAll.categoryItems) &&
        Objects.equals(this.roomId, sessionAll.roomId) &&
        equalsNullable(this.liveUrl, sessionAll.liveUrl) &&
        equalsNullable(this.recordingUrl, sessionAll.recordingUrl) &&
        Objects.equals(this.status, sessionAll.status) &&
        Objects.equals(this.id, sessionAll.id) &&
        Objects.equals(this.speakers, sessionAll.speakers) &&
        Objects.equals(this.questionAnswers, sessionAll.questionAnswers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, hashCodeNullable(description), startsAt, endsAt, isServiceSession, isPlenumSession, categoryItems, roomId, hashCodeNullable(liveUrl), hashCodeNullable(recordingUrl), status, id, speakers, questionAnswers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionAll {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    isServiceSession: ").append(toIndentedString(isServiceSession)).append("\n");
    sb.append("    isPlenumSession: ").append(toIndentedString(isPlenumSession)).append("\n");
    sb.append("    categoryItems: ").append(toIndentedString(categoryItems)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    liveUrl: ").append(toIndentedString(liveUrl)).append("\n");
    sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    speakers: ").append(toIndentedString(speakers)).append("\n");
    sb.append("    questionAnswers: ").append(toIndentedString(questionAnswers)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startsAt` to the URL query string
    if (getStartsAt() != null) {
      try {
        joiner.add(String.format("%sstartsAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartsAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endsAt` to the URL query string
    if (getEndsAt() != null) {
      try {
        joiner.add(String.format("%sendsAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndsAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isServiceSession` to the URL query string
    if (getIsServiceSession() != null) {
      try {
        joiner.add(String.format("%sisServiceSession%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsServiceSession()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isPlenumSession` to the URL query string
    if (getIsPlenumSession() != null) {
      try {
        joiner.add(String.format("%sisPlenumSession%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPlenumSession()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `categoryItems` to the URL query string
    if (getCategoryItems() != null) {
      for (int i = 0; i < getCategoryItems().size(); i++) {
        try {
          joiner.add(String.format("%scategoryItems%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCategoryItems().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `liveUrl` to the URL query string
    if (getLiveUrl() != null) {
      try {
        joiner.add(String.format("%sliveUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLiveUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recordingUrl` to the URL query string
    if (getRecordingUrl() != null) {
      try {
        joiner.add(String.format("%srecordingUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecordingUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `speakers` to the URL query string
    if (getSpeakers() != null) {
      for (int i = 0; i < getSpeakers().size(); i++) {
        try {
          joiner.add(String.format("%sspeakers%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getSpeakers().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `questionAnswers` to the URL query string
    if (getQuestionAnswers() != null) {
      for (int i = 0; i < getQuestionAnswers().size(); i++) {
        if (getQuestionAnswers().get(i) != null) {
          joiner.add(getQuestionAnswers().get(i).toUrlQueryString(String.format("%squestionAnswers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

