package Udemy.Code.Lista_Matriz;

import java.util.Scanner;

public class MatrixColl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número que corresponde a quantidade de linhas: ");
        int numberLines = scanner.nextInt();

        System.out.print("Informe o número que corresponde a quantidade de colunas: ");
        int numberColunns = scanner.nextInt();

        int matrix[][] = new int[numberLines][numberColunns];

        for (int line = 0; line < matrix.length; line++) {
            for (int collun = 0; collun < matrix[line].length; collun++) {
                System.out.printf("Element [%d][%d]: ", line, collun);
                matrix[line][collun] = scanner.nextInt();
            }
        }

        for (int line = 0; line < matrix.length; line++) {
            for (int collun = 0; collun < matrix[line].length; collun++) {
                System.out.print(matrix[line][collun] + " "); 
            }
            System.out.println();
        }

        System.out.print("Enter a number present in the matrix: ");
        int numberPresentMatrix = scanner.nextInt();
        int count = 0;

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (matrix[line][column] == numberPresentMatrix) {
                    System.out.println("Position: " + line + "," + column);

                    // Check left
                    if (column > 0) {
                        System.out.println("Left: " + matrix[line][column - 1]);
                    }

                    // Check right
                    if (column < matrix[line].length - 1) {
                        System.out.println("Right: " + matrix[line][column + 1]);
                    }

                    // Check up
                    if (line > 0) {
                        System.out.println("Up: " + matrix[line - 1][column]);
                    }

                    // Check down
                    if (line < matrix.length - 1) {
                        System.out.println("Down: " + matrix[line + 1][column]);
                    }

                    count++;
                }
            }
        }
        System.out.println("Occurrences found: " + count);

        scanner.close();
    }
}
