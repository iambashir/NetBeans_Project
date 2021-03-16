package com.Dao;

import com.Model.User;
import com.Service.EmployeeService;
import com.Util.DbConnection;
import com.sun.org.apache.bcel.internal.classfile.Code;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAO {

    Connection con;
    Statement st;
    ResultSet rs;

    public void empDao(User user) {
        con = DbConnection.getConnection();
        try {
            String sql = "insert into employee(code,name,salary,address) values('" + user.getUserCode() + "','" + user.getName() + "','" + user.getSalary() + "','" + user.getAddress() + "')";
            st = con.createStatement();
            int status = st.executeUpdate(sql);
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Data Saved");
            }
        } catch (SQLException ex) {

        }

    }

    public User empDaoEdit(String nCode) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        try {
            String sql = "select * from employee where code = '" + nCode + "'";
            con = DbConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            User u = new User();
            while (rs.next()) {
//                u.setId(rs.getInt("int"));
                u.setUserCode(rs.getString("code"));
                u.setName(rs.getString("name"));
                u.setSalary(rs.getDouble("salary"));
                u.setAddress(rs.getString("address"));
            }
            return u;
        } catch (SQLException ex) {
            return null;
        }

    }

    public int empDaoDelete(User U) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        try {
            String sql = "DELETE FROM employee WHERE code = '" + U.getUserCode() + "' ";
            con = DbConnection.getConnection();
            st = con.createStatement();
            int s = st.executeUpdate(sql);
            return s;
        } catch (SQLException ex) {
            return 0;
        }

    }

    public int empDaoUpdate(User U) {
        String sql = "update employee set code = '" + U.getUserCode() + "', name = '" + U.getName() + "',salary = '" + U.getSalary() + "',address = '" + U.getAddress() + "' where code = '"+U.getUserCode()+"'";

        try {
            con = DbConnection.getConnection();
            st = con.createStatement();
            int s = st.executeUpdate(sql);
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public List <User> getAll() {
        try {
            String sql = "select * from employees";
            con = DbConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            User u = new User();
            List <User> empList= new EmployeeService().getAll();   
            while (rs.next()) {
                u.setUserCode(rs.getString("code"));
                u.setName(rs.getString("name"));
                u.setSalary(rs.getDouble("salary"));
                u.setAddress(rs.getString("address"));
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
}
