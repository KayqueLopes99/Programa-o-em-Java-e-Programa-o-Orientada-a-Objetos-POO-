package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int quantity = 0;

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
            if (vector[i] % 2 == 0) {
                sum += vector[i];
                quantity++;
            }

        }

        double average = 0.0;
        if (sum != 0) {
            average = sum / quantity;
            System.out.println("Average: " + average);

            System.out.print("Values even average:");
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] % 2 == 0) {
                    System.out.print(" " + vector[i]);
                }
            }
        } else {
            System.out.println("NO EVEN NUMBER!");
        }

        scanner.close();
    }
}
