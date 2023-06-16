import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Signup1 extends javax.swing.JFrame {

  
    public Signup1() {
        initComponents();
        Connect();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int gotUid;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/readmedb","root","");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup1.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblSignUp_1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblWelcome_1 = new javax.swing.JLabel();
        lblUsername_SignUp = new javax.swing.JLabel();
        txtEmail_SignUp = new javax.swing.JTextField();
        txtPassword_SignUp = new javax.swing.JPasswordField();
        lblPassword_SignUp = new javax.swing.JLabel();
        txtUsername_SignUp = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblMiddleName = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblBarangay = new javax.swing.JLabel();
        txtBarangay = new javax.swing.JTextField();
        lblProvince = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblFullAddress = new javax.swing.JLabel();
        txtFullAddress = new javax.swing.JTextField();
        imgIcon_2 = new javax.swing.JLabel();
        dateBday = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1024, 728));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 728));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp_1.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        lblSignUp_1.setText("Sign Up");
        jPanel2.add(lblSignUp_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmail.setText("Email");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        lblWelcome_1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblWelcome_1.setForeground(new java.awt.Color(82, 82, 91));
        lblWelcome_1.setText("<html>\nWelcome to Readme Library Management\n<br>\nSystem!");
        jPanel2.add(lblWelcome_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lblUsername_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblUsername_SignUp.setText("Username");
        jPanel2.add(lblUsername_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtEmail_SignUp.setBackground(new java.awt.Color(248, 250, 252));
        txtEmail_SignUp.setForeground(new java.awt.Color(127, 126, 126));
        txtEmail_SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtEmail_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_SignUpActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 280, 30));

        txtPassword_SignUp.setBackground(new java.awt.Color(248, 250, 252));
        txtPassword_SignUp.setForeground(new java.awt.Color(127, 127, 127));
        txtPassword_SignUp.setText("jPasswordField1");
        txtPassword_SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        jPanel2.add(txtPassword_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 30));

        lblPassword_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPassword_SignUp.setText("Password");
        jPanel2.add(lblPassword_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtUsername_SignUp.setBackground(new java.awt.Color(248, 250, 252));
        txtUsername_SignUp.setForeground(new java.awt.Color(127, 126, 126));
        txtUsername_SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtUsername_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername_SignUpActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsername_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 30));

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFirstName.setText("First Name");
        jPanel2.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtFirstName.setBackground(new java.awt.Color(248, 250, 252));
        txtFirstName.setForeground(new java.awt.Color(127, 126, 126));
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, 30));

        lblMiddleName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblMiddleName.setText("Middle Name");
        jPanel2.add(lblMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtMiddleName.setBackground(new java.awt.Color(248, 250, 252));
        txtMiddleName.setForeground(new java.awt.Color(127, 126, 126));
        txtMiddleName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiddleNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, 30));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLastName.setText("Last Name");
        jPanel2.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        txtLastName.setBackground(new java.awt.Color(248, 250, 252));
        txtLastName.setForeground(new java.awt.Color(127, 126, 126));
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 280, 30));

        btnNext.setBackground(new java.awt.Color(51, 102, 255));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 130, 40));

        lblContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblContactNumber.setText("Contact Number");
        jPanel2.add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        txtContactNumber.setBackground(new java.awt.Color(248, 250, 252));
        txtContactNumber.setForeground(new java.awt.Color(127, 126, 126));
        txtContactNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 280, 30));

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAge.setText("Age");
        jPanel2.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txtAge.setBackground(new java.awt.Color(248, 250, 252));
        txtAge.setForeground(new java.awt.Color(127, 126, 126));
        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 280, 30));

        lblBirthday.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBirthday.setText("Birthday");
        jPanel2.add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblGender.setText("Gender");
        jPanel2.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        txtGender.setBackground(new java.awt.Color(248, 250, 252));
        txtGender.setForeground(new java.awt.Color(127, 126, 126));
        txtGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel2.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 280, 30));

        lblBarangay.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBarangay.setText("Barangay");
        jPanel2.add(lblBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        txtBarangay.setBackground(new java.awt.Color(248, 250, 252));
        txtBarangay.setForeground(new java.awt.Color(127, 126, 126));
        txtBarangay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarangayActionPerformed(evt);
            }
        });
        jPanel2.add(txtBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 280, 30));

        lblProvince.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblProvince.setText("Province");
        jPanel2.add(lblProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        txtProvince.setBackground(new java.awt.Color(248, 250, 252));
        txtProvince.setForeground(new java.awt.Color(127, 126, 126));
        txtProvince.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
            }
        });
        jPanel2.add(txtProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 280, 30));

        lblCity.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCity.setText("City");
        jPanel2.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        txtCity.setBackground(new java.awt.Color(248, 250, 252));
        txtCity.setForeground(new java.awt.Color(127, 126, 126));
        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 280, 30));

        lblFullAddress.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFullAddress.setText("Full Address");
        jPanel2.add(lblFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        txtFullAddress.setBackground(new java.awt.Color(248, 250, 252));
        txtFullAddress.setForeground(new java.awt.Color(127, 126, 126));
        txtFullAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtFullAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullAddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 280, 30));

        imgIcon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp_LogIn_Icon.png"))); // NOI18N
        imgIcon_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(imgIcon_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 460, 510));
        jPanel2.add(dateBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_SignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_SignUpActionPerformed

    private void txtUsername_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername_SignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername_SignUpActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMiddleNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
       
        String username = txtUsername_SignUp.getText();
        String password = new String(txtPassword_SignUp.getPassword());
        String firstname = txtFirstName.getText();
        String middlename = txtMiddleName.getText();
        String lastname = txtLastName.getText();
        String email = txtEmail_SignUp.getText();
        String ContactNumber = txtContactNumber.getText();       
        String age = txtAge.getText();
        SimpleDateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd");
        String birthday = dateformat.format(dateBday.getDate());
        String gender = txtGender.getText();
        String province = txtProvince.getText();
        String city = txtCity.getText();
        String barangay = txtBarangay.getText();
        String fulladdress = txtFullAddress.getText();
 
         try {
            pst = con.prepareStatement("INSERT INTO user (Username, Password, FirstName, MiddleName, LastName, Email, Age, ContactNumber, Birthday, Gender, Province, City, Barangay, FullAddress, RegDate)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, firstname);
            pst.setString(4, middlename);
            pst.setString(5, lastname);
            pst.setString(6, email );
            pst.setString(7, ContactNumber );   
             pst.setString(8, age);
            pst.setString(9, birthday);
            pst.setString(10, gender);
            pst.setString(11, province);
            pst.setString(12, city);
            pst.setString(13, barangay );
            pst.setString(14, fulladdress );
            pst.setTimestamp(15, date);

            int k =pst.executeUpdate();

            if(k==1){
                JOptionPane.showMessageDialog(null, "Registration Complete");
                Dashboard dash = new Dashboard();
                dash.setVisible(true);
                setVisible(false);
            }

            else{
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUp_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtBarangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarangayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarangayActionPerformed

    private void txtProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtFullAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullAddressActionPerformed

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
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private com.toedter.calendar.JDateChooser dateBday;
    private javax.swing.JLabel imgIcon_2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBarangay;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFullAddress;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMiddleName;
    private javax.swing.JLabel lblPassword_SignUp;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblSignUp_1;
    private javax.swing.JLabel lblUsername_SignUp;
    private javax.swing.JLabel lblWelcome_1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBarangay;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail_SignUp;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFullAddress;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JPasswordField txtPassword_SignUp;
    private javax.swing.JTextField txtProvince;
    public javax.swing.JTextField txtUsername_SignUp;
    // End of variables declaration//GEN-END:variables
}
