package com.jlptpractice.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static com.jlptpractice.GetStart.changeBG;
import static com.jlptpractice.GetStart.changeScene;
import static com.jlptpractice.QuestionRootCtrl.correct;
import static com.jlptpractice.QuestionRootCtrl.total;

public class ResultCtrl implements Initializable {

    public TextField txfSection1;
    public TextField txfSection2;
    public TextField txfSection3;

    public void switchGS() throws Exception {
        changeBG("GetStart.jpg");
        changeScene("GetStart.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String section1 = correct[0] + "/" + total[0];
        txfSection1.setText(section1);
        String section2 = correct[1] + "/" + total[1];
        txfSection2.setText(section2);
        String section3 = correct[2] + "/" + total[2];
        txfSection3.setText(section3);

        for (int i = 0; i < 3; i++) {
            correct[i] = 0;
            total[i] = 0;
        }
    }
}
