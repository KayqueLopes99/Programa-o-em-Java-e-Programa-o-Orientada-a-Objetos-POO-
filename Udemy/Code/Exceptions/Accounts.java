package Udemy.Code.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Accounts {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Accounts(int number, String holder, double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        if (amount > this.withdrawLimit) {
            throw new IllegalArgumentException("The amount exceeds withdraw limit");
        }

        this.balance -= amount;
        return true;

    }

    public static void registerAccount(Scanner scanner) {
    System.out.println("Enter account data: ");

    int number = intVerification(scanner);

    System.out.print("Holder name: ");
    String holderName = scanner.nextLine();

    double initialDeposit = doubleVerification(scanner, "Initial balance: ");
    double withdrawLimit = doubleVerification(scanner, "Withdraw limit: ");

    Accounts account = new Accounts(number, holderName, initialDeposit, withdrawLimit);

    System.out.println("\nAccount created successfully:");
    System.out.println(account);

    // ---- Depósito ----
    boolean depositSuccess = false;
    while (!depositSuccess) {
        try {
            double depositValue = doubleVerification(scanner, "Enter a deposit value: ");
            depositSuccess = account.deposit(depositValue); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    System.out.println("Updated account data after deposit:\n" + account);

    // ---- Saque ----
    boolean withdrawSuccess = false;
    while (!withdrawSuccess) {
        try {
            double withdrawValue = doubleVerification(scanner, "Enter amount for withdraw: ");
            withdrawSuccess = account.withdraw(withdrawValue); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    System.out.println("Updated account data after withdraw:\n" + account);
}


    public static double doubleVerification(Scanner scanner, String text) {
        while (true) {
            try {
                System.out.print(text);
                String input = scanner.nextLine().trim().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!\n");
            }
        }
    }

    public static int intVerification(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Number: ");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number <= 0) {
                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                }

                return number;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido!");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Double getWithdraw() {
        return withdrawLimit;
    }

    public void setWithdraw(Double withdraw) {
        this.withdrawLimit = withdraw;
    }

    @Override
    public String toString() {
        return "Accounts [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
                + withdrawLimit + "]";
    }

}
