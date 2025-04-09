package Main;

import java.sql.*;
import java.util.*;
import Cart.*;

public class Main {
    public static void ProductLists() {
        List<Product> products = ProductRepository.getALlProducts();

        System.out.println("\nProduct Catalog:");
        for (Product product : products) {
            product.displayDetails();
        }
    }

    public static void CartLists() {

    }

    private static Product findProductById(List<Product> products, int id) {
        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Connecting to MySQL database...");

        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Connected to the database!");

            List<Product> productCatalog = ProductRepository.getALlProducts();
            Cart cart = new Cart();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n=== E-Commerce Menu ===");
                System.out.println("1. Products List");
                System.out.println("2. Add to Cart");
                System.out.println("3. View Cart");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Products List logic
                        System.out.println("Products are here:");
                        ProductLists();
                        break;
                    case 2:
                        // Add to Cart logic
                        System.out.print("Enter product ID to add to cart: ");
                        int id = scanner.nextInt();
                        Product selected = findProductById(productCatalog, id);
                        if (selected != null) {
                            cart.addProduct(selected);
                        } else {
                            System.out.println("❌ Product not found.");
                        }
                        break;
                    case 3:
                        // Cart List logic
                        cart.showCart();
                        break;
                    case 4:
                        System.out.println("See you!");
                        return;
                    default:
                        System.out.println("Invalid option, please enter the right input");
                }
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
