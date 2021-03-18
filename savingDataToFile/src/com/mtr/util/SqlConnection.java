package com.mtr.util;

import java.sql.DriverManager;
import java.sql.Connection;

public class SqlConnection {
    public static Connection connection() {
        Connection con = null;
        try {
          Class.forName("com.mysql.jdbc.Driver");
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "1234");
        } catch (Exception e) {
          e.printStackTrace();
        }
        return con;
  }
}
