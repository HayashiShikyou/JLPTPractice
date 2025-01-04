package com.jlptpractice;

import com.jlptpractice.database.ManageDB;
import com.jlptpractice.model.QuestionAnswer;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

import static com.jlptpractice.GetStart.changeBG;
import static com.jlptpractice.GetStart.changeScene;

public class QuestionRootCtrl implements Initializable {

    public VBox questions_view;

    public void switchYM() throws Exception {
        changeBG("YearMonth.jpg");
        changeScene("YearMonth.fxml");
    }

    public void setLoader() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Section1.fxml"));
            Node info_node = loader.load();
            questions_view.getChildren().add(info_node);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int i = 1; i <= 6; i++) {
            for (QuestionAnswer qa : ManageDB.selectOneQuestion(5202407, 1, i, 5)) {
                Section1.questionAnswer = qa;
                setLoader();
            }
        }
    }

}
