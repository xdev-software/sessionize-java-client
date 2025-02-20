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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Question
 */
@JsonPropertyOrder({
  Question.JSON_PROPERTY_ID,
  Question.JSON_PROPERTY_QUESTION,
  Question.JSON_PROPERTY_QUESTION_TYPE,
  Question.JSON_PROPERTY_SORT
})
public class Question {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nonnull
  private Integer id;

  public static final String JSON_PROPERTY_QUESTION = "question";
  @jakarta.annotation.Nonnull
  private String question;

  public static final String JSON_PROPERTY_QUESTION_TYPE = "questionType";
  @jakarta.annotation.Nonnull
  private String questionType;

  public static final String JSON_PROPERTY_SORT = "sort";
  @jakarta.annotation.Nonnull
  private Integer sort;

  public Question() {
  }

  public Question id(@jakarta.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@jakarta.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public Question question(@jakarta.annotation.Nonnull String question) {
    
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuestion() {
    return question;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestion(@jakarta.annotation.Nonnull String question) {
    this.question = question;
  }

  public Question questionType(@jakarta.annotation.Nonnull String questionType) {
    
    this.questionType = questionType;
    return this;
  }

  /**
   * Get questionType
   * @return questionType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuestionType() {
    return questionType;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestionType(@jakarta.annotation.Nonnull String questionType) {
    this.questionType = questionType;
  }

  public Question sort(@jakarta.annotation.Nonnull Integer sort) {
    
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSort(@jakarta.annotation.Nonnull Integer sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.id, question.id) &&
        Objects.equals(this.question, question.question) &&
        Objects.equals(this.questionType, question.questionType) &&
        Objects.equals(this.sort, question.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, questionType, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

    // add `question` to the URL query string
    if (getQuestion() != null) {
      try {
        joiner.add(String.format("%squestion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuestion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `questionType` to the URL query string
    if (getQuestionType() != null) {
      try {
        joiner.add(String.format("%squestionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuestionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sort` to the URL query string
    if (getSort() != null) {
      try {
        joiner.add(String.format("%ssort%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

