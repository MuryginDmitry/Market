package ru.netology;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
