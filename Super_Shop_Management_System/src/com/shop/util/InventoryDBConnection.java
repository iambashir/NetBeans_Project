package com.shop.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class InventoryDBConnection {
public static Connection getConnection(){
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "1234");
         return con;
        }catch (Exception e) {
         System.err.println("Connection Error" + e);
         return null;
        }
    }
}
