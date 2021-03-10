/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtr.student;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bashir Hossain
 */
public class Student extends javax.swing.JFrame {
  MySqlConnection con = new MySqlConnection();

  /**
   * Creates new form Student
   */
  public Student() throws SQLException {
    initComponents();
    DefaultTableModel model = (DefaultTableModel) jtabledata.getModel();
    String query = "select * from bashir.student_data";
    Statement stmt =  (Statement) con.connection().createStatement();
    ResultSet rs = (ResultSet) stmt.executeQuery(query);
    //using a loop to set all data to table
    while (rs.next()) {
      int id = rs.getInt("id");
      String name = rs.getString("name");
      String email = rs.getString("email");
      String address = rs.getString("address");
      String mobile = rs.getString("mobile");
      //System.out.println("id is: " + id + "\nName is: " + name + "\nEmail is: "+ email + "\nAddrss is: " + address + "\nMobile is: " + mobile);
      model.addRow(new Object[]{id, name, email, address, mobile});
    }
    

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnget = new javax.swing.JButton();
        txtinputid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabledata = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        deleteById = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        student_information = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Mobile:");

        txtid.setBackground(new java.awt.Color(204, 204, 204));

        txtname.setBackground(new java.awt.Color(204, 204, 204));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));

        txtaddress.setBackground(new java.awt.Color(204, 204, 204));

        txtmobile.setBackground(new java.awt.Color(204, 204, 204));

        btnsend.setBackground(new java.awt.Color(0, 102, 102));
        btnsend.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsend.setForeground(new java.awt.Color(255, 255, 255));
        btnsend.setText("Save");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        txtarea.setBackground(new java.awt.Color(204, 204, 204));
        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btnget.setBackground(new java.awt.Color(0, 102, 102));
        btnget.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnget.setForeground(new java.awt.Color(255, 255, 255));
        btnget.setText("Show Data");
        btnget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetActionPerformed(evt);
            }
        });

        txtinputid.setBackground(new java.awt.Color(204, 204, 204));
        txtinputid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinputidActionPerformed(evt);
            }
        });

        jtabledata.setBackground(new java.awt.Color(244, 236, 236));
        jtabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Address", "Mobile"
            }
        ));
        jScrollPane2.setViewportView(jtabledata);

        delete.setBackground(new java.awt.Color(0, 102, 102));
        delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        deleteById.setBackground(new java.awt.Color(204, 204, 204));

        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        student_information.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        student_information.setForeground(new java.awt.Color(0, 102, 102));
        student_information.setText("Student Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(student_information, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(student_information, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deleteById, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtinputid)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 0, 0))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtaddress)
                                    .addComponent(txtmobile))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(btnget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtinputid)
                                .addGap(18, 18, 18)
                                .addComponent(deleteById, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed

    try {
      DefaultTableModel model = (DefaultTableModel) jtabledata.getModel();
      StudentModel student = new StudentModel();
      int input_id = Integer.parseInt(txtid.getText());
      student.setId(input_id);
      student.setName(txtname.getText());
      student.setEmail(txtemail.getText());
      student.setAddress(txtaddress.getText());
      student.setMobile(txtmobile.getText());
      PreparedStatement ps = null;
      ps = (PreparedStatement) con.connection().prepareStatement("insert into  bashir.student_data values (?, ?, ?, ?, ?)");
      ps.setInt(1, student.getId());
      ps.setString(2, student.getName());
      ps.setString(3, student.getEmail());
      ps.setString(4, student.getAddress());
      ps.setString(5, student.getMobile());
      int data = (int) ps.executeUpdate();
      if (data == 1) {
        txtid.setText("");
        txtname.setText("");
        txtemail.setText("");
        txtaddress.setText("");
        txtmobile.setText("");
        JOptionPane.showMessageDialog(null, "successful, data saved in database");
      }

      String query = "select * from bashir.student_data where id=" + input_id;
      Statement stmt = (Statement) con.connection().createStatement();
      ResultSet rs = (ResultSet) stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        String address = rs.getString("address");
        String mobile = rs.getString("mobile");
        //System.out.println("id is: " + id + "\nName is: " + name + "\nEmail is: "+ email + "\nAddrss is: " + address + "\nMobile is: " + mobile);
        model.addRow(new Object[]{id, name, email, address, mobile});
      }

//      int id = Integer.parseInt(txtid.getText());
//      String name = txtname.getText();
//      String email = txtemail.getText();
//      String address = txtaddress.getText();
//      String mobile = txtmobile.getText();
//      txtarea.setText("id is: " + id + "\nName is: " + name + "\nEmail is: "+ email + "\nAddrss is: " + address + "\nMobile is: " + mobile);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }//GEN-LAST:event_btnsendActionPerformed

  private void btngetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetActionPerformed
    try {
      ResultSet rs = null;
      PreparedStatement ps = null;
      ps = (PreparedStatement) con.connection().prepareStatement("select * from bashir.student_data where id = ?");
      ps.setInt(1, Integer.parseInt(txtinputid.getText()));

      rs = (ResultSet) ps.executeQuery();

      if (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String email = rs.getString(3);
        String address = rs.getString(4);
        String mobile = rs.getString(5);
        //System.out.println(" " + name);
        txtarea.setText("ID \t: " + id + "\nName \t: " + name + "\nEmail \t: " + email 
                + "\nAddrss \t: " + address + "\nMobile \t: " + mobile);
      }

    } catch (SQLException | NumberFormatException e) {
    }
  }//GEN-LAST:event_btngetActionPerformed

  
  
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        String sql = "delete from student_data where id=" + Integer.parseInt(deleteById.getText());
        try {
            PreparedStatement ps= (PreparedStatement) con.connection().prepareStatement(sql);
            

            ps.executeUpdate();
            System.out.println("Record deleted successfully");
        } catch (SQLException e) {
        }
        
        

        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void txtinputidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinputidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinputidActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        DefaultTableModel model = (DefaultTableModel) jtabledata.getModel();
        model.setRowCount(0);
    String query = "select * from bashir.student_data";
    Statement stmt = null;
      try {
          stmt = (Statement) con.connection().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(query);
          while (rs.next()) {
              int id = rs.getInt("id");
              String name = rs.getString("name");
              String email = rs.getString("email");
              String address = rs.getString("address");
              String mobile = rs.getString("mobile");
              //System.out.println("id is: " + id + "\nName is: " + name + "\nEmail is: "+ email + "\nAddrss is: " + address + "\nMobile is: " + mobile);
              model.addRow(new Object[]{id, name, email, address, mobile});
          }
      } catch (SQLException ex) {
          Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
      }
     
    }//GEN-LAST:event_refreshActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          new Student().setVisible(true);
        } catch (SQLException ex) {
          Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnget;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton delete;
    private javax.swing.JTextField deleteById;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtabledata;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel student_information;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtinputid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
