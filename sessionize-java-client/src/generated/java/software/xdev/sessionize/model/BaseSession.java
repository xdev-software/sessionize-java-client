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
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * BaseSession
 */
@JsonPropertyOrder({
  BaseSession.JSON_PROPERTY_ID,
  BaseSession.JSON_PROPERTY_TITLE,
  BaseSession.JSON_PROPERTY_DESCRIPTION,
  BaseSession.JSON_PROPERTY_STARTS_AT,
  BaseSession.JSON_PROPERTY_ENDS_AT,
  BaseSession.JSON_PROPERTY_IS_SERVICE_SESSION,
  BaseSession.JSON_PROPERTY_IS_PLENUM_SESSION,
  BaseSession.JSON_PROPERTY_CATEGORY_ITEMS,
  BaseSession.JSON_PROPERTY_ROOM_ID,
  BaseSession.JSON_PROPERTY_LIVE_URL,
  BaseSession.JSON_PROPERTY_RECORDING_URL,
  BaseSession.JSON_PROPERTY_STATUS
})
public class BaseSession {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

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

  public BaseSession() {
  }

  public BaseSession id(String id) {
    
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


  public BaseSession title(String title) {
    
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


  public BaseSession description(String description) {
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


  public BaseSession startsAt(OffsetDateTime startsAt) {
    
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


  public BaseSession endsAt(OffsetDateTime endsAt) {
    
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


  public BaseSession isServiceSession(Boolean isServiceSession) {
    
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


  public BaseSession isPlenumSession(Boolean isPlenumSession) {
    
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


  public BaseSession categoryItems(List<Integer> categoryItems) {
    
    this.categoryItems = categoryItems;
    return this;
  }

  public BaseSession addCategoryItemsItem(Integer categoryItemsItem) {
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


  public BaseSession roomId(Integer roomId) {
    
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


  public BaseSession liveUrl(URI liveUrl) {
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


  public BaseSession recordingUrl(URI recordingUrl) {
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


  public BaseSession status(Status status) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSession baseSession = (BaseSession) o;
    return Objects.equals(this.id, baseSession.id) &&
        Objects.equals(this.title, baseSession.title) &&
        equalsNullable(this.description, baseSession.description) &&
        Objects.equals(this.startsAt, baseSession.startsAt) &&
        Objects.equals(this.endsAt, baseSession.endsAt) &&
        Objects.equals(this.isServiceSession, baseSession.isServiceSession) &&
        Objects.equals(this.isPlenumSession, baseSession.isPlenumSession) &&
        Objects.equals(this.categoryItems, baseSession.categoryItems) &&
        Objects.equals(this.roomId, baseSession.roomId) &&
        equalsNullable(this.liveUrl, baseSession.liveUrl) &&
        equalsNullable(this.recordingUrl, baseSession.recordingUrl) &&
        Objects.equals(this.status, baseSession.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, hashCodeNullable(description), startsAt, endsAt, isServiceSession, isPlenumSession, categoryItems, roomId, hashCodeNullable(liveUrl), hashCodeNullable(recordingUrl), status);
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
    sb.append("class BaseSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    return joiner.toString();
  }

}

