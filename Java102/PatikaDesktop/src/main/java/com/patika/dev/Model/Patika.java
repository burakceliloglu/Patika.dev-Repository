package com.patika.dev.Model;

import com.patika.dev.Helper.DbHelper;
import com.patika.dev.Helper.Helper;

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

    public static boolean update(int id, String name){
        String query = "UPDATE patika SET name=? WHERE id=?;";
        try {
            PreparedStatement preparedStatement = DbHelper.getConnection().prepareStatement(query);
            preparedStatement.setInt(2,id);
            preparedStatement.setString(1,name);
            return preparedStatement.executeUpdate() != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Patika getFetch(int selectId) {
        Patika patika = null;
        String sql = "SELECT * FROM patika WHERE id=?;";

        try {
            PreparedStatement preparedStatement = DbHelper.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,selectId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                    patika = new Patika(resultSet.getInt("id"),resultSet.getString("name"));
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return patika;
    }

    public static boolean delete(int id){
        String sql = "DELETE FROM patika WHERE id=?;";
        try {
            PreparedStatement preparedStatement = DbHelper.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,id);
            return preparedStatement.executeUpdate() != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
