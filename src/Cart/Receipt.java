package Cart;

import Main.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

// Contributed by vogelante
public class Receipt {

    // Method to format and print the receipt
    public static void printReceipt(List<Product> cartItems, double total) {
        StringBuilder receipt = new StringBuilder();
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        receipt.append("===== RECEIPT =====\n");
        receipt.append("Date: ").append(timestamp).append("\n");
        receipt.append("---------------------\n");

        // Loop through the cart items and display details
        for (Product item : cartItems) {
            double itemPrice = item.getPrice();

            // Apply discount if the product is discountable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                itemPrice = discountableItem.applyDiscount(10);  // Example: 10% discount
            }

            receipt.append(item.getName())
                    .append(" - $")
                    .append(String.format("%.2f", itemPrice))
                    .append("\n");
        }

        receipt.append("---------------------\n");
        receipt.append("TOTAL: $").append(String.format("%.2f", total)).append("\n");
        receipt.append("=====================\n");

        // Print the receipt to console
        System.out.println(receipt.toString());

        // Save the receipt to a file
        saveReceiptToFile(receipt.toString());
    }

    // Method to save the receipt to a file
    private static void saveReceiptToFile(String receiptContent) {
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(receiptContent + "\n");
            System.out.println("🧾 Receipt saved to orders.txt.");
        } catch (IOException e) {
            System.out.println("⚠️ Failed to save receipt.");
            e.printStackTrace();
        }
    }
}