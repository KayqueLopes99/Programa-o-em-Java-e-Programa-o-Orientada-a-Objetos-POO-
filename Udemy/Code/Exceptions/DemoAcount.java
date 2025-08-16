package Udemy.Code.Exceptions;

import java.util.Scanner;

public class DemoAcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accounts.registerAccount(scanner);
        scanner.close();
    }
}
