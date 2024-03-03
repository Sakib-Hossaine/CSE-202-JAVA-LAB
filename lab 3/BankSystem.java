import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:"); 
        String name = scanner.nextLine();

        System.out.println("Enter your account ID:");
        String id = scanner.nextLine();

        System.out.println("Enter your initial balance:");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, id, balance);

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        account.display();

        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Balance: " + account.getBalance());

        scanner.close();
    } 
}