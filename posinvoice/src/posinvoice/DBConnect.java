package posinvoice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
public static Connection getConnection(){
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supershop_management_system", "root", "1234");
         return conn;
        }catch (Exception e) {
         System.err.println("Connection Error" + e);
         return null;
        }
    }

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
