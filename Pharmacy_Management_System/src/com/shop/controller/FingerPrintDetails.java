/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.controller;

import com.shop.util.DBConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Bashir Hossain
 */
public class FingerPrintDetails extends javax.swing.JFrame {
    

    //=========== Fixed time for showing massage Dialog box ==================//
    private static final int TIME_VISIBLE = 1500;
    
    Connection con;
    Statement prst; 
    

public FingerPrintDetails() {
    initComponents();
    EntryTable();
    ExitTable();
    AssignnedFingerTable();
    ExitTimeTable2();
    EntryTimeTable2();
    getContentPane().setBackground(new java.awt.Color(158, 158, 158));
}

public void searchReset() {

      // id.setText("");
       fId.setText("");
       fName.setText("");
       fDesignation.setText("");
       fInTime.setText("");
       fInTime.setText("");
       exittime.setText("");
       //entrySearch.setText("");
    }


 //============= DATABASE TABLE SHOWING IN FORM ========================//
   private void EntryTimeTable2() {
    try {
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from in_time";
        PreparedStatement prst = con.prepareStatement(sql);
        ResultSet rs = prst.executeQuery();
        entryTimeTable2.setModel(DbUtils.resultSetToTableModel(rs));

        prst.close();
        rs.close();
        con.close();
    }catch(Exception e) {
    //JOptionPane.showMessageDialog(null, e);
    }
    }


 //============= DATABASE TABLE SHOWING IN FORM ========================//
   private void ExitTimeTable2() {
    try {
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from exit_time";
        PreparedStatement prst = con.prepareStatement(sql);
        ResultSet rs = prst.executeQuery();
        exitTimeTable2.setModel(DbUtils.resultSetToTableModel(rs));

        prst.close();
        rs.close();
        con.close();
    }catch(Exception e) {
    //JOptionPane.showMessageDialog(null, e);
    }
    }

  //============= DATABASE TABLE SHOWING IN FORM ========================//
   private void ExitTable() {
    try {
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from exit_time";
        PreparedStatement prst = con.prepareStatement(sql);
        ResultSet rs = prst.executeQuery();
        exit.setModel(DbUtils.resultSetToTableModel(rs));

        prst.close();
        rs.close();
        con.close();
    }catch(Exception e) {
    //JOptionPane.showMessageDialog(null, e);
    }
    }
   
     private void EntryTable() {
     try {
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from in_time";
        PreparedStatement prst = con.prepareStatement(sql);
        ResultSet rs = prst.executeQuery();
        entry.setModel(DbUtils.resultSetToTableModel(rs));

        prst.close();
        rs.close();
        con.close();
    }catch(Exception e) {
    //JOptionPane.showMessageDialog(null, e);
    }
    }

     
     
    private void AssignnedFingerTable() {
     try {
         con = DBConnection.getConnection();
         prst = con.createStatement();
         String sql = "select * from assigned_finger";

         PreparedStatement prst = con.prepareStatement(sql);


         ResultSet rs = prst.executeQuery();
         assignedFinger.setModel(DbUtils.resultSetToTableModel(rs));

         prst.close();
         rs.close();
         con.close();
     }catch (Exception e) {
      //JOptionPane.showMessageDialog(null, e);
     }
    }


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryTime = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        entry = new javax.swing.JTable();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        entrySearch = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        exit = new javax.swing.JTable();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        exitSearch = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        assignedFinger = new javax.swing.JTable();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fId = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        fDesignation = new javax.swing.JTextField();
        fInTime = new javax.swing.JTextField();
        deleteAllExitRecord = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        entryTimeTable2 = new javax.swing.JTable();
        DeleteExit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        exittime = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        exitTimeTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        deleteAllEntryRecord = new javax.swing.JButton();
        deleteEntry = new javax.swing.JButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entryTime.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLayeredPane1.setBackground(new java.awt.Color(0, 153, 153));
        jLayeredPane1.setOpaque(true);

        entry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "finger_id", "name", "designation", "in_time"
            }
        ));
        jScrollPane2.setViewportView(entry);

        jLayeredPane7.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/fingerprint2.gif"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        entrySearch.setBackground(new java.awt.Color(0, 153, 102));
        entrySearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        entrySearch.setForeground(new java.awt.Color(255, 255, 255));
        entrySearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        entrySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrySearchActionPerformed(evt);
            }
        });
        entrySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entrySearchKeyReleased(evt);
            }
        });

        jLayeredPane7.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(entrySearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entrySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane7))
        );

        entryTime.addTab("ENTRY TIME", jLayeredPane1);

        jLayeredPane2.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane2.setOpaque(true);

        exit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(exit);

        jLayeredPane8.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/fingerprint2.gif"))); // NOI18N
        jLabel8.setBorder(null);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        exitSearch.setBackground(new java.awt.Color(0, 153, 153));
        exitSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exitSearch.setForeground(new java.awt.Color(255, 255, 255));
        exitSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        exitSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitSearchActionPerformed(evt);
            }
        });
        exitSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                exitSearchKeyReleased(evt);
            }
        });

        jLayeredPane8.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(exitSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        entryTime.addTab("EXIT TIME", jLayeredPane2);

        assignedFinger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(assignedFinger);

        jLayeredPane3.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        entryTime.addTab("ASSIGNED FINGER", jLayeredPane3);

        jLayeredPane4.setBackground(new java.awt.Color(0, 153, 153));
        jLayeredPane4.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Finger ID :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Designation : ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("In Time :");

        fId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fIdActionPerformed(evt);
            }
        });

        fName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        fDesignation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fDesignationActionPerformed(evt);
            }
        });

        fInTime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        deleteAllExitRecord.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteAllExitRecord.setText("Delete All Exit Record");
        deleteAllExitRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllExitRecordActionPerformed(evt);
            }
        });

        entryTimeTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        entryTimeTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entryTimeTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(entryTimeTable2);

        DeleteExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteExit.setText("Delete Exit by Finger ID");
        DeleteExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteExitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Exit Time : ");

        exittime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        exitTimeTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        exitTimeTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTimeTable2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(exitTimeTable2);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Entry Time");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Exit Time");

        deleteAllEntryRecord.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteAllEntryRecord.setText("Delete All Entry Record");
        deleteAllEntryRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllEntryRecordActionPerformed(evt);
            }
        });

        deleteEntry.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteEntry.setText("Delete Entry by Finger ID");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(fId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(fName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(fDesignation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(fInTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(deleteAllExitRecord, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(DeleteExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(exittime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(deleteAllEntryRecord, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(deleteEntry, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(exittime, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(fInTime))
                                    .addComponent(fDesignation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(fName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteAllEntryRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteAllExitRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(275, 275, 275))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addGap(682, 682, 682)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(280, 280, 280))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fInTime, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exittime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(126, 126, 126)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteAllEntryRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteAllExitRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        entryTime.addTab("FINGER PROCESS", jLayeredPane4);

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
        jLayeredPane6.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane6.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attendence");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane6)
                    .addComponent(entryTime))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryTime, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fIdActionPerformed

    private void fDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fDesignationActionPerformed

    private void entrySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrySearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrySearchActionPerformed

    private void exitSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
      new Dashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    //======================== Entry Finger Print ============================//
    private void entrySearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrySearchKeyReleased
    String search = entrySearch.getText().trim();  //For auto search
    if (search.equals("")) {
    searchReset();
    }else{
      try{
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from assigned_finger where finger_id = ?";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, entrySearch.getText());
        ResultSet rs = prst.executeQuery();

        if (rs.next()) {
            fId.setText(rs.getString("finger_id"));
            fName.setText(rs.getString("name"));
            fDesignation.setText(rs.getString("dessignation"));

            EntryTable();
            //ExitTable();
            //AssignnedFingerTable();

            prst.close();
            rs.close();
            con.close(); 
        } else {

        }
        } catch (Exception e) {
        //JOptionPane.showMessageDialog(null, e);
        }

        try {
        con = DBConnection.getConnection();
        prst = con.createStatement();

        //========= ADD/INSERT/SAVE DATA BY SELL Button ==============//
        String sql = "insert into in_time (finger_id, name, designation, in_time ) values (?,?,?,?)";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, fId.getText());
        prst.setString(2, fName.getText());
        prst.setString(3, fDesignation.getText());
        prst.setTimestamp(4, new java.sql.Timestamp(new Date().getTime()));

        prst.executeUpdate();
        
                        //=================== Auto Close Massage Dialoguebox =====================//
                JOptionPane pane = new JOptionPane("Processed Successfully", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "Finger Print");
                dialog.setModal(false);
                dialog.setVisible(true);

                new Timer(TIME_VISIBLE, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
        
        EntryTable();
        ExitTimeTable2();
        EntryTimeTable2();
        prst.close();
        con.close(); 
    } catch (Exception e) {
                                       //=================== Auto Close Massage Dialoguebox =====================//
                JOptionPane pane = new JOptionPane("Invalid Finger", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "Finger Print");
                dialog.setModal(false);
                dialog.setVisible(true);

                new Timer(TIME_VISIBLE, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
    }

    }
    }//GEN-LAST:event_entrySearchKeyReleased

    private void deleteAllExitRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllExitRecordActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from exit_time ";

            PreparedStatement prst = con.prepareStatement(sql);
            //prst.setString(1, barcodeField11.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

            ExitTable();
            ExitTimeTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteAllExitRecordActionPerformed

    
    
    private void exitSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitSearchKeyPressed
    
    }//GEN-LAST:event_exitSearchKeyPressed

    //===================== Exit Finger Proccess =============================//
    private void exitSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitSearchKeyReleased
    String search = exitSearch.getText().trim();  //For auto search
    if (search.equals("")) {
    //searchReset();
    }else{
      try{
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from assigned_finger where finger_id = ?";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, exitSearch.getText());
        ResultSet rs = prst.executeQuery();

        if (rs.next()) {
            fId.setText(rs.getString("finger_id"));
            fName.setText(rs.getString("name"));
            fDesignation.setText(rs.getString("dessignation"));

            //EntryTable();
            ExitTable();
            //AssignnedFingerTable();

        } else {
        //JOptionPane.showMessageDialog(null, Successfull);
        }
        } catch (Exception e) {
        //JOptionPane.showMessageDialog(null, e);
        }

        try {
        con = DBConnection.getConnection();
        prst = con.createStatement();

        //========= ADD/INSERT/SAVE DATA BY SELL Button ==============//
        String sql = "insert into exit_time (finger_id, name, designation, exit_time ) values (?,?,?,?)";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, fId.getText());
        prst.setString(2, fName.getText());
        prst.setString(3, fDesignation.getText());
        prst.setTimestamp(4, new java.sql.Timestamp(new Date().getTime()));

        prst.executeUpdate();
      
                        //=================== Auto Close Massage Dialoguebox =====================//
                JOptionPane pane = new JOptionPane("Processed Successfully", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "Finger Print");
                dialog.setModal(false);
                dialog.setVisible(true);

                new Timer(TIME_VISIBLE, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
        
        ExitTable();
        ExitTimeTable2();
        EntryTimeTable2();  
        prst.close();
        con.close(); 
    } catch (Exception e) {
                                //=================== Auto Close Massage Dialoguebox =====================//
                JOptionPane pane = new JOptionPane("Invalid Finger Print", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "Finger Print");
                dialog.setModal(false);
                dialog.setVisible(true);

                new Timer(TIME_VISIBLE, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
    }

    }
    }//GEN-LAST:event_exitSearchKeyReleased

    private void exitTimeTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTimeTable2MouseClicked
        DefaultTableModel dr = (DefaultTableModel) exitTimeTable2.getModel();
    int sindex = exitTimeTable2.getSelectedRow();

    //id.setText((String) dr.getValueAt(sindex, 1));
    fId.setText((String) dr.getValueAt(sindex, 1));
    fName.setText((String) dr.getValueAt(sindex, 2));
    fDesignation.setText((String) dr.getValueAt(sindex, 3));
    exittime.setText((String) dr.getValueAt(sindex, 4));
    }//GEN-LAST:event_exitTimeTable2MouseClicked

    private void entryTimeTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entryTimeTable2MouseClicked
            DefaultTableModel dr = (DefaultTableModel) entryTimeTable2.getModel();
    int sindex = entryTimeTable2.getSelectedRow();

    //id.setText((String) dr.getValueAt(sindex, 1));
    fId.setText((String) dr.getValueAt(sindex, 1));
    fName.setText((String) dr.getValueAt(sindex, 2));
    fDesignation.setText((String) dr.getValueAt(sindex, 3));
    fInTime.setText((String) dr.getValueAt(sindex, 4));
    }//GEN-LAST:event_entryTimeTable2MouseClicked

    private void DeleteExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteExitActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from exit_time where finger_id = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, fId.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            JOptionPane.showConfirmDialog(null, "Deleted Successfully");
            
            ExitTimeTable2();
            ExitTable();
            con.close();
            prst.close();
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_DeleteExitActionPerformed

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEntryActionPerformed
         try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from in_time where finger_id = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, fId.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            JOptionPane.showConfirmDialog(null, "Deleted Successfully");
            
            EntryTable();
            EntryTimeTable2();
            con.close();
            prst.close();
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteEntryActionPerformed

    private void deleteAllEntryRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllEntryRecordActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from in_time ";

            PreparedStatement prst = con.prepareStatement(sql);
            //prst.setString(1, barcodeField11.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

            EntryTable();
            EntryTimeTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteAllEntryRecordActionPerformed

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
        java.util.logging.Logger.getLogger(FingerPrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(FingerPrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(FingerPrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(FingerPrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new FingerPrintDetails().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteExit;
    private javax.swing.JTable assignedFinger;
    private javax.swing.JButton deleteAllEntryRecord;
    private javax.swing.JButton deleteAllExitRecord;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JTable entry;
    private javax.swing.JTextField entrySearch;
    private javax.swing.JTabbedPane entryTime;
    private javax.swing.JTable entryTimeTable2;
    private javax.swing.JTable exit;
    private javax.swing.JTextField exitSearch;
    private javax.swing.JTable exitTimeTable2;
    private javax.swing.JTextField exittime;
    private javax.swing.JTextField fDesignation;
    private javax.swing.JTextField fId;
    private javax.swing.JTextField fInTime;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

//    void setfId(String fingerId) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
//    public void setMiniFinger(){
//        
//    }
}
