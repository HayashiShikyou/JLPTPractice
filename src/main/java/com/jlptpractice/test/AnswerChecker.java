package com.jlptpractice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AnswerChecker {

    // Database connection details
    private static final String DB_URL = "";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    public static boolean checkAnswer(int questionId, String userAnswer) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Query to get the correct answer for the question
            String query = "SELECT correct_answer FROM questions WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, questionId);

            // Execute the query
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String correctAnswer = resultSet.getString("correct_answer");
                return userAnswer.equalsIgnoreCase(correctAnswer); // Compare answers ignoring case sensitivity
            } else {
                System.out.println("Question not found in the database.");
                return false;
            }

        } catch (Exception e) {
            return false;
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                if (connection != null) connection.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the question ID: ");
        int questionId = scanner.nextInt(); // Fill with input method to get user question ID

        System.out.print("Enter your answer: ");
        String userAnswer = scanner.next(); // Fill with input method to get user answer

//        boolean isCorrect = checkAnswer(questionId, userAnswer);
        boolean isCorrect = checkAnswer(questionId, userAnswer);
        if (isCorrect) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer.");
        }
        scanner.close();
    }
}
