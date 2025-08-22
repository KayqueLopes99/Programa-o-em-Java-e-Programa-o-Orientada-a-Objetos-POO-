package Udemy.Aula_28_Lambda_Programação_Funcional.Code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class FunctionFunction {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // personalizado.
        double sum = filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Soma: " + sum);



    }

    // função com predicato(condição) no parametro
    public static double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
