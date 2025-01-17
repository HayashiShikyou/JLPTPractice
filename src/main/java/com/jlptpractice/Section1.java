package com.jlptpractice;

import com.jlptpractice.model.QuestionAnswer;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static com.jlptpractice.QuestionRootCtrl.qr;
import static com.jlptpractice.QuestionRootCtrl.userAns;

public class Section1 implements Initializable {

    public Text txtType;
    public Text txtQuestion;
    public ToggleGroup tgAnswer;
    public RadioButton rbAnswer1;
    public RadioButton rbAnswer2;
    public RadioButton rbAnswer3;
    public RadioButton rbAnswer4;
    static QuestionAnswer questionAnswer;

    public void userAns() {
        RadioButton rb = (RadioButton) tgAnswer.getSelectedToggle();
        if (!userAns.contains(rb.getText()) || userAns.isEmpty()) userAns.add(rb.getText());
        rbAnswer1.setDisable(true);
        rbAnswer2.setDisable(true);
        rbAnswer3.setDisable(true);
        rbAnswer4.setDisable(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (QuestionRootCtrl.preTypeId != QuestionRootCtrl.typeId) {
            txtType.setText("問題 " + qr.typeNo + " " + questionAnswer.getType());
            QuestionRootCtrl.preTypeId = QuestionRootCtrl.typeId;
            qr.typeNo++;
        }
        txtQuestion.setText(qr.questionNo + ") " + questionAnswer.getQuestion());
        rbAnswer1.setText(questionAnswer.getAnswer1());
        rbAnswer2.setText(questionAnswer.getAnswer2());
        rbAnswer3.setText(questionAnswer.getAnswer3());
        rbAnswer4.setText(questionAnswer.getAnswer4());
        qr.questionNo++;

        rbAnswer1.setOnAction(e -> userAns());
        rbAnswer2.setOnAction(e -> userAns());
        rbAnswer3.setOnAction(e -> userAns());
        rbAnswer4.setOnAction(e -> userAns());
    }

    // more changes

}
