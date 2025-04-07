package Main;

import java.util.*;

public class ShoppingCart<T extends Product> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void showCart() {
        for (T item : items) {
            item.displayDetails();
        }
    }
}