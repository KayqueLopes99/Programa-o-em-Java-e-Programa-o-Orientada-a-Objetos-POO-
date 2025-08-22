package Udemy.Aula_28_Lambda_Programação_Funcional.Code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functionn {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        /*
         * • Conversões:
         * • List para stream: list.stream()
         * • Stream para List: .collect(Collectors.toList())
         */

        // a função map pega na lista de valores e aplica uma função em cada. 
        //stream conjunto de dados.


        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);



        // Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos
        // preços somente dos produtos cujo nome começa com "T".

    }
}
