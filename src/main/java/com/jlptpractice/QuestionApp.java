package com.jlptpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuestionApp extends Application {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jlpt";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    @Override
    public void start(Stage primaryStage) throws IOException, SQLException {
        // Load the FXML file and get the controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionRoot.fxml"));
        Parent root = loader.load();
        QuestionPaneController controller = loader.getController();

        // Connect to the database
        Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();

        // Execute the query to retrieve questions and answers
        String query = "SELECT questions_text, answer_1,answer_2,answer_3,answer_4, FROM question_n5 where question_id = 1";
        // Replace 'your_table_name' with the actual name of your table
        ResultSet resultSet = statement.executeQuery(query);

        // Pass the ResultSet to the controller
        controller.setData(resultSet);

        // Create and show the scene
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Question App");
        primaryStage.show();

        // Close the database connection
        resultSet.close();
        statement.close();
        connection.close();
    }

    public static void main(String[] args) {
        launch();
    }
}