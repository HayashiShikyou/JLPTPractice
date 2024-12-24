package com.jlptpractice;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static com.jlptpractice.GetStart.changeBG;
import static com.jlptpractice.GetStart.changeScene;

public class Section1 implements Initializable {

    public ToggleGroup answer;
    public VBox questions_view;
    public Text question;
    public RadioButton answer1;
    public RadioButton answer2;
    public RadioButton answer3;
    public RadioButton answer4;

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
        setLoader();
//        answer1.setText("ABC");
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
        setLoader();
    }
}
