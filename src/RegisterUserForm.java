/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mongodb.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Tang
 */
public class RegisterUserForm extends javax.swing.JFrame {
    /**
     * Creates new form Register_User
     */
    RegisterUserService register = new RegisterUserService();
    
    public RegisterUserForm() {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        regisform = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        dataform = new javax.swing.JPanel();
        nevigator = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_rePassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_tellnumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        label_step2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        box_status = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        box_month = new javax.swing.JComboBox<>();
        box_date = new javax.swing.JComboBox<>();
        box_year = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        box_gender = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_nationality = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_race = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_religion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        box_province = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_zipcode = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        label_step3 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_experience = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_education = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        accept = new javax.swing.JToggleButton();
        cancel = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regisform.setBackground(new java.awt.Color(255, 255, 255));
        regisform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 0, 102));
        header.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("                              สมัครสมาชิก (ผู้ใช้ทั่วไป)");
        header.setOpaque(true);
        regisform.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        dataform.setBackground(new java.awt.Color(204, 204, 204));
        dataform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dataform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nevigator.setBackground(new java.awt.Color(255, 255, 255));
        nevigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel2.setText("  คำแนะนำการตั้ง Password");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        nevigator.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 30));

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 16)); // NOI18N
        jLabel3.setText("  หรือตัวเลข 0-9");
        nevigator.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 20));

        jLabel4.setFont(new java.awt.Font("Angsana New", 0, 16)); // NOI18N
        jLabel4.setText("  8 ตัวอักษร");
        nevigator.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 150, 20));

        jLabel6.setFont(new java.awt.Font("Angsana New", 0, 16)); // NOI18N
        jLabel6.setText("  มีความยาวมากกว่าหรือเท่ากับ");
        nevigator.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 20));

        jLabel7.setFont(new java.awt.Font("Angsana New", 0, 16)); // NOI18N
        jLabel7.setText("  เป็นภาษาอังกฤษ a-z, A-Z ");
        nevigator.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 20));

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel5.setText("  คำแนะนำการตั้ง Username");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        nevigator.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jLabel21.setFont(new java.awt.Font("Angsana New", 0, 16)); // NOI18N
        jLabel21.setText("  มีความยาวมากกว่าหรือเท่ากับ");
        nevigator.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 20));

        jLabel43.setFont(new java.awt.Font("Angsana New", 0, 16)); // NOI18N
        jLabel43.setText("  6 ตัวอักษร");
        nevigator.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 20));

        dataform.add(nevigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 150, 200));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("นามสกุล");
        dataform.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 60, 30));

        txt_email.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        dataform.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 40));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Username ");
        dataform.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jLabel10.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");
        dataform.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 10, 30));
        dataform.add(txt_rePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 350, 40));

        jLabel11.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Password");
        dataform.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 30));
        dataform.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 350, 40));

        jLabel12.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        dataform.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 10, 30));

        jLabel13.setBackground(new java.awt.Color(0, 153, 153));
        jLabel13.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Re-Password");
        dataform.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        txt_tellnumber.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_tellnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1210, 500, 40));

        jLabel14.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        dataform.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 10, 30));

        label_step2.setBackground(new java.awt.Color(0, 0, 102));
        label_step2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        label_step2.setForeground(new java.awt.Color(255, 255, 255));
        label_step2.setText("    Step 1 : ข้อมูลการเข้าสู่ระบบ");
        label_step2.setOpaque(true);
        dataform.add(label_step2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Email");
        dataform.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 30));

        jLabel16.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        dataform.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 10, 30));

        txt_username.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        dataform.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 40));

        jLabel17.setBackground(new java.awt.Color(0, 153, 153));
        jLabel17.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("วัน-เดือน-ปี เกิด");
        dataform.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 110, 30));

        jLabel18.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        dataform.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 10, 30));

        txt_firstname.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 500, 40));

        jLabel19.setBackground(new java.awt.Color(0, 153, 153));
        jLabel19.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("ชื่อ");
        dataform.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 20, 30));

        jLabel20.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");
        dataform.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, 30));

        box_status.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        box_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "สถานภาพ", "โสด", "สมรส", "หย่า", "หม้าย" }));
        dataform.add(box_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 500, 40));

        jLabel22.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");
        dataform.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 10, 30));

        box_month.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        box_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เดือน", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        box_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_monthActionPerformed(evt);
            }
        });
        dataform.add(box_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 120, 40));

        box_date.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        box_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วัน", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dataform.add(box_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 50, 40));

        box_year.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        box_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ปี", "2544", "2543", "2542", "2541", "2540", "2539", "2538", "2537", "2536", "2535", "2534", "2533", "2532", "2531", "2530", "2529", "2528", "2527", "2526", "2525", "2524", "2523", "2522", "2521", "2520", "2519", "2518", "2517", "2516", "2515", "2514", "2513", "2512", "2511", "2510", "2509", "2508", "2507", "2506", "2505", "2504", "2503", "2502", "2501", "2500", "2499", "2498", "2497", "2496", "2495", "2494", "2493", "2492", "2491", "2490", "2489", "2488", "2487", "2486", "2485", "2484", "2483", "2482", "2481", "2480" }));
        dataform.add(box_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 90, 40));

        jLabel23.setBackground(new java.awt.Color(0, 153, 153));
        jLabel23.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 153));
        jLabel23.setText("เพศ");
        dataform.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 30, 30));

        jLabel24.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        dataform.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 10, 30));

        box_gender.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        box_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เพศ", "ชาย", "หญิง", "สาวประเภทสอง" }));
        dataform.add(box_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 500, 40));

        jLabel25.setBackground(new java.awt.Color(0, 153, 153));
        jLabel25.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 153));
        jLabel25.setText("สถานภาพ");
        dataform.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 70, 30));

        txt_lastname.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 500, 40));

        jLabel26.setBackground(new java.awt.Color(0, 153, 153));
        jLabel26.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 153));
        jLabel26.setText("สัญชาติ");
        dataform.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 60, 30));

        txt_nationality.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 500, 40));

        jLabel27.setBackground(new java.awt.Color(0, 153, 153));
        jLabel27.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 153));
        jLabel27.setText("เชื้อชาติ");
        dataform.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 60, 30));

        txt_race.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_race, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, 500, 40));

        jLabel28.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("*");
        dataform.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 10, 30));

        jLabel29.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("*");
        dataform.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 740, 10, 30));

        jLabel30.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setText("*");
        dataform.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 810, 10, 30));

        jLabel31.setBackground(new java.awt.Color(0, 153, 153));
        jLabel31.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 153));
        jLabel31.setText("ศาสนา");
        dataform.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, 50, 30));

        jLabel32.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("*");
        dataform.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 880, 10, 30));

        txt_religion.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 910, 500, 40));

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("^ กรอกให้ครบทั้ง บ้านเลขที่, ซอย(ถ้ามี), ถนน, เขต, อำเภอ");
        dataform.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1020, -1, -1));

        jLabel33.setBackground(new java.awt.Color(0, 153, 153));
        jLabel33.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 153, 153));
        jLabel33.setText("ที่อยู่");
        dataform.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 950, 30, 30));

        jLabel34.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("*");
        dataform.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 950, 10, 30));

        box_province.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        box_province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกจังหวัด", "กรุงเทพมหานคร ", "กระบี่ ", "กาญจนบุรี ", "กาฬสินธุ์ ", "กำแพงเพชร ", "ขอนแก่น ", "จันทบุรี ", "ฉะเชิงเทรา ", "ชลบุรี ", "ชัยนาท ", "ชัยภูมิ ", "ชุมพร ", "เชียงราย ", "เชียงใหม่ ", "ตรัง ", "ตราด ", "ตาก ", "นครนายก ", "นครปฐม ", "นครพนม ", "นครราชสีมา ", "นครศรีธรรมราช ", "นครสวรรค์ ", "นนทบุรี ", "นราธิวาส ", "น่าน ", "บึงกาฬ ", "บุรีรัมย์ ", "ปทุมธานี ", "ประจวบคีรีขันธ์ ", "ปราจีนบุรี ", "ปัตตานี ", "พระนครศรีอยุธยา ", "พังงา ", "พัทลุง ", "พิจิตร ", "พิษณุโลก ", "เพชรบุรี ", "เพชรบูรณ์ ", "แพร่ ", "พะเยา ", "ภูเก็ต ", "มหาสารคาม ", "มุกดาหาร ", "แม่ฮ่องสอน ", "ยะลา ", "ยโสธร ", "ร้อยเอ็ด ", "ระนอง ", "ระยอง ", "ราชบุรี ", "ลพบุรี ", "ลำปาง ", "ลำพูน ", "เลย ", "ศรีสะเกษ ", "สกลนคร ", "สงขลา ", "สตูล ", "สมุทรปราการ ", "สมุทรสงคราม ", "สมุทรสาคร ", "สระแก้ว ", "สระบุรี ", "สิงห์บุรี ", "สุโขทัย ", "สุพรรณบุรี ", "สุราษฎร์ธานี ", "สุรินทร์ ", "หนองคาย ", "หนองบัวลำภู ", "อ่างทอง ", "อุดรธานี ", "อุทัยธานี ", "อุตรดิตถ์ ", "อุบลราชธานี ", "อำนาจเจริญ" }));
        dataform.add(box_province, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1070, 500, 40));

        jLabel35.setBackground(new java.awt.Color(0, 153, 153));
        jLabel35.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 153));
        jLabel35.setText("จังหวัด");
        dataform.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1040, 50, 30));

        jLabel36.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setText("*");
        dataform.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1040, 10, 30));

        txt_address.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 500, 40));

        jLabel37.setBackground(new java.awt.Color(0, 153, 153));
        jLabel37.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 153, 153));
        jLabel37.setText("รหัสไปรษณีย์");
        dataform.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1110, 90, 30));

        jLabel38.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 0));
        jLabel38.setText("*");
        dataform.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1110, 10, 30));

        txt_zipcode.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        dataform.add(txt_zipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1140, 500, 40));

        jLabel39.setBackground(new java.awt.Color(0, 153, 153));
        jLabel39.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 153, 153));
        jLabel39.setText("ประสบการณ์การทำงาน");
        dataform.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1430, 160, 30));

        jLabel40.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        jLabel40.setText("*");
        dataform.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1430, 10, 30));

        label_step3.setBackground(new java.awt.Color(0, 0, 102));
        label_step3.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        label_step3.setForeground(new java.awt.Color(255, 255, 255));
        label_step3.setText("    Step 2 : กรอกประวัติส่วนตัว");
        label_step3.setOpaque(true);
        dataform.add(label_step3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 540, 40));

        jLabel45.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel45.setText("หมายเหตุ : ช่องที่มี      หมายความว่าจำเป็นต้องกรอกข้อมูล");
        dataform.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1610, 290, 30));

        jLabel47.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("*");
        dataform.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1610, 10, 30));

        jLabel46.setBackground(new java.awt.Color(0, 153, 153));
        jLabel46.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 153, 153));
        jLabel46.setText("เบอร์โทรศัพท์");
        dataform.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1180, 90, 30));

        jLabel49.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("*");
        dataform.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1180, 10, 30));

        txt_experience.setColumns(20);
        txt_experience.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        txt_experience.setRows(5);
        jScrollPane2.setViewportView(txt_experience);

        dataform.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1460, 500, 150));

        jLabel41.setBackground(new java.awt.Color(0, 153, 153));
        jLabel41.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 153));
        jLabel41.setText("การศึกษา");
        dataform.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1250, 70, 30));

        jLabel42.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setText("*");
        dataform.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1250, 10, 30));

        txt_education.setColumns(20);
        txt_education.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        txt_education.setRows(5);
        jScrollPane3.setViewportView(txt_education);

        dataform.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1280, 500, 150));

        regisform.add(dataform, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 540, 1650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accept.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        accept.setText("ข้อมูลถูกต้อง");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        jPanel1.add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        cancel.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        cancel.setText("ยกเลิก");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 40));

        regisform.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1750, 540, 110));

        jScrollPane1.setViewportView(regisform);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        String username = txt_username.getText();
        String password = txt_password.getText();
        String rePassword = txt_rePassword.getText();
        String email = txt_email.getText();
        String Fname = txt_firstname.getText();
        String Lname = txt_lastname.getText();
        String gender = box_gender.getSelectedItem().toString();
        String dateOfBirth = box_date.getSelectedItem().toString()+"/"+box_month.getSelectedItem().toString()+"/"+box_year.getSelectedItem().toString();
        String status = box_status.getSelectedItem().toString();
        String nationality = txt_nationality.getText();
        String race = txt_race.getText();
        String religion = txt_religion.getText();
        String address = txt_address.getText();
        String province = box_province.getSelectedItem().toString();
        String zipcode = txt_zipcode.getText();
        String tellnumber = txt_tellnumber.getText();
        String education = txt_education.getText();
        String experience = txt_experience.getText();
        String userType = "User";  
        String userStatus = "offline"; 

        if(!register.checkNull(username, password, rePassword, email, Fname, Lname, gender, dateOfBirth, status, nationality, race, religion, address, province, zipcode, tellnumber, education, experience)){
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ครบ", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (!register.checkUsernameLength(username)) {
            JOptionPane.showMessageDialog(null, "Username ต้องมีความยาวมากกว่าหรือเท่ากับ 6 ตัวอักษร", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!register.checkPasswordLength(password)){
            JOptionPane.showMessageDialog(null, "Password ต้องมีความยาวมากกว่าหรือเท่ากับ 8 ตัวอักษร", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!register.checkPasswordForm(password)){
            JOptionPane.showMessageDialog(null, "Password ต้องมีตัวเลขและตัวอักษรผสมกัน", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!register.checkPassword(password, rePassword)){
            JOptionPane.showMessageDialog(null, "Password ไม่ตรงกัน", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!register.checkUserRegisterByUsername(username)){
            JOptionPane.showMessageDialog(null, "Username นี้มีผู้ใช้งานแล้ว", "Error", JOptionPane.ERROR_MESSAGE);
        }else{ 
            register.insertUser(username, password, email, Fname, Lname, gender, dateOfBirth, status, nationality, religion, race, address, province, zipcode, tellnumber, education, experience, userType, userStatus);
            JOptionPane.showMessageDialog(null, "สมัครสมาชิกสำเร็จ");
        }
    }//GEN-LAST:event_acceptActionPerformed

    private void box_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_monthActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton accept;
    private javax.swing.JComboBox<String> box_date;
    private javax.swing.JComboBox<String> box_gender;
    private javax.swing.JComboBox<String> box_month;
    private javax.swing.JComboBox<String> box_province;
    private javax.swing.JComboBox<String> box_status;
    private javax.swing.JComboBox<String> box_year;
    private javax.swing.JToggleButton cancel;
    private javax.swing.JPanel dataform;
    private javax.swing.JLabel header;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_step2;
    private javax.swing.JLabel label_step3;
    private javax.swing.JPanel nevigator;
    private javax.swing.JPanel regisform;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextArea txt_education;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextArea txt_experience;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_nationality;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_race;
    private javax.swing.JPasswordField txt_rePassword;
    private javax.swing.JTextField txt_religion;
    private javax.swing.JTextField txt_tellnumber;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txt_zipcode;
    // End of variables declaration//GEN-END:variables
}