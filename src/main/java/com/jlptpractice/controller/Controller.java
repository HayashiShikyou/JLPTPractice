package com.jlptpractice.controller;

import com.jlptpractice.QuestionRootCtrl;

import static com.jlptpractice.GetStart.changeBG;
import static com.jlptpractice.GetStart.changeScene;

public class Controller {

    public void switchGS() throws Exception {
        changeBG("GetStart.jpg");
        changeScene("GetStart.fxml");
    }

    public void switchLV() throws Exception {
        changeBG("LevelPage.jpg");
        changeScene("LevelPage.fxml");
    }

    public void switchYM() throws Exception {
        changeBG("YearMonth.jpg");
        changeScene("YearMonth.fxml");
    }

    public void switchQA() throws Exception {
        changeScene("QuestionRoot.fxml");
    }

    public void setN5() throws Exception {
        QuestionRootCtrl.lvlId = 5;
        switchYM();
    }

    public void setN4() throws Exception {
        QuestionRootCtrl.lvlId = 4;
        switchYM();
    }

    public void setN3() throws Exception {
        QuestionRootCtrl.lvlId = 3;
        switchYM();
    }

    public void setN2() throws Exception {
        QuestionRootCtrl.lvlId = 2;
        switchYM();
    }

    public void set202007() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202007");
        switchQA();
    }

    public void set202012() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202012");
        switchQA();
    }

    public void set202107() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202107");
        switchQA();
    }

    public void set202112() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202112");
        switchQA();
    }

    public void set202207() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202207");
        switchQA();
    }

    public void set202212() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202212");
        switchQA();
    }

    public void set202307() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202307");
        switchQA();
    }

    public void set202312() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202312");
        switchQA();
    }

    public void set202407() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202407");
        switchQA();
    }

    public void set202412() throws Exception {
        QuestionRootCtrl.testId = Integer.parseInt(QuestionRootCtrl.lvlId + "202412");
        switchQA();
    }

}