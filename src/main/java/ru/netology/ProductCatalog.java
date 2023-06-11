package ru.netology;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> filterByKeyword(String keyword) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(keyword)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public List<Product> filterByPriceRange(double minPrice, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public List<Product> filterByManufacturer(String manufacturer) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getManufacturer().equals(manufacturer)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
