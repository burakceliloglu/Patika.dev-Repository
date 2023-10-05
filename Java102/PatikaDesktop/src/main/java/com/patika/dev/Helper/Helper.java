package com.patika.dev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static int screenCenterLocation(String axis, Dimension size){
        int point = 0;
        switch (axis){
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
                break;
            default:
                point = 0;
        }

        return point;
    }

    public static void setLayout(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().length()==0;
    }

    public static void showMessage(String str){
        optionPageOk();
        String message = null;
        String title = null;
        switch (str){
            case "fill":
                message = "At least one of the fields is empty.";
                title = "WARNING!";
                break;
            case "success":
                message = "Data successfully added.";
                title = "SUCCESS!";
                break;
            case "error":
                message = "Error occurred.";
                title = "ERROR!";
                break;
            case "duplicate":
                message = "Duplicated data.";
                title = "ERROR!";
                break;
            case "delete":
                message = "Data successfully deleted.";
                title = "SUCCESS!";
                break;
            case "update":
                message = "Data successfully updated.";
                title = "SUCCESS!";
                break;
            default:
                break;
        }

        JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void optionPageOk(){
        UIManager.put("OptionPane.okButtonText","Got it");
    }


    public static boolean confirm(String str) {
        String message = null;
        String title = null;
        switch (str){
            case "sure":
                message = "Are you sure that you want to do this action?";
                title = "???";
                break;
            default:
                break;
        }

        return JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_OPTION) == 0;
    }
}
