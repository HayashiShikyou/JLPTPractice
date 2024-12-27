package com.jlptpractice;

import com.jlptpractice.model.Question;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Section1 implements Initializable {

    public Text txtQuestion;
    public ToggleGroup tgAnswer;
    public RadioButton rbAnswer1;
    public RadioButton rbAnswer2;
    public RadioButton rbAnswer3;
    public RadioButton rbAnswer4;
    static Question question;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtQuestion.setText(question.getQ_text());
        rbAnswer1.setText(question.getA_1());
        rbAnswer2.setText(question.getA_2());
        rbAnswer3.setText(question.getA_3());
        rbAnswer4.setText(question.getA_4());
    }

}
