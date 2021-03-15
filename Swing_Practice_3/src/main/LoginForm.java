
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 * @author Bashir Hossain
 */


public class LoginForm extends javax.swing.JFrame {

    //=============Creates new form LoginForm====================//
    public LoginForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelFieldset = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelUserName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setBackground(new java.awt.Color(0, 102, 102));

        LabelFieldset.setBackground(new java.awt.Color(0, 102, 102));
        LabelFieldset.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER LOGIN ");

        LabelUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelUserName.setForeground(new java.awt.Color(255, 255, 255));
        LabelUserName.setText("User name:");

        password.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");

        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LoginButton.setBackground(new java.awt.Color(0, 51, 51));
        LoginButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(0, 51, 51));
        resetButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LabelFieldsetLayout = new javax.swing.GroupLayout(LabelFieldset);
        LabelFieldset.setLayout(LabelFieldsetLayout);
        LabelFieldsetLayout.setHorizontalGroup(
            LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelFieldsetLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LabelFieldsetLayout.createSequentialGroup()
                        .addGroup(LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LabelFieldsetLayout.createSequentialGroup()
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        LabelFieldsetLayout.setVerticalGroup(
            LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelFieldsetLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(LabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(LabelFieldsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFieldset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFieldset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //====================Database Connection to Login Form===================//
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
     String sql = " select * from home_login where user_name = ? and password = ?";
    try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swing_practice", "root", "1234");
        PreparedStatement prst = con.prepareStatement(sql); //PreparedStatement is for security

        prst.setString(1, userNameField.getText()); 
        prst.setString(2, new String (passwordField.getPassword())); 

        ResultSet rs = prst.executeQuery(); //For executing query
            if(rs.next()) 
            {
            JOptionPane.showMessageDialog(null, "Welcome " + userNameField.getText(), "Login Successfull ", JOptionPane.PLAIN_MESSAGE );
            
            //============Open Registration Form===============//
            this.setVisible(false);
            new RegistrationForm().setVisible(true);
            
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
    }//GEN-LAST:event_LoginButtonActionPerformed
 
    
    
    
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        userNameField.setText("");
        passwordField.setText("");
        
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabelFieldset;
    private javax.swing.JLabel LabelUserName;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
