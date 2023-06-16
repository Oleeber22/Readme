import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUD {
    private static String url = "jdbc:mysql://localhost:3306/database_name";
    private static String username = "your_username";
    private static String password = "your_password";

    public static String result;
    public static PreparedStatement stmt;
    public static ResultSet rs;

    public static void create(String sql) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            stmt = con.prepareStatement(sql);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                JOptionPane.showMessageDialog(null, "Data failed to insert.", "Error",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data has been successfully inserted",
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void reload(String sql, Object dgv) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            ((javax.swing.JTable) dgv).setModel(buildTableModel(rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void count(String sql, javax.swing.JLabel value) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String dataValue = rs.getString(1);
                value.setText(dataValue);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void populate(String sql, javax.swing.JComboBox<String> combo,
            String id, String display) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            combo.removeAllItems();
            while (rs.next()) {
                String itemID = rs.getString(id);
                String itemDisplay = rs.getString(display);
                combo.addItem(new ComboItem(itemID, itemDisplay));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
               

