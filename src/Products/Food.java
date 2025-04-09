package Products;

import Main.*;

// Contributed by reiji
public class Food extends Product {
    private String expiryDate;
    private boolean isPerishable;

    public Food(int id, String name, String description, double price, int stockQuantity, String category, String brand) {
        super(id, name, description, price, stockQuantity, category, brand);
        this.expiryDate = expiryDate;
        this.isPerishable = isPerishable;
    }

    @Override
    public void displayDetails() {
        System.out.println("Food: " + name + " | Expires: " + expiryDate +
                " | Perishable: " + (isPerishable ? "Yes" : "No") +
                " | Price: $" + price);
    }
}