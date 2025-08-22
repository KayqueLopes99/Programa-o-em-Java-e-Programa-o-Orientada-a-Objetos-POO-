package Udemy.Aula_28_Lambda_Programação_Funcional.Code;
 
import java.util.List;
import java.util.ArrayList;

public class Predicate {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        // Predicado 
        list.removeIf(p -> p.getPrice() >= 100);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
