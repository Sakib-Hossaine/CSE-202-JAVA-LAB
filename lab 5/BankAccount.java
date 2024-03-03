package bank;

import java.util.Random;

public class BankAccount {
    private String name;
    private String accNum;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accNum = String.format("%06d", new Random().nextInt(999999));
    }

    public void deposit(double depAmount) {
        this.balance += depAmount;
    }

    public void withdraw(double withAmount)
     {
        if (this.balance >= withAmount)
         {
            this.balance -= withAmount;
        }
         else 
        {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccNum() {
        return this.accNum;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "; AccNum: " + this.accNum + "; Balance: " + this.balance;
    }
}