public class BankAccount {
    private String name;
    private String id;
    private double balance;
    private static final double MIN_BALANCE = 100.0;

    public BankAccount(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double depAmount) {
        this.balance += depAmount;
    }

    public void withdraw(double withAmount) {
        if (this.balance - withAmount >= MIN_BALANCE) 
        {
            this.balance -= withAmount;
        } else
         {
            System.out.println("\t=================Sakib Bank Limited=================\n");
            System.out.println("\tInsufficient balance.\n \tYou must have a minimum balance " + MIN_BALANCE);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void display() {
        System.out.println("\tName: " + this.name + ";\n \tId: " + this.id + ";\n \tBalance: " + this.balance);
        System.out.println("\t=================Thank You=================\n");
    }
}