
package myapp;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bashir Hossain
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        browseImageLbl = new javax.swing.JLabel();
        browseImageBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        middleNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        saveRecordBtn = new javax.swing.JButton();
        updateRecordBtn = new javax.swing.JButton();
        deleteRecordBtn = new javax.swing.JButton();
        listingPanel = new javax.swing.JPanel();
        viewImageLbl = new javax.swing.JLabel();
        viewNameBigLbl = new javax.swing.JLabel();
        viewNameLbl = new javax.swing.JLabel();
        viewMiddleNameLbl = new javax.swing.JLabel();
        viewLastNameLbl = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        searchLastNameTxt = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 600));

        mainPanel.setBackground(new java.awt.Color(0, 153, 51));
        mainPanel.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        formPanel.setBackground(new java.awt.Color(0, 153, 153));
        formPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        browseImageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browseImageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/images/student-profile-default.png"))); // NOI18N
        browseImageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        browseImageBtn.setText("BROWSE IMAGE");
        browseImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImageBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name :");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Middle Name :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name :");

        btnPanel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        saveRecordBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveRecordBtn.setText("Save Record");
        saveRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRecordBtnActionPerformed(evt);
            }
        });
        btnPanel.add(saveRecordBtn);

        updateRecordBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        updateRecordBtn.setText("Update Record");
        updateRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordBtnActionPerformed(evt);
            }
        });
        btnPanel.add(updateRecordBtn);

        deleteRecordBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteRecordBtn.setText("Delete Record");
        deleteRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordBtnActionPerformed(evt);
            }
        });
        btnPanel.add(deleteRecordBtn);

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(browseImageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseImageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt)
                            .addComponent(middleNameTxt)
                            .addComponent(lastNameTxt))))
                .addContainerGap())
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(browseImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseImageBtn)
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(middleNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(formPanel);

        listingPanel.setBackground(new java.awt.Color(0, 153, 153));
        listingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewImageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewImageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/images/student-profile-default.png"))); // NOI18N
        viewImageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewNameBigLbl.setBackground(new java.awt.Color(0, 153, 153));
        viewNameBigLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewNameBigLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewNameBigLbl.setText("Name");

        viewNameLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewNameLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewNameLbl.setPreferredSize(new java.awt.Dimension(27, 35));

        viewMiddleNameLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewMiddleNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewMiddleNameLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewMiddleNameLbl.setPreferredSize(new java.awt.Dimension(27, 35));

        viewLastNameLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewLastNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewLastNameLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewLastNameLbl.setPreferredSize(new java.awt.Dimension(27, 35));

        searchPanel.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Name");
        searchPanel.add(jLabel7);
        searchPanel.add(searchNameTxt);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Last Name");
        searchPanel.add(jLabel8);
        searchPanel.add(searchLastNameTxt);

        Search.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        searchPanel.add(Search);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name :");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Middle Name : ");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name :");

        javax.swing.GroupLayout listingPanelLayout = new javax.swing.GroupLayout(listingPanel);
        listingPanel.setLayout(listingPanelLayout);
        listingPanelLayout.setHorizontalGroup(
            listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listingPanelLayout.createSequentialGroup()
                        .addComponent(viewImageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewNameBigLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listingPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(viewMiddleNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewLastNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        listingPanelLayout.setVerticalGroup(
            listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewNameBigLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewMiddleNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewLastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        mainPanel.add(listingPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImageBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "png", "gif");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedImage = fileChooser.getSelectedFile();
            String imagePath = selectedImage.getAbsolutePath();
            try{
                browseImageLbl.setIcon(ResizeImage(imagePath));
                imagePathStr = imagePath;
            }catch (Exception exception){
                JOptionPane.showMessageDialog(this, "Image Error: " + exception.getMessage());
            }
        }
    }//GEN-LAST:event_browseImageBtnActionPerformed

    private void saveRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRecordBtnActionPerformed
        // TODO add your handling code here:
        
        personName = nameTxt.getText();
        personMiddleName = middleNameTxt.getText();
        personLastName = lastNameTxt.getText();
        
        if(!imagePathStr.isEmpty()){
            Operations operations = new Operations();
            operations.insertPerson(personName, personMiddleName, personLastName, imagePathStr, this);
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Image First!");
        }
    }//GEN-LAST:event_saveRecordBtnActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
    
        try{
            Connection mySqlConnection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = mySqlConnection.prepareStatement("SELECT * FROM persons WHERE Name = ? AND LastName = ?");
            
            if(!searchNameTxt.getText().isEmpty() && !searchLastNameTxt.getText().isEmpty()){
                preparedStatement.setString(1, searchNameTxt.getText());
                preparedStatement.setString(2, searchLastNameTxt.getText());
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    viewNameBigLbl.setText(resultSet.getString("Name"));
                    viewNameLbl.setText(resultSet.getString("Name"));
                    viewMiddleNameLbl.setText(resultSet.getString("MiddleName"));
                    viewLastNameLbl.setText(resultSet.getString("LastName"));
                    
                    viewImageLbl.setIcon(ViewResizeImage(null, resultSet.getBytes("Image")));
                    
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Please Fill Fields To Search");
            }
            
        }catch (Exception exception){
            JOptionPane.showMessageDialog(this, "Data Error: " + exception.getMessage());
        }   
    }//GEN-LAST:event_SearchActionPerformed

    private void updateRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateRecordBtnActionPerformed

    private void deleteRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteRecordBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton browseImageBtn;
    private javax.swing.JLabel browseImageLbl;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton deleteRecordBtn;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JPanel listingPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveRecordBtn;
    private javax.swing.JTextField searchLastNameTxt;
    private javax.swing.JTextField searchNameTxt;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton updateRecordBtn;
    private javax.swing.JLabel viewImageLbl;
    private javax.swing.JLabel viewLastNameLbl;
    private javax.swing.JLabel viewMiddleNameLbl;
    private javax.swing.JLabel viewNameBigLbl;
    private javax.swing.JLabel viewNameLbl;
    // End of variables declaration//GEN-END:variables
   
    
    private String personName, personMiddleName, personLastName, imagePathStr;
    
    // Resize Image Function
    private ImageIcon ResizeImage(String imgPath){
        int imageX = 177;
        int imageY = 202;
        browseImageLbl.setSize(imageX, imageY);
        
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(browseImageLbl.getWidth(), browseImageLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    private ImageIcon ViewResizeImage(String imgPath, byte[] imgBytes){
        int imageX = 177;
        int imageY = 202;
        viewImageLbl.setSize(imageX, imageY);
        
        ImageIcon myImage = null;
        
        if(imgPath != null){
            myImage = new ImageIcon(imgPath);
        }else{
            myImage = new ImageIcon(imgBytes);
        }
        
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(viewImageLbl.getWidth(), viewImageLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
}
