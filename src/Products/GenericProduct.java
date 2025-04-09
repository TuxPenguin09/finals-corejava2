package Products;
import Main.Product;

public class GenericProduct extends Product {

    public GenericProduct(int productId, String name, String description, double price, int stockQuantity, String category, String brand) {
        super(productId, name, description, price, stockQuantity, category, brand);
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + productId + " - " + name + " (" + brand + ") - $" + price);
        System.out.println("   Category: " + category + " | Stock: " + stockQuantity);
        System.out.println("   Description: " + description + "\n");
    }
}