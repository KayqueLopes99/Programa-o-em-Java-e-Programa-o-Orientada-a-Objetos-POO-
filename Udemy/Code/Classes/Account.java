package Udemy.Code.Classes;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Withdraw amount must be positive and less than or equal to the current balance.");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder +
                ", balance=" + String.format("%.2f", balance) +
                '}';
    }

}
