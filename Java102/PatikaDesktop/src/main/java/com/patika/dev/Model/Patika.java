package com.patika.dev.Model;

import com.patika.dev.Helper.DbHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Patika {
    private int id;
    private String name;

    public Patika(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static boolean add(String name) {
        String query = "INSERT INTO patika(name) VALUES (?);";
        try {
            PreparedStatement preparedStatement = DbHelper.getConnection().prepareStatement(query);
            preparedStatement.setString(1,name);
            return preparedStatement.executeUpdate() != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Patika> getList(){
        ArrayList<Patika> patikaArrayList = new ArrayList<>();
        Patika obj;
        String query = "SELECT * FROM patika;";
        try {
            Statement statement = DbHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                obj = new Patika(resultSet.getInt(1), resultSet.getString(2));
                patikaArrayList.add(obj);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return patikaArrayList;
    }
}
