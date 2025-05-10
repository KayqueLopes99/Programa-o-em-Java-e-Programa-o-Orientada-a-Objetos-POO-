package lista;

import java.util.Scanner;

public class questao_07Menor{    
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        int menorNumero; 
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        numero1 = leitor.nextInt();
        System.out.print("Informe o segundo numero: ");
        numero2 = leitor.nextInt();
        System.out.print("Informe o terceiro numero: ");
        numero3 = leitor.nextInt();

        if (numero1 < numero2 && numero1 < numero3){
            menorNumero = numero1;
        }else if (numero2 < numero1 && numero2 < numero3){
            menorNumero = numero2;
        }else{
            menorNumero = numero3;
        }

        System.out.println("O menor Numero: " + menorNumero);

        leitor.close();
    }
}
