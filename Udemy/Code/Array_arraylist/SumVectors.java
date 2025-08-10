package Udemy.Code.Array_arraylist;
import java.util.Scanner;


public class SumVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the vectors: ");
        int size = scanner.nextInt();
        int vectorA[] = new int[size];
        int vectorB[] = new int[size];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Enter the value " + (i + 1) + " of vector A: ");
            vectorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vectorB.length; i++) {
            System.out.print("Enter the value " + (i + 1) + " of vector B: ");
            vectorB[i] = scanner.nextInt();
        }

        int vectorC[] = new int[size];
        for (int i = 0; i < size; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        System.out.println("Resulting vector C (A + B):");
        
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + vectorC[i]);
        }
        scanner.close();
    }
}
