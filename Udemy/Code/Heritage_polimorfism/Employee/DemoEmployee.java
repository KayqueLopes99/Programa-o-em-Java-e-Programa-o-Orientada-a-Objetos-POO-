package Udemy.Code.Heritage_polimorfism.Employee;

import java.util.Scanner;

public class DemoEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee.registerEmplyees(scanner);

        scanner.close();
    }
}
