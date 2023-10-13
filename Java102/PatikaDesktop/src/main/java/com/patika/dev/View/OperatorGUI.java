package com.patika.dev.View;

import com.patika.dev.Helper.Config;
import com.patika.dev.Helper.Helper;
import com.patika.dev.Helper.Item;
import com.patika.dev.Model.Course;
import com.patika.dev.Model.Operator;
import com.patika.dev.Model.Patika;
import com.patika.dev.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {

    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_exit;
    private JPanel pnl_user;
    private JScrollPane srl_userlist;
    private JTable tbl_userlist;
    private JPanel pnl_userform;
    private JTextField fld_name_surname;
    private JTextField fld_username;
    private JTextField fld_password;
    private JComboBox cmb_type;
    private JButton btn_user_enter;
    private JLabel lbl_user_id;
    private JTextField fld_user_id;
    private JButton btn_user_delete;
    private JTextField fld_search_name_surname;
    private JTextField fld_search_username;
    private JComboBox cmb_search_type;
    private JButton btn_search;
    private JPanel pnl_patika_list;
    private JTable tbl_patika_list;
    private JScrollPane scrl_patika_list;
    private JTextField fld_patika_name;
    private JButton btn_add_patika;
    private JPanel pnl_course_list;
    private JScrollPane scrl_course_list;
    private JTable tbl_course_list;
    private JPanel pnl_course_add;
    private JTextField fld_course_name;
    private JTextField fld_language;
    private JComboBox cmb_patika_name;
    private JComboBox cmb_educator;
    private JButton btn_course_add;
    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;
    private final Operator operator;
    private DefaultTableModel md_patika_list;
    private Object[] row_patika_list;
    private JPopupMenu patikaMenu;
    private DefaultTableModel md_course_list;
    private Object[] row_course_list;
    public OperatorGUI(Operator operator) {
        this.operator = operator;


        add(wrapper);
        setSize(1000,500);
        int x = Helper.screenCenterLocation("x",getSize());
        int y = Helper.screenCenterLocation("y",getSize());
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_welcome.setText("Welcome! " + operator.getName());

        //UserList
        mdl_user_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column == 0){
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_user_list = {"ID", "Name", "Username", "Password", "Type"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        row_user_list = new Object[col_user_list.length];
        tbl_userlist.setModel(mdl_user_list);
        tbl_userlist.getTableHeader().setReorderingAllowed(false);

        loadUserModel();

        //patika list
        patikaMenu = new JPopupMenu();
        JMenuItem update = new JMenuItem("Update");
        JMenuItem delete = new JMenuItem("Delete");
        patikaMenu.add(update);
        patikaMenu.add(delete);

        //course list
        md_course_list = new DefaultTableModel();
        Object[] col_course_list = {"ID","Course Name","Programming Language","Patika","Educator"};
        md_course_list.setColumnIdentifiers(col_course_list);
        tbl_course_list.setModel(md_course_list);
        row_course_list = new Object[col_course_list.length];
        loadCourseModel();
        tbl_course_list.getTableHeader().setReorderingAllowed(false);
        tbl_course_list.getColumnModel().getColumn(0).setMaxWidth(75);

        loadPatikaComco();
        loadEducatorCombo();

        update.addActionListener(e -> {
            int selectId = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(),0).toString());
            UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(Patika.getFetch(selectId));
            updatePatikaGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPatikaModel();
                    loadPatikaComco();
                    loadCourseModel();
                }
            });
        });

        delete.addActionListener(e -> {
            if(Helper.confirm("sure")){
                int selectedId = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(),0).toString());
                if(Patika.delete(selectedId)){
                    Helper.showMessage("delete");
                    loadPatikaModel();
                    loadPatikaComco();
                    loadCourseModel();
                } else{
                    Helper.showMessage("error");
                }
            }
        });

        md_patika_list = new DefaultTableModel(){

            @Override
            public boolean isCellEditable(int row, int column) {
                if(column == 0){
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_patika_name = {"ID","Patika Name"};
        md_patika_list.setColumnIdentifiers(col_patika_name);
        row_patika_list = new Object[col_patika_name.length];

        loadPatikaModel();
        tbl_patika_list.setComponentPopupMenu(patikaMenu);

        tbl_patika_list.setModel(md_patika_list);
        tbl_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_patika_list.getColumnModel().getColumn(0).setMaxWidth(75);

        tbl_patika_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selectedRow = tbl_patika_list.rowAtPoint(point);
                tbl_patika_list.setRowSelectionInterval(selectedRow,selectedRow);
            }
        });

        tbl_userlist.getSelectionModel().addListSelectionListener(e -> {
            try{
                String selected_user_id = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(),0).toString();
                fld_user_id.setText(selected_user_id);
            } catch (Exception exception){

            }

        });

        tbl_userlist.getModel().addTableModelListener(e -> {
            if(e.getType() == TableModelEvent.UPDATE){
                int user_id = Integer.parseInt(tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(),0).toString());
                String name = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(),1).toString();
                String username = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(),2).toString();
                String password = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(),3).toString();
                String type = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(),4).toString();

                if(User.update(user_id,name,username,password,type)){
                    Helper.showMessage("update");
                    loadUserModel();
                }

                loadUserModel();
                loadEducatorCombo();
                loadCourseModel();
            }
        });

        btn_user_enter.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_name_surname) || Helper.isFieldEmpty(fld_username) || Helper.isFieldEmpty(fld_password)) {
                Helper.showMessage("fill");
            } else {
                String name = fld_name_surname.getText();
                String username = fld_username.getText();
                String password = fld_password.getText();
                String type = cmb_type.getSelectedItem().toString();
                if(User.add(name,username,password,type)){
                    Helper.showMessage("success");
                    loadUserModel();
                    loadEducatorCombo();
                    fld_name_surname.setText(null);
                    fld_password.setText(null);
                    fld_username.setText(null);
                }
            }
        });
        btn_user_delete.addActionListener(e -> {
            if(Helper.isFieldEmpty(fld_user_id)){
                Helper.showMessage("fill");
            } else{
                if(Helper.confirm("sure")){
                    int id = Integer.parseInt(fld_user_id.getText());
                    if(User.delete(id)){
                        Helper.showMessage("delete");
                        loadUserModel();
                        loadEducatorCombo();
                        loadCourseModel();
                        fld_user_id.setText(null);
                    }
                }
            }
        });
        btn_search.addActionListener(e -> {
            String name = fld_search_name_surname.getText();
            String username = fld_search_username.getText();
            String type = cmb_search_type.getSelectedItem().toString();
            loadUserModel(User.searchUser(User.executeQuery(name,username,type)));
        });
        btn_exit.addActionListener(e -> {
            dispose();
        });

        btn_add_patika.addActionListener(e -> {
            String name = fld_patika_name.getText();
            if(fld_patika_name.getText().isEmpty()){
                Helper.showMessage("fill");
            } else{
                if(Patika.add(name)){
                    Helper.showMessage("success");
                    loadPatikaModel();
                    loadPatikaComco();
                    fld_patika_name.setText(null);
                } else {
                    Helper.showMessage("error");
                }
            }
        });
        btn_course_add.addActionListener(e -> {
            Item patikaName = (Item) cmb_patika_name.getSelectedItem();
            Item educator = (Item) cmb_educator.getSelectedItem();
            if(Helper.isFieldEmpty(fld_language) || Helper.isFieldEmpty(fld_course_name)){
                Helper.showMessage("fill");
            } else {
                if(Course.add(educator.getKey(),patikaName.getKey(),fld_course_name.getText(),fld_language.getText())){
                    Helper.showMessage("success");
                    loadCourseModel();
                    loadEducatorCombo();
                }else{
                    Helper.showMessage("error");
                }
            }
        });
        btn_exit.addActionListener(e -> {
            LoginGUI loginGUI = new LoginGUI();
            dispose();
        });
    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_course_list.getModel();
        clearModel.setRowCount(0);
        for(Course course : Course.getList()){
            int i=0;
            row_course_list[i++] = course.getId();
            row_course_list[i++] = course.getName();
            row_course_list[i++] = course.getLang();
            row_course_list[i++] = course.getPatika().getName();
            row_course_list[i++] = course.getEducator().getName();
            md_course_list.addRow(row_course_list);
        }
    }

    private void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika_list.getModel();
        clearModel.setRowCount(0);
        for(Patika patika : Patika.getList()){
            int i=0;
            row_patika_list[i++] = patika.getId();
            row_patika_list[i++] = patika.getName();
            md_patika_list.addRow(row_patika_list);
        }
    }

    public void loadUserModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userlist.getModel();
        clearModel.setRowCount(0);
        for(User user : User.getList()){
            int i = 0;
            row_user_list[i++] = user.getId();
            row_user_list[i++] = user.getName();
            row_user_list[i++] = user.getUsername();
            row_user_list[i++] = user.getPassword();
            row_user_list[i++] = user.getType();
            mdl_user_list.addRow(row_user_list);
        }
    }
    public void loadUserModel(ArrayList<User> list){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userlist.getModel();
        clearModel.setRowCount(0);
        for(User user : list){
            int i = 0;
            row_user_list[i++] = user.getId();
            row_user_list[i++] = user.getName();
            row_user_list[i++] = user.getUsername();
            row_user_list[i++] = user.getPassword();
            row_user_list[i++] = user.getType();
            mdl_user_list.addRow(row_user_list);
        }
    }

    public void loadPatikaComco(){
        cmb_patika_name.removeAllItems();
        for(Patika patika : Patika.getList()){
            cmb_patika_name.addItem(new Item(patika.getId(),patika.getName()));
        }
    }

    private void loadEducatorCombo() {
        cmb_educator.removeAllItems();
        for(User user : User.getList()){
            if(user.getType().equals("educator")){
                cmb_educator.addItem(new Item(user.getId(),user.getName()));
            }
        }
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator();
        op.setId(1);
        op.setName("Mustafa Çetindağ");
        op.setUsername("Mustafa");
        op.setPassword("1234");
        op.setType("operator");

        OperatorGUI operatorGUI = new OperatorGUI(op);
    }
}
