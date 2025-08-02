package lista1;

import java.util.Scanner;

public class questao_05Cdu {
    public static void main(String[] args) {
        int numero, unidade, dezena, centena;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Algarismo: ");
        numero = leitor.nextInt();
        if (numero < 0 || numero > 999) {
            System.out.println("Número inválido, digite novamente.");
        } else {
            unidade = numero % 10;
            dezena = (numero / 10) % 10;
            centena = (numero / 100) % 10;
            int formatoUcd = (unidade * 100) + (centena * 10) + dezena;

            System.out.println("Numero: " + numero + "  Formato UCD: " + formatoUcd);
        }
        leitor.close();
    }
}
