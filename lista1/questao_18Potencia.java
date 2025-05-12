package lista1;

import java.util.Scanner;

public class questao_18Potencia {
    public static void main(String[] args) {
        int base = 3;
        int expoente = 4;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a Base: ");
        base = leitor.nextInt();
        System.out.print("Informe o Expoente: ");
        expoente = leitor.nextInt();

        if (expoente >= 1) {
            System.out.printf("A potencia de %d elevado a %d é: %d", base, expoente, potencia(base, expoente));
        } else {
            System.out.println("O expoente deve ser maior ou igual a 1.");
        }

        leitor.close();
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
}