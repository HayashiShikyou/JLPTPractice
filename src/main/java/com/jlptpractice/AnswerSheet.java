package com.jlptpractice;

public class AnswerSheet {

    private final String correctAns1;
    private final String correctAns2;
    private final String correctAns3;
    private final String correctAns4;

    public AnswerSheet(String correctAns1, String correctAns2, String correctAns3, String correctAns4) {
        this.correctAns1 = correctAns1;
        this.correctAns2 = correctAns2;
        this.correctAns3 = correctAns3;
        this.correctAns4 = correctAns4;
    }

    public String getCorrectAns1() {
        return correctAns1;
    }

    public String getCorrectAns2() {
        return correctAns2;
    }

    public String getCorrectAns3() {
        return correctAns3;
    }

    public String getCorrectAns4() {
        return correctAns4;
    }

}
