import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UapBazar {
    private List<Product> products;

    public UapBazar() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.display();
        }
    }

    public static void main(String[] args) {
        UapBazar store = new UapBazar();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n\t Welcome to Uap Bazar\n");
            System.out.println("\t1. Add product");
            System.out.println("\t2. Update price");
            System.out.println("\t3. View discounted price");
            System.out.println("\t4. View product details");
            System.out.println("\t5. View all products");
            System.out.println("\t0. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.println("Enter product id:");
                    String id = scanner.nextLine();

                    System.out.println("Enter product name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter product price:");
                    double price = scanner.nextDouble();

                    System.out.println("Enter product discount:");
                    double discount = scanner.nextDouble();

                    Product product = new Product(id, name, price, discount);
                    store.addProduct(product);
                    break;
                case 2:
                    System.out.println("Enter product id:");
                    id = scanner.nextLine();

                    System.out.println("Enter new price:");
                    price = scanner.nextDouble();

                    product = store.findProductById(id);
                    if (product != null)
                     {
                        product.setPrice(price);
                    } else 
                    {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter product id:");
                    id = scanner.nextLine();

                    product = store.findProductById(id);
                    if (product != null) 
                    {
                        System.out.println("Discounted price: " + product.getDiscountedPrice());
                    } else 
                    {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter product id:");
                    id = scanner.nextLine();

                    product = store.findProductById(id);
                    if (product != null)
                     {
                        product.display();
                    } else 
                    {
                        System.out.println("Product not found.");
                    }
                    break;
                case 5:
                    store.displayAllProducts();
                    break;
                case 0:
                    System.out.println("\t Thanks For Coming to Uap Bazar \n");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
            }
        }
    }
}