//package com.jlptpractice.inputPanel;
//
//import com.jlptpractice.database.MySQLConnection;
//import javafx.fxml.Initializable;
//import javafx.scene.control.TextField;
//
//import java.net.URL;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.util.ResourceBundle;
//
//public class QuestionInputCtrl implements Initializable {
//
//    public TextField questionInput;
//    public TextField answerInput;
//    public TextField correctInput;
//
//    public void inputQuestion(String question) {
//        String sql = "CALL `question`(?);";
//        try (Connection connected = MySQLConnection.connect(); PreparedStatement statement = connected.prepareStatement(sql)) {
//            statement.setString(1, question);
//            statement.executeUpdate();
//            System.out.println(question);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void inputAnswer(String answer) {
//        String sql = "INSERT INTO `answer`(`answer`) VALUES (?)";
//        try (Connection connected = MySQLConnection.connect(); PreparedStatement statement = connected.prepareStatement(sql)) {
//            statement.setString(1, answer);
//            statement.executeUpdate();
//            System.out.println(answer);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static int inputQnA(int i, int js) {
//        String sql = "INSERT INTO `question_answer` (`question_id`, `answer1`, `answer2`, `answer3`, `answer4`) VALUES (?, ?, ?, ?, ?)";
//        try (Connection connected = MySQLConnection.connect(); PreparedStatement statement = connected.prepareStatement(sql)) {
//            System.out.println(i);
//            statement.setInt(1, i);
//            System.out.println(js);
//            statement.setInt(2, js++);
//            System.out.println(js);
//            statement.setInt(3, js++);
//            System.out.println(js);
//            statement.setInt(4, js++);
//            System.out.println(js);
//            statement.setInt(5, js++);
//
//            statement.executeUpdate();
//            return js;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void questionInput() {
//        inputQuestion(questionInput.getText());
//        System.out.println(questionInput.getText());
//    }
//
//    public void answerInput() {
//        for (int i = 0; i < 4; i++) {
//            inputAnswer(answerInput.getText());
//        }
//    }
//
////    public void
//
//    public static void main(String[] args) {
//        int start = 5;
//        int end = 34;
//        int js = 18;
//        for (int i = start; i <= end; i++) {
//            js = inputQnA(i, js);
//        }
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }
//
//}
