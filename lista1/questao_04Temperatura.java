package lista1;

import java.util.Scanner;

public class questao_04Temperatura {
        public static void main(String[] args) {
        float grausCentigrados, grausFahrenheit;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Graus Centigrados: ");
        grausCentigrados = leitor.nextFloat();
        grausFahrenheit = (((grausCentigrados * 9) / 5) + 32);

        System.out.printf("Graus Fahrenheit: %.2f\n", grausFahrenheit);
        System.out.printf("Graus Centigrados: %.2f\n", grausCentigrados);

        leitor.close();
    }
}
