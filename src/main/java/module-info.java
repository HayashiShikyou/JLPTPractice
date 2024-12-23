module com.jlptpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.sctp;
    requires jdk.compiler;
    requires java.sql;
    exports com.jlptpractice;
    opens com.jlptpractice to javafx.fxml;
}