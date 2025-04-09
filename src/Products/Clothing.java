package Products;

import Main.*;

// Contributed by reiji
public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(int id, String name, String description, double price, int stockQuantity, String category, String brand) {
        super(id, name, description, price, stockQuantity, category, brand);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + name + " | Size: " + size +
                " | Material: " + material + " | Price: $" + price);
    }
}