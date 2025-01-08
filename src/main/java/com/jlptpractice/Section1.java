package com.jlptpractice;

import com.jlptpractice.model.QuestionAnswer;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Section1 implements Initializable {

    public Text txtType;
    public Text txtQuestion;
    public ToggleGroup tgAnswer;
    public RadioButton rbAnswer1;
    public RadioButton rbAnswer2;
    public RadioButton rbAnswer3;
    public RadioButton rbAnswer4;
    static QuestionAnswer questionAnswer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (QuestionRootCtrl.preTypeId != QuestionRootCtrl.typeId) {
            txtType.setText("問題 " + QuestionRootCtrl.typeNo + " " + questionAnswer.getType());
            QuestionRootCtrl.preTypeId = QuestionRootCtrl.typeId;
            QuestionRootCtrl.typeNo++;
        }
        txtQuestion.setText(questionAnswer.getQuestion());
        rbAnswer1.setText(questionAnswer.getAnswer1());
        rbAnswer2.setText(questionAnswer.getAnswer2());
        rbAnswer3.setText(questionAnswer.getAnswer3());
        rbAnswer4.setText(questionAnswer.getAnswer4());
    }

}
