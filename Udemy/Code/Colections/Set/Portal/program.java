package Udemy.Code.Colections.Set.Portal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> listStudent = new HashSet<>();
        Student.registerStudents(scanner, listStudent);
        scanner.close();
    }
}
