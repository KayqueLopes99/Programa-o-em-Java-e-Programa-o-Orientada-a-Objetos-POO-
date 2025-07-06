package lista6_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao102Soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = obterIntValido(leitor);
        int numero2 = obterIntValido(leitor);

        int soma = numero1 + numero2;
        System.out.println("A soma dos números é: " + soma);
        leitor.close();

    }

    public static int obterIntValido(Scanner leitor) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Digite um número inteiro: ");
                numero = leitor.nextInt();
                break;
            } catch (InputMismatchException excecao) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                leitor.next();
            }
        }
        return numero;

    }
}
