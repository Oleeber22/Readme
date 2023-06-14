

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author florence
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_1 {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/readmedb";
        String username = "root";
        String password = "";
// Loading the driver (optional for Java 6 and above)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load MySQL JDBC driver.");
            return;
        }
// Establishing the connection
        try {
            Connection connection;
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");
// Closing the connection
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }
}
