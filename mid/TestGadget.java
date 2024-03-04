// Class: TestGadget
public class TestGadget {
    public static void main(String[] args) {
        // creating an object of the Gadget class
        Gadget myGadget = new Gadget("Samsung", "Galaxy S20", 999.99);

        // calling the setPrice method
        myGadget.setPrice(1100);

        // calling the isAffordable method and printing the output
        System.out.println("Is the gadget affordable? " + myGadget.isAffordable());
    }
}