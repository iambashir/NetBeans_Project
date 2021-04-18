
package com.shop.controller;

import com.shop.util.DBConnection;
//import com.shop.util.MySQLConnection;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Bashir Hossain
 */
public class AdminPanel extends javax.swing.JFrame {

    Connection con;
    Statement prst; 
    private ImageIcon format;
    
/**
 * Creates new form NewJFrame
 */
public AdminPanel() {
    initComponents();
   // DisplayTable();
   table_update();
   idtable();
   BillprocessTable();
   UserTable();
   AssignFingerTable();
   SellsHistory();
}


public void userCreateReset() {
        codes.setText("");
        branches.setText("");
        catagories.setText("");
        payments.setText("");
        
    }

public void idCardReset() {
        idNo.setText("");
        designations.setText("");
        names.setText("");
        contacts.setText("");
        addresses.setText("");
        bloods.setText("");
        dobs.setText("");
        appointDates.setText("");
        photo.setIcon(null);
        
    }

public void AllAdminFieldReset() {
        codes.setText("");
        branches.setText("");
        catagories.setText("");
        payments.setText("");
        
        idNo.setText("");
        designations.setText("");
        names.setText("");
        contacts.setText("");
        addresses.setText("");
        bloods.setText("");
        dobs.setText("");
        appointDates.setText("");
        photo.setIcon(null);
        
        billType.setText("");
        billAmount.setText("");
        billerName.setText("");
        entryDate.setText("");
        expiryDate.setText("");
        
        userTitle.setText("");
        userName.setText("");
        userPassword.setText("");
        
       //======== Clear Assign finger field =========//
        fingerID.setText("");
        fingerName.setText("");
        FingerDesignation.setText("");
    }

   //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void SellsHistory() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM sells_history";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            sellsHistory.setModel(DbUtils.resultSetToTableModel(rs));

           // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void AssignFingerTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM assigned_finger";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            assignFingerTable.setModel(DbUtils.resultSetToTableModel(rs));

           // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void UserTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM login_and_registration";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            userTable.setModel(DbUtils.resultSetToTableModel(rs));

           // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }



    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void BillprocessTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM bill";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            billProcessTable.setModel(DbUtils.resultSetToTableModel(rs));

           // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


   //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void idtable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from assign_employee";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            idtable.setModel(DbUtils.resultSetToTableModel(rs));

            //DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }



  private void table_update() {
        int c;
        try {
            con = DBConnection.getConnection();
             prst = con.createStatement();
            String sql = "select * from combo_field "; // 
            
            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel dr = (DefaultTableModel) adminPanelTable.getModel();
            dr.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= c; a++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("code"));
                    v2.add(rs.getString("branch"));
                    v2.add(rs.getString("catagorie"));
                    v2.add(rs.getString("payment_by"));

                    
                }
                dr.addRow(v2);
            }

        } catch (SQLException ex) {
           // Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }






@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registration = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userRegister = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        userTitle = new javax.swing.JTextField();
        userPassword = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        userRemove = new javax.swing.JButton();
        userUpdate = new javax.swing.JButton();
        userClear = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        branches = new javax.swing.JTextField();
        catagories = new javax.swing.JTextField();
        payments = new javax.swing.JTextField();
        createComboField = new javax.swing.JButton();
        deleteField = new javax.swing.JButton();
        resetAdPanel = new javax.swing.JButton();
        searchByCode = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codes = new javax.swing.JTextField();
        updateField = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminPanelTable = new javax.swing.JTable();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        assignFingerTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fingerID = new javax.swing.JTextField();
        fingerName = new javax.swing.JTextField();
        FingerDesignation = new javax.swing.JTextField();
        AssignFinger = new javax.swing.JButton();
        fingerDelete = new javax.swing.JButton();
        fingerUpdate = new javax.swing.JButton();
        fingerClear = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        sellsHistory = new javax.swing.JTable();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        refreshSallesRecordTable = new javax.swing.JButton();
        deleteAllSellsRecord = new javax.swing.JButton();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        save = new javax.swing.JButton();
        updateIdCard = new javax.swing.JButton();
        PrintIdCard = new javax.swing.JButton();
        browsImage = new javax.swing.JButton();
        idRecordDelete = new javax.swing.JButton();
        searchId = new javax.swing.JButton();
        idCard = new javax.swing.JPanel();
        idCardArea = new javax.swing.JLayeredPane();
        photo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        idNo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        names = new javax.swing.JTextField();
        contacts = new javax.swing.JTextField();
        addresses = new javax.swing.JTextField();
        bloods = new javax.swing.JTextField();
        dobs = new javax.swing.JTextField();
        appointDates = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        designations = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        idtable = new javax.swing.JTable();
        idCardReset = new javax.swing.JButton();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        billProcessTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        billType = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        billRegister = new javax.swing.JButton();
        billUpdate = new javax.swing.JButton();
        billdelete = new javax.swing.JButton();
        BillSearch = new javax.swing.JButton();
        billAmount = new javax.swing.JTextField();
        billerName = new javax.swing.JTextField();
        entryDate = new javax.swing.JTextField();
        expiryDate = new javax.swing.JTextField();
        BillClear = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registration.setBackground(new java.awt.Color(0, 153, 102));
        registration.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registration.setOpaque(true);

        jLayeredPane1.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane1.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Title :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Name :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password : ");

        userRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        userRegister.setText("Register");
        userRegister.setIconTextGap(5);
        userRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegisterActionPerformed(evt);
            }
        });

        userName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        userTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        userPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "TITLE", "USER_NAME", "PASSWORD"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userTable);

        userRemove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        userRemove.setText("Remove");
        userRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRemoveActionPerformed(evt);
            }
        });

        userUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        userUpdate.setText("Update");
        userUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateActionPerformed(evt);
            }
        });

        userClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        userClear.setText("Clear");
        userClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userClearActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userRemove, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(userClear, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(userName)
                            .addComponent(userPassword)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(userRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userClear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(userTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        registration.addTab("REGISTER USER", jLayeredPane1);

        jLayeredPane2.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane2.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Branch :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Catagorie :    ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment by :");

        branches.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        catagories.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catagories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoriesActionPerformed(evt);
            }
        });

        payments.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        createComboField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createComboField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        createComboField.setText("Create");
        createComboField.setIconTextGap(5);
        createComboField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createComboFieldActionPerformed(evt);
            }
        });

        deleteField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        deleteField.setText("Delete");
        deleteField.setIconTextGap(5);
        deleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFieldActionPerformed(evt);
            }
        });

        resetAdPanel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resetAdPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        resetAdPanel.setText("Reset");
        resetAdPanel.setIconTextGap(5);
        resetAdPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAdPanelActionPerformed(evt);
            }
        });

        searchByCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchByCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        searchByCode.setText("Search by Code");
        searchByCode.setIconTextGap(5);
        searchByCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByCodeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Code : ");

        codes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        updateField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        updateField.setText("Update");
        updateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFieldActionPerformed(evt);
            }
        });

        adminPanelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CODE", "BRANCH", "CATAGORIE", "PAYMENT_BY"
            }
        ));
        adminPanelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPanelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminPanelTable);

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(branches, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(catagories, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(payments, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(createComboField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(deleteField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(resetAdPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(searchByCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(codes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(updateField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(createComboField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchByCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetAdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateField, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codes))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catagories, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                    .addComponent(payments)
                                    .addComponent(branches))))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branches, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catagories, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payments, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createComboField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resetAdPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchByCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        registration.addTab("CREATE COMBOBOX FIELD", jLayeredPane2);

        jLayeredPane3.setBackground(new java.awt.Color(0, 153, 51));

        assignFingerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        assignFingerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignFingerTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(assignFingerTable);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Finger ID :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name : ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dessignation :");

        fingerID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        fingerName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        FingerDesignation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FingerDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FingerDesignationActionPerformed(evt);
            }
        });

        AssignFinger.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AssignFinger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        AssignFinger.setText("Assign");
        AssignFinger.setIconTextGap(7);
        AssignFinger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignFingerActionPerformed(evt);
            }
        });

        fingerDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fingerDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        fingerDelete.setText("Delete");
        fingerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fingerDeleteActionPerformed(evt);
            }
        });

        fingerUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fingerUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        fingerUpdate.setText("Update ");
        fingerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fingerUpdateActionPerformed(evt);
            }
        });

        fingerClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fingerClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        fingerClear.setText("Clear");
        fingerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fingerClearActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(fingerID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(fingerName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(FingerDesignation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(AssignFinger, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(fingerDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(fingerUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(fingerClear, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(AssignFinger, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fingerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fingerUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fingerClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fingerID)
                            .addComponent(FingerDesignation)
                            .addComponent(fingerName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(fingerID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fingerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(FingerDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fingerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignFinger, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fingerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fingerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        registration.addTab("ASSIGN FINGER", jLayeredPane3);

        sellsHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(sellsHistory);

        jLayeredPane7.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane7.setOpaque(true);

        refreshSallesRecordTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshSallesRecordTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/recycle.png"))); // NOI18N
        refreshSallesRecordTable.setText("Referesh Table");
        refreshSallesRecordTable.setIconTextGap(7);
        refreshSallesRecordTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSallesRecordTableActionPerformed(evt);
            }
        });

        deleteAllSellsRecord.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteAllSellsRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        deleteAllSellsRecord.setText("Delete All Sales Record");
        deleteAllSellsRecord.setIconTextGap(7);
        deleteAllSellsRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllSellsRecordActionPerformed(evt);
            }
        });

        jLayeredPane7.setLayer(refreshSallesRecordTable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(deleteAllSellsRecord, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(refreshSallesRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteAllSellsRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAllSellsRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshSallesRecordTable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLayeredPane4.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLayeredPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jLayeredPane7)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        registration.addTab("SALES RECORD", jLayeredPane4);

        save.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        updateIdCard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateIdCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        updateIdCard.setText("Update");
        updateIdCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateIdCardActionPerformed(evt);
            }
        });

        PrintIdCard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PrintIdCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/printer.png"))); // NOI18N
        PrintIdCard.setText("Print");
        PrintIdCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintIdCardActionPerformed(evt);
            }
        });

        browsImage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        browsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/select_image.png"))); // NOI18N
        browsImage.setText("Browse");
        browsImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsImageActionPerformed(evt);
            }
        });

        idRecordDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idRecordDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        idRecordDelete.setText("Delete");
        idRecordDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRecordDeleteActionPerformed(evt);
            }
        });

        searchId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        searchId.setText("Search by Id");
        searchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIdActionPerformed(evt);
            }
        });

        idCardArea.setBackground(new java.awt.Color(0, 102, 102));
        idCardArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idCardArea.setOpaque(true);

        photo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/idCover.png"))); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        photo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID No             :");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name             :");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contact         :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Address        : ");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Blood            :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("DOB              :");

        jLabel21.setBackground(new java.awt.Color(0, 153, 102));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Rasulpur Organic Supershop");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        idNo.setBackground(new java.awt.Color(0, 102, 102));
        idNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idNo.setForeground(new java.awt.Color(255, 255, 255));
        idNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("App. Date     : ");

        names.setBackground(new java.awt.Color(0, 102, 102));
        names.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        names.setForeground(new java.awt.Color(255, 255, 255));
        names.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        names.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namesActionPerformed(evt);
            }
        });

        contacts.setBackground(new java.awt.Color(0, 102, 102));
        contacts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contacts.setForeground(new java.awt.Color(255, 255, 255));
        contacts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsActionPerformed(evt);
            }
        });

        addresses.setBackground(new java.awt.Color(0, 102, 102));
        addresses.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addresses.setForeground(new java.awt.Color(255, 255, 255));
        addresses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        bloods.setBackground(new java.awt.Color(0, 102, 102));
        bloods.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bloods.setForeground(new java.awt.Color(255, 255, 255));
        bloods.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        bloods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodsActionPerformed(evt);
            }
        });

        dobs.setBackground(new java.awt.Color(0, 102, 102));
        dobs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dobs.setForeground(new java.awt.Color(255, 255, 255));
        dobs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        appointDates.setBackground(new java.awt.Color(0, 102, 102));
        appointDates.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appointDates.setForeground(new java.awt.Color(255, 255, 255));
        appointDates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Designation  :");

        designations.setBackground(new java.awt.Color(0, 102, 102));
        designations.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        designations.setForeground(new java.awt.Color(255, 255, 255));
        designations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        idCardArea.setLayer(photo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(idNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(names, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(contacts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(addresses, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(bloods, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(dobs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(appointDates, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idCardArea.setLayer(designations, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout idCardAreaLayout = new javax.swing.GroupLayout(idCardArea);
        idCardArea.setLayout(idCardAreaLayout);
        idCardAreaLayout.setHorizontalGroup(
            idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idCardAreaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(idCardAreaLayout.createSequentialGroup()
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idCardAreaLayout.createSequentialGroup()
                        .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(idCardAreaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22)))
                            .addGroup(idCardAreaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15))
                            .addGroup(idCardAreaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16)))
                        .addGap(12, 12, 12)
                        .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designations, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addresses, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloods, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobs, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointDates, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(idCardAreaLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        idCardAreaLayout.setVerticalGroup(
            idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idCardAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(designations, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(7, 7, 7)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresses, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloods, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(idCardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointDates, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout idCardLayout = new javax.swing.GroupLayout(idCard);
        idCard.setLayout(idCardLayout);
        idCardLayout.setHorizontalGroup(
            idCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idCardArea)
        );
        idCardLayout.setVerticalGroup(
            idCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idCardLayout.createSequentialGroup()
                .addComponent(idCardArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        idtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(idtable);

        idCardReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idCardReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        idCardReset.setText("Reset");
        idCardReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCardResetActionPerformed(evt);
            }
        });

        jLayeredPane8.setLayer(save, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(updateIdCard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(PrintIdCard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(browsImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(idRecordDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(searchId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(idCard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(idCardReset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateIdCard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrintIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browsImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRecordDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCardReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(316, Short.MAX_VALUE))
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addComponent(idCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))))
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 25, Short.MAX_VALUE)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idCardReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRecordDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrintIdCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateIdCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        registration.addTab("ASSIGN EMPLOYEE", jLayeredPane8);

        jLayeredPane9.setForeground(new java.awt.Color(204, 204, 204));

        billProcessTable.setModel(new javax.swing.table.DefaultTableModel(
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
        billProcessTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billProcessTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(billProcessTable);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Create Bill Type :");

        billType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Add First Bill amount :");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Add Biller Name :");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Entry Date :");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Expiry Date : ");

        billRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        billRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        billRegister.setText("Register");
        billRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billRegisterActionPerformed(evt);
            }
        });

        billUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        billUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        billUpdate.setText("Update ");
        billUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billUpdateActionPerformed(evt);
            }
        });

        billdelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        billdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        billdelete.setText("Delete");
        billdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdeleteActionPerformed(evt);
            }
        });

        BillSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BillSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        BillSearch.setText("Search");
        BillSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillSearchActionPerformed(evt);
            }
        });

        billAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        billerName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        entryDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        entryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryDateActionPerformed(evt);
            }
        });

        expiryDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        expiryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiryDateActionPerformed(evt);
            }
        });

        BillClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BillClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        BillClear.setText("Clear");
        BillClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillClearActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Note : Before new add or pay bill from Bill window you have to register first.");

        jLayeredPane9.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(billType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(billRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(billUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(billdelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(BillSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(billAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(billerName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(entryDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(expiryDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(BillClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane9Layout = new javax.swing.GroupLayout(jLayeredPane9);
        jLayeredPane9.setLayout(jLayeredPane9Layout);
        jLayeredPane9Layout.setHorizontalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane9Layout.createSequentialGroup()
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(billRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(40, 40, 40)
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entryDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(billerName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(billAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(billType)
                            .addComponent(expiryDate))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane9Layout.setVerticalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel18)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel23)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel24)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel25))
                    .addComponent(jLabel12)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(expiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addComponent(billType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(billAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(billerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BillSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BillClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        registration.addTab("BILL PROCESS", jLayeredPane9);

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
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PANEL (CONTROL PANEL)");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        homeButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/homepage30.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setIconTextGap(7);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/logout.png"))); // NOI18N
        logOut.setText("Log Out");
        logOut.setBorderPainted(false);
        logOut.setContentAreaFilled(false);
        logOut.setIconTextGap(7);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jLayeredPane6.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(homeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(logOut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(homeButton)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(homeButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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
                    .addComponent(registration))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registration)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catagoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catagoriesActionPerformed

    private void createComboFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createComboFieldActionPerformed
       try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //========= ADD/INSERT/SAVE DATA ==============//
            String sql = "insert into combo_field (code, branch, catagorie, payment_by) values (?,?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, codes.getText());
            prst.setString(2, branches.getText());
            prst.setString(3, catagories.getText());
            prst.setString(4, payments.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Created Successfully");
           
            //DisplayTable();
            
            con.close();
            prst.close();
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_createComboFieldActionPerformed

    private void resetAdPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAdPanelActionPerformed
       userCreateReset();
    }//GEN-LAST:event_resetAdPanelActionPerformed

    private void searchByCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByCodeActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from combo_field where code = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, codes.getText());

            ResultSet rs = prst.executeQuery();
            if (rs.next()) {
                branches.setText(rs.getString("branch"));
                catagories.setText(rs.getString("catagorie"));
                payments.setText(rs.getString("payment_by"));
              
            } else {
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close(); 
            prst.close(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchByCodeActionPerformed

    private void deleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFieldActionPerformed
         try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from combo_field where code = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, codes.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            
           // DisplayTable();
            userCreateReset();
            con.close();
            prst.close();
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteFieldActionPerformed

    private void updateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFieldActionPerformed
           try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update combo_field set branch = ?, catagorie = ?, payment_by = ? where code = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, branches.getText());
            prst.setString(2, catagories.getText());
            prst.setString(3, payments.getText());
            

            prst.setString(4, codes.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");

         

            con.close();
            prst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateFieldActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
    this.setVisible(false);
    new Dashboard().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
    this.setVisible(false);
    new Login().setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    //============= Show data by clicking database table (By mouse click event) ==================//
    private void adminPanelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelTableMouseClicked
   
                                           

    DefaultTableModel dr = (DefaultTableModel) adminPanelTable.getModel();
    int sindex = adminPanelTable.getSelectedRow();

    //id.setText((String) dr.getValueAt(sindex, 1));
    codes.setText((String) dr.getValueAt(sindex, 1));
    branches.setText((String) dr.getValueAt(sindex, 2));
    catagories.setText((String) dr.getValueAt(sindex, 3));
    payments.setText((String) dr.getValueAt(sindex, 4));
    }//GEN-LAST:event_adminPanelTableMouseClicked

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    private void FingerDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FingerDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FingerDesignationActionPerformed

    private void contactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactsActionPerformed

    
   //============================= Browse Image =============================//  
    String path = null;
    private void browsImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsImageActionPerformed
//            // TODO add your handling code here:
//        JFileChooser fileChooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "png", "gif");
//        fileChooser.addChoosableFileFilter(filter);
//        int result = fileChooser.showSaveDialog(this);
//        if(result == JFileChooser.APPROVE_OPTION){
//            File selectedImage = fileChooser.getSelectedFile();
//            String imagePath = selectedImage.getAbsolutePath();
//            try{
//                photo.setIcon(ResizeImage(imagePath));
//                imagePathStr = imagePath;
//            }catch (Exception exception){
//                JOptionPane.showMessageDialog(this, "Image Error: " + exception.getMessage());
//            }
//        }
   JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        path = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        photo.setIcon(icon);
        photo.setIcon(ResizeImage(path));//This line only for resize image

    }//GEN-LAST:event_browsImageActionPerformed

    private void PrintIdCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintIdCardActionPerformed
      printRecord();
    }//GEN-LAST:event_PrintIdCardActionPerformed
                                         
                                                 
    
    //====================== Setup Image Size ================================//
    // Resize Image to save
    private ImageIcon ResizeImage(String imgPath){
        int imageX = 100;
        int imageY = 100;
        photo.setSize(imageX, imageY);
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    //============================ Save Image ================================//
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try{
           FileInputStream fis = new FileInputStream(path);
           File file = new File(path);
            System.out.println(fis);
           Connection con = DBConnection.getConnection();
           PreparedStatement prst = con.prepareStatement("insert into assign_employee (id_no, designation, name, cantact, address, blood, dob, appoint_date, profile_photo) values (?,?,?,?,?,?,?,?,?)");
           
           prst.setString(1, idNo.getText());
           prst.setString(2, designations.getText());
           prst.setString(3, names.getText());
           prst.setString(4, contacts.getText());
           prst.setString(5, addresses.getText());
           prst.setString(6, bloods.getText());
           prst.setString(7, dobs.getText());
           prst.setString(8, appointDates.getText());
           
           prst.setBinaryStream(9, fis, (int) file.length());
           int flag = prst.executeUpdate();
           if(flag == 1){
               JOptionPane.showMessageDialog(rootPane, "Assigned Successfully");
           } 
           idtable();
           con.close();
        }catch(Exception e){
          // e.printStackTrace();
        }

    }//GEN-LAST:event_saveActionPerformed

    //============================ Search Image ===============================// 
    private void searchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIdActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from assign_employee where id_no = ?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, idNo.getText());
            ResultSet rs = prst.executeQuery();
            if (rs.next()) {

                names.setText(rs.getString("name"));
                designations.setText(rs.getString("designation"));
                contacts.setText(rs.getString("cantact"));
                addresses.setText(rs.getString("address"));
                bloods.setText(rs.getString("blood"));
                dobs.setText(rs.getString("dob"));
                appointDates.setText(rs.getString("appoint_date"));

                byte[] imagedata = rs.getBytes("profile_photo");
                format = new ImageIcon(imagedata);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon((img2));
                Image scaled = img2.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //Decleare Image size (2nd option)
                ImageIcon icon = new ImageIcon(scaled);
                photo.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchIdActionPerformed

    
   //============================ Search Image ===============================//  
    private void idCardResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCardResetActionPerformed
        idCardReset();
    }//GEN-LAST:event_idCardResetActionPerformed

    private void bloodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodsActionPerformed

    
    //============================ Update id card Image ===============================//  
    private void updateIdCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateIdCardActionPerformed
//    try{
//        FileInputStream fis = new FileInputStream(path);
//        File file = new File(path);
//        System.out.println(fis);  
//         
//    con = DBConnection.getConnection();
//    prst = con.createStatement();
//    String sql = "update assign_employee set designation = ?, set name = ?, set cantact = ?, set address = ?, set blood = ?, set dob = ?, set appoint_date = ?, set profile_photo = ? where id_no = ?";
//    PreparedStatement prst = con.prepareStatement(sql);
//
//    
//    prst.setString(1, designations.getText());
//    prst.setString(2, names.getText());
//    prst.setString(3, contacts.getText());
//    prst.setString(4, addresses.getText());
//    prst.setString(5, bloods.getText());
//    prst.setString(6, dobs.getText());
//    prst.setString(7, appointDates.getText());
//    
//    prst.setBinaryStream(8, fis, (int) file.length()); //This line for image update
//    prst.setString(9, idNo.getText());
//
//    prst.executeUpdate();
//    JOptionPane.showMessageDialog(null, "Record Updated successfully");
//    
//    idtable();
//    con.close(); 
//    }catch(Exception e)
//    {
//    JOptionPane.showMessageDialog(null, e);
//    }

try {
    FileInputStream fis = new FileInputStream(path);
        File file = new File(path);
        System.out.println(fis);
    
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update assign_employee set profile_photo = ? where id_no = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            
//            prst.setString(1, designations.getText());
//            prst.setString(2, names.getText());
//            prst.setString(3, contacts.getText());
//            prst.setString(4, addresses.getText());
//            prst.setString(5, bloods.getText());
//            prst.setString(6, dobs.getText());
//            prst.setString(7, appointDates.getText());

            prst.setBinaryStream(1, fis, (int) file.length());
            prst.setString(2, idNo.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");

            idtable();
            con.close(); 

            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateIdCardActionPerformed

    
    
    private void namesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namesActionPerformed

    private void idRecordDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRecordDeleteActionPerformed
         try{
    con = DBConnection.getConnection();
    prst = con.createStatement();
    String sql = "delete from assign_employee where id_no = ?";
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setString(1, idNo.getText());
    prst.executeUpdate();
    JOptionPane.showConfirmDialog(null, "Do you want to delete");
    JOptionPane.showMessageDialog(null, "Deleted Successfully");
    
    idCardReset();
    idtable();
    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Invalid Deletion");
    }
    }//GEN-LAST:event_idRecordDeleteActionPerformed

    private void entryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryDateActionPerformed

    private void expiryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiryDateActionPerformed

    //============= Show data by clicking database table (By mouse click event) ==================//
    private void billProcessTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billProcessTableMouseClicked
 
    DefaultTableModel dr = (DefaultTableModel) billProcessTable.getModel();
    int sindex = billProcessTable.getSelectedRow();

    billType.setText((String) dr.getValueAt(sindex, 1));
//    billAmount.setText((String) dr.getValueAt(sindex, 2));
//    billerName.setText((String) dr.getValueAt(sindex, 3));
//    entryDate.setText((String) dr.getValueAt(sindex, 4));
//    expiryDate.setText((String) dr.getValueAt(sindex, 5));
    }//GEN-LAST:event_billProcessTableMouseClicked

    private void BillSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillSearchActionPerformed
        try {
        con = DBConnection.getConnection();
        prst = con.createStatement();
        String sql = "select * from bill where bill_type = ?";

        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, billType.getText());

        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            billAmount.setText(rs.getString("bill_amount"));
            billerName.setText(rs.getString("biller_name"));
            entryDate.setText(rs.getString("entry_date"));
            expiryDate.setText(rs.getString("expired_date"));

        } else {
            JOptionPane.showMessageDialog(null, "Record Not found");
        }
        con.close(); 
        prst.close(); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_BillSearchActionPerformed

    private void billRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billRegisterActionPerformed
           try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //========= ADD/INSERT/SAVE DATA ==============//
            String sql = "insert into bill (bill_type, bill_amount, biller_name, entry_date, expired_date) values (?,?,?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, billType.getText());
            prst.setDouble(2, Double.parseDouble(billAmount.getText()));
            prst.setString(3, billerName.getText());
            prst.setString(4, entryDate.getText());
            prst.setString(5, expiryDate.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Created Successfully");
          
            BillprocessTable();
            con.close();
            prst.close();
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_billRegisterActionPerformed

    private void BillClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillClearActionPerformed
    AllAdminFieldReset();
    }//GEN-LAST:event_BillClearActionPerformed

    private void fingerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fingerDeleteActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from assigned_finger where finger_id = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, fingerID.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            
            AllAdminFieldReset();
            AssignFingerTable();
            con.close();
            prst.close();
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_fingerDeleteActionPerformed

    private void AssignFingerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignFingerActionPerformed
           try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //========= ADD/INSERT/SAVE DATA ==============//
            String sql = "insert into assigned_finger (finger_id, name, dessignation) values (?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, fingerID.getText());
            prst.setString(2, fingerName.getText());
            prst.setString(3, FingerDesignation.getText());


            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Assigned Successfully");
           
            AssignFingerTable();
           // AllAdminFieldReset();
            con.close();
            prst.close();
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_AssignFingerActionPerformed

    private void billdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdeleteActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from bill where bill_type = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, billType.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            //JOptionPane.showMessageDialog(null, "Deleted Successfully");

            BillprocessTable();
            AllAdminFieldReset();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_billdeleteActionPerformed

    private void billUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billUpdateActionPerformed
    try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update bill set bill_amount = ?, biller_name = ?, entry_date = ?, expired_date = ? where bill_type = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            
            prst.setDouble(1, Double.parseDouble(billAmount.getText()));
            prst.setString(2, billerName.getText());
            prst.setString(3, entryDate.getText());
            prst.setString(4, expiryDate.getText());

            prst.setString(5, billType.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");

            BillprocessTable();
            AllAdminFieldReset();

            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_billUpdateActionPerformed

    private void userRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegisterActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //========= ADD/INSERT/SAVE DATA ==============//
            String sql = "insert into login_and_registration (title, user_name, password) values (?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, userTitle.getText());
            prst.setString(2, userName.getText());
            prst.setString(3, userPassword.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registerd Successfully");
           
            UserTable();
            
            con.close();
            prst.close();
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_userRegisterActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        DefaultTableModel dr = (DefaultTableModel) userTable.getModel();
    int sindex = userTable.getSelectedRow();

    //id.setText((String) dr.getValueAt(sindex, 1));
    userTitle.setText((String) dr.getValueAt(sindex, 1));
    userName.setText((String) dr.getValueAt(sindex, 2));
    userPassword.setText((String) dr.getValueAt(sindex, 3));

    }//GEN-LAST:event_userTableMouseClicked

    private void userClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userClearActionPerformed
    AllAdminFieldReset();
    }//GEN-LAST:event_userClearActionPerformed

    private void userRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRemoveActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from login_and_registration where user_name = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, userName.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            //JOptionPane.showMessageDialog(null, "Deleted Successfully");

            UserTable();
            AllAdminFieldReset();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_userRemoveActionPerformed

    private void userUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update login_and_registration set user_name = ?, password = ? where title = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            


            prst.setString(1, userName.getText());
            prst.setString(2, userPassword.getText());
            prst.setString(3, userTitle.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");

            UserTable();
            //AllAdminFieldReset();

            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_userUpdateActionPerformed

    private void assignFingerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignFingerTableMouseClicked
     DefaultTableModel dr = (DefaultTableModel) assignFingerTable.getModel();
    int sindex = assignFingerTable.getSelectedRow();

    //id.setText((String) dr.getValueAt(sindex, 1));
    fingerID.setText((String) dr.getValueAt(sindex, 1));
    fingerName.setText((String) dr.getValueAt(sindex, 2));
    FingerDesignation.setText((String) dr.getValueAt(sindex, 3));
    }//GEN-LAST:event_assignFingerTableMouseClicked

    private void fingerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fingerClearActionPerformed
     AllAdminFieldReset();
    }//GEN-LAST:event_fingerClearActionPerformed

    private void fingerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fingerUpdateActionPerformed
               try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update assigned_finger set name = ?, dessignation = ? where finger_id = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            
            prst.setString(1, fingerName.getText());
            prst.setString(2, FingerDesignation.getText());
            
            prst.setString(3, fingerID.getText());


            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");

         
            AssignFingerTable();
            con.close();
            prst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_fingerUpdateActionPerformed

    private void deleteAllSellsRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllSellsRecordActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from sells_history ";

            PreparedStatement prst = con.prepareStatement(sql);
            //prst.setString(1, codes.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            
            SellsHistory();
            userCreateReset();
            con.close();
            prst.close();
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteAllSellsRecordActionPerformed

    private void refreshSallesRecordTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSallesRecordTableActionPerformed
    SellsHistory();
    }//GEN-LAST:event_refreshSallesRecordTableActionPerformed

    
    
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
        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new AdminPanel().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignFinger;
    private javax.swing.JButton BillClear;
    private javax.swing.JButton BillSearch;
    private javax.swing.JTextField FingerDesignation;
    private javax.swing.JButton PrintIdCard;
    private javax.swing.JTextField addresses;
    private javax.swing.JTable adminPanelTable;
    private javax.swing.JTextField appointDates;
    private javax.swing.JTable assignFingerTable;
    private javax.swing.JTextField billAmount;
    private javax.swing.JTable billProcessTable;
    private javax.swing.JButton billRegister;
    private javax.swing.JTextField billType;
    private javax.swing.JButton billUpdate;
    private javax.swing.JButton billdelete;
    private javax.swing.JTextField billerName;
    private javax.swing.JTextField bloods;
    private javax.swing.JTextField branches;
    private javax.swing.JButton browsImage;
    private javax.swing.JTextField catagories;
    private javax.swing.JTextField codes;
    private javax.swing.JTextField contacts;
    private javax.swing.JButton createComboField;
    private javax.swing.JButton deleteAllSellsRecord;
    private javax.swing.JButton deleteField;
    private javax.swing.JTextField designations;
    private javax.swing.JTextField dobs;
    private javax.swing.JTextField entryDate;
    private javax.swing.JTextField expiryDate;
    private javax.swing.JButton fingerClear;
    private javax.swing.JButton fingerDelete;
    private javax.swing.JTextField fingerID;
    private javax.swing.JTextField fingerName;
    private javax.swing.JButton fingerUpdate;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel idCard;
    private javax.swing.JLayeredPane idCardArea;
    private javax.swing.JButton idCardReset;
    private javax.swing.JTextField idNo;
    private javax.swing.JButton idRecordDelete;
    private javax.swing.JTable idtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton logOut;
    private javax.swing.JTextField names;
    private javax.swing.JTextField payments;
    private javax.swing.JLabel photo;
    private javax.swing.JButton refreshSallesRecordTable;
    private javax.swing.JTabbedPane registration;
    private javax.swing.JButton resetAdPanel;
    private javax.swing.JButton save;
    private javax.swing.JButton searchByCode;
    private javax.swing.JButton searchId;
    private javax.swing.JTable sellsHistory;
    private javax.swing.JButton updateField;
    private javax.swing.JButton updateIdCard;
    private javax.swing.JButton userClear;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userPassword;
    private javax.swing.JButton userRegister;
    private javax.swing.JButton userRemove;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField userTitle;
    private javax.swing.JButton userUpdate;
    // End of variables declaration//GEN-END:variables


//===================== Method For To Print Panel Contents ====================//
private void printRecord() {
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("Print Record");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D) graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX() + 10, pageFormat.getImageableY() + 10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(.4, .4);

                // Now paint panel as graphics2D
                idCard.paint(graphics2D);

                // return if page exists
                return Printable.PAGE_EXISTS;
            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if (returningResult) {
            // Use try catch exeption for failure
            try {
                // Now call print method inside printerJob to print
                printerJob.print();
            } catch (PrinterException printerException) {
                JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
            }
        }
 
    }
//========== Method For To Print Panel Contents (end print method) ===========//

}
