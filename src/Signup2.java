
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Signup2 extends javax.swing.JFrame {

    public Signup2() {
        initComponents();
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/readmedb","root","");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup2.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblSignUp_2 = new javax.swing.JLabel();
        lblFullAddress = new javax.swing.JLabel();
        lblWelcome_2 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtFullAddress = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblBarangay = new javax.swing.JLabel();
        txtBarangay = new javax.swing.JTextField();
        lblProvince = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        imgIcon_2 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1024, 728));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 728));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp_2.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        lblSignUp_2.setText("Sign Up");
        jPanel2.add(lblSignUp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblFullAddress.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFullAddress.setText("Full Address");
        jPanel2.add(lblFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        lblWelcome_2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblWelcome_2.setForeground(new java.awt.Color(82, 82, 91));
        lblWelcome_2.setText("<html>\nWelcome to Readme Library Management\n<br>\nSystem!");
        jPanel2.add(lblWelcome_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAge.setText("Age");
        jPanel2.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtFullAddress.setBackground(new java.awt.Color(248, 250, 252));
        txtFullAddress.setForeground(new java.awt.Color(127, 126, 126));
        txtFullAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtFullAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullAddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 280, 30));

        lblBirthday.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBirthday.setText("Birthday");
        jPanel2.add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtBirthday.setBackground(new java.awt.Color(248, 250, 252));
        txtBirthday.setForeground(new java.awt.Color(127, 126, 126));
        txtBirthday.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });
        jPanel2.add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 30));

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblGender.setText("Gender");
        jPanel2.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtGender.setBackground(new java.awt.Color(248, 250, 252));
        txtGender.setForeground(new java.awt.Color(127, 126, 126));
        txtGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel2.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 280, 30));

        lblBarangay.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBarangay.setText("Barangay");
        jPanel2.add(lblBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        txtBarangay.setBackground(new java.awt.Color(248, 250, 252));
        txtBarangay.setForeground(new java.awt.Color(127, 126, 126));
        txtBarangay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarangayActionPerformed(evt);
            }
        });
        jPanel2.add(txtBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 280, 30));

        lblProvince.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblProvince.setText("Province");
        jPanel2.add(lblProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txtProvince.setBackground(new java.awt.Color(248, 250, 252));
        txtProvince.setForeground(new java.awt.Color(127, 126, 126));
        txtProvince.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
            }
        });
        jPanel2.add(txtProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 30));

        btnSignUp.setBackground(new java.awt.Color(51, 102, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 130, 40));

        imgIcon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp_LogIn_Icon.png"))); // NOI18N
        imgIcon_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(imgIcon_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 700, 660));

        txtCity.setBackground(new java.awt.Color(248, 250, 252));
        txtCity.setForeground(new java.awt.Color(127, 126, 126));
        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 280, 30));

        lblCity.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCity.setText("City");
        jPanel2.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        txtAge.setBackground(new java.awt.Color(248, 250, 252));
        txtAge.setForeground(new java.awt.Color(127, 126, 126));
        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullAddressActionPerformed

    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtBarangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarangayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarangayActionPerformed

    private void txtProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

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
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel imgIcon_2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBarangay;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblFullAddress;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblSignUp_2;
    private javax.swing.JLabel lblWelcome_2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBarangay;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFullAddress;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtProvince;
    // End of variables declaration//GEN-END:variables
}
