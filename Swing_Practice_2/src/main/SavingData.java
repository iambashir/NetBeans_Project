package main;

import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import dao.DatabaseConnection;
import java.awt.print.PrinterException;

/**
*
* @author Bashir Hossain
*/
public class SavingData extends javax.swing.JFrame {
    
    //This is for database connection from dao file
    Connection con;
    Statement prst;

    
    //========= RESET METHOD CRATED TO CALL FROM ANYWHERE ==========//
    public void reset(){
    rollField.setText("");
    nameField.setText("");
    addressField.setText("");
    salaryField.setText("");
    }

    
    public SavingData() {
    initComponents();
    //======================== JFRAME COLOUR CHANGE =========================================//
    //getContentPane().setBackground(java.awt.Color.gray);
    //or
    getContentPane().setBackground(new java.awt.Color(22, 92, 115));
    
    //============= CALLING DATABASE TABLE TO ADJUSTING FORM TABLE ========================//
    DisplayTable();//Calling The table
    }
    
    
    //============= DATABASE TABLE SHOWING IN FORM ========================//
    private void DisplayTable(){
    
    try{
    con = DatabaseConnection.getConnection();
    prst = con.createStatement();
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
        databaseTableLabel = new javax.swing.JLabel();
        textAreaLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        salaryField = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        showTextButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bashir Hossain");
        setBackground(new java.awt.Color(0, 153, 153));

        nameLB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameLB.setForeground(new java.awt.Color(102, 204, 0));
        nameLB.setText("Name :");

        rollField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rollField.setForeground(new java.awt.Color(0, 102, 102));
        rollField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollFieldActionPerformed(evt);
            }
        });

        rollLB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rollLB.setForeground(new java.awt.Color(102, 204, 0));
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
        showDataButton.setText("ShowData");
        showDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        databaseTableLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        databaseTableLabel.setForeground(new java.awt.Color(102, 204, 0));
        databaseTableLabel.setText("Database Table");

        textAreaLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textAreaLabel.setForeground(new java.awt.Color(102, 204, 0));
        textAreaLabel.setText("Student Details Information");

        addressLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(102, 204, 0));
        addressLabel.setText("Address :");

        salaryLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(102, 204, 0));
        salaryLabel.setText("Salary :");

        addressField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addressField.setForeground(new java.awt.Color(0, 51, 51));

        salaryField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salaryField.setForeground(new java.awt.Color(0, 51, 51));
        salaryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryFieldActionPerformed(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(0, 102, 102));
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(0, 102, 102));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("GetAll");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        showTextButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        showTextButton.setText("Show Text");
        showTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTextButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Add Salary");

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Substract Sal.");

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Myltiply Salary");

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("jButton5");

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("jButton6");

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("jButton7");

        jButton9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton9.setText("jButton7");

        jButton10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton10.setText("jButton10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rollLB, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addGap(55, 55, 55)
                            .addComponent(rollField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(nameLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(38, 38, 38))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(addressField)
                                .addComponent(salaryField)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(showDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(textAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showTextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(databaseTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(databaseTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollLB)
                            .addComponent(rollField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(textAreaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(resetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(showTextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    //=============================== INSERTING/SAVING/ADDING DATA =====================================//                    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    
    try{
    //==========Same code for every connection==========//
    con = DatabaseConnection.getConnection();
    prst = con.createStatement();
    
       
    //========= ADD/INSERT/SAVE DATA ==============//
    String sql = "insert into saving_data values (?, ?, ?, ?)"; // "?" is for table row number and saving_data is database table name
    PreparedStatement prst = con.prepareStatement(sql);
    
    prst.setInt(1, Integer.parseInt(rollField.getText())); 
    prst.setString(2, nameField.getText()); 
    prst.setString(3, addressField.getText()); 
    prst.setDouble(4, Double.parseDouble(salaryField.getText())); 

    prst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Saved successfully"); //after submission popup massage window
    

    DisplayTable(); //Afetr saving refresh the table by calling this Method
    
    con.close(); //after completing task close the popup window
    } 
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Invalid Input Value");
    }
    }//GEN-LAST:event_saveButtonActionPerformed

    
    
    //=========================== CRATED FORM FILED =======================//
    private void rollFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollFieldActionPerformed

    }//GEN-LAST:event_rollFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

  
    
   //========================= RESET YOUR FIELD ============================//
    private void resetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFieldActionPerformed
    reset();
    
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
   con = DatabaseConnection.getConnection();
    prst = con.createStatement();
    String sql = "select * from saving_data where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText()));
    
    ResultSet rs = prst.executeQuery();
    if(rs.next()){
       nameField.setText(rs.getString("name"));
       addressField.setText(rs.getString("address"));
       salaryField.setText(String.valueOf(rs.getDouble("salary")));
       
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
    con = DatabaseConnection.getConnection();
    prst = con.createStatement();
    String sql = "update saving_data set name = ?, address = ?, salary = ? where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setString(1, nameField.getText());
    prst.setString(2, addressField.getText());
    prst.setDouble(3, Double.parseDouble(salaryField.getText()));
    
    prst.setInt(4, Integer.parseInt(rollField.getText()));
    
    
    prst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Record Updated successfully");
    
    
    DisplayTable();//Refresh Table
   
    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    } 
    }//GEN-LAST:event_updateButtonActionPerformed

    
    //============================ DELETE DATA ==============================//
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
     
    try{
    con = DatabaseConnection.getConnection();
    prst = con.createStatement();
    String sql = "delete from saving_data where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText()));
    
    prst.executeUpdate();
    JOptionPane.showConfirmDialog(null, "Do you want to delete");
    JOptionPane.showMessageDialog(null, "Deleted Successfully");
    
    reset();
    DisplayTable();//Refresh Table
    
    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Invalid Deletion");
    }
    }//GEN-LAST:event_deleteButtonActionPerformed
    

    //================ REFRESHING TABLE BY CALLING TABLE FUNCTION ===========// 
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
     DisplayTable();//Refresh Table 
    }//GEN-LAST:event_refreshButtonActionPerformed

    
    
    //===================== SHOW DATA ============================//
    private void showDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataButtonActionPerformed
    try{
    con = DatabaseConnection.getConnection();
    prst = con.createStatement();
    String sql = "select * from saving_data where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText()));
    
    ResultSet rs = prst.executeQuery();
    if(rs.next()){
   
        int roll = rs.getInt(1);
        String name = rs.getString(2);
        String address = rs.getString(3);
        double salary = rs.getDouble(4);
       
        textArea.setText("Roll No \t:  " + roll 
                        + "\nName \t:  " + name 
                        + "\nAddress \t:  " + address 
                        + "\nSalary \t:  " + salary );
    
    }
    else
    {
     JOptionPane.showMessageDialog(null, "Record Not found");
    }
    con.close(); //after completing task close the popup window
    } 
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Record Not found");
    }
    }//GEN-LAST:event_showDataButtonActionPerformed

    
    private void salaryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryFieldActionPerformed

    
    //===================== PRINT TEXT OR TABLE ============================//
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            boolean print = textArea.print();
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!..");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_printButtonActionPerformed

    
    //===================== EDIT TEXT ============================//
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
     try{
    con = DatabaseConnection.getConnection();
    prst = con.createStatement();
    String sql = "select * from saving_data where roll_no = ?";
    
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setInt(1, Integer.parseInt(rollField.getText()));
    
    ResultSet rs = prst.executeQuery();
    if(rs.next()){
       nameField.setText(rs.getString("name"));
       addressField.setText(rs.getString("address"));
       salaryField.setText(String.valueOf(rs.getDouble("salary")));
       
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
    }//GEN-LAST:event_editButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTextButtonActionPerformed
       
        
       int roll = Integer.parseInt(rollField.getText());
       String name =  nameField.getText();
       String address =  addressField.getText();
       Double salary = Double.parseDouble(salaryField.getText());
        
        
        
        textArea.setText("Student Information Details \n  Rasulpur School" 
                        +"\n--------------------------------"
                        + "\nRoll No \t:  " + roll 
                        + "\nName \t:  " + name 
                        + "\nAddress \t:  " + address 
                        + "\nSalary \t:  " + salary 
                        +"\n--------------------------------"
                        +"\n ********* Thank You *********");
                      
    }//GEN-LAST:event_showTextButtonActionPerformed

    
    
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
    //===================Swing default code end ===========================//
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel databaseTableLabel;
    private javax.swing.JTable dbTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLB;
    private javax.swing.JButton printButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetField;
    private javax.swing.JTextField rollField;
    private javax.swing.JLabel rollLB;
    private javax.swing.JTextField salaryField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showDataButton;
    private javax.swing.JButton showTextButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel textAreaLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
    //=====================Swing default code End==========================//