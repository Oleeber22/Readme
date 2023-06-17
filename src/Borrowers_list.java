
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author PENELOPY
 */
public class Borrowers_list extends javax.swing.JPanel {

    /**
     * Creates new form Borrowers_list
     */
    public Borrowers_list() {
        initComponents();
         Connection con;
        Statement st;
        ResultSet rs;
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/readmedb","root","");
            st = con.createStatement();
            rs = st.executeQuery("Select * from books");
            while(rs.next()){
                
                String Fullname = rs.getString("fullname");
                String date = rs.getString("DATE");
                String id = String.valueOf(rs.getInt("ID"));
                String status = rs.getString("STATUS");
                
                String tbData[] = {Fullname, date, id, status};
                DefaultTableModel tblModel = (DefaultTableModel)tblTable.getModel();
                
                tblModel.addRow(tbData);
            }
        }
        catch(ClassNotFoundException ex){
            System.err.println("Connection error: ");
        } catch (SQLException ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBorrowedbooks = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        pnlLeft = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        iconLogo1 = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        lblStatistics = new javax.swing.JLabel();
        lblFriends = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        iconLogo11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        lblBorrowedbooks.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblBorrowedbooks.setText("Borrowed Books");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(113, 113, 122));
        jLabel3.setText("This is a list of Iborrowers.");

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Name", "DATE & TIME", "Student ID", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblTable);

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setToolTipText("leftPanel");
        pnlLeft.setName("pnlLeft"); // NOI18N

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dashboard1.png"))); // NOI18N

        iconLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo-01 2.png"))); // NOI18N

        lblSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group_1.png"))); // NOI18N

        lblRate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector (1).png"))); // NOI18N

        lblStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Group 1698.png"))); // NOI18N

        lblFriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Friends.png"))); // NOI18N

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logout.png"))); // NOI18N

        iconLogo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Vector 16.png"))); // NOI18N

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDashboard)
                    .addComponent(lblStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(iconLogo11))
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(pnlLeftLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLeftLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblFriends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iconLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLogo11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblBorrowedbooks)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBorrowedbooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLogo1;
    private javax.swing.JLabel iconLogo11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBorrowedbooks;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblFriends;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblStatistics;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JTable tblTable;
    // End of variables declaration//GEN-END:variables
}
