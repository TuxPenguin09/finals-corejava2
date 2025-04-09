package Cart;

import Main.*;

import java.util.List;

// Contributed by vogelante
public class Checkout {
    public static void processCheckout(List<Product> cartItems, double total) {
        if (cartItems.isEmpty()) {
            System.out.println("Cannot checkout, your cart is empty.");
            return;
        }

        // Print and save the receipt using PrintReceipt class
        Receipt.printReceipt(cartItems, total);

        // Clear the cart after checkout
        cartItems.clear();
        System.out.println("Checkout complete. Thank you!");
    }
}
