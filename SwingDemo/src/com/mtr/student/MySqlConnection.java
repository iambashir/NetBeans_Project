package com.mtr.student;

import com.mysql.jdbc.*;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

public class MySqlConnection {
  public void connection(){
    try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=(Connection) DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sonoo","root","1234");  
  
}catch(Exception e){ System.out.println(e);}  
}  
}
