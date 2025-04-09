package Main;

import java.sql.*;
import java.util.*;

public class Main {

    public static void ProductLists() {
        List<Product> products = ProductRepository.getALlProducts();

        System.out.println("\nProduct Catalog:");
        for (Product product : products) {
            product.displayDetails();
        }
    }

    public static void main(String[] args) {
        System.out.println("Connecting to MySQL database...");

        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Connected to the database!");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n=== E-Commerce Menu ===");
                System.out.println("1. Products List");
                System.out.println("2. Cart []");
                System.out.println("3. Exit");
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Products List logic
                        System.out.println("Products are here:");
                        ProductLists();
                        break;
                    case 2:
                        // Cart List logic
                        System.out.println("You don't have anything in the cart");
                        break;
                    case 3:
                        System.out.println("See you!");
                        return;
                    default:
                        System.out.println("Invalid option, please enter the right input");
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
