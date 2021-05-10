package main;

import dao.DBConnection;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Bashir Hossain
 */
public class swing_form_field extends javax.swing.JFrame {

    Connection con;
    Statement prst;

     public void clearAllFormField(){
        userField.setText("");
        PasswordField.setText("");
        nameField.setText("");
        cDateTime.setText("");
        salaryField.setText("");
        countryComboBox.setSelectedIndex(0);
        autoComboBox.setSelectedIndex(0);
        
        quantitySpinner.setValue(Integer.parseInt("0"));
        
        dateChooser1.setDate(null); //9    
        rollField.setText("");
        buttonGroup1.clearSelection();
        
        banglaCheckBox.setSelected(false);
        englishCheckBox.setSelected(false);
        arabicCheckBox.setSelected(false);
        
        textArea.setText("");
     }
    
    public swing_form_field() {
        initComponents();
        AllFormTable();
        AutoComboBox();
        AutoCompleteDecorator.decorate(autoComboBox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        userId = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        Name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox<>();
        sex = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        banglaCheckBox = new javax.swing.JCheckBox();
        englishCheckBox = new javax.swing.JCheckBox();
        arabicCheckBox = new javax.swing.JCheckBox();
        development = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        rollField = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        show = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        currentDateTime = new javax.swing.JButton();
        cDateTime = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        allFormTable = new javax.swing.JTable();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSlider1 = new javax.swing.JSlider();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        autoComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLayeredPane1.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane1.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("All Swing Form Field");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        userId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userId.setForeground(new java.awt.Color(255, 255, 255));
        userId.setText("1. User ID : ");

        userField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("2. Password");

        PasswordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("3.  Name : ");

        nameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        address.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("4. C Date & Time :");

        country.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        country.setForeground(new java.awt.Color(255, 255, 255));
        country.setText("5. Country :");

        countryComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        countryComboBox.setForeground(new java.awt.Color(255, 255, 255));
        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - - Select - - - -", "Bangladesh", "Nepal", "Afganistan", "Uganda" }));
        countryComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                countryComboBoxComponentAdded(evt);
            }
        });
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });

        sex.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sex.setForeground(new java.awt.Color(255, 255, 255));
        sex.setText("6. Sex :");

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        maleRadioButton.setText("Male");

        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        femaleRadioButton.setText("Female");

        buttonGroup1.add(otherRadioButton);
        otherRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        otherRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        otherRadioButton.setText("Other");
        otherRadioButton.setContentAreaFilled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("7. Language : ");

        banglaCheckBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        banglaCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        banglaCheckBox.setText("Bangla");

        englishCheckBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        englishCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        englishCheckBox.setText("English");

        arabicCheckBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        arabicCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        arabicCheckBox.setText("Arabic");

        development.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        development.setForeground(new java.awt.Color(255, 255, 255));
        development.setText("8. Sarary :");

        salaryField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("9. Date : ");

        dateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateChooser1.setDateFormatString("d-MMM-yyyy");
        dateChooser1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateChooser1.setMaximumSize(new java.awt.Dimension(214748364, 214748364));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("10. Roll No :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("11. Quantity : ");

        quantitySpinner.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        rollField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rollField.setForeground(new java.awt.Color(51, 51, 51));

        insert.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(0, 102, 102));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 102));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 102, 102));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 102));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(0, 102, 102));
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 102, 102));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        currentDateTime.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        currentDateTime.setForeground(new java.awt.Color(0, 102, 102));
        currentDateTime.setText("Current Date & Time");
        currentDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentDateTimeActionPerformed(evt);
            }
        });

        cDateTime.setBackground(new java.awt.Color(51, 51, 51));
        cDateTime.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cDateTime.setForeground(new java.awt.Color(255, 255, 255));
        cDateTime.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLayeredPane2.setLayer(userId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(userField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PasswordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(nameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(country, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(countryComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(sex, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(maleRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(femaleRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(otherRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(banglaCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(englishCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(arabicCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(development, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(salaryField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(dateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(quantitySpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(rollField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(insert, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(search, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(show, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(clear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(currentDateTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cDateTime, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(currentDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30))
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(countryComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 221, Short.MAX_VALUE)
                                .addComponent(nameField)
                                .addComponent(PasswordField)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(maleRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(femaleRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(otherRadioButton))
                                .addComponent(userField)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(banglaCheckBox)
                                    .addGap(3, 3, 3)
                                    .addComponent(englishCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(arabicCheckBox))
                                .addComponent(cDateTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(development, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rollField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salaryField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password))
                .addGap(7, 7, 7)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country))
                .addGap(14, 14, 14)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton)
                    .addComponent(otherRadioButton)
                    .addComponent(sex))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(englishCheckBox)
                    .addComponent(arabicCheckBox)
                    .addComponent(banglaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(development, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rollField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        allFormTable.setModel(new javax.swing.table.DefaultTableModel(
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
        allFormTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allFormTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allFormTable);

        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        jLayeredPane4.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 102, 102));
        jToggleButton1.setText("ON/OF");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Slider :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proggress :");

        jLayeredPane5.setLayer(jToggleButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jSlider1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jProgressBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("12. Browse Photo");

        autoComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Auto Complete Combobox");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(autoComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane3)
                            .addComponent(jLayeredPane5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(autoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane5))
                    .addComponent(jLayeredPane2))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
        private void AutoComboBox() {
    try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct name from form where name != \"\" "; //For distinct and not null record    
            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
            autoComboBox.addItem(rs.getString("name"));
            }
            
            prst.close();
            rs.close();
            con.close();
        } catch (Exception e) {
        //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }
          
    
    //======================= DATABASE TABLE SHOWING  ========================//
    private void AllFormTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM form";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            allFormTable.setModel(DbUtils.resultSetToTableModel(rs));

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    //========================== ADD/INSERT/SAVE DATA ========================//
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
            //==========Same code for every connection==========//
            con = DBConnection.getConnection();
            prst = con.createStatement();

            String sql = "insert into form (user_id, password, name, text_date, country, sex, language, salary, date, roll_no, quantity) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
            PreparedStatement prst = con.prepareStatement(sql);
            

            //================ User Name/Text Field : String =================//
            prst.setString(1, userField.getText());

            //=============== Password/Pasword Field : String ================//
            prst.setString(2, PasswordField.getText());

            //=============== Name/Text Field : String =======================//
            prst.setString(3, nameField.getText());

            //=============== Address/Text Field : String ====================//
            prst.setString(4, cDateTime.getText());

            //================ Country/Combo Box : String ====================//
            String country = countryComboBox.getSelectedItem().toString();
            prst.setString(5, country);

            //================ Sex/Radio button : String =====================//
            String sex = null;
            if (maleRadioButton.isSelected()) {
                sex = maleRadioButton.getText();
            }
            if (femaleRadioButton.isSelected()) {
                sex = femaleRadioButton.getText();
            }
            if (otherRadioButton.isSelected()) {
                sex = otherRadioButton.getText();
            }
            prst.setString(6, sex);

            //==================== Language/Checkbox : String ================//
            String language = "";
            if (banglaCheckBox.isSelected()) {language += banglaCheckBox.getText() + " ";}
            if (englishCheckBox.isSelected()) {language += englishCheckBox.getText() + " ";}
            if (arabicCheckBox.isSelected()) {language += arabicCheckBox.getText();}
            prst.setString(7, language);

            //================= Salary/Text Field : Double  ==================//
            prst.setDouble(8, Double.parseDouble(salaryField.getText()));

            //=================== Name/Date Field : Date =====================//
//                  ================= For Current Date ===============
//           java.util.Date date = new java.util.Date();
//           java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//           prst.setDate(9, sqlDate);
//                  ================= For Selected Date ===============
            java.util.Date utilDate = (java.util.Date) dateChooser1.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            prst.setDate(9, sqlDate);

            //================= User Name/Text Field : String ================//
            prst.setInt(10, Integer.parseInt(rollField.getText()));
            
            //================= User Name/Text Field : String ================//
            prst.setInt(11, Integer.parseInt(quantitySpinner.getModel().getValue().toString()));

            prst.executeUpdate();
            AllFormTable();
            AutoComboBox();
            JOptionPane.showMessageDialog(null, "Saved successfully"); //after submission popup massage window
            con.close(); //after completing task close the popup window
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_insertActionPerformed

    
    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void countryComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_countryComboBoxComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboBoxComponentAdded

    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from form where user_id = ?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, userField.getText());
            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            AllFormTable();
            con.close();
            prst.close();
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteActionPerformed

    //============================== Search ==================================//
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from form where user_id = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, userField.getText());//1

            ResultSet rs = prst.executeQuery();
            if (rs.next()) {

            PasswordField.setText(rs.getString("password"));//2
            nameField.setText(rs.getString("name")); //3
            cDateTime.setText(rs.getString("text_date")); //4
            countryComboBox.setSelectedItem(rs.getString("country"));//5

            //=========== Set Radio Button value (For Searching)==========//6
            String sexes = rs.getString("sex");
            if ( sexes.matches("Male")) {maleRadioButton.setSelected(true);}
            if ( sexes.matches("Female")) {femaleRadioButton.setSelected(true);}
            if ( sexes.matches("Other")) {otherRadioButton.setSelected(true);}

            //============ Set Checkbox value (For Searching) ============//7
            String languages =  rs.getString("language");         
            if ( languages.matches("Bangla English Arabic")) {banglaCheckBox.setSelected(true);}
            if ( languages.matches("Bangla English Arabic")) {englishCheckBox.setSelected(true);}
            if ( languages.matches("Bangla English Arabic")) {arabicCheckBox.setSelected(true);}

            if ( languages.matches("Bangla English ")) {banglaCheckBox.setSelected(true);}
            if ( languages.matches("Bangla English ")) {englishCheckBox.setSelected(true);}

            if ( languages.matches("English Arabic")) {englishCheckBox.setSelected(true);}
            if ( languages.matches("English Arabic")) {arabicCheckBox.setSelected(true);} 

            if ( languages.matches("Bangla Arabic")) {banglaCheckBox.setSelected(true);}
            if ( languages.matches("Bangla Arabic")) {arabicCheckBox.setSelected(true);}

            if ( languages.matches("Arabic")) {arabicCheckBox.setSelected(true);}       
            if ( languages.matches("Bangla ")) {banglaCheckBox.setSelected(true);}       
            if ( languages.matches("English ")) {englishCheckBox.setSelected(true);} 


            salaryField.setText(String.valueOf(rs.getDouble("salary")));//8

            //=================== Set date (For Searching)================//9
            String dateValue = rs.getString("date"); // What ever column
            java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateValue);
            dateChooser1.setDate(date);

            rollField.setText(String.valueOf(rs.getInt("roll_no")));//10
            quantitySpinner.setValue(Integer.parseInt(rs.getString("quantity")));//11

            userField.setText(rs.getString("user_id"));//1
                
                
            } else {
               JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    clearAllFormField();
    }//GEN-LAST:event_clearActionPerformed

    private void currentDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentDateTimeActionPerformed
            //========== Setting Time ======//
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy/ HH:mm:ss").format(Calendar.getInstance().getTime());
        cDateTime.setText(timeStamp);
    }//GEN-LAST:event_currentDateTimeActionPerformed

    
    //================================ Update ================================//
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update form set password = ?, name = ?, text_date = ?, country = ?, sex = ?, language = ?, salary =?, date = ?, roll_no = ?, quantity =? where user_id = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            
            prst.setString(1, PasswordField.getText());
            prst.setString(2, nameField.getText());
            prst.setString(3, cDateTime.getText());
            prst.setString(4, countryComboBox.getSelectedItem().toString());
            
            String sex = null;
            if (maleRadioButton.isSelected()) {
                sex = maleRadioButton.getText();
            }
            if (femaleRadioButton.isSelected()) {
                sex = femaleRadioButton.getText();
            }
            if (otherRadioButton.isSelected()) {
                sex = otherRadioButton.getText();
            }
            prst.setString(5, sex);
            
            String language = "";
            if (banglaCheckBox.isSelected()) {language += banglaCheckBox.getText() + " ";}
            if (englishCheckBox.isSelected()) {language += englishCheckBox.getText() + " ";}
            if (arabicCheckBox.isSelected()) {language += arabicCheckBox.getText();}
            prst.setString(6, language);

            prst.setDouble(7, Double.parseDouble(salaryField.getText()));
            
            java.util.Date utilDate = (java.util.Date) dateChooser1.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            prst.setDate(8, sqlDate);
            
            prst.setInt(9, Integer.parseInt(rollField.getText()));
            prst.setInt(10, Integer.parseInt(quantitySpinner.getModel().getValue().toString()));

            prst.setString(11, userField.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");


            AllFormTable();
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
    
            String userId =  userField.getText();//1
            String passwords =  PasswordField.getText();//2
            String names =  nameField.getText();//3
            String currentDateTimes =  cDateTime.getText();//4
            String country = countryComboBox.getSelectedItem().toString();//5
           
            String sex = null;//6
            if (maleRadioButton.isSelected()) {
                sex = maleRadioButton.getText();
            }
            if (femaleRadioButton.isSelected()) {
                sex = femaleRadioButton.getText();
            }
            if (otherRadioButton.isSelected()) {
                sex = otherRadioButton.getText();
            }

            //=================== Language/Checkbox : String ================//7
            String language = "";
            if (banglaCheckBox.isSelected()) {language += banglaCheckBox.getText() + " ";}
            if (englishCheckBox.isSelected()) {language += englishCheckBox.getText() + " ";}
            if (arabicCheckBox.isSelected()) {language += arabicCheckBox.getText();}
            
            Double salarys =  Double.parseDouble(salaryField.getText());//8

            //================== Name/Date Field : Date ====================//9
//            java.util.Date date = new java.util.Date();
//            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//            java.sql.Date dates = sqlDate;
            
            java.util.Date utilDate = (java.util.Date) dateChooser1.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.sql.Date dates = sqlDate;

            int rolls =  Integer.parseInt(rollField.getText());//10
            Integer quantitys =  Integer.parseInt(quantitySpinner.getModel().getValue().toString());//11
            
            textArea.setText(
            "\nALL FORM FIELD VALUE"
            + "\n ----------------------------------------" 
                    
            + "\nUser ID :\t\t" + userId 
            + "\nPassword : \t\t" + passwords
            + "\nName :\t\t" + names
            + "\nCurrent date&Time :\t" + currentDateTimes
            + "\nCountry :\t\t" + country
            + "\nSex :\t\t" + sex
            + "\nLanguage :\t\t" + language
            + "\nSalary :\t\t" + salarys
            + "\nDate :\t\t" + dates
            + "\nRoll No :\t\t" + rolls
            + "\nSpinner value :\t\t" + quantitys);

    }//GEN-LAST:event_showActionPerformed

    
    //===================== Show Data by clicking table ======================//
    private void allFormTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allFormTableMouseClicked
    DefaultTableModel dr = (DefaultTableModel) allFormTable.getModel();
    int sindex = allFormTable.getSelectedRow();

    //id.setText((String) dr.getValueAt(sindex, 1));
    userField.setText((String) dr.getValueAt(sindex, 1));
    PasswordField.setText((String) dr.getValueAt(sindex, 2));
    nameField.setText((String) dr.getValueAt(sindex, 3));
    cDateTime.setText((String) dr.getValueAt(sindex, 4));
    countryComboBox.setSelectedItem((String) dr.getValueAt(sindex, 5));

            
        //=========== Set Radio Button value (For Searching)==========//6
            String sexes = (String) dr.getValueAt(sindex, 6);
            if ( sexes.matches("Male")) {maleRadioButton.setSelected(true);}
            if ( sexes.matches("Female")) {femaleRadioButton.setSelected(true);}
            if ( sexes.matches("Other")) {otherRadioButton.setSelected(true);}         


        //============ Set Checkbox value (For Searching) ============//7
                
        banglaCheckBox.setSelected(false);
        englishCheckBox.setSelected(false);
        arabicCheckBox.setSelected(false); 
                
                
            String languages =  (String) dr.getValueAt(sindex, 7);         
            if ( languages.matches("Bangla English Arabic")) {banglaCheckBox.setSelected(true);}
            if ( languages.matches("Bangla English Arabic")) {englishCheckBox.setSelected(true);}
            if ( languages.matches("Bangla English Arabic")) {arabicCheckBox.setSelected(true);}

            if ( languages.matches("Bangla English ")) {banglaCheckBox.setSelected(true);}
            if ( languages.matches("Bangla English ")) {englishCheckBox.setSelected(true);}

            if ( languages.matches("English Arabic")) {englishCheckBox.setSelected(true);}
            if ( languages.matches("English Arabic")) {arabicCheckBox.setSelected(true);} 

            if ( languages.matches("Bangla Arabic")) {banglaCheckBox.setSelected(true);}
            if ( languages.matches("Bangla Arabic")) {arabicCheckBox.setSelected(true);}

            if ( languages.matches("Arabic")) {arabicCheckBox.setSelected(true);}       
            if ( languages.matches("Bangla ")) {banglaCheckBox.setSelected(true);}       
            if ( languages.matches("English ")) {englishCheckBox.setSelected(true);} 
            
      

    salaryField.setText (String.valueOf (dr.getValueAt(sindex, 8)));  
    
    dateChooser1.setDate(null);  
    dateChooser1.setDate((Date) dr.getValueAt(sindex, 9));

    
    rollField.setText(String.valueOf (dr.getValueAt(sindex, 10)));
    
    quantitySpinner.setValue(Integer.parseInt(String.valueOf (dr.getValueAt(sindex, 11))));

    }//GEN-LAST:event_allFormTableMouseClicked


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
            java.util.logging.Logger.getLogger(swing_form_field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(swing_form_field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(swing_form_field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(swing_form_field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new swing_form_field().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel address;
    private javax.swing.JTable allFormTable;
    private javax.swing.JCheckBox arabicCheckBox;
    private javax.swing.JComboBox<String> autoComboBox;
    private javax.swing.JCheckBox banglaCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel cDateTime;
    private javax.swing.JButton clear;
    private javax.swing.JLabel country;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JButton currentDateTime;
    private com.toedter.calendar.JDateChooser dateChooser1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel development;
    private javax.swing.JCheckBox englishCheckBox;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField rollField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton search;
    private javax.swing.JLabel sex;
    private javax.swing.JButton show;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton update;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userId;
    // End of variables declaration//GEN-END:variables
}
