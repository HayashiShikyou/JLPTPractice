package com.jlptpractice;

import com.jlptpractice.database.TestingDB;
import com.jlptpractice.model.Question;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Section1 implements Initializable {

    public Text question;
    public ToggleGroup answer;
    public RadioButton answer1;
    public RadioButton answer2;
    public RadioButton answer3;
    public RadioButton answer4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        Question q = TestingDB.selectQuestionTable();
//        question.setText(q.getQ_text());
//        answer1.setText(q.getA_1());
//        answer2.setText(q.getA_2());
//        answer3.setText(q.getA_3());
//        answer4.setText(q.getA_4());
    }
}
