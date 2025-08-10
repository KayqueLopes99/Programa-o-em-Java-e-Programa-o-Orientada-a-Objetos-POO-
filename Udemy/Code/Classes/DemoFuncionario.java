package Udemy.Code.Classes;

import java.util.Scanner;

public class DemoFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Gross salary:");
        double grossSalary = scanner.nextDouble();
        System.out.println("Tax:");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary?");
        double percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee);

        scanner.close();
    }
}
