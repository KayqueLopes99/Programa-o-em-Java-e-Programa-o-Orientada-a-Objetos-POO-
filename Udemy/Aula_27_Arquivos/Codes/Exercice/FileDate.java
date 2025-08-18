package Udemy.Aula_27_Arquivos.Codes.Exercice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDate {
    public static void main(String[] args) {
        String pathItens = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Aula_27_Arquivos\\Codes\\Exercice\\file.txt";
        
        String pathToSummary = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Aula_27_Arquivos\\Codes\\Exercice\\out\\summary.csv";

        List<Product> listProducts = new ArrayList<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathItens))){
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] listDateItem = line.split(",");
                String name = listDateItem[0];
                double price = Double.parseDouble(listDateItem[1]);

                int quantity = Integer.parseInt(listDateItem[2]);
                
                listProducts.add(new Product(name, price, quantity));

                
                line = bufferedReader.readLine();
                

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        
        }

        for (Product product : listProducts) {
            System.out.println(product);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToSummary, true))) {
            for (Product product : listProducts) {
                String line = product.getName() + ", " + (product.getPrice() * product.getQuantity());
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

