package lista;

import java.util.Scanner;

public class questao_19Fatorial {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um algorismo para ver o seu fatorial: ");
        numero = leitor.nextInt();

        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.printf("%d! = %d\n", i, fatorial(i));
        }

        leitor.close();

    }

    public static int fatorial(int n) {
        if (n == 0) {

            return 1;

        } else {
            return n * fatorial(n - 1);
        }
    }
}
