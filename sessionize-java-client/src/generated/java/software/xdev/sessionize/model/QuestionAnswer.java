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
 * QuestionAnswer
 */
@JsonPropertyOrder({
  QuestionAnswer.JSON_PROPERTY_QUESTION_ID,
  QuestionAnswer.JSON_PROPERTY_ANSWER_VALUE
})
public class QuestionAnswer {
  public static final String JSON_PROPERTY_QUESTION_ID = "questionId";
  private Integer questionId;

  public static final String JSON_PROPERTY_ANSWER_VALUE = "answerValue";
  private String answerValue;

  public QuestionAnswer() {
  }

  public QuestionAnswer questionId(Integer questionId) {
    
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuestionId() {
    return questionId;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestionId(Integer questionId) {
    this.questionId = questionId;
  }

  public QuestionAnswer answerValue(String answerValue) {
    
    this.answerValue = answerValue;
    return this;
  }

  /**
   * Get answerValue
   * @return answerValue
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANSWER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAnswerValue() {
    return answerValue;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnswerValue(String answerValue) {
    this.answerValue = answerValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionAnswer questionAnswer = (QuestionAnswer) o;
    return Objects.equals(this.questionId, questionAnswer.questionId) &&
        Objects.equals(this.answerValue, questionAnswer.answerValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, answerValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionAnswer {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    answerValue: ").append(toIndentedString(answerValue)).append("\n");
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

    // add `questionId` to the URL query string
    if (getQuestionId() != null) {
      try {
        joiner.add(String.format("%squestionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuestionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `answerValue` to the URL query string
    if (getAnswerValue() != null) {
      try {
        joiner.add(String.format("%sanswerValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAnswerValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

