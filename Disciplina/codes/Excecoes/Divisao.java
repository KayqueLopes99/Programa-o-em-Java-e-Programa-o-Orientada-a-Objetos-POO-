package Disciplina.codes.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Divisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean numeradorValido = false;
        boolean denominadorValido = false;
        int numerador = 0 , denominador = 0;
        System.out.print("Digite o numerador: ");

        do {
            try {
                numerador = leitor.nextInt();
                numeradorValido = true; 
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro.");
                leitor.nextLine();
            }

        } while (!numeradorValido);

        System.out.print("Digite o denominador: ");
       
        do {
            try {
                denominador = leitor.nextInt();
                denominadorValido = true; 
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro.");
                leitor.nextLine();
            }

        } while (!denominadorValido);

    
     System.out.println(numerador + "/" + denominador + " = " + divisaoInteira(numerador, denominador));
        leitor.close();
    }
    public static int divisaoInteira(int numerador, int denominador) {        
        int resultado = 0;
        try{
            resultado = numerador / denominador;
        } catch (ArithmeticException e){
            System.out.println("Divisão por zero não e possivel!");
        }
        return resultado;
    }
}   