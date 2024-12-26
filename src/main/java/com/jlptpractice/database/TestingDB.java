package com.jlptpractice.database;

import com.jlptpractice.model.Question;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestingDB {
    public static List<Question> selectQuestionTable() {
//        Question question = null;
        List<Question> list = new ArrayList<>();
        String sql = "SELECT questions_text, answer_1,answer_2,answer_3,answer_4 FROM question_n5";
        try (Connection connected = MySQLConnection.connect(); Statement statement = connected.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                list.add(new Question(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)));
//                question = new List<Question>(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<Question> question = selectQuestionTable();
        for (Question q : question) {
            System.out.println(q.getQ_text());
            System.out.println(q.getA_1());
            System.out.println(q.getA_2());
            System.out.println(q.getA_3());
            System.out.println(q.getA_4());
            System.out.println("===================");
        }
    }
}
