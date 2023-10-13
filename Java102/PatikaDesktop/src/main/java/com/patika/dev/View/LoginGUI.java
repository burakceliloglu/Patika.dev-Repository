package com.patika.dev.View;

import com.patika.dev.Helper.Config;
import com.patika.dev.Helper.Helper;
import com.patika.dev.Model.Operator;
import com.patika.dev.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_username;
    private JTextField fld_password;
    private JButton enterButton;

    public LoginGUI(){
        add(wrapper);
        Helper.setLayout();
        setSize(400,400);
        int x = Helper.screenCenterLocation("x",getSize());
        int y = Helper.screenCenterLocation("y",getSize());
        setLocation(x,y);
        setVisible(true);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        enterButton.addActionListener(e -> {
            String username = fld_username.getText();
            String password = fld_password.getText();
            if(Helper.isFieldEmpty(fld_username) || Helper.isFieldEmpty(fld_password)){
                Helper.showMessage("fill");
            } else{
                User user = User.getFetch(username,password);
                if(user == null){
                    Helper.showMessage("userNotFound");
                } else {
                    Helper.showMessage("success");
                    switch (user.getType()){
                        case "operator":
                            OperatorGUI operatorGUI = new OperatorGUI((Operator) user);
                            break;
                        case "educator":
                            EducatorGUI educatorGUI = new EducatorGUI();
                            break;
                        case "student":
                            StudentGUI studentGUI = new StudentGUI();
                            break;
                        default:
                            Helper.showMessage("error");
                            break;
                    }
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
    }
}
