
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Oliver Dela Cruz
 */
public class Borrower extends javax.swing.JFrame {

    /**
     * Creates new form Borrower
     */
    public Borrower() {
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
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_borrowbooks = new javax.swing.JLabel();
        lblwelcome = new javax.swing.JLabel();
        txt_booktitle = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblBookTitle = new javax.swing.JLabel();
        btn_borrow = new javax.swing.JButton();
        pnlLeft3 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        iconLogo31 = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        lblStatistics = new javax.swing.JLabel();
        lblFriends = new javax.swing.JLabel();
        iconLogo36 = new javax.swing.JLabel();
        iconLogo37 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        iconLogo39 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        pnlFeatured = new javax.swing.JPanel();
        lblDidYouRead = new javax.swing.JLabel();
        pnlBookFeatured = new javax.swing.JPanel();
        lblFeaturedBookTitle = new javax.swing.JLabel();
        lblFeaturedBookAuthor = new javax.swing.JLabel();
        btnRating = new javax.swing.JButton();
        btnReadNow = new javax.swing.JButton();
        pnlCommunity = new javax.swing.JPanel();
        btnJoin = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlUser1 = new javax.swing.JPanel();
        lblUsername2 = new javax.swing.JLabel();
        lblUsername3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblUsername4 = new javax.swing.JLabel();
        lblISBN1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        lbl_borrowbooks.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_borrowbooks.setText("Borrow Books");
        lbl_borrowbooks.setName("lbl_borrowtext"); // NOI18N

        lblwelcome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(82, 82, 91));
        lblwelcome.setText("<html>\nWelcome to ReadMe Library Management \n<br>\nSystem!");

        txt_booktitle.setBackground(new java.awt.Color(248, 250, 252));
        txt_booktitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txt_booktitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_booktitleActionPerformed(evt);
            }
        });

        txt_isbn.setBackground(new java.awt.Color(248, 250, 252));
        txt_isbn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txt_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_isbnActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblUsername.setText("Full Name");

        lblBookTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBookTitle.setText("Book Title");

        btn_borrow.setBackground(new java.awt.Color(0, 102, 204));
        btn_borrow.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_borrow.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrow.setText("Borrow");
        btn_borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrowActionPerformed(evt);
            }
        });

        pnlLeft3.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft3.setToolTipText("leftPanel");
        pnlLeft3.setName("pnlLeft"); // NOI18N

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dashboard1.png"))); // NOI18N

        iconLogo31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo-01 1 (1).png"))); // NOI18N

        lblSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Settings.png"))); // NOI18N

        lblRate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rating.png"))); // NOI18N

        lblStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Statistic.png"))); // NOI18N

        lblFriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Friends.png"))); // NOI18N

        iconLogo37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector 16.png"))); // NOI18N

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logout.png"))); // NOI18N

        javax.swing.GroupLayout pnlLeft3Layout = new javax.swing.GroupLayout(pnlLeft3);
        pnlLeft3.setLayout(pnlLeft3Layout);
        pnlLeft3Layout.setHorizontalGroup(
            pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeft3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(iconLogo31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLeft3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLeft3Layout.createSequentialGroup()
                        .addGroup(pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDashboard)
                            .addComponent(lblStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFriends)
                            .addComponent(lblSettings))
                        .addGap(28, 28, 28)
                        .addComponent(iconLogo37))
                    .addComponent(iconLogo36)))
            .addGroup(pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLeft3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(iconLogo39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        pnlLeft3Layout.setVerticalGroup(
            pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeft3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iconLogo31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLogo37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLeft3Layout.createSequentialGroup()
                        .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconLogo36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLeft3Layout.createSequentialGroup()
                    .addGap(348, 348, 348)
                    .addComponent(iconLogo39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(367, Short.MAX_VALUE)))
        );

        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFeatured.setBackground(new java.awt.Color(255, 255, 255));

        lblDidYouRead.setBackground(new java.awt.Color(153, 153, 153));
        lblDidYouRead.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblDidYouRead.setForeground(new java.awt.Color(153, 153, 153));
        lblDidYouRead.setText("Did you read");

        pnlBookFeatured.setBackground(new java.awt.Color(196, 196, 196));
        pnlBookFeatured.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlBookFeatured.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBookFeaturedLayout = new javax.swing.GroupLayout(pnlBookFeatured);
        pnlBookFeatured.setLayout(pnlBookFeaturedLayout);
        pnlBookFeaturedLayout.setHorizontalGroup(
            pnlBookFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        pnlBookFeaturedLayout.setVerticalGroup(
            pnlBookFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        lblFeaturedBookTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFeaturedBookTitle.setText("Book Title");

        lblFeaturedBookAuthor.setBackground(new java.awt.Color(153, 153, 153));
        lblFeaturedBookAuthor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFeaturedBookAuthor.setForeground(new java.awt.Color(153, 153, 153));
        lblFeaturedBookAuthor.setText("by Author");

        btnRating.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRating.setForeground(new java.awt.Color(255, 255, 255));
        btnRating.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rate.png"))); // NOI18N
        btnRating.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnReadNow.setBackground(new java.awt.Color(196, 196, 196));
        btnReadNow.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnReadNow.setForeground(new java.awt.Color(255, 255, 255));
        btnReadNow.setText("Read Now");

        javax.swing.GroupLayout pnlFeaturedLayout = new javax.swing.GroupLayout(pnlFeatured);
        pnlFeatured.setLayout(pnlFeaturedLayout);
        pnlFeaturedLayout.setHorizontalGroup(
            pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFeaturedLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlBookFeatured, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRating)
                    .addComponent(lblDidYouRead)
                    .addComponent(lblFeaturedBookTitle)
                    .addComponent(lblFeaturedBookAuthor)
                    .addComponent(btnReadNow))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlFeaturedLayout.setVerticalGroup(
            pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeaturedLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBookFeatured, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFeaturedLayout.createSequentialGroup()
                        .addComponent(lblDidYouRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFeaturedBookTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFeaturedBookAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRating, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReadNow)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlRight.add(pnlFeatured, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 56, 320, -1));

        pnlCommunity.setBackground(new java.awt.Color(196, 196, 196));
        pnlCommunity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 196, 196), 1, true));
        pnlCommunity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJoin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnJoin.setForeground(new java.awt.Color(180, 180, 180));
        btnJoin.setText("Join Now");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });
        pnlCommunity.add(btnJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        lblCommunity.setBackground(new java.awt.Color(196, 196, 196));
        lblCommunity.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunity.setText("<html> Join a community of over  <br>  5000 Book Lovers  <br> here now");
        lblCommunity.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCommunity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlCommunity.add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, 223, 280));

        pnlRight.add(pnlCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 275, 320, 330));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 196, 196), 1, true));
        jPanel5.setPreferredSize(new java.awt.Dimension(84, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group 1683.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 70, 70));

        jLabel5.setBackground(new java.awt.Color(196, 196, 196));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rectangle 775.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, 50));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Subscribe now to our blog");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pnlRight.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 320, -1));

        pnlUser1.setBackground(new java.awt.Color(255, 255, 255));
        pnlUser1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ellipse 14.png"))); // NOI18N
        pnlUser1.add(lblUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 30, 30));

        lblUsername3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector.png"))); // NOI18N
        pnlUser1.add(lblUsername3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 20, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Notification.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 1, true));
        pnlUser1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        lblUsername4.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername4.setText("User Profile");
        pnlUser1.add(lblUsername4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 160, 30));

        pnlRight.add(pnlUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 14, 320, -1));

        lblISBN1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblISBN1.setText("ISBN");

        txt_username.setBackground(new java.awt.Color(248, 250, 252));
        txt_username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLeft3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername)
                    .addComponent(lbl_borrowbooks)
                    .addComponent(lblBookTitle)
                    .addComponent(txt_booktitle)
                    .addComponent(txt_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblISBN1)
                    .addComponent(txt_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbl_borrowbooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblBookTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblISBN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(btn_borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlLeft3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_booktitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_booktitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_booktitleActionPerformed

    private void txt_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_isbnActionPerformed

    private void btn_borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrowActionPerformed
       java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
       String fullname = txt_username.getText();
        String booktitle = txt_booktitle.getText();
        String isbn = txt_isbn.getText();
        
        try {
            pst = con.prepareStatement("INSERT INTO borrower (FULLNAME, booktitle, isbn, DATE)VALUES(?,?,?,?)");
            pst.setString(1, fullname);
            pst.setString(2, booktitle);
            pst.setString(3, isbn);
            pst.setTimestamp(4, date);

            int k =pst.executeUpdate();

            if(k==1){
                JOptionPane.showMessageDialog(null, "Borrowing Complete");
                BorrowersList borrow = new BorrowersList();
                borrow.setVisible(true);
                setVisible(false);
            }

            else{
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_borrowActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJoinActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrower().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnRating;
    private javax.swing.JButton btnReadNow;
    private javax.swing.JButton btn_borrow;
    private javax.swing.JLabel iconLogo31;
    private javax.swing.JLabel iconLogo36;
    private javax.swing.JLabel iconLogo37;
    private javax.swing.JLabel iconLogo39;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBookTitle;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDidYouRead;
    private javax.swing.JLabel lblFeaturedBookAuthor;
    private javax.swing.JLabel lblFeaturedBookTitle;
    private javax.swing.JLabel lblFriends;
    private javax.swing.JLabel lblISBN1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblStatistics;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel lbl_borrowbooks;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JPanel pnlBookFeatured;
    private javax.swing.JPanel pnlCommunity;
    private javax.swing.JPanel pnlFeatured;
    private javax.swing.JPanel pnlLeft3;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlUser1;
    private javax.swing.JTextField txt_booktitle;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
