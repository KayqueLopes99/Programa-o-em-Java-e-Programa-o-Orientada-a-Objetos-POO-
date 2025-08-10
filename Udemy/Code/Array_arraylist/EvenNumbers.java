package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class EvenNumbers {
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
        int evenCount = 0;
        int indexJ = 0;

        System.out.println("Enter " + quantity + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
                numbers[indexJ] = numbers[i];
                indexJ++;
            }
        }

        System.out.println("You entered " + evenCount + " even numbers.");
        if (evenCount == 0) {
            System.out.println("No even numbers were entered.");
        } else {
            System.out.print("Even numbers:");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(" " + numbers[i]);
            }
        }

        scanner.close();

    }
}
