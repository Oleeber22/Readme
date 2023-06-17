/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Judy
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDConnection {
    private static String url = "jdbc:mysql://localhost:3306/readmedb";
    private static String username = "root";
    private static String password = "";
    private static Connection conn = null;

    public static void create(String sql) {
        try {
            conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            int result = stmt.executeUpdate();

            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Data failed to insert.", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data has been successfully inserted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public static void reload(String sql, JTable table, int numberOfColumns) {
        try {
            conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = new Object[numberOfColumns]; // Specify the number of columns
                // Populate the row with data from the ResultSet
                // Example: row[0] = rs.getObject("column_name");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public static int count(String sql) {
    int count = 0;
    try {
        conn = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            count = rs.getInt(1); // Assuming the count value is in the first column
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        closeConnection();
    }
    return count;
}

    public static void populate(String sql, JComboBox<String> combo, String id, String display) {
        try {
            conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            combo.removeAllItems();

            while (rs.next()) {
                String value = rs.getString(display);
                combo.addItem(value);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    private static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}