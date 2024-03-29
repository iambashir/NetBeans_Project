package com.shop.controller;

//=============================== Import Start =================================//
import com.shop.util.DBConnection;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import static java.lang.Double.sum;
import static java.lang.Integer.sum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.math.RoundingMode;
import java.text.DecimalFormat;
//=============================== Import End =================================//



/**
 *
 * @author Bashir Hossain
 * 
 **/


public class Dashboard extends javax.swing.JFrame {

    //=========== Fixed time for showing massage Dialog box ==================//
    private static final int TIME_VISIBLE = 1000;

    //======================== Variable For Calculator =======================//
    static int flag = 0;

    //================== Variable for Database connection ====================//
    Connection con;
    Statement prst;

    //================== Variable for Titlebar icon set== ====================//
    private ImageIcon format;

    //=============== Initiate call for all Dashboards Methods ===============//
    public Dashboard() {
        initComponents();
        initComboBox();
        initComboBox2();
        initComboBox3();
        employeeComboBox3();
        branchComboBox3();
        catagoriesComboBox3();
        paymentTypeComboBox3();
        DisplayTable();
        DisplayTable2();
        DisplayTable3();
        NeedToBuy();
        Seticon();
        BillDetailsTable();
        initBillTypeCombobox3();
        EmployeeTable2();
        TotalBillAmount();

        //========================== JFRAME COLOUR CHANGE ========================//
        //getContentPane().setBackground(java.awt.Color.orange); or
        getContentPane().setBackground(new java.awt.Color(122, 72, 48));

        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//close one jframe without closing other
        CategorieTable();
    }

    //======================== Clear All Deshboard Field =====================//
    public void clearAllDeshboardField() {
        billAmount.setText("");
        billerName2.setText("");
        entryDate.setText("");
        expiredDate.setText("");
        billPayment.setText("");
        addBillAmount.setText("");

        barcodeField11.setText("");
        productField12.setText("");
        quantityField2.setText("");
        unitPrField3.setText("");
        discountField4.setText("");

        //======orderReset=======//
        barcodeField1.setText("");
        product.setText("");
        branch.setText("");
        vat.setText("");
        totalVat.setText("");
        unitPrice.setText("");
        discount.setText("");
        subTotal.setText("");
        subDiscount.setText("");
        totalAmount.setText("");
        totalDiscount.setText("");
        subVat.setText("");
        totalVat.setText("");
        vat.setText("");

        printArea.setText("");

        //== Reset For Add Product ==//
        barcodeField11.setText("");
        productField12.setText("");
        quantityField2.setText("");
        unitPrField3.setText("");
        discountField4.setText("");
        discount.setText("");
        subTotal.setText("");
        adNameField14.setText("");
        adPhoneField16.setText("");
        dateChooser2.setDate(null);

    }

    //========= RESET METHOD CRATED TO CALL FROM ANYWHERE ==========//
    public void reset() {
        barcodeField11.setText("");
        productField12.setText("");
        quantityField2.setText("");
        unitPrField3.setText("");
        discountField4.setText("");
    }

    public void orderReset() {
        barcodeField1.setText("");
        product.setText("");
        branch.setText("");
        unitPrice.setText("");
        discount.setText("");
        subTotal.setText("");
        subDiscount.setText("");
        totalAmount.setText("");
        totalDiscount.setText("");
        subVat.setText("");
        totalVat.setText("");
        quntity.setText("1");
        vat.setText("0");
    }

    public void reset2() {
        printArea.setText("");
    }

    public void resetForAddProduct() {
        barcodeField11.setText("");
        productField12.setText("");
        quantityField2.setText("");
        unitPrField3.setText("");
        discountField4.setText("");
        discount.setText("");
        subTotal.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        stocksButton1 = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        logoutButton3 = new javax.swing.JButton();
        attendence = new javax.swing.JButton();
        supplierButton7 = new javax.swing.JButton();
        itemButton9 = new javax.swing.JButton();
        cashRecieptButton12 = new javax.swing.JButton();
        shopLogoButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        tabPane = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        electronics = new javax.swing.JButton();
        fashon = new javax.swing.JButton();
        medicalinstrument = new javax.swing.JButton();
        cooking = new javax.swing.JButton();
        homeApplience = new javax.swing.JButton();
        giftAndToys = new javax.swing.JButton();
        grocery = new javax.swing.JButton();
        personal = new javax.swing.JButton();
        stationery = new javax.swing.JButton();
        sports = new javax.swing.JButton();
        dairyProducts = new javax.swing.JButton();
        fruitsAndVegitables = new javax.swing.JButton();
        bags = new javax.swing.JButton();
        drinks = new javax.swing.JButton();
        meatAndFish = new javax.swing.JButton();
        addProductPanel = new javax.swing.JPanel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable2 = new javax.swing.JTable();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        barcodeField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        productField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        quantityField2 = new javax.swing.JTextField();
        unitPrField3 = new javax.swing.JTextField();
        discountField4 = new javax.swing.JTextField();
        Search2 = new javax.swing.JButton();
        categorieComboBox = new javax.swing.JComboBox<>();
        branchComboBox3 = new javax.swing.JComboBox<>();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        dataEntryButton45 = new javax.swing.JButton();
        searchByBarcode = new javax.swing.JButton();
        deleteButton47 = new javax.swing.JButton();
        adNameField14 = new javax.swing.JTextField();
        adPhoneField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        ClearOrderField = new javax.swing.JButton();
        updateAddProduct = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        jLayeredPane12 = new javax.swing.JLayeredPane();
        display = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        orderPanel = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable1 = new javax.swing.JTable();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        barcodeField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        barcodeSearch = new javax.swing.JButton();
        product = new javax.swing.JLabel();
        unitPrice = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        quntity = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        vat = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        recieptButton16 = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        billerName = new javax.swing.JTextField();
        PhoneField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        paymentComboBox2 = new javax.swing.JComboBox<>();
        totalAmount = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        subDiscount = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        totalDiscount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        totalVat = new javax.swing.JLabel();
        subVat = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        printButton19 = new javax.swing.JButton();
        exitButton20 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        printArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        invoiceNo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        invoiceDate = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        nbrInvoice = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mushokNo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane11 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        all_catagories = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        employeeComboBox1 = new javax.swing.JComboBox<>();
        branchComboBox2 = new javax.swing.JComboBox<>();
        catagoriesComboBox3 = new javax.swing.JComboBox<>();
        paymentComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        CategorieTable = new javax.swing.JTable();
        catagoriewiseStock = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        employeename = new javax.swing.JLabel();
        employeeDesignation = new javax.swing.JLabel();
        EmployeeAddress = new javax.swing.JLabel();
        EmployeeContact = new javax.swing.JLabel();
        EmployeeSearchButton = new javax.swing.JButton();
        EmployeeSearchField = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        employeeTable2 = new javax.swing.JTable();
        employeePhoto = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        clearEmployee = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        billDetailsTable = new javax.swing.JTable();
        jLayeredPane17 = new javax.swing.JLayeredPane();
        jLabel42 = new javax.swing.JLabel();
        billType = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        dueBill = new javax.swing.JTextField();
        jLayeredPane14 = new javax.swing.JLayeredPane();
        jLayeredPane15 = new javax.swing.JLayeredPane();
        jLabel40 = new javax.swing.JLabel();
        billAmount = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        billerName2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        entryDate = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        expiredDate = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLayeredPane13 = new javax.swing.JLayeredPane();
        totalBill = new javax.swing.JTextField();
        jLayeredPane16 = new javax.swing.JLayeredPane();
        jLabel35 = new javax.swing.JLabel();
        addBillAmount = new javax.swing.JTextField();
        billPayment = new javax.swing.JTextField();
        updateBill = new javax.swing.JButton();
        clearBillField = new javax.swing.JButton();
        payBill = new javax.swing.JButton();
        addBill = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        needToBuy = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUPARSHOP MANAGEMENT SYSTEM  - Developed by Bashir Hossain");
        setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 0), null, null));

        stocksButton1.setBackground(new java.awt.Color(0, 102, 102));
        stocksButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        stocksButton1.setForeground(new java.awt.Color(255, 255, 255));
        stocksButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/stock.png"))); // NOI18N
        stocksButton1.setText("Stocks");
        stocksButton1.setBorder(null);
        stocksButton1.setBorderPainted(false);
        stocksButton1.setContentAreaFilled(false);
        stocksButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stocksButton1.setIconTextGap(15);
        stocksButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocksButton1ActionPerformed(evt);
            }
        });

        dashboardButton.setBackground(new java.awt.Color(153, 153, 153));
        dashboardButton.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 102, 102));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/dashboard.png"))); // NOI18N
        dashboardButton.setText("DASHBOARD");
        dashboardButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        dashboardButton.setIconTextGap(10);

        logoutButton3.setBackground(new java.awt.Color(0, 51, 51));
        logoutButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logoutButton3.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/arrow.png"))); // NOI18N
        logoutButton3.setText("Log out");
        logoutButton3.setAlignmentY(0.0F);
        logoutButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutButton3.setContentAreaFilled(false);
        logoutButton3.setIconTextGap(10);
        logoutButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton3ActionPerformed(evt);
            }
        });

        attendence.setBackground(new java.awt.Color(0, 102, 102));
        attendence.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        attendence.setForeground(new java.awt.Color(255, 255, 255));
        attendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/customer.png"))); // NOI18N
        attendence.setText("Attendence");
        attendence.setBorderPainted(false);
        attendence.setContentAreaFilled(false);
        attendence.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        attendence.setIconTextGap(15);
        attendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendenceActionPerformed(evt);
            }
        });

        supplierButton7.setBackground(new java.awt.Color(0, 102, 102));
        supplierButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        supplierButton7.setForeground(new java.awt.Color(255, 255, 255));
        supplierButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/ship.png"))); // NOI18N
        supplierButton7.setText("Suppliers");
        supplierButton7.setBorderPainted(false);
        supplierButton7.setContentAreaFilled(false);
        supplierButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supplierButton7.setIconTextGap(15);
        supplierButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierButton7ActionPerformed(evt);
            }
        });

        itemButton9.setBackground(new java.awt.Color(0, 102, 102));
        itemButton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        itemButton9.setForeground(new java.awt.Color(255, 255, 255));
        itemButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/new.png"))); // NOI18N
        itemButton9.setText("New Order");
        itemButton9.setBorderPainted(false);
        itemButton9.setContentAreaFilled(false);
        itemButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        itemButton9.setIconTextGap(15);
        itemButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton9ActionPerformed(evt);
            }
        });

        cashRecieptButton12.setBackground(new java.awt.Color(0, 102, 102));
        cashRecieptButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cashRecieptButton12.setForeground(new java.awt.Color(255, 255, 255));
        cashRecieptButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/money.png"))); // NOI18N
        cashRecieptButton12.setText("Admin Panel");
        cashRecieptButton12.setBorderPainted(false);
        cashRecieptButton12.setContentAreaFilled(false);
        cashRecieptButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cashRecieptButton12.setIconTextGap(15);
        cashRecieptButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRecieptButton12ActionPerformed(evt);
            }
        });

        shopLogoButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/online-shopping-dashboard.png"))); // NOI18N
        shopLogoButton22.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(shopLogoButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashRecieptButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stocksButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(shopLogoButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stocksButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashRecieptButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(logoutButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/title_img.png"))); // NOI18N
        jButton21.setBorder(null);
        jButton21.setContentAreaFilled(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setIconTextGap(0);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLayeredPane6.setBackground(new java.awt.Color(0, 153, 51));

        tabPane.setBackground(new java.awt.Color(180, 113, 45));
        tabPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabPane.setForeground(new java.awt.Color(51, 51, 51));
        tabPane.setFocusTraversalPolicyProvider(true);
        tabPane.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tabPane.setNextFocusableComponent(home);
        tabPane.setOpaque(true);
        tabPane.setPreferredSize(new java.awt.Dimension(1200, 638));

        home.setBackground(new java.awt.Color(0, 153, 102));
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        electronics.setBackground(new java.awt.Color(51, 51, 51));
        electronics.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        electronics.setForeground(new java.awt.Color(255, 255, 255));
        electronics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/desk-lamp.png"))); // NOI18N
        electronics.setText("Electronics");
        electronics.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        electronics.setContentAreaFilled(false);
        electronics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        electronics.setIconTextGap(10);
        electronics.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        electronics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicsActionPerformed(evt);
            }
        });

        fashon.setBackground(new java.awt.Color(51, 51, 51));
        fashon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fashon.setForeground(new java.awt.Color(255, 255, 255));
        fashon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/fashion.png"))); // NOI18N
        fashon.setText("Fashion");
        fashon.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        fashon.setContentAreaFilled(false);
        fashon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fashon.setIconTextGap(10);
        fashon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fashon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fashonActionPerformed(evt);
            }
        });

        medicalinstrument.setBackground(new java.awt.Color(51, 51, 51));
        medicalinstrument.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        medicalinstrument.setForeground(new java.awt.Color(255, 255, 255));
        medicalinstrument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/medical-equipment.png"))); // NOI18N
        medicalinstrument.setText("Medical Instr.");
        medicalinstrument.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        medicalinstrument.setContentAreaFilled(false);
        medicalinstrument.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        medicalinstrument.setIconTextGap(10);
        medicalinstrument.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        medicalinstrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalinstrumentActionPerformed(evt);
            }
        });

        cooking.setBackground(new java.awt.Color(51, 51, 51));
        cooking.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cooking.setForeground(new java.awt.Color(255, 255, 255));
        cooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/kitchen.png"))); // NOI18N
        cooking.setText("Cooking");
        cooking.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cooking.setContentAreaFilled(false);
        cooking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cooking.setIconTextGap(10);
        cooking.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookingActionPerformed(evt);
            }
        });

        homeApplience.setBackground(new java.awt.Color(51, 51, 51));
        homeApplience.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        homeApplience.setForeground(new java.awt.Color(255, 255, 255));
        homeApplience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/oven.png"))); // NOI18N
        homeApplience.setText("Home Appliance");
        homeApplience.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        homeApplience.setContentAreaFilled(false);
        homeApplience.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeApplience.setIconTextGap(10);
        homeApplience.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeApplience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeApplienceActionPerformed(evt);
            }
        });

        giftAndToys.setBackground(new java.awt.Color(51, 51, 51));
        giftAndToys.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        giftAndToys.setForeground(new java.awt.Color(255, 255, 255));
        giftAndToys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/toys.png"))); // NOI18N
        giftAndToys.setText("Gift & Toys");
        giftAndToys.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        giftAndToys.setContentAreaFilled(false);
        giftAndToys.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        giftAndToys.setIconTextGap(10);
        giftAndToys.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        giftAndToys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giftAndToysActionPerformed(evt);
            }
        });

        grocery.setBackground(new java.awt.Color(51, 51, 51));
        grocery.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        grocery.setForeground(new java.awt.Color(255, 255, 255));
        grocery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/grocery.png"))); // NOI18N
        grocery.setText("Grocery");
        grocery.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        grocery.setContentAreaFilled(false);
        grocery.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        grocery.setIconTextGap(10);
        grocery.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        grocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groceryActionPerformed(evt);
            }
        });

        personal.setBackground(new java.awt.Color(51, 51, 51));
        personal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        personal.setForeground(new java.awt.Color(255, 255, 255));
        personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/hairdresser.png"))); // NOI18N
        personal.setText("Personal Care");
        personal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        personal.setContentAreaFilled(false);
        personal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        personal.setIconTextGap(10);
        personal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalActionPerformed(evt);
            }
        });

        stationery.setBackground(new java.awt.Color(51, 51, 51));
        stationery.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stationery.setForeground(new java.awt.Color(255, 255, 255));
        stationery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/stationery.png"))); // NOI18N
        stationery.setText("Stationery");
        stationery.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        stationery.setContentAreaFilled(false);
        stationery.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stationery.setIconTextGap(10);
        stationery.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stationery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationeryActionPerformed(evt);
            }
        });

        sports.setBackground(new java.awt.Color(51, 51, 51));
        sports.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sports.setForeground(new java.awt.Color(255, 255, 255));
        sports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/sports.png"))); // NOI18N
        sports.setText("Sports");
        sports.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        sports.setContentAreaFilled(false);
        sports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sports.setIconTextGap(10);
        sports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsActionPerformed(evt);
            }
        });

        dairyProducts.setBackground(new java.awt.Color(51, 51, 51));
        dairyProducts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dairyProducts.setForeground(new java.awt.Color(255, 255, 255));
        dairyProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/dairy-products.png"))); // NOI18N
        dairyProducts.setText("Dairy Products");
        dairyProducts.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        dairyProducts.setContentAreaFilled(false);
        dairyProducts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dairyProducts.setIconTextGap(10);
        dairyProducts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dairyProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairyProductsActionPerformed(evt);
            }
        });

        fruitsAndVegitables.setBackground(new java.awt.Color(51, 51, 51));
        fruitsAndVegitables.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fruitsAndVegitables.setForeground(new java.awt.Color(255, 255, 255));
        fruitsAndVegitables.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/healthy-food.png"))); // NOI18N
        fruitsAndVegitables.setText("Fruits and Vegitables");
        fruitsAndVegitables.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        fruitsAndVegitables.setContentAreaFilled(false);
        fruitsAndVegitables.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fruitsAndVegitables.setIconTextGap(10);
        fruitsAndVegitables.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fruitsAndVegitables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitsAndVegitablesActionPerformed(evt);
            }
        });

        bags.setBackground(new java.awt.Color(51, 51, 51));
        bags.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bags.setForeground(new java.awt.Color(255, 255, 255));
        bags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/online-shopping-dashboard.png"))); // NOI18N
        bags.setText("Bags");
        bags.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bags.setContentAreaFilled(false);
        bags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bags.setIconTextGap(10);
        bags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagsActionPerformed(evt);
            }
        });

        drinks.setBackground(new java.awt.Color(51, 51, 51));
        drinks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        drinks.setForeground(new java.awt.Color(255, 255, 255));
        drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/drink.png"))); // NOI18N
        drinks.setText("Drinks");
        drinks.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        drinks.setContentAreaFilled(false);
        drinks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        drinks.setIconTextGap(10);
        drinks.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });

        meatAndFish.setBackground(new java.awt.Color(51, 51, 51));
        meatAndFish.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        meatAndFish.setForeground(new java.awt.Color(255, 255, 255));
        meatAndFish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/thanksgiving.png"))); // NOI18N
        meatAndFish.setText("Meat & Fish");
        meatAndFish.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        meatAndFish.setContentAreaFilled(false);
        meatAndFish.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        meatAndFish.setIconTextGap(10);
        meatAndFish.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meatAndFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatAndFishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(sports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grocery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dairyProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(medicalinstrument, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(electronics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giftAndToys, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(cooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(drinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stationery, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(homeApplience, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(bags, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashon, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(meatAndFish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fruitsAndVegitables, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(grocery, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(personal, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(electronics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(homeApplience, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(giftAndToys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fashon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stationery, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(cooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(meatAndFish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicalinstrument, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bags, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(drinks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dairyProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fruitsAndVegitables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        tabPane.addTab("HOME", home);

        addProductPanel.setBackground(new java.awt.Color(0, 153, 102));

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        productTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Barcode", "Product_Name", "Branch", "Quantity", "Unit_Price", "Discount", "Categories", "Inputer_Name", "Phone", "Date"
            }
        ));
        productTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productTable2);

        jLayeredPane7.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane8.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLayeredPane9.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Barcode :");

        barcodeField11.setBackground(new java.awt.Color(244, 253, 209));
        barcodeField11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        barcodeField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barcodeField11.setFocusCycleRoot(true);
        barcodeField11.setFocusTraversalPolicyProvider(true);
        barcodeField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeField11ActionPerformed(evt);
            }
        });
        barcodeField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barcodeField11KeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Product :");

        productField12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        productField12.setFocusCycleRoot(true);
        productField12.setFocusTraversalPolicyProvider(true);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Branch :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Quantity :");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Unit Price :");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Discount :");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Catagorie :");

        quantityField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quantityField2.setFocusCycleRoot(true);
        quantityField2.setFocusTraversalPolicyProvider(true);
        quantityField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityField2ActionPerformed(evt);
            }
        });

        unitPrField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        unitPrField3.setFocusCycleRoot(true);
        unitPrField3.setFocusTraversalPolicyProvider(true);
        unitPrField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitPrField3ActionPerformed(evt);
            }
        });

        discountField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        discountField4.setFocusCycleRoot(true);
        discountField4.setFocusTraversalPolicyProvider(true);

        Search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });

        categorieComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        categorieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieComboBoxActionPerformed(evt);
            }
        });

        branchComboBox3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        branchComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchComboBox3ActionPerformed(evt);
            }
        });

        jLayeredPane9.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(barcodeField11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(productField12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(quantityField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(unitPrField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(discountField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(Search2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(categorieComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(branchComboBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane9Layout = new javax.swing.GroupLayout(jLayeredPane9);
        jLayeredPane9.setLayout(jLayeredPane9Layout);
        jLayeredPane9Layout.setHorizontalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Search2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barcodeField11, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(discountField4))))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(categorieComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitPrField3)
                            .addComponent(quantityField2)
                            .addComponent(branchComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productField12))))
                .addGap(0, 0, 0))
        );
        jLayeredPane9Layout.setVerticalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(barcodeField11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(branchComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPrField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(discountField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jLayeredPane10.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Administrator Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Name :");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Phone : ");

        dataEntryButton45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dataEntryButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        dataEntryButton45.setText("Data Entry");
        dataEntryButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEntryButton45ActionPerformed(evt);
            }
        });

        searchByBarcode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchByBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        searchByBarcode.setText("Search by Pr.");
        searchByBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByBarcodeActionPerformed(evt);
            }
        });

        deleteButton47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/delete.png"))); // NOI18N
        deleteButton47.setText("Delete");
        deleteButton47.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteButton47.setIconTextGap(5);
        deleteButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton47ActionPerformed(evt);
            }
        });

        adNameField14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adNameField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adNameField14ActionPerformed(evt);
            }
        });

        adPhoneField16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Date :");

        searchField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ClearOrderField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ClearOrderField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        ClearOrderField.setText("Clear");
        ClearOrderField.setIconTextGap(5);
        ClearOrderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearOrderFieldActionPerformed(evt);
            }
        });

        updateAddProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        updateAddProduct.setText("Update");
        updateAddProduct.setIconTextGap(5);
        updateAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAddProductActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/sell.png"))); // NOI18N
        jButton3.setText("Purchase ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/options.png"))); // NOI18N
        jButton5.setText("Option");
        jButton5.setIconTextGap(5);

        dateChooser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateChooser2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLayeredPane10.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(dataEntryButton45, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(searchByBarcode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(deleteButton47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(adNameField14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(adPhoneField16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(searchField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(ClearOrderField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(updateAddProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(dateChooser2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane10Layout = new javax.swing.GroupLayout(jLayeredPane10);
        jLayeredPane10.setLayout(jLayeredPane10Layout);
        jLayeredPane10Layout.setHorizontalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane10Layout.createSequentialGroup()
                        .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adPhoneField16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adNameField14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane10Layout.createSequentialGroup()
                        .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClearOrderField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(dataEntryButton45, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchByBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchField, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jLayeredPane10Layout.setVerticalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adNameField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adPhoneField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(dateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataEntryButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLayeredPane12.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        display.setBackground(new java.awt.Color(244, 253, 209));
        display.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("AC");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        btnDivide.setBackground(new java.awt.Color(204, 204, 204));
        btnDivide.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDivide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/division-symbol.png"))); // NOI18N
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnPercent.setBackground(new java.awt.Color(204, 204, 204));
        btnPercent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPercent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/percentige.png"))); // NOI18N
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/back-arrow.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/multiply-mathematical-sign.png"))); // NOI18N
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/minus.png"))); // NOI18N
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/plus.png"))); // NOI18N
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/dot.png"))); // NOI18N
        btnPoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        jLayeredPane12.setLayer(display, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnDivide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnPercent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnMulti, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnMinus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnPlus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btn0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnPoint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(btnEqual, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane12Layout = new javax.swing.GroupLayout(jLayeredPane12);
        jLayeredPane12.setLayout(jLayeredPane12Layout);
        jLayeredPane12Layout.setHorizontalGroup(
            jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display)
                    .addGroup(jLayeredPane12Layout.createSequentialGroup()
                        .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEqual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        jLayeredPane12Layout.setVerticalGroup(
            jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane12Layout.createSequentialGroup()
                        .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane8.setLayer(jLayeredPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jLayeredPane10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jLayeredPane12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addComponent(jLayeredPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane10)
                .addContainerGap())
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addProductPanelLayout = new javax.swing.GroupLayout(addProductPanel);
        addProductPanel.setLayout(addProductPanelLayout);
        addProductPanelLayout.setHorizontalGroup(
            addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane7)
                    .addComponent(jLayeredPane8))
                .addContainerGap())
        );
        addProductPanelLayout.setVerticalGroup(
            addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPane.addTab("ADD PRODUCT", addProductPanel);

        orderPanel.setBackground(new java.awt.Color(98, 135, 153));
        orderPanel.setAutoscrolls(true);

        jLayeredPane2.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        salesTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        salesTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salesTable1);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        jLayeredPane3.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales Amount", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane3.setAutoscrolls(true);
        jLayeredPane3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/qr-code.png"))); // NOI18N
        jLabel1.setText("Barcode :");

        barcodeField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        barcodeField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barcodeField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeField1ActionPerformed(evt);
            }
        });
        barcodeField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barcodeField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/product.png"))); // NOI18N
        jLabel2.setText("Product :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/branch.png"))); // NOI18N
        jLabel3.setText("Branch :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/quantity.png"))); // NOI18N
        jLabel4.setText("Quantity :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/unit_price.png"))); // NOI18N
        jLabel5.setText("Unit Price :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/discount.png"))); // NOI18N
        jLabel6.setText("Discount (%):");

        barcodeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        barcodeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeSearchActionPerformed(evt);
            }
        });

        product.setBackground(new java.awt.Color(51, 51, 51));
        product.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        unitPrice.setBackground(new java.awt.Color(51, 51, 51));
        unitPrice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        unitPrice.setForeground(new java.awt.Color(255, 255, 255));
        unitPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        discount.setBackground(new java.awt.Color(51, 51, 51));
        discount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        branch.setBackground(new java.awt.Color(51, 51, 51));
        branch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        branch.setForeground(new java.awt.Color(255, 255, 255));
        branch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        quntity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quntity.setText("1");
        quntity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quntityActionPerformed(evt);
            }
        });
        quntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quntityKeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/pay.png"))); // NOI18N
        jLabel36.setText("Vat (%) :");

        vat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vat.setText("0");
        vat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatActionPerformed(evt);
            }
        });
        vat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vatKeyReleased(evt);
            }
        });

        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(barcodeField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(barcodeSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(product, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(unitPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(discount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(branch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(quntity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(vat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unitPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quntity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(branch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(barcodeSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barcodeField1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addComponent(vat))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barcodeField1)
                    .addComponent(barcodeSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quntity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel36)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLayeredPane4.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/name.png"))); // NOI18N
        jLabel8.setText("Biller Name :");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/phone.png"))); // NOI18N
        jLabel14.setText("Phone : ");

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        reset.setText("Reset");
        reset.setIconTextGap(5);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        recieptButton16.setBackground(new java.awt.Color(204, 204, 204));
        recieptButton16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        recieptButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/receipt.png"))); // NOI18N
        recieptButton16.setText("Reciept");
        recieptButton16.setIconTextGap(5);
        recieptButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieptButton16ActionPerformed(evt);
            }
        });

        sellButton.setBackground(new java.awt.Color(204, 204, 204));
        sellButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sellButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/sell.png"))); // NOI18N
        sellButton.setText("Sell");
        sellButton.setIconTextGap(5);
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        billerName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        billerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PhoneField10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        PhoneField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/pay.png"))); // NOI18N
        jLabel15.setText("Payment By : ");

        paymentComboBox2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        paymentComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentComboBox2ActionPerformed(evt);
            }
        });

        totalAmount.setBackground(new java.awt.Color(51, 51, 51));
        totalAmount.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        totalAmount.setForeground(new java.awt.Color(255, 255, 255));
        totalAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/price-tag.png"))); // NOI18N
        jLabel30.setText("Total Discount :");

        subDiscount.setBackground(new java.awt.Color(51, 51, 51));
        subDiscount.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        subDiscount.setForeground(new java.awt.Color(255, 255, 255));
        subDiscount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/download.png"))); // NOI18N
        jLabel32.setText("Total Price : ");

        totalDiscount.setBackground(new java.awt.Color(51, 51, 51));
        totalDiscount.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        totalDiscount.setForeground(new java.awt.Color(255, 255, 255));
        totalDiscount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/quantity2.png"))); // NOI18N
        jLabel7.setText("Sub Total :");

        subTotal.setBackground(new java.awt.Color(51, 51, 51));
        subTotal.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        subTotal.setForeground(new java.awt.Color(255, 255, 255));
        subTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        subTotal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                subTotalComponentResized(evt);
            }
        });

        totalVat.setBackground(new java.awt.Color(51, 51, 51));
        totalVat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        totalVat.setForeground(new java.awt.Color(255, 255, 255));
        totalVat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        subVat.setBackground(new java.awt.Color(51, 51, 51));
        subVat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subVat.setForeground(new java.awt.Color(255, 255, 255));
        subVat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subVat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        subVat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/discount.png"))); // NOI18N
        jLabel39.setText("Total Vat : ");

        jLayeredPane4.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(reset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(recieptButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(sellButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(billerName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(PhoneField10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(paymentComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(totalAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(subDiscount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(totalDiscount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(subTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(totalVat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(subVat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recieptButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel32)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(subVat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalVat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(paymentComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneField10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(billerName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billerName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalVat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subVat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recieptButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLayeredPane5.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order and Print details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        printButton19.setBackground(new java.awt.Color(204, 204, 204));
        printButton19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        printButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/printer.png"))); // NOI18N
        printButton19.setText("Print");
        printButton19.setIconTextGap(5);
        printButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButton19ActionPerformed(evt);
            }
        });

        exitButton20.setBackground(new java.awt.Color(204, 204, 204));
        exitButton20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/exit.png"))); // NOI18N
        exitButton20.setText("Exit");
        exitButton20.setIconTextGap(5);
        exitButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton20ActionPerformed(evt);
            }
        });

        printArea.setColumns(20);
        printArea.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        printArea.setRows(5);
        jScrollPane3.setViewportView(printArea);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.setIconTextGap(5);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane5.setLayer(printButton19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(exitButton20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addComponent(printButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        invoiceNo.setBackground(new java.awt.Color(51, 51, 51));
        invoiceNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        invoiceNo.setForeground(new java.awt.Color(255, 255, 255));
        invoiceNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invoiceNo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        invoiceNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Invoice No :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Invoice Date & Time :");

        invoiceDate.setBackground(new java.awt.Color(51, 51, 51));
        invoiceDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        invoiceDate.setForeground(new java.awt.Color(255, 255, 255));
        invoiceDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invoiceDate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        invoiceDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("NBR Invoice No :");

        nbrInvoice.setBackground(new java.awt.Color(0, 0, 0));
        nbrInvoice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nbrInvoice.setForeground(new java.awt.Color(255, 255, 255));
        nbrInvoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbrInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        nbrInvoice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mushok :");

        mushokNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(jLayeredPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane5))
                    .addComponent(jLayeredPane2)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mushokNo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbrInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(invoiceNo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                .addContainerGap())
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(invoiceDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(nbrInvoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoiceNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(mushokNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2)
                .addGap(2, 2, 2)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jLayeredPane5))
                .addContainerGap())
        );

        tabPane.addTab("ORDER", orderPanel);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jLayeredPane11.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPane11.setOpaque(true);

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        jScrollPane4.setViewportView(historyTable);

        jLayeredPane11.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane11Layout = new javax.swing.GroupLayout(jLayeredPane11);
        jLayeredPane11.setLayout(jLayeredPane11Layout);
        jLayeredPane11Layout.setHorizontalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        jLayeredPane11Layout.setVerticalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane11)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane11)
        );

        tabPane.addTab("SELLS HISTORY", jPanel1);

        all_catagories.setBackground(new java.awt.Color(0, 153, 102));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Branch :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Catagories :");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Payment Type :");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Employee :");

        employeeComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeeComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeComboBox1ActionPerformed(evt);
            }
        });

        branchComboBox2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        branchComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchComboBox2ActionPerformed(evt);
            }
        });

        catagoriesComboBox3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        paymentComboBox4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        CategorieTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(CategorieTable);

        catagoriewiseStock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        catagoriewiseStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/stock.png"))); // NOI18N
        catagoriewiseStock.setText("Go To Catagoriewise Stocks");
        catagoriewiseStock.setIconTextGap(10);
        catagoriewiseStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoriewiseStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout all_catagoriesLayout = new javax.swing.GroupLayout(all_catagories);
        all_catagories.setLayout(all_catagoriesLayout);
        all_catagoriesLayout.setHorizontalGroup(
            all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(all_catagoriesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(all_catagoriesLayout.createSequentialGroup()
                        .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel9)
                            .addComponent(jLabel27)
                            .addComponent(jLabel13))
                        .addGap(53, 53, 53)
                        .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(employeeComboBox1, 0, 279, Short.MAX_VALUE)
                                .addComponent(branchComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paymentComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(catagoriesComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(catagoriewiseStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        all_catagoriesLayout.setVerticalGroup(
            all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, all_catagoriesLayout.createSequentialGroup()
                .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(all_catagoriesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(27, 27, 27)
                        .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branchComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(27, 27, 27)
                        .addGroup(all_catagoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catagoriesComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(catagoriewiseStock, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(all_catagoriesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPane.addTab("CATAGORIES & OTHERS", all_catagories);

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));
        jPanel6.setAutoscrolls(true);

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Rasulpur Organic Supershop");
        jLabel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Name :");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Designation :");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Address : ");

        employeename.setBackground(new java.awt.Color(0, 102, 102));
        employeename.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        employeename.setForeground(new java.awt.Color(255, 255, 255));
        employeename.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        employeeDesignation.setBackground(new java.awt.Color(0, 102, 102));
        employeeDesignation.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        employeeDesignation.setForeground(new java.awt.Color(255, 255, 255));
        employeeDesignation.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EmployeeAddress.setBackground(new java.awt.Color(0, 102, 102));
        EmployeeAddress.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        EmployeeAddress.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EmployeeContact.setBackground(new java.awt.Color(0, 102, 102));
        EmployeeContact.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        EmployeeContact.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeContact.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EmployeeSearchButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmployeeSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/search.png"))); // NOI18N
        EmployeeSearchButton.setText("Search By Employee ID");
        EmployeeSearchButton.setIconTextGap(6);
        EmployeeSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSearchButtonActionPerformed(evt);
            }
        });

        EmployeeSearchField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        employeeTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(employeeTable2);

        employeePhoto.setBackground(new java.awt.Color(51, 51, 51));
        employeePhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeePhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeePhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel47.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Contact :");

        clearEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        clearEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EmployeeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(employeeDesignation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(employeename, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EmployeeContact, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(EmployeeSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EmployeeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clearEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(employeePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(3, 3, 3)
                .addComponent(employeePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel31))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(employeename, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(employeeDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel33)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel34)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmployeeContact, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmployeeSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        tabPane.addTab("EMPLOYEE", jPanel6);

        jPanel7.setBackground(new java.awt.Color(98, 135, 153));

        billDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bill_Type", "Due_Bill", "Biller_Name", "Entry_Date", "Expired_Date"
            }
        ));
        jScrollPane5.setViewportView(billDetailsTable);

        jLayeredPane17.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Bill Type");

        billType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        billType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billTypeActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Due Bill");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dueBill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dueBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueBillActionPerformed(evt);
            }
        });

        jLayeredPane14.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane14.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane14Layout = new javax.swing.GroupLayout(jLayeredPane14);
        jLayeredPane14.setLayout(jLayeredPane14Layout);
        jLayeredPane14Layout.setHorizontalGroup(
            jLayeredPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jLayeredPane14Layout.setVerticalGroup(
            jLayeredPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLayeredPane15.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane15.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane15Layout = new javax.swing.GroupLayout(jLayeredPane15);
        jLayeredPane15.setLayout(jLayeredPane15Layout);
        jLayeredPane15Layout.setHorizontalGroup(
            jLayeredPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jLayeredPane15Layout.setVerticalGroup(
            jLayeredPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel40.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Bill Amount :");

        billAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Biller Name :");

        billerName2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Entry Date :");

        entryDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Expierd Date :");

        expiredDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        expiredDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiredDateActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Total Due Bill");
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLayeredPane13.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane13.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane13Layout = new javax.swing.GroupLayout(jLayeredPane13);
        jLayeredPane13.setLayout(jLayeredPane13Layout);
        jLayeredPane13Layout.setHorizontalGroup(
            jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        jLayeredPane13Layout.setVerticalGroup(
            jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        totalBill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBillActionPerformed(evt);
            }
        });

        jLayeredPane16.setBackground(new java.awt.Color(153, 204, 255));
        jLayeredPane16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Note : Generel user can add or pay bill and update date only.");

        addBillAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        billPayment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        updateBill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        updateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/updated.png"))); // NOI18N
        updateBill.setText("Update");
        updateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBillActionPerformed(evt);
            }
        });

        clearBillField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearBillField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/clear.png"))); // NOI18N
        clearBillField.setText("Clear");
        clearBillField.setIconTextGap(5);
        clearBillField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBillFieldActionPerformed(evt);
            }
        });

        payBill.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        payBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/pay.png"))); // NOI18N
        payBill.setText("Pay Bill");
        payBill.setIconTextGap(5);
        payBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBillActionPerformed(evt);
            }
        });

        addBill.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        addBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/add.png"))); // NOI18N
        addBill.setText("Add Bill");
        addBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBillActionPerformed(evt);
            }
        });

        jLayeredPane16.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane16.setLayer(addBillAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane16.setLayer(billPayment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane16.setLayer(updateBill, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane16.setLayer(clearBillField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane16.setLayer(payBill, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane16.setLayer(addBill, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane16Layout = new javax.swing.GroupLayout(jLayeredPane16);
        jLayeredPane16.setLayout(jLayeredPane16Layout);
        jLayeredPane16Layout.setHorizontalGroup(
            jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addGroup(jLayeredPane16Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(billPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane16Layout.createSequentialGroup()
                        .addComponent(addBill, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBill, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBillField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jLayeredPane16Layout.setVerticalGroup(
            jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billPayment)
                    .addComponent(addBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payBill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBillField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLayeredPane17.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(billType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(dueBill, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLayeredPane14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLayeredPane15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(billAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(billerName2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(entryDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLabel46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(expiredDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLabel45, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLayeredPane13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(totalBill, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane17.setLayer(jLayeredPane16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane17Layout = new javax.swing.GroupLayout(jLayeredPane17);
        jLayeredPane17.setLayout(jLayeredPane17Layout);
        jLayeredPane17Layout.setHorizontalGroup(
            jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane17Layout.createSequentialGroup()
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46))
                            .addComponent(jLabel43))
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane17Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(billerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(billAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane17Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(billType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane17Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(totalBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(dueBill, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane17Layout.createSequentialGroup()
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel42))
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLayeredPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLayeredPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane17Layout.setVerticalGroup(
            jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billType, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueBill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane17Layout.createSequentialGroup()
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane17)
                .addContainerGap())
        );

        tabPane.addTab("BILL", jPanel7);

        jLayeredPane1.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane1.setOpaque(true);

        needToBuy.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(needToBuy);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("The Product Quantity Lower Then 50");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLayeredPane1.setLayer(jScrollPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );

        tabPane.addTab("PRODUCT ALERT", jLayeredPane1);

        jLayeredPane6.setLayer(tabPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane6Layout.createSequentialGroup()
                    .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane6)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane6)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategorieTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from combo_field";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            CategorieTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void EmployeeTable2() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT id_no, designation, name, cantact, address FROM assign_employee";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            employeeTable2.setModel(DbUtils.resultSetToTableModel(rs));

            // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void BillDetailsTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM supershop_management_system.bill";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            billDetailsTable.setModel(DbUtils.resultSetToTableModel(rs));

            // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void NeedToBuy() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT * FROM supershop_management_system.product_entry where quantity <50 ";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            needToBuy.setModel(DbUtils.resultSetToTableModel(rs));

            // DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //============= DATABASE TABLE SHOWING IN ADD PRODUCT FORM ========================//
    private void DisplayTable() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from product_entry";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            productTable2.setModel(DbUtils.resultSetToTableModel(rs));

            DisplayTable2();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //============= DATABASE TABLE SHOWING IN ORDER FORM ========================//
    private void DisplayTable2() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from product_entry";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            salesTable1.setModel(DbUtils.resultSetToTableModel(rs));
            //historyTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void DisplayTable3() {

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from sells_history";

            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            historyTable.setModel(DbUtils.resultSetToTableModel(rs));
            //historyTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void stocksButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocksButton1ActionPerformed

        this.setVisible(true);
        new Stocks().setVisible(true);
    }//GEN-LAST:event_stocksButton1ActionPerformed

    //========================= LOGOUT ========================================//
    private void logoutButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton3ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButton3ActionPerformed

    private void initComboBox() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct branch from combo_field where branch != \"\""; // if want unique distinct value
            //"select * from user"; //if I want All value

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                branchComboBox3.addItem(rs.getString("branch"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }


    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void attendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendenceActionPerformed
        dispose();
        this.setVisible(true);
        new Attendence().setVisible(true);
    }//GEN-LAST:event_attendenceActionPerformed

    private void cashRecieptButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRecieptButton12ActionPerformed
        this.setVisible(true);
        new GoToAdminPanel().setVisible(true);
    }//GEN-LAST:event_cashRecieptButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton20ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_exitButton20ActionPerformed

    //========================= PRINT SELLS ===================================// 
    private void printButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButton19ActionPerformed
        try {
            boolean print = printArea.print();
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!..");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_printButton19ActionPerformed

    private void paymentComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentComboBox2ActionPerformed

    //============ Stordata in Array then Calculate by loop ==============//
    Double totalvalue = 0.0;
    Double cash = 0.0;
    Double balance = 0.0;
    Double bHeight = 0.0;
    double subDiss = 0.0;
    double totalDisscounts = 0.0;
    double subVatV = 0.0;
    double totalVatV = 0.0;

    ArrayList<String> productsName = new ArrayList<>();
    ArrayList<String> quantitys = new ArrayList<>();
    ArrayList<String> unitsPrice = new ArrayList<>();
    ArrayList<String> discountS = new ArrayList<>();
    ArrayList<String> subtotals = new ArrayList<>();
    ArrayList<String> subDiscounts = new ArrayList<>();
    ArrayList<String> totalDiscounts = new ArrayList<>();
    ArrayList<String> subVateList = new ArrayList<>();

    //============================ Sell Product ==============================//
    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed

        String productName = product.getText();
        int quantitY = Integer.parseInt(quntity.getText());
        double uPrice = Double.parseDouble(unitPrice.getText());
        double discounts = Double.parseDouble(discount.getText());
        double subTotals = Double.parseDouble(subTotal.getText());
        double subVates = Double.parseDouble(vat.getText());

        productsName.add(product.getText());
        quantitys.add(quntity.getText());
        unitsPrice.add(unitPrice.getText());
        discountS.add(discount.getText());
        subtotals.add(subTotal.getText());
        subDiscounts.add(subDiscount.getText());
        totalDiscounts.add(totalDiscount.getText());
        subVateList.add(vat.getText());

        //==================== Main Theory =============================//
        // {Qty x U.Pr   +   Qty x (U.pr x tax)}   -  (Qty x Dis)            = Result
        //  2   x 500 tk +    2  x ( 500 x 10/100) -  { 2  x (500 x 5/100)} = 1090
        //     1000      +    2  x      50         -       10     = 1090
        shortenNumber.setRoundingMode(RoundingMode.DOWN);
        //shortenNumber.format

        //=================== Total Price Calculation =======================//
        totalAmount.setText("");
        totalvalue = totalvalue + Double.valueOf(subTotal.getText());
        totalAmount.setText(shortenNumber.format(totalvalue) + "");

        //================ Discount Calculation =========================//
        subDiss = quantitY * ((Double.valueOf(unitPrice.getText())) * (Double.valueOf(discount.getText())) / 100);
        subDiscount.setText((subDiss) + "");

        totalDisscounts = totalDisscounts + subDiss;
        totalDiscount.setText((totalDisscounts) + "");

        //=================== Vat Calculation ============================//
        subVatV = quantitY * ((Double.valueOf(unitPrice.getText())) * (Double.valueOf(vat.getText())) / 100);
        subVat.setText(shortenNumber.format(subVatV) + ""); //System.out.println("double : " + shortenNumber.format(input));

        totalVatV = totalVatV + subVatV;
        totalVat.setText(shortenNumber.format(totalVatV) + "");

        int p = subtotals.size();
        int d = discountS.size();
        int v = subVateList.size();

        for (int i = 0; i < p; i++) {
        }
        for (int i = 0; i < d; i++) {
        }
        for (int i = 0; i < v; i++) {
        }

        //========== Setting Time ======//
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy/ HH:mm:ss").format(Calendar.getInstance().getTime()); //yyyyMMdd_HHmmss
        invoiceDate.setText(timeStamp);

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //================ Insert Data to sell history ===================//
            String sql = "insert into sells_history (barcode, product_name, branch, quantity, unit_price, unit_discount,  sub_total, biller_name, phone, payment_by, sub_discount, date_time) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            //sql = "SELECT SUM(subtotal) as total FROM selling_product";

            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, barcodeField1.getText());
            prst.setString(2, product.getText());
            prst.setString(3, branch.getText());
            prst.setInt(4, Integer.parseInt(quntity.getText()));
            prst.setDouble(5, Double.parseDouble(unitPrice.getText()));
            prst.setDouble(6, Double.parseDouble(discount.getText()));
            prst.setDouble(7, Double.parseDouble(subTotal.getText()));
            prst.setString(8, billerName.getText());
            prst.setString(9, PhoneField10.getText());
            String catagorie;
            catagorie = paymentComboBox2.getSelectedItem().toString();
            prst.setString(10, catagorie);
            prst.setDouble(11, Double.parseDouble(subDiscount.getText()));
            prst.setTimestamp(12, new java.sql.Timestamp(new Date().getTime()));

            prst.executeUpdate();
            DisplayTable3();
            con.close();
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }

        //================= Product sell by clicking Sell Button ===============//
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update product_entry set quantity = (quantity - ?) where barcode = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setString(1, nameField.getText());

            prst.setInt(1, Integer.parseInt(quntity.getText()));
            prst.setString(2, barcodeField1.getText());
            //prst.setDouble(, Double.parseDouble(salaryField.getText()));

            prst.executeUpdate();

            //=================== Auto Close Massage Dialoguebox =====================//
            JOptionPane pane = new JOptionPane("Sold Successfully", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(null, "Sell Product");
            dialog.setModal(false);
            dialog.setVisible(true);

            new Timer(TIME_VISIBLE, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            }).start();

            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }

        printArea.append(" # " + productName + "\t " + quantitY + " x " + " " + uPrice + " " + " " + subVates + " " + " " + discounts + "  = " + subTotals + " Tk.\n");

        DisplayTable();
        DisplayTable2();
    }//GEN-LAST:event_sellButtonActionPerformed

    //============================== Reciept =================================//
    private void recieptButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieptButton16ActionPerformed

        //======= Generate random int number from 200 to 400 for invoice =====//
        int min = 200;
        int max = 900;
        int rand = (int) (Math.random() * (max - min + 1) + min);
        invoiceNo.setText("ORGANIC" + Integer.toString(rand));//Add organic before random invoice

        //======= Generate NBR Invoice No from 200 to 400 for invoice =====//
        int mn = 1000;
        int mx = 2000;
        int random = (int) (Math.random() * (max - min + 1) + min);
        nbrInvoice.setText("NBR" + Integer.toString(rand));//Add organic before random invoice

        //============================== Setting Time ========================//
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy/ HH:mm:ss").format(Calendar.getInstance().getTime());
        invoiceDate.setText(timeStamp);
        //yyyyMMdd_HHmmss

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update product_entry set quantity = (quantity - ?) where barcode = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setInt(1, Integer.parseInt(quntity.getText()));
            prst.setString(2, barcodeField1.getText());
            prst.executeUpdate();
            DisplayTable();//Refresh Table
            DisplayTable2();//Refresh Table

            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }

        //================== Taking all value in variable =====================//
        String productName = product.getText();
        String branches = branch.getText();
        int quantitY = Integer.parseInt(quntity.getText());
        Double uPrice = Double.parseDouble(unitPrice.getText());
        Double discounts = Double.parseDouble(discount.getText());
        Double totalAmountV = Double.parseDouble(totalAmount.getText());
        Double subdiscounts = Double.parseDouble(subDiscount.getText());
        //Double totaldiscounts = Double.parseDouble(subDiscount.getText());
        Double totaldiscount2 = Double.parseDouble(totalDiscount.getText());
        String billersName = billerName.getText();
        String phone = PhoneField10.getText();
        String payments = paymentComboBox2.getSelectedItem().toString();
        String invoice = invoiceNo.getText();
        String nbrInvoices = nbrInvoice.getText();
        String mushok = mushokNo.getText();
        String dateAndTime = invoiceDate.getText();
        String totalVatV = totalVat.getText();
        String printS = printArea.getText();

        //ImageIcon icon = new ImageIcon("E:\\IDB_File\\Module_3_Java_Programming\\NetBeans_Project\\Super_Shop_Management_System\\src\\com\\shop\\img\\grocery.png");
        printArea.setText(
                //icon.getImage()+
                "\nRSULPUR ORGANIC SUPERSHOP. \nRasulpur, Araihazar, Narayangonj."
                + "\nInvoice No : " + invoice + " "
                + "\nNBR Invoice No : " + nbrInvoices + " "
                + "\nBranch : " + branches + ", " + "Mushok No:" + mushok
                + "\nDate & Time : " + dateAndTime
                + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + "\nItem \t" + " Qty " + "U.Pr. " + " Vat% " + "Dis% " + " T.Price"
                + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + "\n\n"
                + printS
                //+ "\n"
                + "\nTotal discounts :\t  " + totaldiscount2 + " Tk."
                + "\nTotal Vat :\t\t  " + totalVatV + " Tk."
                + "\nTotal price :\t\t" + totalAmountV + " Tk."
                + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + "\nBiller Name : " + billersName
                + "\nPhone : " + phone
                + "\nPayment By : " + payments
                + "\n ************** Thank You **************");

        //================ Delete from ADD selling_product Table =============//
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from selling_product;";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.executeUpdate();
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_recieptButton16ActionPerformed
    //============================== Reciept End =============================//


    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        orderReset();
    }//GEN-LAST:event_resetActionPerformed

    //=========================== Barcode Search =============================//
    private void barcodeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeSearchActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from product_entry where barcode = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, barcodeField1.getText());

            ResultSet rs = prst.executeQuery();
            if (rs.next()) {
                product.setText(rs.getString("product_name"));
                branch.setText(rs.getString("branch"));
                unitPrice.setText(String.valueOf(rs.getDouble("unit_price")));
                discount.setText(String.valueOf(rs.getDouble("discount")));
            } else {
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_barcodeSearchActionPerformed

    //=============== Bercode Field ======================================//
    private void barcodeField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeField1KeyReleased

        //============== Search by Barcode ==============================//
        String search = barcodeField1.getText().trim();//For auto search
        if (search.equals("")) {
            orderReset();
        } else {

            try {
                con = DBConnection.getConnection();
                prst = con.createStatement();
                String sql = "select * from product_entry where barcode = ?";

                PreparedStatement prst = con.prepareStatement(sql);
                prst.setString(1, barcodeField1.getText());

                ResultSet rs = prst.executeQuery();
                if (rs.next()) {
                    product.setText(rs.getString("product_name"));
                    branch.setText(rs.getString("branch"));
                    unitPrice.setText(String.valueOf(rs.getDouble("unit_price")));
                    discount.setText(String.valueOf(rs.getDouble("discount")));

                } else {
                    //JOptionPane.showMessageDialog(null, "Record Not found");
                }
                con.close();
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
            }

            //==================== Search by Product Name =====================//
            try {
                con = DBConnection.getConnection();
                prst = con.createStatement();
                String sql = "select * from product_entry where product_name = ?";

                PreparedStatement prst = con.prepareStatement(sql);
                prst.setString(1, barcodeField1.getText());

                ResultSet rs = prst.executeQuery();
                if (rs.next()) {
                    product.setText(rs.getString("product_name"));
                    branch.setText(rs.getString("branch"));
                    unitPrice.setText(String.valueOf(rs.getDouble("unit_price")));
                    discount.setText(String.valueOf(rs.getDouble("discount")));

                } else {
                    //JOptionPane.showMessageDialog(null, "Record Not found");
                }
                con.close();
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_barcodeField1KeyReleased


    private void barcodeField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update product_entry set quantity = (quantity + ?) where barcode = ?";
            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setString(1, nameField.getText());

            prst.setInt(1, Integer.parseInt(quantityField2.getText()));
            prst.setString(2, barcodeField11.getText());

            prst.executeUpdate();
            DisplayTable();//Refresh Table
            DisplayTable2();//Refresh Table
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAddProductActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update product_entry set product_name = ?, quantity = ?, unit_price = ?, discount = ?, inputer_name = ?, phone = ? where barcode = ?";

            PreparedStatement prst = con.prepareStatement(sql);

            prst.setString(1, productField12.getText());
            prst.setInt(2, Integer.parseInt(quantityField2.getText()));
            prst.setDouble(3, Double.parseDouble(unitPrField3.getText()));
            prst.setDouble(4, Double.parseDouble(discountField4.getText()));
            prst.setString(5, adNameField14.getText());
            prst.setString(6, adPhoneField16.getText());
            prst.setString(7, barcodeField11.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");
            DisplayTable();
            DisplayTable2();
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateAddProductActionPerformed

    private void ClearOrderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearOrderFieldActionPerformed
        resetForAddProduct();
    }//GEN-LAST:event_ClearOrderFieldActionPerformed

    private void adNameField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adNameField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adNameField14ActionPerformed

    //=================== Delete from ADD ORDER ===========================//
    private void deleteButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton47ActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "delete from product_entry where barcode = ?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, barcodeField11.getText());

            prst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Do you want to delete");
            //JOptionPane.showMessageDialog(null, "Deleted Successfully");
            reset();
            DisplayTable();//Refresh Table

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Deletion");
        }
    }//GEN-LAST:event_deleteButton47ActionPerformed

    private void searchByBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByBarcodeActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from product_entry where product_name = ?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, searchField.getText());

            ResultSet rs = prst.executeQuery();
            if (rs.next()) {
                barcodeField11.setText(rs.getString("barcode"));
                branch.setText(rs.getString("branch"));
                quantityField2.setText(String.valueOf(rs.getInt("quantity")));
                unitPrField3.setText(String.valueOf(rs.getDouble("unit_price")));
                discountField4.setText(String.valueOf(rs.getDouble("discount")));
                adNameField14.setText(rs.getString("inputer_name"));
                adPhoneField16.setText(rs.getString("phone"));
                productField12.setText(rs.getString("product_name"));
            } else {
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchByBarcodeActionPerformed

    private void dataEntryButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEntryButton45ActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();

            //========= ADD/INSERT/SAVE DATA ==============//
            String sql = "insert into product_entry (barcode, product_name, branch, quantity, unit_price, discount, catagories, inputer_name, phone, date) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);

            prst.setInt(1, Integer.parseInt(barcodeField11.getText()));
            prst.setString(2, productField12.getText());

            String branch;
            branch = branchComboBox3.getSelectedItem().toString();
            prst.setString(3, branch);

            prst.setInt(4, Integer.parseInt(quantityField2.getText()));
            prst.setDouble(5, Double.parseDouble(unitPrField3.getText()));
            prst.setDouble(6, Double.parseDouble(discountField4.getText()));

            String catagorie;
            catagorie = categorieComboBox.getSelectedItem().toString();
            prst.setString(7, catagorie);

            prst.setString(8, adNameField14.getText());
            prst.setString(9, adPhoneField16.getText());

            java.util.Date date = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            prst.setDate(10, sqlDate);

            prst.executeUpdate();
            //=================== Auto Close Massage Dialoguebox =====================//
            JOptionPane pane = new JOptionPane("Add Product Successfully", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(null, "Add Product");
            dialog.setModal(false);
            dialog.setVisible(true);

            new Timer(TIME_VISIBLE, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            }).start();

            DisplayTable();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
    }//GEN-LAST:event_dataEntryButton45ActionPerformed

    private void categorieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorieComboBoxActionPerformed

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from product_entry where barcode = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, barcodeField11.getText());

            ResultSet rs = prst.executeQuery();
            if (rs.next()) {
                productField12.setText(rs.getString("product_name"));
                branch.setText(rs.getString("branch"));
                quantityField2.setText(String.valueOf(rs.getInt("quantity")));
                unitPrField3.setText(String.valueOf(rs.getDouble("unit_price")));
                discountField4.setText(String.valueOf(rs.getDouble("discount")));
                adNameField14.setText(rs.getString("inputer_name"));
                adPhoneField16.setText(rs.getString("phone"));

            } else {
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close(); //after completing task close the popup window
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Search2ActionPerformed

    private void unitPrField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitPrField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitPrField3ActionPerformed

    private void quantityField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityField2ActionPerformed

    private void barcodeField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeField11KeyReleased
        String search = barcodeField11.getText().trim();  //For auto search

        if (search.equals("")) {
            resetForAddProduct();
        } else {

            try {
                con = DBConnection.getConnection();
                prst = con.createStatement();
                String sql = "select * from product_entry where barcode = ?";

                PreparedStatement prst = con.prepareStatement(sql);
                prst.setString(1, barcodeField11.getText());

                ResultSet rs = prst.executeQuery();
                if (rs.next()) {
                    productField12.setText(rs.getString("product_name"));
                    //branch.setText(rs.getString("branch"));
                    quantityField2.setText(String.valueOf(rs.getInt("quantity")));
                    unitPrField3.setText(String.valueOf(rs.getDouble("unit_price")));
                    discountField4.setText(String.valueOf(rs.getDouble("discount")));

                    DisplayTable();
                    DisplayTable2();
                } else {
                    //JOptionPane.showMessageDialog(null, "Record Not found");
                }
                con.close(); //after completing task close the popup window
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_barcodeField11KeyReleased

    private void meatAndFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatAndFishActionPerformed
        this.setVisible(true);
        new MeatAndFish().setVisible(true);
    }//GEN-LAST:event_meatAndFishActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        this.setVisible(true);
        new Drinks().setVisible(true);
    }//GEN-LAST:event_drinksActionPerformed

    private void bagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagsActionPerformed
        this.setVisible(true);
        new Bags().setVisible(true);
    }//GEN-LAST:event_bagsActionPerformed

    private void fruitsAndVegitablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitsAndVegitablesActionPerformed
        this.setVisible(true);
        new FruitsAndVegitables().setVisible(true);
    }//GEN-LAST:event_fruitsAndVegitablesActionPerformed

    private void dairyProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairyProductsActionPerformed
        this.setVisible(true);
        new DairyProducts().setVisible(true);
    }//GEN-LAST:event_dairyProductsActionPerformed

    private void sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsActionPerformed
        this.setVisible(true);
        new Sports().setVisible(true);
    }//GEN-LAST:event_sportsActionPerformed

    private void stationeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationeryActionPerformed
        this.setVisible(true);
        new Stationery().setVisible(true);
    }//GEN-LAST:event_stationeryActionPerformed

    private void personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalActionPerformed
        this.setVisible(true);
        new PersonalCare().setVisible(true);
    }//GEN-LAST:event_personalActionPerformed

    private void groceryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groceryActionPerformed
        this.setVisible(true);
        new Grocery().setVisible(true);
    }//GEN-LAST:event_groceryActionPerformed

    private void giftAndToysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giftAndToysActionPerformed
        this.setVisible(true);
        new GiftAndToys().setVisible(true);
    }//GEN-LAST:event_giftAndToysActionPerformed

    private void homeApplienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeApplienceActionPerformed
        this.setVisible(true);
        new HomeApplience().setVisible(true);
    }//GEN-LAST:event_homeApplienceActionPerformed

    private void cookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookingActionPerformed
        this.setVisible(true);
        new Coocking().setVisible(true);
    }//GEN-LAST:event_cookingActionPerformed

    private void medicalinstrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalinstrumentActionPerformed
        this.setVisible(true);
        new Medicalinstrument().setVisible(true);
    }//GEN-LAST:event_medicalinstrumentActionPerformed

    private void fashonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fashonActionPerformed
        this.setVisible(true);
        new Fashion().setVisible(true);
    }//GEN-LAST:event_fashonActionPerformed

    private void electronicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electronicsActionPerformed
        this.setVisible(true);
        new Electronics().setVisible(true);
    }//GEN-LAST:event_electronicsActionPerformed

    private void expiredDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiredDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiredDateActionPerformed

    private void dueBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dueBillActionPerformed

    private void payBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBillActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update bill set bill_amount = (bill_amount - ?) where bill_type = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setString(1, nameField.getText());

            prst.setDouble(1, Double.parseDouble(billPayment.getText()));
            prst.setString(2, billType.getSelectedItem().toString());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Payment Successfull");
            BillDetailsTable();
            TotalBillAmount();
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_payBillActionPerformed

    private void itemButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButton9ActionPerformed
        this.setVisible(false);
        new NewOrders().setVisible(true);
    }//GEN-LAST:event_itemButton9ActionPerformed

    private void supplierButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierButton7ActionPerformed
        this.setVisible(true);
        new Supplier().setVisible(true);
    }//GEN-LAST:event_supplierButton7ActionPerformed


    private void productTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTable2MouseClicked
        DefaultTableModel dr = (DefaultTableModel) productTable2.getModel();
        int sindex = productTable2.getSelectedRow();

        barcodeField11.setText((String) dr.getValueAt(sindex, 1));

    }//GEN-LAST:event_productTable2MouseClicked

    private void barcodeField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeField11ActionPerformed

    private void branchComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchComboBox3ActionPerformed

    private void employeeComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeComboBox1ActionPerformed

    private void branchComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchComboBox2ActionPerformed

    //================== Bill ComboBox Start after initialize =================//
    private void billTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTypeActionPerformed

        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            // String sql = "select distinct bill_amount from bill WHERE bill_type = ?"; 
            String sql = "select distinct * from bill WHERE bill_type = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));
            String catagorie = billType.getSelectedItem().toString();
            prst.setString(1, catagorie);
            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                dueBill.setText(String.valueOf(rs.getDouble("bill_amount")));
                billAmount.setText(String.valueOf(rs.getDouble("bill_amount")));
                billerName2.setText(rs.getString("biller_name"));
                entryDate.setText(rs.getString("entry_date"));
                expiredDate.setText(rs.getString("expired_date"));

            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }

    }//GEN-LAST:event_billTypeActionPerformed

    //================== Bill ComboBox initialize By methode =================//
    private void initBillTypeCombobox3() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct bill_type from bill WHERE bill_type != \"\""; // if want unique distinct value and not null value

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                billType.addItem(rs.getString("bill_type"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    //============================ Add Bill =================================//
    private void addBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBillActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update bill set bill_amount = (bill_amount + ?) where bill_type = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setString(1, nameField.getText());

            prst.setDouble(1, Double.parseDouble(addBillAmount.getText()));
            prst.setString(2, billType.getSelectedItem().toString());
            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Bill Added successfully");

            //initBillTypeCombobox3();
            BillDetailsTable();
            TotalBillAmount();
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addBillActionPerformed

    private void clearBillFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBillFieldActionPerformed
        billAmount.setText("");
        billerName2.setText("");
        entryDate.setText("");
        expiredDate.setText("");
        billPayment.setText("");
        addBillAmount.setText("");
    }//GEN-LAST:event_clearBillFieldActionPerformed

    private void updateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBillActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "update bill set biller_name = ?, entry_date = ?, expired_date = ? where bill_type = ?";

            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, billerName2.getText());
            prst.setString(2, entryDate.getText());
            prst.setString(3, expiredDate.getText());
            prst.setString(4, billType.getSelectedItem().toString());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated successfully");

            BillDetailsTable();
            TotalBillAmount();
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateBillActionPerformed

    private void EmployeeSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSearchButtonActionPerformed
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select * from assign_employee where id_no = ?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, EmployeeSearchField.getText());
            ResultSet rs = prst.executeQuery();
            if (rs.next()) {

                employeename.setText(rs.getString("name"));
                employeeDesignation.setText(rs.getString("designation"));
                EmployeeAddress.setText(rs.getString("address"));
                EmployeeContact.setText(rs.getString("cantact"));

                byte[] imagedata = rs.getBytes("profile_photo");
                format = new ImageIcon(imagedata);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(employeePhoto.getWidth(), employeePhoto.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon((img2));
                Image scaled = img2.getScaledInstance(140, 140, Image.SCALE_SMOOTH); //Decleare Image size (2nd option)
                ImageIcon icon = new ImageIcon(scaled);
                employeePhoto.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_EmployeeSearchButtonActionPerformed

    private void clearEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEmployeeActionPerformed
        EmployeeSearchField.setText("");
        employeeDesignation.setText("");
        employeename.setText("");
        EmployeeContact.setText("");
        EmployeeAddress.setText("");
        employeePhoto.setIcon(null);
    }//GEN-LAST:event_clearEmployeeActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        display.setText(display.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        display.setText(display.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        display.setText(display.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        display.setText("");
    }//GEN-LAST:event_cancelActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        display.setText(display.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        display.setText(display.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        display.setText(display.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        display.setText(display.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        display.setText(display.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        display.setText(display.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        display.setText(display.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        display.setText(display.getText() + ".");
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
        display.setText(display.getText() + " % ");
        flag = 5;
    }//GEN-LAST:event_btnPercentActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        display.setText(display.getText() + " + ");
        flag = 4;
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        display.setText(display.getText() + " − ");
        flag = 3;
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        display.setText(display.getText() + " × ");
        flag = 1;
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        display.setText(display.getText() + " ÷ ");
        flag = 2;
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        display.setText(display.getText() + " = ");
        String str = display.getText();
        String[] substr = str.split("\\s+");

        float num1 = Float.parseFloat(substr[0]);
        float num2 = Float.parseFloat(substr[2]);

        if (flag == 1) {
            display.setText(display.getText() + " " + (num1 * num2));
        }
        if (flag == 2) {
            display.setText(display.getText() + " " + (num1 / num2));
        }
        if (flag == 3) {
            display.setText(display.getText() + " " + (num1 - num2));
        }
        if (flag == 4) {
            display.setText(display.getText() + " " + (num1 + num2));
        }
        if (flag == 5) {
            display.setText(display.getText() + " " + (num1 * num2) / 100);
        }
        //if(flag == 6){display.setText(display.getText()+ " " + (Math.sqrt(num2)));}

    }//GEN-LAST:event_btnEqualActionPerformed

    private void totalBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBillActionPerformed

    private void catagoriewiseStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoriewiseStockActionPerformed
        //============== Taking this variable to check validation =============//
        String catagorie = catagoriesComboBox3.getSelectedItem().toString();

        if ((catagorie.matches("Grocery"))) {
            this.setVisible(false);
            new Grocery().setVisible(true);
        }
        if ((catagorie.matches("Electronics"))) {
            this.setVisible(false);
            new Electronics().setVisible(true);
        }
        if ((catagorie.matches("Gift & Toys"))) {
            this.setVisible(false);
            new GiftAndToys().setVisible(true);
        }
        if ((catagorie.matches("Drinks"))) {
            this.setVisible(false);
            new Drinks().setVisible(true);
        }
        if ((catagorie.matches("Coocking"))) {
            this.setVisible(false);
            new Coocking().setVisible(true);
        }
    }//GEN-LAST:event_catagoriewiseStockActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        display.setText(display.getText().substring(0, display.getText().length() - 1));
    }//GEN-LAST:event_btnBackActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void salesTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTable1MouseClicked
        DefaultTableModel dr = (DefaultTableModel) salesTable1.getModel();
        int sindex = salesTable1.getSelectedRow();

        barcodeField1.setText((String) dr.getValueAt(sindex, 1));
        product.setText((String) dr.getValueAt(sindex, 2));
        branch.setText((String) dr.getValueAt(sindex, 3));
        quntity.setText(String.valueOf(dr.getValueAt(sindex, 4)));
        unitPrice.setText(String.valueOf(dr.getValueAt(sindex, 5)));
        discount.setText(String.valueOf(dr.getValueAt(sindex, 6)));


    }//GEN-LAST:event_salesTable1MouseClicked

    private static DecimalFormat shortenNumber = new DecimalFormat("#.#");

    //======================== Quantity condition set ========================//
    private void quntityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quntityKeyReleased

        double total = 0;
        double tax = 0;
        double dis = 0;

        //==================== Main Theory =============================//
        // {Qty x U.Pr   +   Qty x (U.pr x tax)}   -  (Qty x Dis)            = Result
        //  2   x 500 tk +    2  x ( 500 x 10/100) -  { 2  x (500 x 5/100)} = 1090
        //     1000      +    2  x      50         -       10     = 1090
        shortenNumber.setRoundingMode(RoundingMode.DOWN);
        //shortenNumber.format

        //=============== Find out the quantity based unit price =============//
        if (quntity.getText().trim().length() > 0) {
            try {
                total += Integer.parseInt(quntity.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        if (unitPrice.getText().trim().length() > 0) {
            try {
                total *= Double.parseDouble(unitPrice.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        //========== Find out the quantity & Unit based tax price =============//
        if (unitPrice.getText().trim().length() > 0) {
            try {
                tax += Double.parseDouble(unitPrice.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        if (vat.getText().trim().length() > 0) {
            try {
                tax *= (Double.parseDouble(vat.getText())) / 100;
            } catch (NumberFormatException nbx) {
            }
        }

        if (quntity.getText().trim().length() > 0) {
            try {
                tax *= Integer.parseInt(quntity.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        double sub = total + tax;

        //=============== Find out the quantity based Discount ================//
        if (unitPrice.getText().trim().length() > 0) {
            try {
                dis += Double.parseDouble(unitPrice.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        if (discount.getText().trim().length() > 0) {
            try {
                dis *= (Double.parseDouble(discount.getText())) / 100;
            } catch (NumberFormatException nbx) {
            }
        }

        if (quntity.getText().trim().length() > 0) {
            try {
                dis *= Integer.parseInt(quntity.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        subTotal.setText("" + shortenNumber.format(sub - dis));

        String qty = quntity.getText().trim();  //For auto search

        if (qty.equals("")) {
            orderReset();
        } else {

            //================= Calculate All =======================//
            int quantitY = Integer.parseInt(quntity.getText());

            //==================== Main Theory =============================//
            // {Qty x U.Pr   +   Qty x (U.pr x tax)}   -  (Qty x Dis)            = Result
            //  2   x 500 tk +    2  x ( 500 x 10/100) -  { 2  x (500 x 5/100)} = 1090
            //     1000      +    2  x      50         -       10     = 1090
            shortenNumber.setRoundingMode(RoundingMode.DOWN);
            //================ Discount Calculation =========================//
            subDiss = quantitY * ((Double.valueOf(unitPrice.getText())) * (Double.valueOf(discount.getText())) / 100);
            subDiscount.setText((subDiss) + "");

            //=================== Vat Calculation ============================//
            subVatV = quantitY * ((Double.valueOf(unitPrice.getText())) * (Double.valueOf(vat.getText())) / 100);
            subVat.setText(shortenNumber.format(subVatV) + "");
        }

    }//GEN-LAST:event_quntityKeyReleased


    private void quntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quntityActionPerformed

    private void vatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatActionPerformed

    private void vatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatKeyReleased
        double total = 0;
        double tax = 0;
        double dis = 0;

        //==================== Main Theory =============================//
        // {Qty x U.Pr   +   Qty x (U.pr x tax)}   -  (Qty x Dis)            = Result
        //  2   x 500 tk +    2  x ( 500 x 10/100) -  { 2  x (500 x 5/100)} = 1090
        //     1000      +    2  x      50         -       10     = 1090
        //=============== Find out the quantity based unit price =============//
        if (quntity.getText().trim().length() > 0) {
            try {
                total += Integer.parseInt(quntity.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        if (unitPrice.getText().trim().length() > 0) {
            try {
                total *= Double.parseDouble(unitPrice.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        //========== Find out the quantity & Unit based tax price =============//
        if (unitPrice.getText().trim().length() > 0) {
            try {
                tax += Double.parseDouble(unitPrice.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        if (vat.getText().trim().length() > 0) {
            try {
                tax *= (Double.parseDouble(vat.getText())) / 100;
            } catch (NumberFormatException nbx) {
            }
        }

        if (quntity.getText().trim().length() > 0) {
            try {
                tax *= Integer.parseInt(quntity.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        double sub = total + tax;

        //=============== Find out the quantity based Discount ================//
        if (unitPrice.getText().trim().length() > 0) {
            try {
                dis += Double.parseDouble(unitPrice.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        if (discount.getText().trim().length() > 0) {
            try {
                dis *= (Double.parseDouble(discount.getText())) / 100;
            } catch (NumberFormatException nbx) {
            }
        }

        if (quntity.getText().trim().length() > 0) {
            try {
                dis *= Integer.parseInt(quntity.getText());
            } catch (NumberFormatException nbx) {
            }
        }

        subTotal.setText("" + shortenNumber.format(sub - dis));

        //==== Alternative/Cpied calculation from  quantity keyrealeased =====// 
        String vatV = vat.getText().trim();  //For auto search
        if (vatV.equals("")) {
            orderReset();
        } else {
            //================= Calculate All =======================//
            int quantitY = Integer.parseInt(quntity.getText());

            //==================== Main Theory =============================//
            // {Qty x U.Pr   +   Qty x (U.pr x tax)}   -  (Qty x Dis)            = Result
            //  2   x 500 tk +    2  x ( 500 x 10/100) -  { 2  x (500 x 5/100)} = 1090
            //     1000      +    2  x      50         -       10     = 1090
            shortenNumber.setRoundingMode(RoundingMode.DOWN);

            //================ Discount Calculation =========================//
            subDiss = quantitY * ((Double.valueOf(unitPrice.getText())) * (Double.valueOf(discount.getText())) / 100);
            subDiscount.setText((subDiss) + "");

            //=================== Vat Calculation ============================//
            subVatV = quantitY * ((Double.valueOf(unitPrice.getText())) * (Double.valueOf(vat.getText())) / 100);
            subVat.setText(shortenNumber.format(subVatV) + ""); //System.out.println("double : " + shortenNumber.format(input));

        }
    }//GEN-LAST:event_vatKeyReleased

    private void subTotalComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_subTotalComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalComponentResized

    //================== Bill ComboBox initialize By methode =================//
    private void TotalBillAmount() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "SELECT SUM(bill_amount) FROM bill ";
            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                totalBill.setText(String.valueOf(rs.getDouble("sum(bill_amount)")));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    private void initComboBox3() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct catagorie from combo_field WHERE catagorie != \"\"";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                categorieComboBox.addItem(rs.getString("catagorie"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    private void initComboBox2() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct payment_by from combo_field WHERE payment_by != \"\""; // if want unique distinct value
            //"select * from user"; //if I want All value

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                paymentComboBox2.addItem(rs.getString("payment_by"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    //=========================== employee Combo box ===========================// 
    private void employeeComboBox3() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct name from assigned_finger WHERE name != \"\"";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                employeeComboBox1.addItem(rs.getString("name"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    //=========================== branch Combo box ===========================// 
    private void branchComboBox3() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct branch from combo_field WHERE branch != \"\"";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                branchComboBox2.addItem(rs.getString("branch"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    //=========================== catagories Combo box ========================// 
    private void catagoriesComboBox3() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct catagorie from combo_field WHERE catagorie != \"\"";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                catagoriesComboBox3.addItem(rs.getString("catagorie"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    //=========================== paymentType Combo box ========================// 
    private void paymentTypeComboBox3() {
        try {
            con = DBConnection.getConnection();
            prst = con.createStatement();
            String sql = "select distinct payment_by from combo_field WHERE payment_by != \"\"";

            PreparedStatement prst = con.prepareStatement(sql);
            // prst.setInt(1, Integer.parseInt(rollField.getText()));

            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                paymentComboBox4.addItem(rs.getString("payment_by"));
            }
            con.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Record Not found");
        }
    }

    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CategorieTable;
    private javax.swing.JButton ClearOrderField;
    private javax.swing.JLabel EmployeeAddress;
    private javax.swing.JLabel EmployeeContact;
    private javax.swing.JButton EmployeeSearchButton;
    private javax.swing.JTextField EmployeeSearchField;
    private javax.swing.JTextField PhoneField10;
    private javax.swing.JButton Search2;
    private javax.swing.JTextField adNameField14;
    private javax.swing.JTextField adPhoneField16;
    private javax.swing.JButton addBill;
    private javax.swing.JTextField addBillAmount;
    private javax.swing.JPanel addProductPanel;
    private javax.swing.JPanel all_catagories;
    private javax.swing.JButton attendence;
    private javax.swing.JButton bags;
    private javax.swing.JTextField barcodeField1;
    private javax.swing.JTextField barcodeField11;
    private javax.swing.JButton barcodeSearch;
    private javax.swing.JTextField billAmount;
    private javax.swing.JTable billDetailsTable;
    private javax.swing.JTextField billPayment;
    private javax.swing.JComboBox<String> billType;
    private javax.swing.JTextField billerName;
    private javax.swing.JTextField billerName2;
    private javax.swing.JLabel branch;
    private javax.swing.JComboBox<String> branchComboBox2;
    private javax.swing.JComboBox<String> branchComboBox3;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cashRecieptButton12;
    private javax.swing.JComboBox<String> catagoriesComboBox3;
    private javax.swing.JButton catagoriewiseStock;
    private javax.swing.JComboBox<String> categorieComboBox;
    private javax.swing.JButton clearBillField;
    private javax.swing.JButton clearEmployee;
    private javax.swing.JButton cooking;
    private javax.swing.JButton dairyProducts;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton dataEntryButton45;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JButton deleteButton47;
    private javax.swing.JLabel discount;
    private javax.swing.JTextField discountField4;
    private javax.swing.JTextField display;
    private javax.swing.JButton drinks;
    private javax.swing.JTextField dueBill;
    private javax.swing.JButton electronics;
    private javax.swing.JComboBox<String> employeeComboBox1;
    private javax.swing.JLabel employeeDesignation;
    private javax.swing.JLabel employeePhoto;
    private javax.swing.JTable employeeTable2;
    private javax.swing.JLabel employeename;
    private javax.swing.JTextField entryDate;
    private javax.swing.JButton exitButton20;
    private javax.swing.JTextField expiredDate;
    private javax.swing.JButton fashon;
    private javax.swing.JButton fruitsAndVegitables;
    private javax.swing.JButton giftAndToys;
    private javax.swing.JButton grocery;
    private javax.swing.JTable historyTable;
    private javax.swing.JPanel home;
    private javax.swing.JButton homeApplience;
    private javax.swing.JLabel invoiceDate;
    private javax.swing.JLabel invoiceNo;
    private javax.swing.JButton itemButton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JLayeredPane jLayeredPane12;
    private javax.swing.JLayeredPane jLayeredPane13;
    private javax.swing.JLayeredPane jLayeredPane14;
    private javax.swing.JLayeredPane jLayeredPane15;
    private javax.swing.JLayeredPane jLayeredPane16;
    private javax.swing.JLayeredPane jLayeredPane17;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton logoutButton3;
    private javax.swing.JButton meatAndFish;
    private javax.swing.JButton medicalinstrument;
    private javax.swing.JTextField mushokNo;
    private javax.swing.JLabel nbrInvoice;
    private javax.swing.JTable needToBuy;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JButton payBill;
    private javax.swing.JComboBox<String> paymentComboBox2;
    private javax.swing.JComboBox<String> paymentComboBox4;
    private javax.swing.JButton personal;
    private javax.swing.JTextArea printArea;
    private javax.swing.JButton printButton19;
    private javax.swing.JLabel product;
    private javax.swing.JTextField productField12;
    private javax.swing.JTable productTable2;
    private javax.swing.JTextField quantityField2;
    private javax.swing.JTextField quntity;
    private javax.swing.JButton recieptButton16;
    private javax.swing.JButton reset;
    private javax.swing.JTable salesTable1;
    private javax.swing.JButton searchByBarcode;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton shopLogoButton22;
    private javax.swing.JButton sports;
    private javax.swing.JButton stationery;
    private javax.swing.JButton stocksButton1;
    private javax.swing.JLabel subDiscount;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel subVat;
    private javax.swing.JButton supplierButton7;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JTextField totalBill;
    private javax.swing.JLabel totalDiscount;
    private javax.swing.JLabel totalVat;
    private javax.swing.JTextField unitPrField3;
    private javax.swing.JLabel unitPrice;
    private javax.swing.JButton updateAddProduct;
    private javax.swing.JButton updateBill;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("home50.png")));
    }
}
