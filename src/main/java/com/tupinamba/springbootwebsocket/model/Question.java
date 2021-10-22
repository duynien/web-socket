package com.tupinamba.springbootwebsocket.model;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name_question;

  @ManyToOne
  @JoinColumn(name = "question_code")
  private CodeQuestion codeQuestion;

  public Question() {}

  public Question(int id, String name_question, CodeQuestion codeQuestion) {
    this.id = id;
    this.name_question = name_question;
    this.codeQuestion = codeQuestion;
  }

  public Question(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName_question() {
    return name_question;
  }

  public void setName_question(String name_question) {
    this.name_question = name_question;
  }

  public CodeQuestion getCodeQuestion() {
    return codeQuestion;
  }

  public void setCodeQuestion(CodeQuestion codeQuestion) {
    this.codeQuestion = codeQuestion;
  }
}
