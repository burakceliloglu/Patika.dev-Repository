package com.patika.dev.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
    }
}
