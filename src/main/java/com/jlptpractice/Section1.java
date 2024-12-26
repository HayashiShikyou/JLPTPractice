package com.jlptpractice;

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
        answer1.setText("ABC");
    }
}
