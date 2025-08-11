package Udemy.Code.Lista_Matriz;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matriz quadrada informe o número que corresponde a quantidade de linhas e colunas: ");
        int number = scanner.nextInt();

        int matrix[][] = new int[number][number];

        // Entre no primeiro loop for de lines e entra no for das colluns. Quando a condição em colluns se torna falsa sai deste, voltando para o for de lines e refazendo o processo pela segunda vez. E assim por diante
        for (int line = 0; line < matrix.length; line++) {
            for (int collun = 0; collun < matrix[line].length; collun++) {
                System.out.printf("Element [%d][%d]: ", line, collun);
               matrix[line][collun] = scanner.nextInt(); 
            }
        }

        System.out.print("\nMain diagonal: ");
        for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++) {
            System.out.print(matrix[lineIndex][lineIndex] + " ");
        }

        int count = 0;
        for (int line = 0; line < matrix.length; line++) {
            for (int collun = 0; collun < matrix[line].length; collun++) {
                if(matrix[line][collun] < 0){
                    count++;
                }
            }
        }
        System.out.println("\nQuantidade de números negativos: " + count);
        scanner.close();
    }
}
