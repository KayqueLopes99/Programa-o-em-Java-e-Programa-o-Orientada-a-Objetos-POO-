package Udemy.Code.Classes;
import java.util.Scanner;
public class DemoDolarsCotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = scanner.nextDouble();
        double result = CurrencyConverter.convertToReal(dollarPrice, amount);
        System.out.println("Amount to be paid in reais: " +  result);
        scanner.close();

    }
}
