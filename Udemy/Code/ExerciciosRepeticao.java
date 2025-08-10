package Udemy.Code;

import java.util.Scanner;

public class ExerciciosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exibindo números ímpares de 0 a X");
        showOdds(scanner);
        System.out.println("Exibindo valores no intervalo de 10 a 20");
        showValuesInInterval(scanner);
        System.out.println("Casos de teste com média ponderada");
        testCases(scanner);
        System.out.println("Cálculo de pares de números");
        calculatePairs(scanner);
        System.out.println("Exibindo fatorial de um número");
        printFactorial(scanner);
        System.out.println("Exibindo divisores de um número");
        calculateDivisors(scanner);
        System.out.println("Exibindo potências de números de 1 a N");
        showPowers(scanner);

        scanner.close();
    }

    public static void showOdds(Scanner scanner) {
        System.out.println("Digite um valor inteiro entre 1 e 1000: ");
        int valueX = scanner.nextInt();

        if (1 <= valueX && valueX <= 1000) {
            for (int i = 0; i < valueX; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Valor fora do intervalo permitido.");
        }

    }

    public static void showValuesInInterval(Scanner scanner) {
        System.out.println("Digite um valor inteiro para quantidade de valores a serem mostrados: ");
        int quantity = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite um valor inteiro: ");
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }

    public static void testCases(Scanner scanner) {
        System.out.println("Digite um valor inteiro para quantidade de casos de teste: ");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite três valores decimais separados por espaço:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double weightedAverage = (a * 2 + b * 3 + c * 5) / 10.0;
            System.out.printf("%.1f%n", weightedAverage);
        }
    }

    public static void calculatePairs(Scanner scanner) {
        System.out.println("Digite um valor inteiro: ");

        System.out.println("Digite a quantidade de pares de números:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite dois números separados por espaço:");
            double numerator = scanner.nextDouble();
            double denominator = scanner.nextDouble();

            if (denominator == 0) {
                System.out.println("divisao impossivel");
            } else {
                double result = numerator / denominator;
                System.out.printf("%.1f%n", result);
            }
        }

    }

    public static void printFactorial(Scanner scanner) {
        System.out.println("Digite um valor inteiro para visualizar seu fatorial: ");
        int value = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        System.out.println("Fatorial: " + result);

    }

    public static void calculateDivisors(Scanner scanner) {
        System.out.println("Digite um valor inteiro para visualizar seus divisores: ");
        int value = scanner.nextInt();

        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                System.out.println("Divisor: " + i);

            }

        }

    }

    public static void showPowers(Scanner scanner){
        System.out.println("Digite um valor inteiro para quantidade: ");
        int quantity = scanner.nextInt();
        int number = 0, square = 0, cube = 0;

        for (int i = 1; i <= quantity; i++) {
            number = i;
            square = number * number;
            cube = number * number * number;


            System.out.printf("%d %d %d\n", number, square, cube);

            
        }
    }

}
