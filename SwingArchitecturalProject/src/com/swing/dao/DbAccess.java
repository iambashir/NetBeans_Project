
package com.swing.dao;

import com.swing.common.ICommonDao;
import com.swing.model.SwingModel;
import com.swing.util.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.swing.controller.SwingController;


public class DbAccess implements ICommonDao<SwingModel>{

   Connection con = null;
   Statement stmt = null;
   ResultSet rs = null;
   PreparedStatement ps = null;
    
    
    
    
    
    
    @Override
    public int save(SwingModel t) {
           int flag = -1;
    try {
        con = DbConnection.getConnection();
        ps = (PreparedStatement) con.prepareStatement("insert into  swing_architecture (id, name, address, salary) values (?, ?, ?, ?)");
        ps.setInt(1, t.getId());
        ps.setString(2, t.getName());
        ps.setString(3, t.getAddress());
        ps.setDouble(4, t.getSalary());

        flag = ps.executeUpdate();
        con.close();
        ps.close();
    } catch (Exception e) {
    }
    return flag;
    }

    @Override
    public SwingModel getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(SwingModel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SwingModel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//   Connection con;
//    Statement st;
//    ResultSet rs;   
//    
//    
// //RECIEVED SwingService VALUE BY R PARAMETER
// public void swing(SwingModel R){
//       con = DbConnection.getConnection();
//        
//         try {
//             String sql = "insert into swing_architechture (id, name, address, salary ) values ('" + R.getId() + "','" + R.getName() + "','" + R.getAddress() + "','" + R.getSalary() + "')";
//             st = con.createStatement();
//             int status = st.executeUpdate(sql);
//             if (status == 1) {
//                 JOptionPane.showMessageDialog(null, "Data Saved Successfully");
//               reset(); 
//               
//             }
//         } catch (SQLException ex) {
//             Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
//         }
//         
//    }
// 
//    
////  //===================== SAVING DATA ======================//  
////  Connection con;
////  Statement prst; 
//// //RECIEVED SwingService VALUE BY R PARAMETER  
//// public void swing(SwingModel R){
////    try{
////    //==========Same code for every connection==========//
////    con = DbConnection.getConnection();
////    prst = con.createStatement();
////    
////    //return RecievedServiceValue;
////     
////    //========= ADD/INSERT/SAVE DATA ==============//
////    String sql = "insert into swing_architecture (id, name, address, salary) values (?, ?, ?, ?)"; 
////    PreparedStatement prst = con.prepareStatement(sql);
////    
////    prst = (PreparedStatement) R; //TYPE CASTING INTO PreparedStatement
////    
////    prst.setInt(1, R.getId());
////    prst.setString(2, R.getName());
////    prst.setString(3, R.getAddress());
////    prst.setDouble(4, R.getSalary()); 
////
////    prst.executeUpdate();
////    JOptionPane.showMessageDialog(null, " Data Saved successfully"); //after submission popup massage window
////    
////
////    //DisplayTable(); //Afetr saving refresh the table by calling this Method
////    
////    con.close(); //after completing task close the popup window
////    } 
////    catch(Exception e)
////    {
////    JOptionPane.showMessageDialog(null, "Invalid Input Value");
////    }
//// }
//
//    private void reset() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
