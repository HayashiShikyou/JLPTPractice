package com.jlptpractice;

import com.jlptpractice.model.QuestionAnswer;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
            txtType.setText("問題 " + QuestionRootCtrl.qr.typeNo + " " + questionAnswer.getType());
            QuestionRootCtrl.preTypeId = QuestionRootCtrl.typeId;
            QuestionRootCtrl.qr.typeNo++;
        }
        txtQuestion.setText(QuestionRootCtrl.qr.questionNo + ") " + questionAnswer.getQuestion());
        rbAnswer1.setText(questionAnswer.getAnswer1());
        rbAnswer2.setText(questionAnswer.getAnswer2());
        rbAnswer3.setText(questionAnswer.getAnswer3());
        rbAnswer4.setText(questionAnswer.getAnswer4());
        QuestionRootCtrl.qr.questionNo++;


        List<String> lkl = new ArrayList<>();
        lkl.add(questionAnswer.getAnswer1());
        lkl.add(questionAnswer.getAnswer2());
        lkl.add(questionAnswer.getAnswer3());
        lkl.add(questionAnswer.getAnswer4());

        rbAnswer1.setOnAction(e -> System.out.println(questionAnswer.getAnswer1()));
        rbAnswer2.setOnAction(e -> System.out.println(rbAnswer2.getText()));
        rbAnswer3.setOnAction(e -> System.out.println(rbAnswer3.getText()));
        rbAnswer4.setOnAction(e -> System.out.println(rbAnswer4.getText()));
    }

}
