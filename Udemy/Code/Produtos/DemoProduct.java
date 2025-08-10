package Udemy.Code.Produtos;

import java.util.Scanner;

public class DemoProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product product1 = new Product(name, price, quantity);
        System.out.println("Quantity for add products in stock: ");
        quantity = scanner.nextInt();
        product1.addProducts(quantity);

         System.out.println("Quantity for remove products in stock: ");
        quantity = scanner.nextInt();
        product1.removeProducts(quantity);

        System.out.println(product1);

        product1.setPrice(15.55);
        product1.setName("Bolo gelado");
        product1.setQuantity(10);




        scanner.close();



    }
}
