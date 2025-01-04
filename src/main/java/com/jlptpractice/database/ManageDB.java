package com.jlptpractice.database;

import com.jlptpractice.model.QuestionAnswer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ManageDB {

    public static List<QuestionAnswer> selectOneQuestion(int testId, int sectionId, int typeId, int levelId) {
        List<QuestionAnswer> list = new ArrayList<>();
        String sql = "SELECT `qa_id`, `question`, `a1`.`answer`, `a2`.`answer`, `a3`.`answer`, `a4`.`answer`, `picture` FROM `question_answer` AS `qa` INNER JOIN `question` AS `q` ON `qa`.`question_id`=`q`.`question_id` INNER JOIN `answer` AS `a1` ON `answer1`=`a1`.`answer_id` INNER JOIN `answer` AS `a2` ON `answer2`=`a2`.`answer_id` INNER JOIN `answer` AS `a3` ON `answer3`=`a3`.`answer_id` INNER JOIN `answer` AS `a4` ON `answer4`=`a4`.`answer_id` INNER JOIN `test` AS `t` ON `q`.`test_id`=`t`.`test_id` WHERE `q`.`test_id`=? && `section_id`=? && `type_id`=? &&`level_id`=?";
        try (Connection connection = MySQLConnection.connect(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, testId);
            statement.setInt(2, sectionId);
            statement.setInt(3, typeId);
            statement.setInt(4, levelId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new QuestionAnswer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getBlob(7)));
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        for (int i = 1; i <= 6; i++) {
//            for (QuestionAnswer a : selectOneQuestion(5202407, 1, i, 5)) {
//                System.out.println(a.toString());
//            }
//        }
//    }

}
