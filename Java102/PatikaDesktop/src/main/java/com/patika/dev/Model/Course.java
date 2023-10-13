package com.patika.dev.Model;

import com.patika.dev.Helper.DbHelper;
import com.patika.dev.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Course {
    private int id;
    private int user_id;
    private int patika_id;
    private String name;
    private String lang;
    private Patika patika;
    private User educator;

    public Course(int id, int user_id, int patika_id, String name, String lang) {
        this.id = id;
        this.user_id = user_id;
        this.patika_id = patika_id;
        this.name = name;
        this.lang = lang;
        this.patika = Patika.getFetch(patika_id);
        this.educator = User.getFetch(user_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPatika_id() {
        return patika_id;
    }

    public void setPatika_id(int patika_id) {
        this.patika_id = patika_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Patika getPatika() {
        return patika;
    }

    public void setPatika(Patika patika) {
        this.patika = patika;
    }

    public User getEducator() {
        return educator;
    }

    public void setEducator(User educator) {
        this.educator = educator;
    }
    
    public static ArrayList<Course> getList(){
        String query = "SELECT * FROM course;";
        ArrayList<Course> courseArrayList = new ArrayList<>();
        Course course;
        try {
            Statement statement = DbHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                int user_id = resultSet.getInt("user_id");
                int patika_id = resultSet.getInt("patika_id");
                String name = resultSet.getString("name");
                String lang = resultSet.getString("lang");
                course = new Course(id,user_id,patika_id,name,lang);
                courseArrayList.add(course);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return courseArrayList;
    }

    public static boolean add(int user_id, int patika_id, String name, String lang){
        String query = "INSERT INTO course(user_id,patika_id,name,lang) VALUES (?,?,?,?);";
        try {
            PreparedStatement preparedStatement = DbHelper.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,user_id);
            preparedStatement.setInt(2,patika_id);
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,lang);
            return preparedStatement.executeUpdate() != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Course> getListByUser(int user_id){
        String query = "SELECT * FROM course WHERE user_id = " + user_id;
        ArrayList<Course> courseArrayList = new ArrayList<>();
        Course course;
        try {
            Statement statement = DbHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                int userId= resultSet.getInt("user_id");
                int patika_id = resultSet.getInt("patika_id");
                String name = resultSet.getString("name");
                String lang = resultSet.getString("lang");
                course = new Course(id,userId,patika_id,name,lang);
                courseArrayList.add(course);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return courseArrayList;
    }

    public static boolean delete(int id){
        String sql = "DELETE FROM course WHERE id = ?;";
        ArrayList<Course> courseArrayList = Course.getListByUser(id);
        try {
            PreparedStatement statement = DbHelper.getConnection().prepareStatement(sql);
            statement.setInt(1,id);
            return statement.executeUpdate() != -1;
        } catch (SQLException e) {
            Helper.showMessage("error");
            throw new RuntimeException(e);
        }
    }
}
