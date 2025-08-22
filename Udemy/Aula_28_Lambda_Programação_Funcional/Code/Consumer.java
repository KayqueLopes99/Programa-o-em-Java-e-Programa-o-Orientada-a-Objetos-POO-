package Udemy.Aula_28_Lambda_Programação_Funcional.Code;

import java.util.List;
import java.util.ArrayList;

public class Consumer {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // aumentando cada preço em 10%
        list.forEach(product -> product.setPrice(product.getPrice() + (product.getPrice() * 0.1)));

        // Impressão
        list.forEach(System.out::println);


    }
}
