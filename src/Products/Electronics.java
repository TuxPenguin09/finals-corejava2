package Products;

import Main.*;

public class Electronics extends Product implements Discountable {
    private final String brand;

    public Electronics(int id, String name, String description, double price, int stockQuantity, String category, String brand) {
        super(id, name, description, price, stockQuantity, category, brand);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + " | Brand: " + brand);
    }

    @Override
    public double applyDiscount(double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}
