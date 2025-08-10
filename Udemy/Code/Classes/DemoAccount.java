package Udemy.Code.Classes;

import java.util.Scanner;

public class DemoAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("holder name: ");
        String holderName = scanner.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");

        String response = scanner.next().toLowerCase();
        scanner.nextLine();

        Account account = new Account(number, holderName);

        if (response.equals("y")) {
            System.out.println("Initial deposit value:");
            double initialDeposit = scanner.nextDouble();
            account.setBalance(initialDeposit);
            System.out.println("Account data: " + account);

        }

        System.out.println("Enter a deposit value:");
        double depositValue = scanner.nextDouble();

        account.deposit(depositValue);
        System.out.println("Updated account data:\n" + account);

        System.out.println("Enter a withdraw value:");
        double withdrawValue = scanner.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:\n" + account);
        scanner.close();

    }

}
