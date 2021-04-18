
package myapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bashir Hossain
 */
public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostname = "localhost:3306/";
        String dbName = "person_info";
        String dbUrl = dbRoot+hostname+dbName;
        
        String hostUsername = "root";
        String hostPassword = "1234"; // Leave this blank if no password set
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        
        return myConn;
    }
}
