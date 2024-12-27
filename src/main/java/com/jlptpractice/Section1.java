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
    static Question q;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtQuestion.setText(q.getQ_text());
        rbAnswer1.setText(q.getA_1());
        rbAnswer2.setText(q.getA_2());
        rbAnswer3.setText(q.getA_3());
        rbAnswer4.setText(q.getA_4());
    }

}
