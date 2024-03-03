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

       
       
       
        int option;
        Menu:
        while(true){
            System.out.println("Please Enter 1 to Deposit, Enter 2 to Withdraw,Enter 3 to Check Balance, 4 watch Details, Enter 0 to exit");
            option=scanner.nextInt();
            switch (option) {
                case 1:
                System.out.println("Enter amount to deposit:");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                    break;
            case 2:
            System.out.println("Enter amount to withdraw:");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            break;
            
            case 3:
            System.out.println("Show Balance");
            System.out.println("Balance: " + account.getBalance());
            break;
            case 4:
            System.out.println("Details of your Account");
            account.display();
            break ;
            case 0:
            break Menu;

                default:
                System.out.println("Your Option Is INVALID ");
                    break;
            }
        }

        

      
       
       

       

        scanner.close();
    } 
}