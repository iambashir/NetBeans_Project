
package dao;

import java.sql.*;
// import java.util.logging.Level;
// import java.util.logging.Logger;

public class DbConnection {
//    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/bashir_user_login";
//    private static final String USER_NAME = "root";
//    private static final String PASSWORD = "1234";
//    
//    public static Connection getConnection() throws SQLException{
//        try {
//            Class.forName(DRIVER_CLASS);
//            Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//            return con;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DbConnerction.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    
//    }
    
       public static Connection getConnection(){
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/bashir_user_login", "root", "1234");
         return con;
        }catch (Exception e) {
         System.err.println("Connection Error" + e);
         return null;
        }
    }
    
}
