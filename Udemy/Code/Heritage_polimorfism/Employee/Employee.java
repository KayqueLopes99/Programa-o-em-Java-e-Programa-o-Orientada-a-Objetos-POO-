package Udemy.Code.Heritage_polimorfism.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private String name;
    private int hours;
    private double valuePerHour;

    private static List<Employee> listEmployees = new ArrayList<>();

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return this.hours * this.valuePerHour;
    }

    public static void registerEmplyees(Scanner scanner) {

        System.out.print("Enter the number of employees: ");
        int quantityEmployeesForAdd = scanner.nextInt();
        int indexEmployees = 1;

        while (quantityEmployeesForAdd != 0) {
            System.out.println("Employee #" + indexEmployees + "  data:");

            System.out.print("Name: ");
            String nameEmployees = scanner.next();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("Outsourced (YES/NO)? ");
            String response1 = scanner.next().toUpperCase();

            scanner.nextLine();
            if (response1.equals("YES")) {
                System.out.print("Additional charge:: ");
                double additionalCharge = scanner.nextDouble();

                OutsourceEmployee employee = new OutsourceEmployee(nameEmployees, hours, valuePerHour, additionalCharge);
                employee.payment();
                employee.addEmployee(employee);
            }else{
                Employee employee = new Employee(nameEmployees, hours, valuePerHour);
                employee.addEmployee(employee);
            }

            quantityEmployeesForAdd--;
            indexEmployees++;

        }
        
        Employee.listPayments();

    }

    public void addEmployee(Employee employee) {
        boolean sucess = listEmployees.add(employee);
        if (sucess) {
            System.out.println("Funcionário adicionado na lista com sucesso.");
        } else {
            System.out.println("ERRO: não foi possível adicionar o Funcionário na lista.");
        }
    }

    public static void listPayments(){
        if (!listEmployees.isEmpty()) {
            for (Employee employee : listEmployees) {
            System.out.println(employee.getName() + " - " + employee.payment());
        }
        } else{
            System.out.println("Lista Vazia!");
        }
        
    }

}
