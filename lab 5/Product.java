public class Product {
    private String id;
    private String name;
    private double price;
    private double discount;

    public Product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return price - (price * discount);
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Discount: " + discount);
    }
}