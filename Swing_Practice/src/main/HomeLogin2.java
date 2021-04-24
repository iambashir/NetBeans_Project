
package main;

import dao.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.regex.*;



/**
 *
 * @author Bashir Hossain
 */
public class HomeLogin2 extends javax.swing.JFrame {

    Connection con;
    Statement prst;

public HomeLogin2() {
    initComponents();
}


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginPaneLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        adminLoginLabel2 = new javax.swing.JLabel();
        adminUserLabel3 = new javax.swing.JLabel();
        adminPasswordLabel4 = new javax.swing.JLabel();
        adminField1 = new javax.swing.JTextField();
        adminLoginButton2 = new javax.swing.JButton();
        passwordField2 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        adminIconButton4 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        salesUserLabel5 = new javax.swing.JLabel();
        salesPasswordLabel6 = new javax.swing.JLabel();
        salesLoginLabel7 = new javax.swing.JLabel();
        salesField4 = new javax.swing.JTextField();
        salesLoginButton3 = new javax.swing.JButton();
        PasswordField1 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        salesIconButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUPERSHOP  MANAGEMANT  SYSTEM - Login Window");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        loginPaneLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        loginPaneLabel1.setForeground(new java.awt.Color(255, 255, 255));
        loginPaneLabel1.setText("LOGIN");

        jLayeredPane1.setBackground(new java.awt.Color(0, 102, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        adminLoginLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adminLoginLabel2.setForeground(new java.awt.Color(255, 255, 255));
        adminLoginLabel2.setText("Admin Login");

        adminUserLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adminUserLabel3.setForeground(new java.awt.Color(255, 255, 255));
        adminUserLabel3.setText("User Name : ");

        adminPasswordLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adminPasswordLabel4.setForeground(new java.awt.Color(255, 255, 255));
        adminPasswordLabel4.setText("Password : ");

        adminLoginButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adminLoginButton2.setText("login");
        adminLoginButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        adminLoginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLayeredPane3.setLayer(adminLoginLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(adminUserLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(adminPasswordLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(adminField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(adminLoginButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(passwordField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLoginLabel2)
                .addGap(160, 160, 160))
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(adminUserLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(adminPasswordLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminField1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(passwordField2)))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(adminLoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(adminLoginLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminUserLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminPasswordLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(passwordField2)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(adminLoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        adminIconButton4.setBackground(new java.awt.Color(51, 51, 51));
        adminIconButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/login.png"))); // NOI18N
        adminIconButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        adminIconButton4.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(adminIconButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
            .addComponent(adminIconButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane4.setForeground(new java.awt.Color(255, 255, 255));

        salesUserLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salesUserLabel5.setForeground(new java.awt.Color(255, 255, 255));
        salesUserLabel5.setText("User Name : ");

        salesPasswordLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salesPasswordLabel6.setForeground(new java.awt.Color(255, 255, 255));
        salesPasswordLabel6.setText("Password : ");

        salesLoginLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salesLoginLabel7.setForeground(new java.awt.Color(255, 255, 255));
        salesLoginLabel7.setText("Salesman Login");

        salesField4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        salesLoginButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salesLoginButton3.setText("Login");
        salesLoginButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        salesLoginButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesLoginButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLayeredPane4.setLayer(salesUserLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(salesPasswordLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(salesLoginLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(salesField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(salesLoginButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(PasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salesUserLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salesPasswordLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salesField4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(PasswordField1)))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(salesLoginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(salesLoginLabel7)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(salesLoginLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesUserLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesPasswordLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salesLoginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        salesIconButton1.setBackground(new java.awt.Color(0, 0, 0));
        salesIconButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/login2.png"))); // NOI18N
        salesIconButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        salesIconButton1.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(salesIconButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesIconButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
            .addComponent(jLayeredPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLayeredPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPaneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(loginPaneLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //================================= Salesman Login =====================================// 
    private void salesLoginButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesLoginButton3ActionPerformed
        String sql = " select * from login where sa_user = ? and sa_password = ?";
    try{
         con = DBConnection.getConnection();
         prst = con.createStatement();
         PreparedStatement prst = con.prepareStatement(sql);

         prst.setString(1, salesField4.getText()); 
         prst.setString(2, new String (PasswordField1.getPassword())); 

         ResultSet rs = prst.executeQuery(); //For executing query
         
        
         //============= Variable Create to use in Password ==========//
        String saName = salesField4.getText();
        String saPassword = new String (PasswordField1.getPassword());
        
            if(rs.next() && (!saName.equals("") && !saPassword.equals(""))) 
            {
            JOptionPane.showMessageDialog(null, "Welcome " + salesField4.getText(), "Login Successfull ", JOptionPane.PLAIN_MESSAGE );

//            this.setVisible(false);
//            new Dashboard().setVisible(true);
            
            } 
            else
            {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password" , "Login Unsuccessfull", JOptionPane.ERROR_MESSAGE );
            }
        con.close();
        }
   catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_salesLoginButton3ActionPerformed

    
    //================================= Admin Login =====================================// 
    private void adminLoginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButton2ActionPerformed
      
            String sql = " select * from login where ad_user = ? and ad_password = ?";
    try{
         con = DBConnection.getConnection();
         prst = con.createStatement();
         PreparedStatement prst = con.prepareStatement(sql);

         prst.setString(1, adminField1.getText()); 
         prst.setString(2, new String (passwordField2.getPassword())); 
         

         ResultSet rs = prst.executeQuery(); //For executing query

        String adName = adminField1.getText();
        String adPassword = new String (passwordField2.getPassword());
        
            if(rs.next() && (!adName.equals("") && !adPassword.equals("")))  
            {
            JOptionPane.showMessageDialog(null, "Welcome " + salesField4.getText(), "Login Successfull ", JOptionPane.PLAIN_MESSAGE );

            this.setVisible(false);
            new UserCreate().setVisible(true);
            
            } 
            else
            {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password" , "Login Unsuccessfull", JOptionPane.ERROR_MESSAGE );
            }
            
            
        con.close();
        }
    
   catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }    
        
        
    }//GEN-LAST:event_adminLoginButton2ActionPerformed

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
        java.util.logging.Logger.getLogger(HomeLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(HomeLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(HomeLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(HomeLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new HomeLogin2().setVisible(true);
    }
    });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JTextField adminField1;
    private javax.swing.JButton adminIconButton4;
    private javax.swing.JButton adminLoginButton2;
    private javax.swing.JLabel adminLoginLabel2;
    private javax.swing.JLabel adminPasswordLabel4;
    private javax.swing.JLabel adminUserLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel loginPaneLabel1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField salesField4;
    private javax.swing.JButton salesIconButton1;
    private javax.swing.JButton salesLoginButton3;
    private javax.swing.JLabel salesLoginLabel7;
    private javax.swing.JLabel salesPasswordLabel6;
    private javax.swing.JLabel salesUserLabel5;
    // End of variables declaration//GEN-END:variables
}
