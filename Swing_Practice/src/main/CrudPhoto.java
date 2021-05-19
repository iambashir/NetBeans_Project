
package main;

import dao.DBConnection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Bashir Hossain
 */
public class CrudPhoto extends javax.swing.JFrame {

    Connection con;
    Statement prst;
    private ImageIcon format; //Create this for search image
    
    //========================= Craete Image reset Methode ===================//
    public void ImageReset() {
    imageCode.setText("");
    photo.setIcon(null) ;
    }

    //=================== Initializing JFrame ================================//
    public CrudPhoto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        photo = new javax.swing.JLabel();
        chooseImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imageCode = new javax.swing.JTextField();
        saveImage = new javax.swing.JButton();
        updateImg = new javax.swing.JButton();
        imgReset = new javax.swing.JButton();
        imageSearch = new javax.swing.JButton();
        deleteImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane1.setOpaque(true);

        photo.setBackground(new java.awt.Color(51, 51, 51));
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        photo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        chooseImage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chooseImage.setText("Choose Image");
        chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Image Code : ");

        imageCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        saveImage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        saveImage.setText("Save Image");
        saveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageActionPerformed(evt);
            }
        });

        updateImg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateImg.setText("Update");
        updateImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateImgActionPerformed(evt);
            }
        });

        imgReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        imgReset.setText("Reset ");
        imgReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgResetActionPerformed(evt);
            }
        });

        imageSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        imageSearch.setText("Search");
        imageSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageSearchActionPerformed(evt);
            }
        });

        deleteImg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteImg.setText("Delete");
        deleteImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteImgActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(photo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chooseImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(imageCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(saveImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(updateImg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(imgReset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(imageSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(deleteImg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(saveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateImg, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(imgReset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteImg, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageCode, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(imageSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(deleteImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //============================= Browse Image =============================//
    String path = null;
    private void chooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        path = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        photo.setIcon(icon);
        photo.setIcon(ResizeImage(path));//This line only for resize image  
    }//GEN-LAST:event_chooseImageActionPerformed
                                                 
    
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
    
    // Resize Image to show but I used 2nd option
    private ImageIcon ViewResizeImage(String imgPath, byte[] imgBytes){
        int imageX = 100;
        int imageY = 100;
        photo.setSize(imageX, imageY);
        ImageIcon myImage = null;
        if(photo != null){
            myImage = new ImageIcon(imgPath);
        }else{
            myImage = new ImageIcon(imgBytes);
        }
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    
    //============================= Save  image ====================// 
    private void saveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageActionPerformed
        try{
           FileInputStream fis = new FileInputStream(path);
           File file = new File(path);
            System.out.println(fis);
           Connection con = DBConnection.getConnection();
           PreparedStatement prst = con.prepareStatement("insert into img (code, image) values (?, ?)");
           
           prst.setString(1, imageCode.getText());
           prst.setBinaryStream(2, fis, (int) file.length());
           int flag = prst.executeUpdate();
           if(flag == 1){
               JOptionPane.showMessageDialog(rootPane, "Image inserted");
           }
           con.close();
        }catch(Exception e){
          // e.printStackTrace();
        }
    }//GEN-LAST:event_saveImageActionPerformed

    //=============================== Image Search ===========================//
    private void imageSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageSearchActionPerformed
    try{
    con = DBConnection.getConnection();
    prst = con.createStatement();
    String sql = "select * from img where code = ?";
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setString(1, imageCode.getText());
    ResultSet rs = prst.executeQuery();
    if(rs.next()){
               byte[] imagedata = rs.getBytes("image");
               format = new ImageIcon(imagedata);
               Image mm = format.getImage();
               Image img2 = mm.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon image = new ImageIcon((img2));
               Image scaled = img2.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //Decleare Image size (2nd option)
               ImageIcon icon = new ImageIcon(scaled); 
               photo.setIcon(icon);
    }
    else
    {
     JOptionPane.showMessageDialog(null, "Record Not found");
    }
    con.close();
    } 
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_imageSearchActionPerformed

    //=============================== Delete Search ===========================//
    private void deleteImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteImgActionPerformed
     try{
    con = DBConnection.getConnection();
    prst = con.createStatement();
    String sql = "delete from img where code = ?";
    PreparedStatement prst = con.prepareStatement(sql);
    prst.setString(1, imageCode.getText());
    prst.executeUpdate();
    JOptionPane.showConfirmDialog(null, "Do you want to delete");
    JOptionPane.showMessageDialog(null, "Deleted Successfully");
    
    ImageReset();
    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Invalid Deletion");
    }
    }//GEN-LAST:event_deleteImgActionPerformed

    //============================ Reset Image ===============================//
    private void imgResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgResetActionPerformed
    ImageReset();
    }//GEN-LAST:event_imgResetActionPerformed

    //========================== Update Image ================================//
    private void updateImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateImgActionPerformed
     try{
        FileInputStream fis = new FileInputStream(path);
        File file = new File(path);
        System.out.println(fis);  
         
    con = DBConnection.getConnection();
    prst = con.createStatement();
    String sql = "update img set image = ? where code = ?";
    PreparedStatement prst = con.prepareStatement(sql);

    prst.setBinaryStream(1, fis, (int) file.length()); //This line for image update
    prst.setString(2, imageCode.getText());

    prst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Record Updated successfully");

    con.close(); 
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    } 
    }//GEN-LAST:event_updateImgActionPerformed

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
            java.util.logging.Logger.getLogger(CrudPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudPhoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseImage;
    private javax.swing.JButton deleteImg;
    private javax.swing.JTextField imageCode;
    private javax.swing.JButton imageSearch;
    private javax.swing.JButton imgReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel photo;
    private javax.swing.JButton saveImage;
    private javax.swing.JButton updateImg;
    // End of variables declaration//GEN-END:variables
}
