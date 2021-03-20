
package com.swing.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
 public static Connection getConnection(){
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_architecture", "root", "1234");
         return con;
        }catch (Exception e) {
         System.err.println("Connection Error" + e);
         return null;
        }
    }
}
