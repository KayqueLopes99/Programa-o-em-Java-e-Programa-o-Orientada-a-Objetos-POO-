package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        double average = sum / vector.length;

        
        System.out.println("Average: " + average);

        System.out.print("Values below average:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < average) {
                System.out.print(" " + vector[i]);
            }

           
        }

        scanner.close();
    }

}
