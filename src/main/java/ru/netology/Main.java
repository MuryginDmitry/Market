package ru.netology;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Добавляем товары в каталог
        catalog.addProduct(new Product("iPhone", 1000.0, "Apple"));
        catalog.addProduct(new Product("Galaxy", 800.0, "Samsung"));
        catalog.addProduct(new Product("Pixel", 700.0, "Google"));

        Shop shop = new Shop(catalog);

        // Вывод доступных товаров
        shop.displayAvailableProducts();

        // Фильтрация товаров по ключевому слову
        shop.searchProducts("iPhone");

        // Фильтрация товаров по диапазону цен
        shop.filterProductsByPrice(700.0, 900.0);

        // Фильтрация товаров по производителю
        shop.filterProductsByManufacturer("Samsung");

        // Создание корзины пользователя
        ShoppingCart cart = shop.createShoppingCart();
        cart.addItem(catalog.getProducts().get(0));  // Добавляем товар в корзину
        cart.addItem(catalog.getProducts().get(1));
        System.out.println("Total price: $" + cart.calculateTotalPrice());
    }
}