
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Oliver Dela Cruz
 */
public class Login1 extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login1() {
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

        jPanel1 = new javax.swing.JPanel();
        lblLogIn = new javax.swing.JLabel();
        txtCreateFreeAccount = new javax.swing.JLabel();
        lblWelcome_LogIn = new javax.swing.JLabel();
        lblUsername_LogIn = new javax.swing.JLabel();
        txtEmail_LogIn = new javax.swing.JTextField();
        txtPassword_LogIn = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        txtUsername_LogIn = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        imgIcon_LogIn = new javax.swing.JLabel();
        chckbxRememberMe = new javax.swing.JCheckBox();
        lblEmail_LogIn = new javax.swing.JLabel();
        iconLogo = new javax.swing.JLabel();
        txtDontHaveAnAccount = new javax.swing.JLabel();
        txtForgotPassword = new javax.swing.JLabel();
        iconUsername = new javax.swing.JLabel();
        iconEmailAddress = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 728));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 728));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogIn.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        lblLogIn.setText("Log In");
        jPanel1.add(lblLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtCreateFreeAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCreateFreeAccount.setForeground(new java.awt.Color(37, 99, 235));
        txtCreateFreeAccount.setText("Create free account");
        jPanel1.add(txtCreateFreeAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, -1, 20));

        lblWelcome_LogIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWelcome_LogIn.setForeground(new java.awt.Color(82, 82, 91));
        lblWelcome_LogIn.setText("<html> Welcome to Readme Library Management <br> System!");
        jPanel1.add(lblWelcome_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        lblUsername_LogIn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblUsername_LogIn.setText("Username");
        jPanel1.add(lblUsername_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txtEmail_LogIn.setBackground(new java.awt.Color(248, 250, 252));
        txtEmail_LogIn.setForeground(new java.awt.Color(127, 126, 126));
        txtEmail_LogIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtEmail_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_LogInActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 280, 30));

        txtPassword_LogIn.setBackground(new java.awt.Color(248, 250, 252));
        txtPassword_LogIn.setForeground(new java.awt.Color(127, 127, 127));
        txtPassword_LogIn.setText("jPasswordField1");
        txtPassword_LogIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtPassword_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword_LogInActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 280, 30));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPassword.setText("Password");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        txtUsername_LogIn.setBackground(new java.awt.Color(248, 250, 252));
        txtUsername_LogIn.setForeground(new java.awt.Color(127, 126, 126));
        txtUsername_LogIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtUsername_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername_LogInActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, 30));

        btnSignIn.setBackground(new java.awt.Color(51, 102, 255));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign In");
        btnSignIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 130, 40));

        imgIcon_LogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1-01 1.png"))); // NOI18N
        imgIcon_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(imgIcon_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 700, 660));

        chckbxRememberMe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chckbxRememberMe.setText("Remember me");
        chckbxRememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbxRememberMeActionPerformed(evt);
            }
        });
        jPanel1.add(chckbxRememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        lblEmail_LogIn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmail_LogIn.setText("Email Address");
        jPanel1.add(lblEmail_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo-01 1.png"))); // NOI18N
        jPanel1.add(iconLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, 130));

        txtDontHaveAnAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDontHaveAnAccount.setForeground(new java.awt.Color(82, 82, 91));
        txtDontHaveAnAccount.setText("Don't have an account?");
        jPanel1.add(txtDontHaveAnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        txtForgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtForgotPassword.setForeground(new java.awt.Color(37, 99, 235));
        txtForgotPassword.setText("Forgot Password?");
        jPanel1.add(txtForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, 20));
        jPanel1.add(iconUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 20, 40));
        jPanel1.add(iconEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 20, 40));
        jPanel1.add(iconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 20, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_LogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_LogInActionPerformed

    private void txtPassword_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword_LogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword_LogInActionPerformed

    private void txtUsername_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername_LogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername_LogInActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/readmedb");
            String sql = "Select * from readmedb where username=? and password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,txtUsername_LogIn.getText());
            pst.setString(2,txtPassword_LogIn.getText());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Username and Password Matched");
                Dashboard dash = new Dashboard();
                dash.setVisible(true);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Username and Password Do Not Matched");
                txtUsername_LogIn.setText("");
                txtPassword_LogIn.setText("");
            }
        }
        catch(Exception e){
            System.err.println("Connection error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void chckbxRememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbxRememberMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chckbxRememberMeActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JCheckBox chckbxRememberMe;
    private javax.swing.JLabel iconEmailAddress;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JLabel imgIcon_LogIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail_LogIn;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername_LogIn;
    private javax.swing.JLabel lblWelcome_LogIn;
    private javax.swing.JLabel txtCreateFreeAccount;
    private javax.swing.JLabel txtDontHaveAnAccount;
    private javax.swing.JTextField txtEmail_LogIn;
    private javax.swing.JLabel txtForgotPassword;
    private javax.swing.JPasswordField txtPassword_LogIn;
    private javax.swing.JTextField txtUsername_LogIn;
    // End of variables declaration//GEN-END:variables
}
