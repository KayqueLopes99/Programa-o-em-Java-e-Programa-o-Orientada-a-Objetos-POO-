package Udemy.Code.Abstract.TaxPayer;
import java.util.Scanner;

public class DemoTaxPayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxPayer.registerTaxPayers(scanner);
        scanner.close();
    }
}
