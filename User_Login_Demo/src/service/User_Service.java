package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import dao.DbConnerction;

public class User_Service {

    Connection con;
    Statement smt;

    public int addUser(User u) {
        try {

            con = DbConnerction.getConnection();
            smt = con.createStatement();
            String query = "Insert into user (Name,Age,User_name,Password)Values('" + u.getName() + "','" + u.getAge() + "','" + u.getUsername() + "','" + u.getPassword() + "')";
            return smt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(User_Service.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public int loginUser(User u) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            con = DbConnerction.getConnection();
            smt = con.createStatement();
            String sql = "Select * from user where User_name = '" + u.getUsername() + "'";
            ResultSet rs = smt.executeQuery(sql);
            rs.absolute(1);
            if (u.getPassword().equals(rs.getString("Password"))) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(User_Service.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

}
