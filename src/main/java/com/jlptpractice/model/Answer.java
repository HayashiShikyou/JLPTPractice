package com.jlptpractice.model;

public class Answer {
    private int q_id;
    private String correct_answer;
    private int exam_section_id;

    public Answer(int q_id, String correct_answer, int exam_section_id) {
        this.q_id = q_id;
        this.correct_answer = correct_answer;
        this.exam_section_id = exam_section_id;
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public int getExam_section_id() {
        return exam_section_id;
    }

    public void setExam_section_id(int exam_section_id) {
        this.exam_section_id = exam_section_id;
    }

    @Override
    public String toString() {
        return "answer{" + "q_id=" + q_id + ", correct_answer='" + correct_answer + '\'' + ", exam_section_id=" + exam_section_id + '}';
    }
}
