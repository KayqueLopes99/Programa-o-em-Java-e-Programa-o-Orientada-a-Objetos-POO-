package lista1;

import java.util.Scanner;

public class questao_21Primo {
    public static void main(String[] args) {
        int numero;
        int divisor = 2;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        numero = leitor.nextInt();

        if (numero < 2) {
            System.out.println("O número deve ser maior ou igual a 2.");
        } else {

            if (verificaPrimo(numero, divisor)) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        leitor.close();
    }

    public static boolean verificaPrimo(int numero, int divisor) {

        if (divisor == numero) {
            return true;

        }

        if (numero % divisor == 0) {
            return false;

        }

        return verificaPrimo(numero, divisor + 1);

    }
}
