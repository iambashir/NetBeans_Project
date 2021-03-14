package main;

import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
*
* @author Bashir Hossain
*/
public class SavingData extends javax.swing.JFrame {

    //========= RESET METHOD CRATED TO CALL FROM ANYWHERE ==========//
    public void reset(){
    rollField.setText("");
    nameField.setText("");
    }

    public SavingData() {
    initComponents();
    //======================== JFRAME COLOUR CHANGE =========================================//
    getContentPane().setBackground(java.awt.Color.orange);
    //============= CALLING DATABASE TABLE TO ADJUSTING FORM TABLE ========================//
    DisplayTable();//Calling The table
    }
    
    
    //============= DATABASE TABLE SHOWING IN FORM ========================//
    private void DisplayTable(){
    
    try{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
    String sql = "select * from saving_data";
    
    PreparedStatement prst = con.prepareStatement(sql);
    ResultSet rs = prst.executeQuery();
    dbTable.setModel(DbUtils.resultSetToTableModel(rs));
   
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    }

    
    //============================ SWING DEFAULT SYSTEM CODE START ========================//
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLB = new javax.swing.JLabel();
        rollField = new javax.swing.JTextField();
        rollLB = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        resetField = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        showDataButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Window");
        setBackground(new java.awt.Color(0, 153, 153));

        nameLB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameLB.setForeground(new java.awt.Color(0, 102, 102));
        nameLB.setText("Name :");

        rollField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rollField.setForeground(new java.awt.Color(0, 102, 102));
        rollField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollFieldActionPerformed(evt);
            }
        });

        rollLB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rollLB.setForeground(new java.awt.Color(0, 102, 102));
        rollLB.setText("Roll No: ");

        nameField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 102, 102));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 102, 102));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resetField.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        resetField.setForeground(new java.awt.Color(0, 102, 102));
        resetField.setText("Reset");
        resetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFieldActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 102, 102));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 102, 102));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 102, 102));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 102, 102));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 102, 102));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        dbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(dbTable);

        refreshButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 102, 102));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        showDataButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        showDataButton.setForeground(new java.awt.Color(0, 102, 102));
        showDataButton.setText("Show Data");
        showDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rollLB, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addComponent(rollField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollLB)
                            .addComponent(rollField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resetField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    //=============================== INSERTING/SAVING/ADDING DATA =====================================//                    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    
    try{
    //==========Same code for every connection==========//
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
    String sql = "insert into saving_data values (?, ?)"; // "?" is for table row number and saving_data is database table name
    
    //========= ADD/INSERT/SAVE DATA ==============//
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText())); // this is for number 1 field
    prst.setString(2, nameField.getText()); // this is for number 2 field

    prst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Saved successfully"); //after submission popup massage window
    
    
    
    DisplayTable(); //Afetr saving refresh the table by calling this Method
    
    
    con.close(); //after completing task close the popup window
    } 
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_saveButtonActionPerformed

    
    
    //=========================== CRATED FORM FILED =======================//
    private void rollFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollFieldActionPerformed

    }//GEN-LAST:event_rollFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

  
    
   //========================= RESET YOUR FIELD ============================//
    private void resetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFieldActionPerformed
    rollField.setText("");
    nameField.setText("");
    
    // OR WRITE reset();
    }//GEN-LAST:event_resetFieldActionPerformed

    
    
    //============================ EXIT WINDOW======================================//
    private JFrame frame;
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","HOME PAGE",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }  
    }//GEN-LAST:event_exitButtonActionPerformed
    
    
    
    //==================== MOVING ONE JFRAME TO ANOTHER JFRAME ===================//
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
         
        this.setVisible(false);
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    
    //============================ SEARCH DATA==============================//
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
    
    try{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
    String sql = "select * from saving_data where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText()));
    
    ResultSet rs = prst.executeQuery();
    if(rs.next()){
       nameField.setText(rs.getString("name"));
    }
    else
    {
     JOptionPane.showMessageDialog(null, "Record Not found");
    }
    con.close(); //after completing task close the popup window
    } 
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_searchButtonActionPerformed

    
    //============================ UPDATE DATA ==============================//
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
                                                
    try{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
    String sql = "update saving_data set name = ?  where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setString(1, nameField.getText());
    prst.setInt(2, Integer.parseInt(rollField.getText()));
    
    prst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Record Updated successfully");
    
    
    DisplayTable();//Refresh Table
   
    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    } 
    }//GEN-LAST:event_updateButtonActionPerformed

    
    //============================ UPDATE DATA ==============================//
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
     
    try{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
    String sql = "delete from saving_data where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText()));
    
    prst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Record Deleted successfully");
   
    rollField.setText("");
    nameField.setText("");
    
    DisplayTable();//Refresh Table
    
    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_deleteButtonActionPerformed
    

    //================ REFRESHING TABLE BY CALLING TABLE FUNCTION ===========// 
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
     DisplayTable();//Refresh Table 
    }//GEN-LAST:event_refreshButtonActionPerformed

    
    
    //===================== SHOW TEXT ============================//
    private void showDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataButtonActionPerformed
    
    try{
        
    com.mysql.jdbc.ResultSet rs = null;
    com.mysql.jdbc.PreparedStatement prst = null;
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
    String sql = "select * from saving_data where roll_no = ?)"; // "?" is for table row number and saving_data is database table name
    
    //PreparedStatement prst = con.prepareStatement(sql);
    
    prst.setInt(1, Integer.parseInt(rollField.getText()));

    prst.executeQuery();
    
    if (rs.next()) {
        int roll_no = rs.getInt(1);
        String name = rs.getString(2);
        
        textArea.setText("Roll No \t: " + roll_no + "\nName \t: " + name);
      }
    
    
    JOptionPane.showMessageDialog(null, "Saved successfully"); //after submission popup massage window
    

    con.close(); //after completing task close the popup window
    } 
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_showDataButtonActionPerformed

    
    
    //===================Swing default code Start===========================//
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
            java.util.logging.Logger.getLogger(SavingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SavingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SavingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SavingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SavingData().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dbTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLB;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetField;
    private javax.swing.JTextField rollField;
    private javax.swing.JLabel rollLB;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showDataButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
    //=====================Swing default code End==========================//