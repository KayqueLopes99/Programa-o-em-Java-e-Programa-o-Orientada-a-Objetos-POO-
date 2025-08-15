package Udemy.Code.Heritage_polimorfism.Product;

import java.util.Scanner;

public class DemoProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product.registerProducts(scanner);
        scanner.close();
    }
}
