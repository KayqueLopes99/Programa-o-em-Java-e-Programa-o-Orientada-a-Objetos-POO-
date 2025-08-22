package Udemy.Aula_28_Lambda_Programação_Funcional.Code;


import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.sort((p01, p02) -> p01.getName().toUpperCase().compareTo(p02.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
            
        }
        
    }
}