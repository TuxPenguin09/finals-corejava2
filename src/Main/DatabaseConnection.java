package Main;

import java.sql.*;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String[] dbconn = {"jdbc:mysql://localhost:3306/finals", "username", "password"};
        return DriverManager.getConnection(dbconn[0], dbconn[1], dbconn[2]);
    }

    /*public static void getAllCustomers() throws SQLException { // Sample code
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM customers");
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
        con.close();
    }*/
}