package lista;

import java.util.Scanner;

public class questao_14Fibonaci {
    public static void main(String[] args) {
        int numeroFibonaci;;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de n (n > 0): ");
        numeroFibonaci = leitor.nextInt();
        if (numeroFibonaci <= 0) {
            System.out.println("n deve ser maior que 0.");
        } else{
            System.out.println("Série de Fibonacci até o " + numeroFibonaci + "º termo:");
            for (int i = 0; i < numeroFibonaci; i++) {
                System.out.print(fibonaci(i) + " ");
            }
        }


        leitor.close();
        
    }


    public static int fibonaci(int n){
        if (n < 2) {
            return n;
        } else{
            return fibonaci(n-1) + fibonaci(n - 2);
        }
    }
}
