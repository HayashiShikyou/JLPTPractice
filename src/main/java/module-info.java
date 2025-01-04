module com.jlptpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.sctp;
    requires jdk.compiler;
    requires java.sql;

    exports com.jlptpractice;
    opens com.jlptpractice to javafx.fxml;
    exports com.jlptpractice.controller;
    opens com.jlptpractice.controller to javafx.fxml;
    exports com.jlptpractice.inputPanel;
    opens com.jlptpractice.inputPanel to javafx.fxml;
}