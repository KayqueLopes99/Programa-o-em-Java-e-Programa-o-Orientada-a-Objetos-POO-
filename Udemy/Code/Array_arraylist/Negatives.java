package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer number of elements in the array: ");
        int number;
       

        while (true) {
            System.out.print("Enter the integer number of elements in the array(number <= 10) and not negative: ");
            number = scanner.nextInt();
            if (number <= 10 && number > 0) {
                break;
            }
        }

        int vector[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < number; i++) {
            if (vector[i] < 0) {
                System.out.println("The element " + (i + 1) + " is negative: " + vector[i]);
            }
        }
        

        scanner.close();
    }

}
