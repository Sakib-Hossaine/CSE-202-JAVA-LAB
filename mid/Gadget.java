// Class: Gadget
public class Gadget {
    String brand;
    String model;
    double price;

    // constructor to initialize the variables
    public Gadget(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // method to return the brand of the gadget
    public String getBrand() {
        System.out.println("The brand of the gadget is: " + this.brand);
        return this.brand;
    }

    // method to update the price of the gadget
    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("The updated price of the gadget is: " + this.price);
    }

    // method to check if the gadget is affordable
    public boolean isAffordable() {
        boolean affordable = this.price <= 1000;
        System.out.println("Is the gadget affordable? " + affordable);
        return affordable;
    }
}