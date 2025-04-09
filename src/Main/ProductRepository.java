package Main;

import Products.GenericProduct;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public static List<Product> getALlProducts() {
        List<Product> productList = new ArrayList<>();
        String query = "SELECT * FROM products";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Product product = new GenericProduct(
                        rs.getInt("product_id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getInt("stock_quantity"),
                        rs.getString("category"),
                        rs.getString("brand")
                );
                productList.add(product);
            }

        } catch (SQLException e) {
            System.out.println("Error fetching products: " + e.getMessage());
        }

        return productList;
    }
}
