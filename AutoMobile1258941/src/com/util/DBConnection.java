
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Md. Sajib
 */
public class DBConnection {
    
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/bashir_swing_architecture";
    final static String USER = "root";
    final static String PASS = "1234";

    public static Connection getConn() {
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
    
}
