package Udemy.Code.Lista_Matriz.ListOfEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoEmployes {
    public static void main(String[] args) {
        List<Employees> listEmployees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int quantity;
        while (true) {
            System.out.print("Enter the quantity of employees not negative: ");
            quantity = scanner.nextInt();
            if (quantity > 0) {
                break;
            }
        }

        for (int i = 0; i < quantity; i++) {
            System.out.println("Date employees #" + (i + 1));

            int id;
            while (true) {
                System.out.print("ID: ");
                id = scanner.nextInt();

                boolean exists = false;
                for (Employees e : listEmployees) {
                    if (e.getId() == id) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    break;
                } else {
                    System.out.println("ID já existente! Digite outro.");
                }
            }

            System.out.print("NAME: ");
            String name = scanner.next();

            System.out.print("SALARY: ");
            double salary = scanner.nextDouble();

            Employees employees = new Employees(id, name, salary);

            while (true) {
                System.out.print("Deseja aumentar o salário antes de adicionar? (s/n): ");
                String answer = scanner.next().toLowerCase();

                if (answer.equals("s")) {
                    System.out.print("Informe o percentual de aumento: ");
                    double percent = scanner.nextDouble();
                    employees.increaseSalary(percent);
                    break;
                } else if (answer.equals("n")) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite 's' ou 'n'.");
                }
            }

            listEmployees.add(employees);
        }


        System.out.println("List of employees:");
        for (Employees employees : listEmployees) {
            System.out.println(employees);
        }

        scanner.close();

    }
}
