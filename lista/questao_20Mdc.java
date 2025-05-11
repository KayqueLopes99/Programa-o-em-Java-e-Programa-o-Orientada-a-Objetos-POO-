package lista;

import java.util.Scanner;

public class questao_20Mdc {
    public static void main(String[] args) {
        int numero1, numero2;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        numero1 = leitor.nextInt();
        System.out.print("Informe o segundo numero: ");
        numero2 = leitor.nextInt();

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("O MDC de 0 é: 0");
        }else{
            System.out.printf("O MDC de %d e %d é: %d", numero1, numero2, mdc(numero1, numero2));
            }
        

        leitor.close();
        
    }

    public static int mdc(int n, int m){
        if (n > m){
            return mdc(m, n);      
        }
        if (n == 0) {
            return m;
        }
        else{
            return mdc(n, m % n);
        }
    }
}