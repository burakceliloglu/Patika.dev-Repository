package org.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private static final String DB_URL = "jdbc:mysql://localhost/sakila";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "12345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    }

}
