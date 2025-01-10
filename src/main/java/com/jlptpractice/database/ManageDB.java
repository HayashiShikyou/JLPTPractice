package com.jlptpractice.database;

import com.jlptpractice.model.QuestionAnswer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManageDB {

    public static List<QuestionAnswer> selectOneQuestion(int testId, int sectionId, int typeId, int levelId) {
        List<QuestionAnswer> list = new ArrayList<>();
        String sql = "SELECT `qa_id`, `question`, `a1`.`answer`, `a2`.`answer`, `a3`.`answer`, `a4`.`answer`, `type`, `picture` FROM `question_answer` AS `qa` INNER JOIN `question` AS `q` ON `qa`.`question_id`=`q`.`question_id` INNER JOIN `answer` AS `a1` ON `answer1`=`a1`.`answer_id` INNER JOIN `answer` AS `a2` ON `answer2`=`a2`.`answer_id` INNER JOIN `answer` AS `a3` ON `answer3`=`a3`.`answer_id` INNER JOIN `answer` AS `a4` ON `answer4`=`a4`.`answer_id` INNER JOIN `test` AS `t` ON `q`.`test_id`=`t`.`test_id` INNER JOIN `type` AS `ty` ON `q`.`type_id`=`ty`.`type_id` WHERE `q`.`test_id`=? && `section_id`=? && `q`.`type_id`=? && `level_id`=?";
        try (Connection connection = MySQLConnection.connect(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, testId);
            statement.setInt(2, sectionId);
            statement.setInt(3, typeId);
            statement.setInt(4, levelId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new QuestionAnswer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getBlob(8)));
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> correctAns(int testId, int sectionId, int levelId) {
        List<String> list = new ArrayList<>();
        String sql = "SELECT `answer`.`answer` FROM `question_answer` AS `qa` INNER JOIN `answer` ON `answer1`=`answer_id` || `answer2`=`answer_id` || `answer3`=`answer_id` || `answer4`=`answer_id` INNER JOIN `question` AS `q` ON `qa`.`question_id`=`q`.`question_id` INNER JOIN `test` AS `t` ON `q`.`test_id`=`t`.`test_id` WHERE `q`.`test_id`=? && `section_id`=? && `level_id`=? && `correct`=1";
        try (Connection connection = MySQLConnection.connect(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, testId);
            statement.setInt(2, sectionId);
            statement.setInt(3, levelId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(resultSet.getString(1));
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String correctAns(int testId, int sectionId, int levelId, String userAns) {
        String result = null;
        String sql = "SELECT `answer`.`answer` FROM `question_answer` AS `qa` INNER JOIN `answer` ON `answer1`=`answer_id` || `answer2`=`answer_id` || `answer3`=`answer_id` || `answer4`=`answer_id` INNER JOIN `question` AS `q` ON `qa`.`question_id`=`q`.`question_id` INNER JOIN `test` AS `t` ON `q`.`test_id`=`t`.`test_id` WHERE `q`.`test_id`=? && `section_id`=? && `level_id`=? && `correct`=1 && `answer`=?";
        try (Connection connection = MySQLConnection.connect(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, testId);
            statement.setInt(2, sectionId);
            statement.setInt(3, levelId);
            statement.setString(4, userAns);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) result = resultSet.getString(1);
            connection.close();
            statement.close();
            resultSet.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
