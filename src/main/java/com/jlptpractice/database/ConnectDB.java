package com.jlptpractice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectDB {

    String JDBC_URL = "jdbc:mysql://localhost:3306/jlpt";
    String USERNAME = "root";
    String PASSWORD = "";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}