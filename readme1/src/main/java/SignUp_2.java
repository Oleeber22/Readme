/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


/**
 *
 * @author florence
 */
public class SignUp_2 extends javax.swing.JPanel {

    /**
     * Creates new form SignUp_1
     */
    public SignUp_2() {
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

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 728));
        setPreferredSize(new java.awt.Dimension(1024, 728));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp_2.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        lblSignUp_2.setText("Sign Up");
        add(lblSignUp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblFullAddress.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFullAddress.setText("Full Address");
        add(lblFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        lblWelcome_2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblWelcome_2.setForeground(new java.awt.Color(82, 82, 91));
        lblWelcome_2.setText("<html>\nWelcome to Readme Library Management\n<br>\nSystem!");
        add(lblWelcome_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtFullAddress.setBackground(new java.awt.Color(248, 250, 252));
        txtFullAddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFullAddress.setForeground(new java.awt.Color(127, 126, 126));
        txtFullAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtFullAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullAddressActionPerformed(evt);
            }
        });
        add(txtFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 280, 30));

        lblBirthday.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBirthday.setText("Birthday");
        add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtBirthday.setBackground(new java.awt.Color(248, 250, 252));
        txtBirthday.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBirthday.setForeground(new java.awt.Color(127, 126, 126));
        txtBirthday.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });
        add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 30));

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtGender.setBackground(new java.awt.Color(248, 250, 252));
        txtGender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtGender.setForeground(new java.awt.Color(127, 126, 126));
        txtGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 280, 30));

        lblBarangay.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBarangay.setText("Barangay");
        add(lblBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        txtBarangay.setBackground(new java.awt.Color(248, 250, 252));
        txtBarangay.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBarangay.setForeground(new java.awt.Color(127, 126, 126));
        txtBarangay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarangayActionPerformed(evt);
            }
        });
        add(txtBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 280, 30));

        lblProvince.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblProvince.setText("Province");
        add(lblProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txtProvince.setBackground(new java.awt.Color(248, 250, 252));
        txtProvince.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtProvince.setForeground(new java.awt.Color(127, 126, 126));
        txtProvince.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
            }
        });
        add(txtProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 30));

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
        add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 130, 40));

        imgIcon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1-01 1.png"))); // NOI18N
        imgIcon_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(imgIcon_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 700, 660));

        txtCity.setBackground(new java.awt.Color(248, 250, 252));
        txtCity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCity.setForeground(new java.awt.Color(127, 126, 126));
        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 280, 30));

        lblCity.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        txtAge.setBackground(new java.awt.Color(248, 250, 252));
        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtAge.setForeground(new java.awt.Color(127, 126, 126));
        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 30));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel imgIcon_2;
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
