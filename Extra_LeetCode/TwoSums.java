package Extra_LeetCode;

import java.util.Scanner;
public class TwoSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Target: ");
        int target = scanner.nextInt();
        System.out.print("Informe a quantidade de números do vetor: ");
        int quantity = scanner.nextInt();
        int[] vector = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Number of index: " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        if (vector.length < 2 || vector.length > Math.pow(10, 4)) {
            System.out.println("O tamanho do vetor deve estar entre 2 e 10^4.");
            scanner.close();
        }

        for (int num : vector) {
            if (num < -(Math.pow(10, 9)) || num > Math.pow(10, 9)) {
                System.out.println("Os valores do vetor devem estar entre -10^9 e 10^9.");
                scanner.close();
            }
        }

        if (target < -(Math.pow(10, 9)) || target > Math.pow(10, 9)) {
            System.out.println("O valor de target deve estar entre -10^9 e 10^9.");
            scanner.close();
        }
        boolean sucess = false;


        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] + vector[j] == target) {
                    System.out.println("Indices: " + "["+ i + ", " + j + "]");
                    sucess = true;
                }
            }
        }

        if (!sucess) {
            System.out.println("Não foi possível retornar os índices dos dois números de forma que a soma deles seja igual ao target.");
        }

        scanner.close();
    }
}