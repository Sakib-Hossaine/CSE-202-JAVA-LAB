import java.util.Scanner;
public class UapBazar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        String name = scanner.nextLine();

        System.out.println("Enter product id:");
        String id = scanner.nextLine();

        System.out.println("Enter product category:");
        String category = scanner.nextLine();

        System.out.println("Enter product price:");
        double price = scanner.nextDouble();

        Product product = new Product(name, id, category, price);

        while (true) {
            System.out.println("1. Update price");
            System.out.println("2. discounted price");
            System.out.println("3. Display product ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter new price:");
                    double newPrice = scanner.nextDouble();
                    product.updatePrice(newPrice);
                    break;
                case 2:
                    System.out.println("Enter discount percentage:");
                    double discount = scanner.nextDouble();
                    System.out.println("Discounted price: " + product.getDiscountedPrice(discount));
                    break;
                case 3:
                    product.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}