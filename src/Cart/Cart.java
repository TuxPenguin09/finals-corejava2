package Cart;
import java.util.*;
import Main.*;

public class Cart {
    private List<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        cartItems.add(product);
        System.out.println("Added to cart: " + product.getName());
    }

    public double getTotal() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void showCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\nYour Shopping Cart:");
        for (Product item : cartItems) {
            item.displayDetails();
        }
        System.out.println("Total: $" + getTotal());

        try {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println("1. Checkout");
                System.out.println("2. Back");
                System.out.print("Choose option: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Checkout.processCheckout(cartItems, getTotal());
                        cartItems.clear();
                        running = false;
                        break;
                    case 2:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option, please enter the right input");
                }
            }
        } catch (Exception e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
