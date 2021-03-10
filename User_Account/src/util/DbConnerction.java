
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnerction {
    private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
    private static final String DB_URL="jdbc:mysql://localhost:3306/swing_login";
    private static final String USER_NAME="root";
    private static final String PASSWORD="root";
    
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName(DRIVER_CLASS);
            Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnerction.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    
}
