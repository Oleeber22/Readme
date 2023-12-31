/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


/**
 *
 * @author florence
 */
public class ProfilePicture extends javax.swing.JPanel {

    /**
     * Creates new form SignUp_1
     */
    public ProfilePicture() {
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
        lblWelcome_2 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        btnChooseFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 728));
        setPreferredSize(new java.awt.Dimension(1024, 728));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp_2.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        lblSignUp_2.setText("Sign Up");
        add(lblSignUp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblWelcome_2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblWelcome_2.setForeground(new java.awt.Color(82, 82, 91));
        lblWelcome_2.setText("Upload Profile Picture ");
        add(lblWelcome_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        btnUpload.setBackground(new java.awt.Color(51, 102, 255));
        btnUpload.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setText("Upload");
        btnUpload.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 130, 40));

        btnChooseFile.setBackground(new java.awt.Color(248, 250, 252));
        btnChooseFile.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnChooseFile.setText("Choose a File");
        add(btnChooseFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-icon-png-910.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 260, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSignUp_2;
    private javax.swing.JLabel lblWelcome_2;
    // End of variables declaration//GEN-END:variables
}
