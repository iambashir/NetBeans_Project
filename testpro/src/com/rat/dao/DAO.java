/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rat.dao;

import com.rat.model.User;
import com.rat.util.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiccup
 */
public class DAO {
     Connection con;
    Statement st;
    ResultSet rs;
    public void empdao(User user){
       con = DbConnection.getConnection();
        
         try {
             String sql = "insert into testpros (code, name, salary, address) values ('" + user.getCode() + "','" + user.getName() + "','" + user.getSalary() + "','" + user.getAddress() + "')";
             st = con.createStatement();
             int status = st.executeUpdate(sql);
             if (status == 1) {
                 JOptionPane.showMessageDialog(null, "Data Saved");
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
