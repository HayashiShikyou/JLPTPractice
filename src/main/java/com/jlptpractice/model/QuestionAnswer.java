package com.jlptpractice.model;

import java.sql.Blob;

public class QuestionAnswer {

    private int qaId;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private Blob picture;

    public QuestionAnswer(int qaId, String question, String answer1, String answer2, String answer3, String answer4, Blob picture) {
        this.qaId = qaId;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.picture = picture;
    }

    public int getQaId() {
        return qaId;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public Blob getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "AnswerModel{" + "qaId=" + qaId + ", question='" + question + '\'' + ", answer1='" + answer1 + '\'' + ", answer2='" + answer2 + '\'' + ", answer3='" + answer3 + '\'' + ", answer4='" + answer4 + '\'' + ", picture=" + picture + '}';
    }
}
