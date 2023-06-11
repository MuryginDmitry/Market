package ru.netology;

import java.util.List;

class Shop {
    private ProductCatalog catalog;

    public Shop(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public void displayAvailableProducts() {
        for (Product product : catalog.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void searchProducts(String keyword) {
        List<Product> filteredProducts = catalog.filterByKeyword(keyword);
        for (Product product : filteredProducts) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void filterProductsByPrice(double minPrice, double maxPrice) {
        List<Product> filteredProducts = catalog.filterByPriceRange(minPrice, maxPrice);
        for (Product product : filteredProducts) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void filterProductsByManufacturer(String manufacturer) {
        List<Product> filteredProducts = catalog.filterByManufacturer(manufacturer);
        for (Product product : filteredProducts) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public ShoppingCart createShoppingCart() {
        return new ShoppingCart();
    }
}
