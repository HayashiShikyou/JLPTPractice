package com.jlptpractice.controller;

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

}