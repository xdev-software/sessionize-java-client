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
 * QuestionAnswerFull
 */
@JsonPropertyOrder({
  QuestionAnswerFull.JSON_PROPERTY_ID,
  QuestionAnswerFull.JSON_PROPERTY_QUESTION,
  QuestionAnswerFull.JSON_PROPERTY_QUESTION_TYPE,
  QuestionAnswerFull.JSON_PROPERTY_ANSWER,
  QuestionAnswerFull.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuestionAnswerFull {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_QUESTION = "question";
  private String question;

  public static final String JSON_PROPERTY_QUESTION_TYPE = "questionType";
  private String questionType;

  public static final String JSON_PROPERTY_ANSWER = "answer";
  private String answer;

  public static final String JSON_PROPERTY_SORT = "sort";
  private Integer sort;

  public QuestionAnswerFull() {
  }

  public QuestionAnswerFull id(Integer id) {
    
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

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public QuestionAnswerFull question(String question) {
    
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuestion() {
    return question;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestion(String question) {
    this.question = question;
  }


  public QuestionAnswerFull questionType(String questionType) {
    
    this.questionType = questionType;
    return this;
  }

   /**
   * Get questionType
   * @return questionType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuestionType() {
    return questionType;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestionType(String questionType) {
    this.questionType = questionType;
  }


  public QuestionAnswerFull answer(String answer) {
    
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAnswer() {
    return answer;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public QuestionAnswerFull sort(Integer sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSort(Integer sort) {
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
    QuestionAnswerFull questionAnswerFull = (QuestionAnswerFull) o;
    return Objects.equals(this.id, questionAnswerFull.id) &&
        Objects.equals(this.question, questionAnswerFull.question) &&
        Objects.equals(this.questionType, questionAnswerFull.questionType) &&
        Objects.equals(this.answer, questionAnswerFull.answer) &&
        Objects.equals(this.sort, questionAnswerFull.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, questionType, answer, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionAnswerFull {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

    // add `answer` to the URL query string
    if (getAnswer() != null) {
      try {
        joiner.add(String.format("%sanswer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAnswer()), "UTF-8").replaceAll("\\+", "%20")));
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

