package Udemy.Code.Lambda.Products;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/*
Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio.
 */
public class ReadProducts {
    public static void main(String[] args) {
        String path = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Code\\Lambda\\Products\\file.csv";
        double _sum = 0.0;

        List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            String fields[];

            while (line != null) {
                System.out.println(line);
                fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }

        _sum = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);

        double priceMedia = _sum / products.size();

        System.out.println("Produtos: ");

        products.stream()
                .filter(p -> p.getPrice() < priceMedia)
                .sorted((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()))
                .forEach(System.out::println);

        System.out.printf("Media dos preços: %.2f", priceMedia);

    }
}
