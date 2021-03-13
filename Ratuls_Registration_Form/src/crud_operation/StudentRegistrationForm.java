package crud_operation;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentRegistrationForm extends javax.swing.JFrame {

    public StudentRegistrationForm() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stRegistrationLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        courseField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stRegistrationLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        stRegistrationLabel.setText("Student Registration ");

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 18)))); // NOI18N

        nameLabel.setText("Student Name");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        courseLabel.setText("Course");

        courseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseFieldActionPerformed(evt);
            }
        });

        mobileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileFieldActionPerformed(evt);
            }
        });

        mobileLabel.setText("Mobile");

        insertButton.setText("Insert");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameLabel)
                        .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(mobileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Course", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentTable);
        if (StudentTable.getColumnModel().getColumnCount() > 0) {
            StudentTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(stRegistrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stRegistrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void courseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseFieldActionPerformed

    private void mobileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonActionPerformed
    Connection con1;
    PreparedStatement insert;

    private void table_update() {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swings", "root", "1234");
            insert = con1.prepareStatement("SELECT * FROM studentregistration s;");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel dr = (DefaultTableModel) StudentTable.getModel();
            dr.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= c; a++) {
                    v2.add(rs.getString("Id"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Course"));
                    v2.add(rs.getString("Mobile"));

                }
                dr.addRow(v2);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        // TODO add your handling code here:
        String sname = nameField.getText();
        String scourse = courseField.getText();
        String smobile = mobileField.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swings", "root", "1234");
            insert = con1.prepareStatement("INSERT INTO studentregistration (Name,Course, Mobile) VALUES (?,?,?)");
            insert.setString(1, sname);
            insert.setString(2, scourse);
            insert.setString(3, smobile);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "SAVED");
            table_update();

            System.out.println("Name   :\t" + sname);
            System.out.println("Course :\t" + scourse);
            System.out.println("Mobile :\t" + smobile);
            nameField.setText(" ");
            courseField.setText(" ");
            mobileField.setText(" ");
            nameField.requestFocus();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_insertButtonMouseClicked

    
    //=====================Show data by clicking database table============================//
    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked
        DefaultTableModel dr = (DefaultTableModel) StudentTable.getModel();
        int sindex = StudentTable.getSelectedRow();
        nameField.setText((String) dr.getValueAt(sindex, 1));
        courseField.setText((String) dr.getValueAt(sindex, 2));
        mobileField.setText((String) dr.getValueAt(sindex, 3));
    }//GEN-LAST:event_StudentTableMouseClicked

    
    
    
    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        DefaultTableModel dr = (DefaultTableModel) StudentTable.getModel();
        int sindex = StudentTable.getSelectedRow();
        try {
            int sid = Integer.parseInt(dr.getValueAt(sindex, 0).toString());

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swings", "root", "1234");
                insert = con1.prepareStatement("DELETE FROM studentregistration WHERE Id=?");

                insert.setInt(1, sid);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "DELETED");
                table_update();

                nameField.setText(" ");
                courseField.setText(" ");
                mobileField.setText(" ");
                nameField.requestFocus();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        DefaultTableModel dr = (DefaultTableModel) StudentTable.getModel();
        int sindex = StudentTable.getSelectedRow();
        try {
            int sid = Integer.parseInt(dr.getValueAt(sindex, 0).toString());
            String sname = nameField.getText();
            String scourse = courseField.getText();
            String smobile = mobileField.getText();
            Class.forName("com.mysql.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bashir_swings", "root", "1234");
            insert = con1.prepareStatement("UPDATE studentregistration SET Name=?,Course=?,Mobile=? WHERE Id=?");
            insert.setString(1, sname);
            insert.setString(2, scourse);
            insert.setString(3, smobile);
            insert.setInt(4, sid);

            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated");
            table_update();

            System.out.println("Name   :\t" + sname);
            System.out.println("Course :\t" + scourse);
            System.out.println("Mobile :\t" + smobile);
            nameField.setText(" ");
            courseField.setText(" ");
            mobileField.setText(" ");
            nameField.requestFocus();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StudentTable;
    private javax.swing.JTextField courseField;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel stRegistrationLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
