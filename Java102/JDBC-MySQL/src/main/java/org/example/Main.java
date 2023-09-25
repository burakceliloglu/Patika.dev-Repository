package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        String sql = "SELECT * FROM country;";
        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
             while(resultSet.next()){
                 System.out.println("Country Name: " + resultSet.getString(2));
             }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}