package com.rat.util;



import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/testpro";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1234";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_CLASS);
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
