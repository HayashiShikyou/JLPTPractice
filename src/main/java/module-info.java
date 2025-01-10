module com.jlptpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.sctp;
    requires jdk.compiler;
    requires java.sql;
    requires java.desktop;

    exports com.jlptpractice;
    opens com.jlptpractice to javafx.fxml;
    exports com.jlptpractice.controller;
    opens com.jlptpractice.controller to javafx.fxml;
    exports com.jlptpractice.inputPanel;
    opens com.jlptpractice.inputPanel to javafx.fxml;
    exports com.jlptpractice.test;
    opens com.jlptpractice.test to javafx.fxml;
}