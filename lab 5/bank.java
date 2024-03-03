package bank;

import java.util.Scanner;

public class bank {
    private static BankAccount[] accounts = new BankAccount[10];
    private static int accountCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1: Create new account");
            System.out.println("2: Deposit money");
            System.out.println("3: Withdraw money");
            System.out.println("4: Display balance");
            System.out.println("5: Display account details");
            System.out.println("6: Display all accounts");
            System.out.println("0: Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    accounts[accountCount++] = new BankAccount(name, balance);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.next();
                    BankAccount account = findAccount(accNum);
                    if (account == null) {
                        System.out.println("Account not found");
                    } else {
                        if (option == 2) {
                            System.out.print("Enter deposit amount: ");
                            double deposit = scanner.nextDouble();
                            account.deposit(deposit);
                        } else if (option == 3) {
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawal = scanner.nextDouble();
                            account.withdraw(withdrawal);
                        } else if (option == 4) {
                            System.out.println("Balance: " + account.getBalance());
                        } else {
                            System.out.println(account);
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < accountCount; i++) {
                        System.out.println(accounts[i]);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);

        scanner.close();
    }

    private static BankAccount findAccount(String accNum) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccNum().equals(accNum)) {
                return accounts[i];
            }
        }
        return null;
    }
}