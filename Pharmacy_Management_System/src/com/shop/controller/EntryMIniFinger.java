
package com.shop.controller;

import com.shop.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.shop.controller.FingerPrintDetails;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Bashir Hossain
 */
public class EntryMIniFinger extends javax.swing.JFrame {

        //=========== Fixed time for showing massage Dialog box ==================//
    private static final int TIME_VISIBLE = 1500;
    Connection con;
    Statement prst;
    
    
    
    public EntryMIniFinger() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        miniFingerPrintEntry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finger Print");
        setResizable(false);

        jLayeredPane2.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane2.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/fingerprint2.gif"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        miniFingerPrintEntry.setBackground(new java.awt.Color(0, 153, 102));
        miniFingerPrintEntry.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miniFingerPrintEntry.setForeground(new java.awt.Color(255, 255, 255));
        miniFingerPrintEntry.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        miniFingerPrintEntry.setOpaque(true);
        miniFingerPrintEntry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                miniFingerPrintEntryKeyReleased(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(miniFingerPrintEntry, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miniFingerPrintEntry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miniFingerPrintEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entry");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void resetFinger() {
        miniFingerPrintEntry.setText("");

    }
    
    private void miniFingerPrintEntryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miniFingerPrintEntryKeyReleased

                  String search = miniFingerPrintEntry.getText().trim();  //For auto search
    if (search.equals("")) {
    //searchReset();
    }else{
       
        String miniEntryFinger = miniFingerPrintEntry.getText();
        FingerPrintDetails entryFinger = new FingerPrintDetails();
        
       // entryFinger.setMiniFinger(miniEntryFinger);
        

    }


//          String search = miniFingerPrintEntry.getText().trim();  //For auto search
//    if (search.equals("")) {
//    //searchReset();
//    }else{
//      try{
//        con = DBConnection.getConnection();
//        prst = con.createStatement();
//        String sql = "select * from assigned_finger where finger_id = ?";
//        PreparedStatement prst = con.prepareStatement(sql);
//        prst.setString(1, miniFingerPrintEntry.getText());
//        ResultSet rs = prst.executeQuery();
//
//        if (rs.next()) {
////            fId.setText(rs.getString("finger_id"));
////            fName.setText(rs.getString("name"));
////            fDesignation.setText(rs.getString("dessignation"));
//
//           // EntryTable();
//            //ExitTable();
//            //AssignnedFingerTable();
//
//            prst.close();
//            rs.close();
//            con.close(); 
//        } else {
//
//        }
//        } catch (Exception e) {
//        //JOptionPane.showMessageDialog(null, e);
//        }
//
//        try {
//        con = DBConnection.getConnection();
//        prst = con.createStatement();
//
//        //========= ADD/INSERT/SAVE DATA BY SELL Button ==============//
//        String sql = "insert into in_time (finger_id, name, designation, in_time ) values (?,?,?,?)";
//        PreparedStatement prst = con.prepareStatement(sql);
////        prst.setString(1, fId.getText());
////        prst.setString(2, fName.getText());
////        prst.setString(3, fDesignation.getText());
//        prst.setTimestamp(4, new java.sql.Timestamp(new Date().getTime()));
//
//        prst.executeUpdate();
//        
//                        //=================== Auto Close Massage Dialoguebox =====================//
//                JOptionPane pane = new JOptionPane("Processed Successfully", JOptionPane.INFORMATION_MESSAGE);
//                JDialog dialog = pane.createDialog(null, "Finger Print");
//                dialog.setModal(false);
//                dialog.setVisible(true);
//
//                new Timer(TIME_VISIBLE, new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        dialog.setVisible(false);
//                    }
//                }).start();
//        
//        //EntryTable();
//        //ExitTable();
//       // AssignnedFingerTable();
//        //searchReset();
//        prst.close();
//        con.close(); 
//    } catch (Exception e) {
//                                       //=================== Auto Close Massage Dialoguebox =====================//
//                JOptionPane pane = new JOptionPane("Invalid Finger", JOptionPane.INFORMATION_MESSAGE);
//                JDialog dialog = pane.createDialog(null, "Finger Print");
//                dialog.setModal(false);
//                dialog.setVisible(true);
//
//                new Timer(TIME_VISIBLE, new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        dialog.setVisible(false);
//                    }
//                }).start();
//    }
//
//    }
        
    }//GEN-LAST:event_miniFingerPrintEntryKeyReleased

 
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
            java.util.logging.Logger.getLogger(EntryMIniFinger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryMIniFinger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryMIniFinger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryMIniFinger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryMIniFinger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField miniFingerPrintEntry;
    // End of variables declaration//GEN-END:variables
}
