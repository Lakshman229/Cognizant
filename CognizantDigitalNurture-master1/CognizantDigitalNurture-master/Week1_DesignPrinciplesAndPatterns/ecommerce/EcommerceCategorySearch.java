package ecommerce;

import java.util.*;

public class EcommerceCategorySearch {

    // Inner Product class with category
    static class Product {
        int id;
        String name;
        String category;
        double price;

        Product(int id, String name, String category, double price) {
            this.id = id;
            this.name = name;
            this.category = category;
            this.price = price;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Category: " + category + ", Price: ₹" + price;
        }
    }

    public static void main(String[] args) {
        // Sample product catalog
        List<Product> products = Arrays.asList(
            new Product(101, "Samsung TV", "Electronics", 45000),
            new Product(102, "Nike Sneakers", "Fashion", 6500),
            new Product(103, "iPad Air", "Electronics", 56000),
            new Product(104, "Jeans - Levi's", "Fashion", 2500),
            new Product(105, "Data Structures Book", "Books", 499),
            new Product(106, "Bluetooth Speaker", "Electronics", 2999),
            new Product(107, "Harry Potter Set", "Books", 1599)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("📂 Enter category to search (e.g. Electronics, Fashion, Books): ");
        String inputCategory = scanner.nextLine().trim().toLowerCase();

        // Display matching products
        boolean found = false;
        System.out.println("\n📦 Products in '" + inputCategory + "' category:");
        for (Product p : products) {
            if (p.category.toLowerCase().equals(inputCategory)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No products found in that category.");
        }

        scanner.close();
    }
}
