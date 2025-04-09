package Products;

import Main.*;

// Contributed by reiji
public class Kitchenware extends Product {
    private String material;
    private boolean isDishwasherSafe;

    public Kitchenware(int id, String name, String description, double price, int stockQuantity, String category, String brand) {
        super(id, name, description, price, stockQuantity, category, brand);
        this.material = material;
        this.isDishwasherSafe = isDishwasherSafe;
    }

    @Override
    public void displayDetails() {
        System.out.println("Kitchenware: " + name + " | Material: " + material +
                " | Dishwasher Safe: " + (isDishwasherSafe ? "Yes" : "No") +
                " | Price: $" + price);
    }
}