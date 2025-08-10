package Udemy.Code.Classes;

import java.util.Scanner;

public class DemoStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Grade 1: ");
        double grade1 = scanner.nextDouble();
        System.out.print("Grade 2: ");
        double grade2 = scanner.nextDouble();
        System.out.print("Grade 3: ");
        double grade3 = scanner.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);
        System.out.println(student);
        student.checkingAproved();

        scanner.close();
    }
}
