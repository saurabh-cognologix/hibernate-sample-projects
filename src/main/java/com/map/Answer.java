package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    @Column(name="answer_id")
    private Integer answerId;
    private String answer;

    public Answer() {
    }

    public Answer(Integer answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
