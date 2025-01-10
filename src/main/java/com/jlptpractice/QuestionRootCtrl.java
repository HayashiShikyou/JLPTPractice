package com.jlptpractice;

import com.jlptpractice.model.QuestionAnswer;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.jlptpractice.GetStart.changeBG;
import static com.jlptpractice.GetStart.changeScene;
import static com.jlptpractice.database.ManageDB.correctAns;
import static com.jlptpractice.database.ManageDB.selectOneQuestion;

public class QuestionRootCtrl implements Initializable {

    public ScrollPane scrollPane;
    public VBox questions_view;
    public Button btnNext;
    public static int testId;
    public static int sectionId;
    public static int typeId;
    public static int lvlId;
    public static int preTypeId = QuestionRootCtrl.typeId;
    public int typeNo = 1;
    public int questionNo = 1;
    public static int[] correct = new int[3];
    public static int[] total = new int[3];
    public static QuestionRootCtrl qr = new QuestionRootCtrl();
    static List<String> correctAns;
    static List<String> userAns = new ArrayList<>();

    public void switchYM() throws Exception {
        changeBG("YearMonth.jpg");
        changeScene("YearMonth.fxml");
    }

    public void resultPane() throws Exception {
        changeScene("Result.fxml");
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

    private void getData() {
        correctAns = correctAns(testId, sectionId, lvlId);
        totalPoint();
        for (typeId = 1; typeId <= 6; typeId++) {
            for (QuestionAnswer qa : selectOneQuestion(testId, sectionId, typeId, lvlId)) {
                Section1.questionAnswer = qa;
                setLoader();
            }
        }
    }

    static void totalPoint() {
        for (int i = 0; i < correctAns.size(); i++) {
            if (sectionId == 1) total[0]++;
            if (sectionId == 2) total[1]++;
            if (sectionId == 3) total[2]++;
        }
    }

    public void userPoint() {
        for (String usa : userAns) {
            if (Objects.equals(usa, correctAns(testId, sectionId, lvlId, usa))) {
                if (sectionId == 1) correct[0]++;
                if (sectionId == 2) correct[1]++;
                if (sectionId == 3) correct[2]++;
            }
        }
    }

    public void changeSection() throws Exception {
        userPoint();
        questions_view.getChildren().clear();
        switch (sectionId) {
            case 0:
                sectionId = 1;
                break;
            case 1:
                sectionId = 2;
                scrollPane.setVvalue(0.0);
                break;
            case 2:
                sectionId = 3;
                scrollPane.setVvalue(0.0);
                btnNext.setText("Submit");
                break;
            case 3:
                resultPane();
                break;
        }
        qr.questionNo = 1;
        getData();
        qr.typeNo = 1;
        qr.questionNo = 1;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sectionId = 0;
        try {
            changeSection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
