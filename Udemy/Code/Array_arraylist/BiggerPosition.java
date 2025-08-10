package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class BiggerPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        while (true) {
            System.out.print("Enter the quantity of numbers not negative: ");
            quantity = scanner.nextInt();
            if (quantity > 0) {
                break;
            }
        }

        int numbers[] = new int[quantity];

        System.out.println("Enter " + quantity + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int biggerNumber = numbers[0];
        int position = 0;


       System.out.print("Even numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(" " + numbers[i]);

                if (numbers[i] > biggerNumber) {
                    biggerNumber = numbers[i];
                    position = i;
                }
            }

        System.out.println("\nBigger number: " + biggerNumber);
        System.out.println("Position of the bigger number: " + position);
        




        // int bigger = max(numbers[0], numbers);
        scanner.close();        
    }
    
}
