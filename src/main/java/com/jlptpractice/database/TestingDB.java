package com.jlptpractice.database;

import com.jlptpractice.model.Question;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestingDB {
    static void selectQuestionTable() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        // Execute the query to retrieve questions and answers
        String query = "SELECT questions_text, answer_1,answer_2,answer_3,answer_4 FROM question_n5 where question_id = 1";
        // Replace 'your_table_name' with the actual name of your table
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Question question = new Question(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
            System.out.println(question.getQ_text());
            System.out.println(question.getA_1());
            System.out.println(question.getA_2());
            System.out.println(question.getA_3());
            System.out.println(question.getA_4());
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public static void main(String[] args) {
        try {
            selectQuestionTable();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
