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
    public static int testId;
    public static int sectionId;
    public static int typeId;
    public static int lvlId;
    public static int preTypeId = QuestionRootCtrl.typeId;
    public static int typeNo = 1;

    public void switchYM() throws Exception {
        changeBG("YearMonth.jpg");
        changeScene("YearMonth.fxml");
    }

    public void setLoader() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Section1.fxml"));
            Node info_node = loader.load();
//            questions_view.getChildren().add(txtType);
            questions_view.getChildren().add(info_node);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void getData() {
        for (typeId = 1; typeId <= 6; typeId++) {
            for (QuestionAnswer qa : ManageDB.selectOneQuestion(testId, sectionId, typeId, lvlId)) {
                Section1.questionAnswer = qa;
                setLoader();
            }
        }
    }

    public void nextSection() {
        questions_view.getChildren().clear();
        sectionId = 2;
        getData();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        questions_view.getChildren().clear();
        sectionId = 1;
        getData();
    }

}
