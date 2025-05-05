package Disciplina.codes;

import java.util.Scanner;

public class Aula_07Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num1, num2, num3, m;

        System.out.print("Numero 1: ");
        num1 = leitor.nextDouble();
        System.out.print("Numero 2: ");
        num2 = leitor.nextDouble();
        System.out.print("Numero 3: ");
        num3 = leitor.nextDouble();
        m = media(num1, num2, num3);
        System.out.println("A Media de " + num1 + " " + num2 + " " + num3 + " = " + m);

        leitor.close();
    }

    public static double media(double n1, double n2, double n3){
        return (n1 + n2 + n3)/3;
    }
}
