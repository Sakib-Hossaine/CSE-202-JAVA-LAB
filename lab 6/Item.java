package store;

import java.util.ArrayList;

public class Item {
    private String name;
    private String id;
    private String category;
    private double price;
    private int quantity;

    public Item(String name, String id, String category, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    

    public double getSalePrice(double saleAmount) {
        return price - (price * saleAmount / 100);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}