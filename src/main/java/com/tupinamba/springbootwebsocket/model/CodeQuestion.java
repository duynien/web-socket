package com.tupinamba.springbootwebsocket.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "code_ques")
public class CodeQuestion {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String code_ques;
  private Topic topic;
  private String create_at;
  private String create_by;
  private String expire_time;

  @OneToMany(mappedBy = "codeQuestion")
  private List<Question> questionList;

  public CodeQuestion() {
  }

  public CodeQuestion(
      int id,
      String code_ques,
      Topic topic,
      String create_at,
      String create_by,
      String expire_time,
      List<Question> questionList) {
    this.id = id;
    this.code_ques = code_ques;
    this.topic = topic;
    this.create_at = create_at;
    this.create_by = create_by;
    this.expire_time = expire_time;
    this.questionList = questionList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCode_ques() {
    return code_ques;
  }

  public void setCode_ques(String code_ques) {
    this.code_ques = code_ques;
  }

  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }

  public String getCreate_at() {
    return create_at;
  }

  public void setCreate_at(String create_at) {
    this.create_at = create_at;
  }

  public String getCreate_by() {
    return create_by;
  }

  public void setCreate_by(String create_by) {
    this.create_by = create_by;
  }

  public String getExpire_time() {
    return expire_time;
  }

  public void setExpire_time(String expire_time) {
    this.expire_time = expire_time;
  }

  public List<Question> getQuestionList() {
    return questionList;
  }

  public void setQuestionList(List<Question> questionList) {
    this.questionList = questionList;
  }

  @Override
  public String toString() {
    return "CodeQuestion{"
        + "id="
        + id
        + ", code_ques='"
        + code_ques
        + '\''
        + ", topic="
        + topic
        + ", create_at='"
        + create_at
        + '\''
        + ", create_by='"
        + create_by
        + '\''
        + ", expire_time='"
        + expire_time
        + '\''
        + ", questionList="
        + questionList
        + '}';
  }
}
