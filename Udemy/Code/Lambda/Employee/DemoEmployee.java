package Udemy.Code.Lambda.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoEmployee {
    public static void main(String[] args) {
        String path = "C:\\Users\\kaiqu\\OneDrive\\Imagens\\Programa-o-em-Java-e-Programa-o-Orientada-a-Objetos-POO-\\Udemy\\Code\\Lambda\\Employee\\file.csv";
        double _sum = 0.0;
        List<Employees> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            String fields[];

            while (line != null) {
                fields = line.split(",");
                list.add(new Employees(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();

            }

            _sum = list.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(Employees::getSalary)
                    .reduce(0.0, Double::sum);
            
            
            List<Employees> list2 = list.stream().filter(e -> e.getName().charAt(0) == 'M').collect(Collectors.toList());


            double priceMedia = list2.isEmpty() ? 0.0 : _sum / list2.size();


            System.out.print("Enter salary: ");
            double value = scanner.nextDouble();
            System.out.println("Email of people whose salary is more than " + value + ":");
            list.stream()
                .filter(e -> e.getSalary() > value)
                .sorted((e1, e2) -> e1.getEmail().compareToIgnoreCase(e2.getEmail()))
                .forEach(e -> System.out.println(e.getEmail()));


            
            System.out.println("Sum of salary of people whose name starts with 'M': " + priceMedia);
                    



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }

        scanner.close();

    }
}
