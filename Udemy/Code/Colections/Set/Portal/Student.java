package Udemy.Code.Colections.Set.Portal;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;


public class Student {
    private int codeNumber;

    public Student(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codeNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (codeNumber != other.codeNumber)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [codeNumber=" + codeNumber + "]";
    }

    public static void registerStudents(Scanner scanner, Set<Student> studentsList){
        int quantityA = intVerification(scanner, "How many students for course A? ");

        for (int index = 0; index < quantityA; index++) {
            int code = intVerification(scanner, "Code #" + (index+1) + ": ");
            studentsList.add(new Student(code));
        }

        int quantityB = intVerification(scanner, "How many students for course B? ");

        for (int index = 0; index < quantityB; index++) {
            int code = intVerification(scanner, "Code #" + (index+1) + ": ");
            studentsList.add(new Student(code));
        }

        int quantityC = intVerification(scanner, "How many students for course C? ");

        for (int index = 0; index < quantityC; index++) {
            int codeA = intVerification(scanner, "Code #" + (index+1) + ": ");
            studentsList.add(new Student(codeA));
        }

        System.out.println("Total Students: " + studentsList.size());





    }

    public static int intVerification(Scanner scanner, String text) {
        while (true) {
            try {
                System.out.print(text);
                int Number = scanner.nextInt();
                scanner.nextLine();

                if (Number <= 0) {
                    throw new IllegalArgumentException("O número do contrato deve ser maior que zero.");
                }


                return Number;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido!");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
