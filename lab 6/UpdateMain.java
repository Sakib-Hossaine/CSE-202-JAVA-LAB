package UapBazar;

import java.util.Scanner;

public class UpdateMain {
    public static void main(String[] args) {
        Items shop = new Items("UapBazar");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(a) 1 to view all");
            System.out.println("(b) 2 to view a specific item");
            System.out.println("(c) 3 to add item");
            System.out.println("(d) 4 to sell item");
            System.out.println("(e) 5 to see sale price of an item");
            System.out.println("(f) 0 to exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shop.viewItems();
                    break;
                case 2:
                    System.out.println("Enter item id:");
                    String id = scanner.next();
                    shop.viewItem(id);
                    break;
                case 3:
                    System.out.println("Enter item details (name, id, category, price, quantity):");
                    String name = scanner.next();
                    id = scanner.next();
                    String category = scanner.next();
                    double price = scanner.nextDouble();
                    int quantity = scanner.nextInt();
                    shop.addItem(name, id, category, price, quantity);
                    break;
                case 4:
                    System.out.println("Enter item id and quantity to sell:");
                    id = scanner.next();
                    quantity = scanner.nextInt();
                    shop.sellAnItem(id, quantity);
                    break;
                case 5:
                    System.out.println("Enter item id and sale amount:");
                    id = scanner.next();
                    double saleAmount = scanner.nextDouble();
                    double salePrice = shop.getSalePriceOfAnItem(id, saleAmount);
                    System.out.println("Sale price: " + salePrice);
                    break;
                case 0:
                    return;
            }
        }
    }
}