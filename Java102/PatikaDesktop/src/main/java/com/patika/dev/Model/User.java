package com.patika.dev.Model;

import com.patika.dev.Helper.DbHelper;
import com.patika.dev.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String type;

    public User() {
    }

    public User(int id, String name, String username, String password, String type) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.type = type;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList() {
        ArrayList<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM user;";
        User user;
        Statement statement = null;
        try {
            statement = DbHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                user = new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                userList.add(user);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    public static boolean add(String name, String username, String password, String type){
        String sql = "INSERT INTO user(name,username,password,type) VALUES (?,?,?,?);";
        User findUser = User.getFetch(username);
        if(findUser != null){
            Helper.showMessage("duplicate");
            return false;
        }
        try {
            PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
            statement.setString(1,name);
            statement.setString(2,username);
            statement.setString(3,password);
            statement.setString(4,type);
            int response = statement.executeUpdate();
            if(response == -1){
                Helper.showMessage("error");
            }
            statement.close();
            return response != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static User getFetch(String username){
        User user = null;
        String sql = "SELECT * FROM user WHERE username = ?";
        try {
            PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
            statement.setString(1,username);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setType(resultSet.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }

    public static User getFetch(int id){
        User user = null;
        String sql = "SELECT * FROM user WHERE id = ?";
        try {
            PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setType(resultSet.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }

    public static boolean delete(int id){
        String sql = "DELETE FROM user WHERE id = ?;";
        try {
            PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
            statement.setInt(1,id);
            return statement.executeUpdate() != -1;
        } catch (SQLException e) {
            Helper.showMessage("error");
            throw new RuntimeException(e);
        }
    }

    public static boolean update(int id, String name, String username, String password, String type){
        String sql = "UPDATE user SET name=?, username=?, password=?, type=? WHERE id=?;";
        User findUser = User.getFetch(username);
        // güncelleme işlemini yaparken type'a farklı bir şey yazılmasını engelle.
        if(findUser != null && findUser.getId() != id){
            Helper.showMessage("duplicate");
            return false;
        }
        try {
            PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
            statement.setString(1,name);
            statement.setString(2,username);
            statement.setString(3,password);
            statement.setString(4,type);
            statement.setInt(5,id);
            return statement.executeUpdate() != -1;
        } catch (SQLException e) {
            Helper.showMessage("error");
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<User> searchUser(String query) {
        ArrayList<User> userList = new ArrayList<>();
        User user;
        Statement statement = null;
        try {
            statement = DbHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                user = new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
                userList.add(user);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    public static String executeQuery(String name,String username,String type){
        String query = "SELECT * FROM user WHERE name LIKE '%{{name}}%' AND username LIKE '%{{username}}%'";
        query = query.replace("{{name}}",name);
        query = query.replace("{{username}}",username);
        if(!type.isEmpty())
        {
            query += " AND type LIKE '{{type}}';";
            query = query.replace("{{type}}",type);
        }
        return query;
    }
}

