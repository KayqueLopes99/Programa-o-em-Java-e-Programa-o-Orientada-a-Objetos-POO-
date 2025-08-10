package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer number of elements in the array: ");
        int number;
        int sum = 0;

        while (true) {
            System.out.print("Enter the integer number of elements in the array not negative: ");
            number = scanner.nextInt();
            if (number > 0) {
                break;
            }
        }

        double vector[] = new double[number];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
            sum += vector[i];
        }
    

        System.out.print("Values:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
            
        }
        double average = sum / vector.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);



        scanner.close();
    }

}
