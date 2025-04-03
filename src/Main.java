import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String[] dbconn = {"jdbc:mysql://localhost:3306/finals", "username", "password"};

        System.out.println("Connecting to MySQL database...");

        try (Connection connection = DriverManager.getConnection(dbconn[0], dbconn[1], dbconn[2])) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database", e);
        }
    }
}
