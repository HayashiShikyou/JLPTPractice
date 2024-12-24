package com.jlptpractice.model;

public class Question {
    private int q_id;
    private String q_text;
    private String a_1;
    private String a_2;
    private String a_3;
    private String a_4;
    private int exam_section_id;
    private int test_id;

    public Question(int q_id, String q_text, String a_1, String a_2, String a_3, String a_4, int exam_section_id, int test_id) {
        this.q_id = q_id;
        this.q_text = q_text;
        this.a_1 = a_1;
        this.a_2 = a_2;
        this.a_3 = a_3;
        this.a_4 = a_4;
        this.exam_section_id = exam_section_id;
        this.test_id = test_id;
    }

    public Question(String q_text, String a_1, String a_2, String a_3, String a_4) {
        this.q_text = q_text;
        this.a_1 = a_1;
        this.a_2 = a_2;
        this.a_3 = a_3;
        this.a_4 = a_4;
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQ_text() {
        return q_text;
    }

    public void setQ_text(String q_text) {
        this.q_text = q_text;
    }

    public String getA_1() {
        return a_1;
    }

    public void setA_1(String a_1) {
        this.a_1 = a_1;
    }

    public String getA_2() {
        return a_2;
    }

    public void setA_2(String a_2) {
        this.a_2 = a_2;
    }

    public String getA_3() {
        return a_3;
    }

    public void setA_3(String a_3) {
        this.a_3 = a_3;
    }

    public String getA_4() {
        return a_4;
    }

    public void setA_4(String a_4) {
        this.a_4 = a_4;
    }

    public int getExam_section_id() {
        return exam_section_id;
    }

    public void setExam_section_id(int exam_section_id) {
        this.exam_section_id = exam_section_id;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    @Override
    public String toString() {
        return "question{" + "q_id=" + q_id + ", q_text='" + q_text + '\'' + ", a_1='" + a_1 + '\'' + ", a_2='" + a_2 + '\'' + ", a_3='" + a_3 + '\'' + ", a_4='" + a_4 + '\'' + ", exam_section_id=" + exam_section_id + ", test_id=" + test_id + '}';
    }
}
