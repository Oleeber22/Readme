import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        imgIcon_1 = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();

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
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

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
        jPanel2.add(txtEmail_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 280, 30));

        txtPassword_SignUp.setBackground(new java.awt.Color(248, 250, 252));
        txtPassword_SignUp.setForeground(new java.awt.Color(127, 127, 127));
        txtPassword_SignUp.setText("jPasswordField1");
        txtPassword_SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        jPanel2.add(txtPassword_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 30));

        lblPassword_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPassword_SignUp.setText("Password");
        jPanel2.add(lblPassword_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

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
        jPanel2.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtFirstName.setBackground(new java.awt.Color(248, 250, 252));
        txtFirstName.setForeground(new java.awt.Color(127, 126, 126));
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 280, 30));

        lblMiddleName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblMiddleName.setText("Middle Name");
        jPanel2.add(lblMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        txtMiddleName.setBackground(new java.awt.Color(248, 250, 252));
        txtMiddleName.setForeground(new java.awt.Color(127, 126, 126));
        txtMiddleName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiddleNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 280, 30));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLastName.setText("Last Name");
        jPanel2.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txtLastName.setBackground(new java.awt.Color(248, 250, 252));
        txtLastName.setForeground(new java.awt.Color(127, 126, 126));
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 30));

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
        jPanel2.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 130, 40));

        imgIcon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp_LogIn_Icon.png"))); // NOI18N
        imgIcon_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(imgIcon_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 700, 660));

        lblContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblContactNumber.setText("Contact Number");
        jPanel2.add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        txtContactNumber.setBackground(new java.awt.Color(248, 250, 252));
        txtContactNumber.setForeground(new java.awt.Color(127, 126, 126));
        txtContactNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 280, 30));

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
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        String username = txtUsername_SignUp.getText();
        String password = new String(txtPassword_SignUp.getPassword());
        String firstname = txtFirstName.getText();
        String middlename = txtMiddleName.getText();
        String lastname = txtLastName.getText();
        String email = txtEmail_SignUp.getText();
        String ContactNumber = txtContactNumber.getText();
         try {
            pst = con.prepareStatement("INSERT INTO user (Username, Password, FirstName, MiddleName, LastName, Email, ContactNumber)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, firstname);
            pst.setString(4, middlename);
            pst.setString(5, lastname);
            pst.setString(6, email );
            pst.setString(7, ContactNumber );

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
    private javax.swing.JLabel imgIcon_1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMiddleName;
    private javax.swing.JLabel lblPassword_SignUp;
    private javax.swing.JLabel lblSignUp_1;
    private javax.swing.JLabel lblUsername_SignUp;
    private javax.swing.JLabel lblWelcome_1;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail_SignUp;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JPasswordField txtPassword_SignUp;
    public javax.swing.JTextField txtUsername_SignUp;
    // End of variables declaration//GEN-END:variables
}
