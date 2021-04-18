package com.shop.util;

import java.sql.Connection;
import java.sql.DriverManager;



public class MySqlConnection {

  public Connection connection() {
    Connection con = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supershop_management_system", "root", "1234");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return con;
  }
}
