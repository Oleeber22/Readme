
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Judy
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard () {
        initComponents();
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/readmedb";
        String user = "root";
        String password = "";
        
        Connection con;
        Statement st;
        ResultSet rs;
        try {
            // Register JDBC driver
            Class.forName(className);
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            // Execute a query
            System.out.println("Creating statement...");
            st = con.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM user";
            rs = st.executeQuery(sql);

            // Process the result
            if (rs.next()) {
                int totalCount = rs.getInt("total");
                noreaders.setText("" + totalCount);
            }

            // Clean up
            rs.close();
            st.close();
            con.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // Register JDBC driver
            Class.forName(className);
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            // Execute a query
            System.out.println("Creating statement...");
            st = con.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM authors";
            rs = st.executeQuery(sql);

            // Process the result
            if (rs.next()) {
                int totalCount = rs.getInt("total");
                jLabel10.setText("" + totalCount);
            }

            // Clean up
            rs.close();
            st.close();
            con.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            // Register JDBC driver
            Class.forName(className);
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            // Execute a query
            System.out.println("Creating statement...");
            st = con.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM publisher";
            rs = st.executeQuery(sql);

            // Process the result
            if (rs.next()) {
                int totalCount = rs.getInt("total");
                jLabel9.setText("" + totalCount);
            }

            // Clean up
            rs.close();
            st.close();
            con.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            Class.forName(className);
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            // Compose the SQL query with multiple labels
            String query = "SELECT * FROM books";
            rs = st.executeQuery(query);

            int count = 1;
            while (rs.next()) {
               String bookTitle = rs.getString("title");
               byte[] imageData = rs.getBytes(10);

                        ByteArrayInputStream inputStream = new ByteArrayInputStream(imageData);
                        Image image = ImageIO.read(inputStream);
                
                switch (count) {
                
                    case 1:
                        lblBook1.setText(rs.getString(2));
                        lblAuthor1.setText(rs.getString(3));
                     //   jImage1.setIcon(new ImageIcon(image));
                        
                        break;
                    case 2:
                        lblBook2.setText(rs.getString(2));
                        lblAuthor2.setText(rs.getString(3));
                     //   jImage2.setIcon(new ImageIcon(image));

                        break;
                        
                    case 3:
                        lblBook3.setText(rs.getString(2));
                        lblAuthor3.setText(rs.getString(3));
                        break;
                    case 4:
                        lblBook4.setText(rs.getString(2));
                        lblAuthor4.setText(rs.getString(3));
                        break;
                    // Add more cases for additional labels
                    // case 3:
                    //    lblBook3.setText(rs.getString(2));
                    //    lblAuthor3.setText(rs.getString(3));
                    //    break;
                    default:
                        break;
                }
                count++;
            }
        } catch (ClassNotFoundException ex) {
            System.err.println("Connection error: " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        iconLogo = new javax.swing.JLabel();
        iconLogo1 = new javax.swing.JLabel();
        iconLogo2 = new javax.swing.JLabel();
        iconLogo3 = new javax.swing.JLabel();
        iconLogo4 = new javax.swing.JLabel();
        iconLogo5 = new javax.swing.JLabel();
        iconLogo10 = new javax.swing.JLabel();
        iconLogo11 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnFilter = new javax.swing.JButton();
        pnlQuotation = new javax.swing.JPanel();
        pnlQuoteOfTheDay = new javax.swing.JPanel();
        lblQuoteOfTheDay = new javax.swing.JLabel();
        lblQuote = new javax.swing.JLabel();
        lblPersonQuoted = new javax.swing.JLabel();
        pnlReco = new javax.swing.JPanel();
        lblRecommended = new javax.swing.JLabel();
        btnViewMore = new javax.swing.JButton();
        pnlBookPreview3 = new javax.swing.JPanel();
        lblBook3 = new javax.swing.JLabel();
        lblAuthor3 = new javax.swing.JLabel();
        btnBorrow3 = new javax.swing.JButton();
        pnlBookFeatured4 = new javax.swing.JPanel();
        btnBorrow6 = new javax.swing.JButton();
        pnlBookPreview6 = new javax.swing.JPanel();
        lblBook2 = new javax.swing.JLabel();
        lblAuthor2 = new javax.swing.JLabel();
        btnBorrow4 = new javax.swing.JButton();
        pnlBookFeatured6 = new javax.swing.JPanel();
        jImage2 = new javax.swing.JLabel();
        btnBorrow12 = new javax.swing.JButton();
        pnlBookPreview7 = new javax.swing.JPanel();
        lblBook1 = new javax.swing.JLabel();
        lblAuthor1 = new javax.swing.JLabel();
        pnlBookFeatured7 = new javax.swing.JPanel();
        jImage1 = new javax.swing.JLabel();
        btnBorrow14 = new javax.swing.JButton();
        btnBorrow13 = new javax.swing.JButton();
        pnlBookPreview8 = new javax.swing.JPanel();
        lblBook4 = new javax.swing.JLabel();
        lblAuthor4 = new javax.swing.JLabel();
        btnBorrow15 = new javax.swing.JButton();
        pnlBookFeatured8 = new javax.swing.JPanel();
        btnBorrow16 = new javax.swing.JButton();
        pnlAuthor = new javax.swing.JPanel();
        iconLogo6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlBorrower = new javax.swing.JPanel();
        iconLogo7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        noreaders = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlPublisher = new javax.swing.JPanel();
        iconLogo8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        pnlFeatured = new javax.swing.JPanel();
        lblDidYouRead = new javax.swing.JLabel();
        lblFeaturedBookTitle = new javax.swing.JLabel();
        lblFeaturedBookAuthor = new javax.swing.JLabel();
        btnRead = new javax.swing.JButton();
        btnRead1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlCommunity = new javax.swing.JPanel();
        btnJoin = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlUser1 = new javax.swing.JPanel();
        lblUsername2 = new javax.swing.JLabel();
        lblUsername3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblUsername4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 728));
        setSize(new java.awt.Dimension(1024, 728));

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setToolTipText("leftPanel");
        pnlLeft.setName("pnlLeft"); // NOI18N

        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dashboard1.png"))); // NOI18N

        iconLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo-01 2.png"))); // NOI18N

        iconLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group_1.png"))); // NOI18N

        iconLogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector (1).png"))); // NOI18N

        iconLogo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group 1698.png"))); // NOI18N

        iconLogo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Friends.png"))); // NOI18N

        iconLogo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logout.png"))); // NOI18N
        iconLogo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLogo10MouseClicked(evt);
            }
        });

        iconLogo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector 16.png"))); // NOI18N

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconLogo)
                    .addComponent(iconLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(iconLogo11))
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(pnlLeftLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(iconLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLeftLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(iconLogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconLogo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iconLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLogo11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(iconLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconLogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconLogo10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnlCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group (1).png"))); // NOI18N
        pnlCenter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 40));

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("        Search for anything here");
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        pnlCenter.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 780, 30));

        btnFilter.setBackground(new java.awt.Color(196, 196, 196));
        btnFilter.setForeground(new java.awt.Color(212, 212, 212));
        btnFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group.png"))); // NOI18N
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        pnlCenter.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 14, 40, 30));

        pnlQuotation.setBackground(java.awt.SystemColor.activeCaption);

        pnlQuoteOfTheDay.setBackground(java.awt.SystemColor.textHighlight);

        lblQuoteOfTheDay.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblQuoteOfTheDay.setForeground(new java.awt.Color(255, 255, 255));
        lblQuoteOfTheDay.setText("Quote Today");

        javax.swing.GroupLayout pnlQuoteOfTheDayLayout = new javax.swing.GroupLayout(pnlQuoteOfTheDay);
        pnlQuoteOfTheDay.setLayout(pnlQuoteOfTheDayLayout);
        pnlQuoteOfTheDayLayout.setHorizontalGroup(
            pnlQuoteOfTheDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuoteOfTheDayLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblQuoteOfTheDay)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlQuoteOfTheDayLayout.setVerticalGroup(
            pnlQuoteOfTheDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuoteOfTheDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuoteOfTheDay)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        lblQuote.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblQuote.setText("<html>\n\"Libraries will get you through times of no money better than money will\n<br>\nget you through times of no libraries and books are uniquely portably magic.\"");

        lblPersonQuoted.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPersonQuoted.setForeground(java.awt.SystemColor.textHighlight);
        lblPersonQuoted.setText("- Stephen King");

        javax.swing.GroupLayout pnlQuotationLayout = new javax.swing.GroupLayout(pnlQuotation);
        pnlQuotation.setLayout(pnlQuotationLayout);
        pnlQuotationLayout.setHorizontalGroup(
            pnlQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuotationLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPersonQuoted)
                    .addComponent(pnlQuoteOfTheDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlQuotationLayout.setVerticalGroup(
            pnlQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuotationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlQuoteOfTheDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)


                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addComponent(lblPersonQuoted, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlCenter.add(pnlQuotation, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 820, -1));

        pnlReco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRecommended.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblRecommended.setForeground(new java.awt.Color(51, 51, 51));
        lblRecommended.setText("Recommended Books");
        pnlReco.add(lblRecommended, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnViewMore.setBackground(new java.awt.Color(242, 242, 242));
        btnViewMore.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnViewMore.setForeground(new java.awt.Color(212, 212, 212));
        btnViewMore.setText("View More >");
        btnViewMore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 1, true));
        btnViewMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMoreActionPerformed(evt);
            }
        });
        pnlReco.add(btnViewMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 110, -1));

        pnlBookPreview3.setBackground(new java.awt.Color(255, 255, 255));

        lblBook3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBook3.setText("Book Title");

        lblAuthor3.setBackground(new java.awt.Color(153, 153, 153));
        lblAuthor3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAuthor3.setForeground(new java.awt.Color(153, 153, 153));
        lblAuthor3.setText("Author");

        btnBorrow3.setBackground(new java.awt.Color(0, 10, 223));
        btnBorrow3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBorrow3.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrow3.setText("Borrow");

        pnlBookFeatured4.setBackground(new java.awt.Color(196, 196, 196));
        pnlBookFeatured4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlBookFeatured4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBookFeatured4Layout = new javax.swing.GroupLayout(pnlBookFeatured4);
        pnlBookFeatured4.setLayout(pnlBookFeatured4Layout);
        pnlBookFeatured4Layout.setHorizontalGroup(
            pnlBookFeatured4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        pnlBookFeatured4Layout.setVerticalGroup(
            pnlBookFeatured4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        btnBorrow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Bar.png"))); // NOI18N
        btnBorrow6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout pnlBookPreview3Layout = new javax.swing.GroupLayout(pnlBookPreview3);
        pnlBookPreview3.setLayout(pnlBookPreview3Layout);
        pnlBookPreview3Layout.setHorizontalGroup(
            pnlBookPreview3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookPreview3Layout.createSequentialGroup()
                .addGroup(pnlBookPreview3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBookPreview3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBookPreview3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBook3)
                            .addComponent(lblAuthor3)))
                    .addComponent(btnBorrow6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlBookPreview3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview3Layout.createSequentialGroup()
                        .addComponent(pnlBookFeatured4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview3Layout.createSequentialGroup()
                        .addComponent(btnBorrow3)
                        .addGap(49, 49, 49))))
        );
        pnlBookPreview3Layout.setVerticalGroup(
            pnlBookPreview3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(pnlBookFeatured4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBook3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthor3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrow3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrow6)
                .addGap(10, 10, 10))
        );

        pnlReco.add(pnlBookPreview3, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 39, -1, -1));

        pnlBookPreview6.setBackground(new java.awt.Color(255, 255, 255));

        lblBook2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBook2.setText("The Two Towers");

        lblAuthor2.setBackground(new java.awt.Color(153, 153, 153));
        lblAuthor2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAuthor2.setForeground(new java.awt.Color(153, 153, 153));
        lblAuthor2.setText("JRR Tolkien");

        btnBorrow4.setBackground(new java.awt.Color(0, 10, 223));
        btnBorrow4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBorrow4.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrow4.setText("Borrow");

        pnlBookFeatured6.setBackground(new java.awt.Color(196, 196, 196));
        pnlBookFeatured6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlBookFeatured6.setForeground(new java.awt.Color(255, 255, 255));

        jImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/madalyn-cox-O7ygzpAL4Mc-unsplash (2).jpg"))); // NOI18N
        jImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlBookFeatured6Layout = new javax.swing.GroupLayout(pnlBookFeatured6);
        pnlBookFeatured6.setLayout(pnlBookFeatured6Layout);
        pnlBookFeatured6Layout.setHorizontalGroup(
            pnlBookFeatured6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBookFeatured6Layout.setVerticalGroup(
            pnlBookFeatured6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnBorrow12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Bar.png"))); // NOI18N
        btnBorrow12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout pnlBookPreview6Layout = new javax.swing.GroupLayout(pnlBookPreview6);
        pnlBookPreview6.setLayout(pnlBookPreview6Layout);
        pnlBookPreview6Layout.setHorizontalGroup(
            pnlBookPreview6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookPreview6Layout.createSequentialGroup()
                .addGroup(pnlBookPreview6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBookPreview6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBookPreview6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBook2)
                            .addComponent(lblAuthor2)))
                    .addComponent(btnBorrow12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBookPreview6Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnBorrow4))
                    .addGroup(pnlBookPreview6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnlBookFeatured6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBookPreview6Layout.setVerticalGroup(
            pnlBookPreview6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBookFeatured6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBook2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrow4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrow12)
                .addGap(10, 10, 10))
        );

        pnlReco.add(pnlBookPreview6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 39, -1, 310));

        pnlBookPreview7.setBackground(new java.awt.Color(255, 255, 255));

        lblBook1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBook1.setText("How Innovation Works");

        lblAuthor1.setBackground(new java.awt.Color(153, 153, 153));
        lblAuthor1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAuthor1.setForeground(new java.awt.Color(153, 153, 153));
        lblAuthor1.setText("Matt Ridley");

        pnlBookFeatured7.setBackground(new java.awt.Color(196, 196, 196));
        pnlBookFeatured7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlBookFeatured7.setForeground(new java.awt.Color(255, 255, 255));

        jImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/matt-ridley-H-LIL57PHCc-unsplash (4).jpg"))); // NOI18N
        jImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlBookFeatured7Layout = new javax.swing.GroupLayout(pnlBookFeatured7);
        pnlBookFeatured7.setLayout(pnlBookFeatured7Layout);
        pnlBookFeatured7Layout.setHorizontalGroup(
            pnlBookFeatured7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBookFeatured7Layout.setVerticalGroup(
            pnlBookFeatured7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnBorrow14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Bar.png"))); // NOI18N
        btnBorrow14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnBorrow13.setBackground(new java.awt.Color(0, 10, 223));
        btnBorrow13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBorrow13.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrow13.setText("Borrow");
        btnBorrow13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrow13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBookPreview7Layout = new javax.swing.GroupLayout(pnlBookPreview7);
        pnlBookPreview7.setLayout(pnlBookPreview7Layout);
        pnlBookPreview7Layout.setHorizontalGroup(
            pnlBookPreview7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookPreview7Layout.createSequentialGroup()
                .addGroup(pnlBookPreview7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBookPreview7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBookPreview7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBook1)
                            .addComponent(lblAuthor1)))
                    .addComponent(btnBorrow14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBookPreview7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBorrow13))
                    .addGroup(pnlBookPreview7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnlBookFeatured7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBookPreview7Layout.setVerticalGroup(
            pnlBookPreview7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview7Layout.createSequentialGroup()


                .addContainerGap()
                .addComponent(pnlBookFeatured7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBook1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthor1)
                .addGap(5, 5, 5)
                .addComponent(btnBorrow13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrow14)
                .addGap(10, 10, 10))
        );

        pnlReco.add(pnlBookPreview7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 320));

        pnlBookPreview8.setBackground(new java.awt.Color(255, 255, 255));

        lblBook4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBook4.setText("Book Title");

        lblAuthor4.setBackground(new java.awt.Color(153, 153, 153));
        lblAuthor4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblAuthor4.setForeground(new java.awt.Color(153, 153, 153));
        lblAuthor4.setText("Author");

        btnBorrow15.setBackground(new java.awt.Color(0, 10, 223));
        btnBorrow15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBorrow15.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrow15.setText("Borrow");

        pnlBookFeatured8.setBackground(new java.awt.Color(196, 196, 196));
        pnlBookFeatured8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlBookFeatured8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBookFeatured8Layout = new javax.swing.GroupLayout(pnlBookFeatured8);
        pnlBookFeatured8.setLayout(pnlBookFeatured8Layout);
        pnlBookFeatured8Layout.setHorizontalGroup(
            pnlBookFeatured8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        pnlBookFeatured8Layout.setVerticalGroup(
            pnlBookFeatured8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        btnBorrow16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Bar.png"))); // NOI18N
        btnBorrow16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout pnlBookPreview8Layout = new javax.swing.GroupLayout(pnlBookPreview8);
        pnlBookPreview8.setLayout(pnlBookPreview8Layout);
        pnlBookPreview8Layout.setHorizontalGroup(
            pnlBookPreview8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlBookFeatured8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(pnlBookPreview8Layout.createSequentialGroup()
                .addGroup(pnlBookPreview8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBookPreview8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBookPreview8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBook4)
                            .addComponent(lblAuthor4)))
                    .addComponent(btnBorrow16, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBookPreview8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBorrow15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBookPreview8Layout.setVerticalGroup(
            pnlBookPreview8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPreview8Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(pnlBookFeatured8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBook4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthor4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrow15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrow16)
                .addGap(10, 10, 10))
        );

        pnlReco.add(pnlBookPreview8, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 39, -1, -1));

        pnlCenter.add(pnlReco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, -1, -1));

        pnlAuthor.setBackground(new java.awt.Color(255, 255, 255));
        pnlAuthor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLogo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Frame.png"))); // NOI18N
        pnlAuthor.add(iconLogo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 20, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ellipse 15.png"))); // NOI18N
        pnlAuthor.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("No. of Authors");
        pnlAuthor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Book Authors");
        pnlAuthor.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        pnlCenter.add(pnlAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 629, 260, 84));

        pnlBorrower.setBackground(new java.awt.Color(255, 255, 255));
        pnlBorrower.setPreferredSize(new java.awt.Dimension(214, 84));
        pnlBorrower.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLogo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Reader.png"))); // NOI18N
        pnlBorrower.add(iconLogo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 20, 30, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Book Readers");
        pnlBorrower.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        noreaders.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        noreaders.setText("No. of Readers");
        pnlBorrower.add(noreaders, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ellipse 15.png"))); // NOI18N
        pnlBorrower.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, -1, -1));

        pnlCenter.add(pnlBorrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 260, -1));

        pnlPublisher.setBackground(new java.awt.Color(255, 255, 255));
        pnlPublisher.setPreferredSize(new java.awt.Dimension(214, 84));
        pnlPublisher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLogo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group 1688.png"))); // NOI18N
        pnlPublisher.add(iconLogo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Book Sharer");
        pnlPublisher.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("No. of Sharer");
        pnlPublisher.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ellipse 15.png"))); // NOI18N
        pnlPublisher.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, -1, -1));

        pnlCenter.add(pnlPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 260, 84));

        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFeatured.setBackground(new java.awt.Color(255, 255, 255));

        lblDidYouRead.setBackground(new java.awt.Color(153, 153, 153));
        lblDidYouRead.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblDidYouRead.setForeground(new java.awt.Color(153, 153, 153));
        lblDidYouRead.setText("Did you read");

        lblFeaturedBookTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFeaturedBookTitle.setText("<html>\nThe Psychology \n<br>\nof Money");

        lblFeaturedBookAuthor.setBackground(new java.awt.Color(153, 153, 153));
        lblFeaturedBookAuthor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFeaturedBookAuthor.setForeground(new java.awt.Color(153, 153, 153));
        lblFeaturedBookAuthor.setText("Morgan Housel");

        btnRead.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRead.setForeground(new java.awt.Color(255, 255, 255));
        btnRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rate.png"))); // NOI18N
        btnRead.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnRead1.setBackground(new java.awt.Color(0, 10, 223));
        btnRead1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRead1.setForeground(new java.awt.Color(255, 255, 255));
        btnRead1.setText("Read Now");
        btnRead1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRead1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/morgan-housel-aZ_MmSmAcjg-unsplash (1).jpg"))); // NOI18N

        javax.swing.GroupLayout pnlFeaturedLayout = new javax.swing.GroupLayout(pnlFeatured);
        pnlFeatured.setLayout(pnlFeaturedLayout);
        pnlFeaturedLayout.setHorizontalGroup(
            pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFeaturedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRead)
                    .addComponent(lblDidYouRead)
                    .addComponent(lblFeaturedBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFeaturedBookAuthor)
                    .addComponent(btnRead1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFeaturedLayout.setVerticalGroup(
            pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeaturedLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFeaturedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFeaturedLayout.createSequentialGroup()
                        .addComponent(lblDidYouRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFeaturedBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFeaturedBookAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnRead1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRight.add(pnlFeatured, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 56, 320, 310));

        pnlCommunity.setBackground(java.awt.SystemColor.activeCaption);
        pnlCommunity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 196, 196), 1, true));
        pnlCommunity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJoin.setBackground(new java.awt.Color(0, 10, 223));
        btnJoin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnJoin.setForeground(new java.awt.Color(255, 255, 255));
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

        pnlRight.add(pnlCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 375, 320, 230));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 196, 196), 1, true));
        jPanel5.setPreferredSize(new java.awt.Dimension(84, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group 1683.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 70, 70));

        jLabel3.setBackground(new java.awt.Color(196, 196, 196));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rectangle 775.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, 50));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Subscribe now to our blog");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnViewMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMoreActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnRead1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRead1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRead1ActionPerformed

    private void iconLogo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLogo10MouseClicked
            Login log = new Login();
            log.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_iconLogo10MouseClicked

    private void btnBorrow13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrow13ActionPerformed
        // TODO add your handling code here:
        Borrower borrow = new Borrower();
        borrow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBorrow13ActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow12;
    private javax.swing.JButton btnBorrow13;
    private javax.swing.JButton btnBorrow14;
    private javax.swing.JButton btnBorrow15;
    private javax.swing.JButton btnBorrow16;
    private javax.swing.JButton btnBorrow3;
    private javax.swing.JButton btnBorrow4;
    private javax.swing.JButton btnBorrow6;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnRead1;
    private javax.swing.JButton btnViewMore;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JLabel iconLogo1;
    private javax.swing.JLabel iconLogo10;
    private javax.swing.JLabel iconLogo11;
    private javax.swing.JLabel iconLogo2;
    private javax.swing.JLabel iconLogo3;
    private javax.swing.JLabel iconLogo4;
    private javax.swing.JLabel iconLogo5;
    private javax.swing.JLabel iconLogo6;
    private javax.swing.JLabel iconLogo7;
    private javax.swing.JLabel iconLogo8;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jImage1;
    private javax.swing.JLabel jImage2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAuthor1;
    private javax.swing.JLabel lblAuthor2;
    private javax.swing.JLabel lblAuthor3;
    private javax.swing.JLabel lblAuthor4;
    private javax.swing.JLabel lblBook1;
    private javax.swing.JLabel lblBook2;
    private javax.swing.JLabel lblBook3;
    private javax.swing.JLabel lblBook4;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDidYouRead;
    private javax.swing.JLabel lblFeaturedBookAuthor;
    private javax.swing.JLabel lblFeaturedBookTitle;
    private javax.swing.JLabel lblPersonQuoted;
    private javax.swing.JLabel lblQuote;
    private javax.swing.JLabel lblQuoteOfTheDay;
    private javax.swing.JLabel lblRecommended;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel noreaders;
    private javax.swing.JPanel pnlAuthor;
    private javax.swing.JPanel pnlBookFeatured4;
    private javax.swing.JPanel pnlBookFeatured6;
    private javax.swing.JPanel pnlBookFeatured7;
    private javax.swing.JPanel pnlBookFeatured8;
    private javax.swing.JPanel pnlBookPreview3;
    private javax.swing.JPanel pnlBookPreview6;
    private javax.swing.JPanel pnlBookPreview7;
    private javax.swing.JPanel pnlBookPreview8;
    private javax.swing.JPanel pnlBorrower;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlCommunity;
    private javax.swing.JPanel pnlFeatured;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlPublisher;
    private javax.swing.JPanel pnlQuotation;
    private javax.swing.JPanel pnlQuoteOfTheDay;
    private javax.swing.JPanel pnlReco;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlUser1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
