package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class Aproved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        while (true) {
            System.out.print("Enter the quantity of students not negative: ");
            quantity = scanner.nextInt();
            if (quantity > 0) {
                break;
            }
        }
        Student vector[] = new Student[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.println(" ---> Student n" + (i + 1) + ": <---");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Grade 1: ");
            double grade1 = scanner.nextDouble();
            System.out.print("Grade 2: ");
            double grade2 = scanner.nextDouble();
            vector[i] = new Student(name, grade1, grade2);

        }

        System.out.println("Students Aproved:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].checkingAproved()) {
                System.out.println(vector[i].getName());
            }
        }

        scanner.close();
    }
}
