import java.util.Scanner;

public class Product {
    private String name;
    private String id;
    private String category;
    private double price;

    public Product(String name, String id, String category, double price) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscountedPrice(double discountPercentage) {
        return this.price * (1 - discountPercentage / 100);
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Category: " + this.category);
        System.out.println("Price: " + this.price);
    }
}