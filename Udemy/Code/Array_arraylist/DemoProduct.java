package Udemy.Code.Array_arraylist;

import java.util.Scanner;

import Udemy.Code.Produtos.Product;

public class DemoProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of products:");
        int quantity = scanner.nextInt();

        Product[] vector = new Product[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter product name:");
            String name = scanner.next();
            System.out.println("Enter product price:");
            double price = scanner.nextDouble();
            vector[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double average = sum / quantity;

        System.out.printf("Average price: %.2f", average);

        scanner.close();
    }
}
