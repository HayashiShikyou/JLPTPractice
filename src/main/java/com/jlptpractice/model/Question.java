//package com.jlptpractice.model;
//
//import java.sql.Blob;
//
//public class Question {
//
//    private int questionId;
//    private int testId;
//    private int sectionId;
//    private int typeId;
//    private String question;
//    private String answer1;
//    private String answer2;
//    private String answer3;
//    private String answer4;
//    private Blob picture;
//
//    public Question(int questionId, int testId, int sectionId, int typeId, String question, String answer1, String answer2, String answer3, String answer4) {
//        this.questionId = questionId;
//        this.testId = testId;
//        this.sectionId = sectionId;
//        this.typeId = typeId;
//        this.question = question;
//        this.answer1 = answer1;
//        this.answer2 = answer2;
//        this.answer3 = answer3;
//        this.answer4 = answer4;
//    }
//
//    public Question(int questionId, String question, Blob picture) {
//        this.questionId = questionId;
//        this.question = question;
//        this.picture = picture;
//    }
//
//    public Question(String question, String answer1, String answer2, String answer3, String answer4) {
//        this.question = question;
//        this.answer1 = answer1;
//        this.answer2 = answer2;
//        this.answer3 = answer3;
//        this.answer4 = answer4;
//    }
//
//    public int getQuestionId() {
//        return questionId;
//    }
//
//    public void setQuestionId(int questionId) {
//        this.questionId = questionId;
//    }
//
//    public int getTestId() {
//        return testId;
//    }
//
//    public void setTestId(int testId) {
//        this.testId = testId;
//    }
//
//    public int getSectionId() {
//        return sectionId;
//    }
//
//    public void setSectionId(int sectionId) {
//        this.sectionId = sectionId;
//    }
//
//    public int getTypeId() {
//        return typeId;
//    }
//
//    public void setTypeId(int typeId) {
//        this.typeId = typeId;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public String getAnswer1() {
//        return answer1;
//    }
//
//    public void setAnswer1(String answer1) {
//        this.answer1 = answer1;
//    }
//
//    public String getAnswer2() {
//        return answer2;
//    }
//
//    public void setAnswer2(String answer2) {
//        this.answer2 = answer2;
//    }
//
//    public String getAnswer3() {
//        return answer3;
//    }
//
//    public void setAnswer3(String answer3) {
//        this.answer3 = answer3;
//    }
//
//    public String getAnswer4() {
//        return answer4;
//    }
//
//    public void setAnswer4(String answer4) {
//        this.answer4 = answer4;
//    }
//
//    public Blob getPicture() {
//        return picture;
//    }
//
//    public void setPicture(Blob picture) {
//        this.picture = picture;
//    }
//
//}
