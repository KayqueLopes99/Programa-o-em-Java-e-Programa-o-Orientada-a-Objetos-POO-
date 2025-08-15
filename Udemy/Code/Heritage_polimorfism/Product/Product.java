package Udemy.Code.Heritage_polimorfism.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;

    private static List<Product> listProducts = new ArrayList<>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String priceTag() {
        return this.name + " R$ " + this.price;
    }

    public static void registerProducts(Scanner scanner) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int quantityItensForAdd = scanner.nextInt();
        scanner.nextLine();
        int indexProducts = 1;

        while (quantityItensForAdd > 0) {
            System.out.println("Product #" + indexProducts + "  data:");
            System.out.print("Product Name: ");
            String nameProduct = scanner.nextLine();

            System.out.print("Product Price: ");
            double priceProduct = scanner.nextDouble();
            scanner.nextLine();

            String response1 = "";

            while (!(response1.equals("COMMON") || response1.equals("USED") || response1.equals("IMPORTED"))) {
                System.out.print("Common, used or imported (COMMON/USED/IMPORTED)? ");
                response1 = scanner.nextLine().toUpperCase();
            }

            if (response1.equals("COMMON")) {
                Product.addProduct(new Product(nameProduct, priceProduct));

            } else if (response1.equals("USED")) {

                LocalDate date = null;
                while (date == null) {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String dateStr = scanner.nextLine();
                    try {
                        date = LocalDate.parse(dateStr, formatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida! Use o formato DD/MM/YYYY.");
                    }
                }

                Product.addProduct(new UsedProduct(nameProduct, priceProduct, date));

            } else if (response1.equals("IMPORTED")) {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                scanner.nextLine();
                Product.addProduct(new ImportedProduct(nameProduct, priceProduct, customsFee));
            }

            quantityItensForAdd--;
            indexProducts++;
        }

        Product.listProducts();
    }

    public static void addProduct(Product product) {
        boolean sucess = listProducts.add(product);
        if (sucess) {
            System.out.println("Produto adicionado na lista com sucesso.");
        } else {
            System.out.println("ERRO: não foi possível adicionar o produto na lista.");
        }
    }

    public static void listProducts() {
        if (!listProducts.isEmpty()) {
            System.out.println("---- Prices Tags ----");
            for (Product product : listProducts) {
                System.out.println(product.priceTag());
            }

        } else {
            System.out.println("Nenhum pedido cadastrado na lista.");
        }
    }

}
