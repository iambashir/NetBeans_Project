package com.service;

import com.model.User;
import com.util.DbConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {

    Connection con;
    Statement st;

    public int addUser(User u) throws SQLException {
            con = DbConnection.getConnection();
            st = con.createStatement();
            String sql = "INSERT INTO login (username, password) values ('" + u.getUsername() + "', '" + u.getPassword() + "')";
            return st.executeUpdate(sql);
        
    }

    
    
    
    public int loginUser(User u) {
        try {
            System.out.println("enter");
            con = DbConnection.getConnection();
            st = con.createStatement();
            String sql = "SELECT * from login where username = '" + u.getUsername() + "' ";
            ResultSet rs = st.executeQuery(sql);
            rs.absolute(1);
            if (u.getPassword().equals(rs.getString("password"))) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

}
