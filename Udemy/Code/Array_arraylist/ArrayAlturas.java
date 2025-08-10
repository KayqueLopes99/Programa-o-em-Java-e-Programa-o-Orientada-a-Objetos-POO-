package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class ArrayAlturas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas alturas você quer informar? ");
        int numHeights = scanner.nextInt();
        double[] heights = new double[numHeights];
        double sum= 0.0;

        for (int i = 0; i < numHeights; i++) {
            System.out.print("Informe a altura " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            sum += heights[i];
        }

        double average = sum /= numHeights;
        System.out.println("Heights informed:");
        for (int i = 0; i < numHeights; i++) {
            System.out.printf("Height  %d: %.2f\n", (i + 1), heights[i]);
        }
        System.out.printf("Average Height: %.2f%n", average);


        scanner.close();

    }
}
