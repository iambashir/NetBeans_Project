package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
public static final String DRIVER_CLASS ="com.mysql.jdbc.Driver";
public static final String DB_URL ="jdbc:mysql://localhost:3306/roll";
public static final String USER_NAME = "root";
public static final String PASSWORD = "1234";

public static Connection getConnection(){
    try {
        Class.forName(DRIVER_CLASS);
        Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
      return con;  
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }

}
}
