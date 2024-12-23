package com.jlptpractice.model;

public class ExamSection {
    private int exam_section_id;
    private String section_name;

    public ExamSection(int exam_section_id, String section_name) {
        this.exam_section_id = exam_section_id;
        this.section_name = section_name;
    }

    public int getExam_section_id() {
        return exam_section_id;
    }

    public void setExam_section_id(int exam_section_id) {
        this.exam_section_id = exam_section_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    @Override
    public String toString() {
        return "examsection{" + "exam_section_id=" + exam_section_id + ", section_name='" + section_name + '\'' + '}';
    }
}
