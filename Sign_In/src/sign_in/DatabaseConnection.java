package sign_in;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
public class DatabaseConnection {
  public Connection connection() {
    Connection con = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir", "root", "1234");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return con;
  }
}
