package com.jlptpractice;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionPaneController {

    @FXML
    private TextArea questionTextArea;

    @FXML
    private TextArea answerTextArea;

    public void setData(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            questionTextArea.setText(resultSet.getString("question"));
            answerTextArea.setText(resultSet.getString("answer"));
        } else {
            // Handle the end of the result set (e.g., display a message)
            questionTextArea.setText("No more questions.");
            answerTextArea.setText("");
        }
    }
}
