package Main;

public abstract class Product {
    protected int productId;
    protected String name;
    protected String description;
    protected double price;
    protected int stockQuantity;
    protected String category;
    protected String brand;

    public Product(int productId, String name, String description, double price, int stockQuantity, String category, String brand) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.brand = brand;
    }

    public abstract void displayDetails();
}