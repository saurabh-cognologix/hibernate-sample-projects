package com.map;

import javax.persistence.*;


@Entity
public class Question {
    @Id
    @Column(name="question_id")
    private Integer questionId;
    private String question;
    @OneToOne
    @JoinColumn(name="answer_id")
    private Answer answer;

    public Question() {
    }

    public Question(Integer questionId, String question, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
