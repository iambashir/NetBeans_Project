
package com.shop.controller;

import com.shop.util.DBConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Bashir Hossain
 * 
 **/

public class Supplier extends javax.swing.JFrame {
    
    Connection con;
    Statement prst; 
    
public Supplier() {
    initComponents();
    getContentPane().setBackground(new java.awt.Color(158, 158, 158));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//close one jframe without closing other
    supplierDetails();
}

    //========= RESET METHOD CRATED TO CALL FROM ANYWHERE ==========//
    public void resetSuplierField() {
        sCode.setText("");
        sName.setText("");
        sBrand.setText("");
        sContact.setText("");
        sAddress.setText("");
    }



@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        supplierAdd = new javax.swing.JButton();
        supplierReset = new javax.swing.JButton();
        sName = new javax.swing.JTextField();
        sBrand = new javax.swing.JTextField();
        sContact = new javax.swing.JTextField();
        sAddress = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        suplierTable = new javax.swing.JTable();
        sCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane5.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane5.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLayeredPane6.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane6.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/ship.png"))); // NOI18N
        jLabel1.setText("Supplier");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/logout.png"))); // NOI18N
        jButton1.setText("Log Out");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jLayeredPane6.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23))
        );

        jLayeredPane9.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane9.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier Code :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand : ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");

        supplierAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        supplierAdd.setForeground(new java.awt.Color(0, 102, 102));
        supplierAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        supplierAdd.setText("Add");
        supplierAdd.setIconTextGap(5);
        supplierAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAddActionPerformed(evt);
            }
        });

        supplierReset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        supplierReset.setForeground(new java.awt.Color(0, 102, 102));
        supplierReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        supplierReset.setText("Reset ");
        supplierReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierResetActionPerformed(evt);
            }
        });

        sName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameActionPerformed(evt);
            }
        });

        sBrand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBrandActionPerformed(evt);
            }
        });

        sContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        sAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        jButton7.setText("Update");

        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        jButton8.setText("Delete");

        suplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Supplier_code", "Supplier_Name", "Brand", "Contact", "Address"
            }
        ));
        suplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suplierTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(suplierTable);

        sCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLayeredPane9.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(supplierAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(supplierReset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(sName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(sBrand, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(sContact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(sAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(sCode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane9Layout = new javax.swing.GroupLayout(jLayeredPane9);
        jLayeredPane9.setLayout(jLayeredPane9Layout);
        jLayeredPane9Layout.setHorizontalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addComponent(supplierAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supplierReset)
                        .addGap(8, 8, 8)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sName)
                            .addComponent(sBrand)
                            .addComponent(sContact)
                            .addComponent(sAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(sCode))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane9Layout.setVerticalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sCode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sContact, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(supplierAdd)
                        .addComponent(supplierReset))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7)))
                .addGap(16, 16, 16))
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane6)
                    .addComponent(jLayeredPane9))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane9)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
      new Dashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameActionPerformed

    private void sBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sBrandActionPerformed
  
    
    //======================== Showing Data to table =========================//
     private void supplierDetails() {
        int c;
        try {
            con = DBConnection.getConnection();
             prst = con.createStatement();
            String sql = "select * from supplier";
            
            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel dr = (DefaultTableModel) suplierTable.getModel();
            dr.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= c; a++) {
                    v2.add(rs.getString("supplier_code"));
                    v2.add(rs.getString("supplier_name"));
                    v2.add(rs.getString("brand"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("address"));
                    
                }
                dr.addRow(v2);
            }

        } catch (SQLException ex) {
           // Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     
    //=================== Save Data to Supplier table ========================//
    private void supplierAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAddActionPerformed
    try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //========= ADD/INSERT/SAVE DATA ==============//
            String sql = "insert into supplier (supplier_code, supplier_name, brand, contact, address) values (?,?,?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, sCode.getText());
            prst.setString(2, sName.getText());
            prst.setString(3, sBrand.getText());
            prst.setString(4, sContact.getText());
            prst.setString(5, sAddress.getText());

            prst.executeUpdate();
            supplierDetails();
            
            JOptionPane.showMessageDialog(null, "Saved successfully");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_supplierAddActionPerformed

    
    private void supplierResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierResetActionPerformed
    resetSuplierField();
    }//GEN-LAST:event_supplierResetActionPerformed

    
    private void suplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suplierTableMouseClicked
    DefaultTableModel dr = (DefaultTableModel) suplierTable.getModel();
    int sindex = suplierTable.getSelectedRow();

    sCode.setText((String) dr.getValueAt(sindex, 1));
    sName.setText((String) dr.getValueAt(sindex, 2));
    sBrand.setText((String) dr.getValueAt(sindex, 3));
    sContact.setText((String) dr.getValueAt(sindex, 4));
    sAddress.setText((String) dr.getValueAt(sindex, 5));
    }//GEN-LAST:event_suplierTableMouseClicked

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
        java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Supplier().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField sAddress;
    private javax.swing.JTextField sBrand;
    private javax.swing.JTextField sCode;
    private javax.swing.JTextField sContact;
    private javax.swing.JTextField sName;
    private javax.swing.JTable suplierTable;
    private javax.swing.JButton supplierAdd;
    private javax.swing.JButton supplierReset;
    // End of variables declaration//GEN-END:variables

    void setfId(String fingerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
