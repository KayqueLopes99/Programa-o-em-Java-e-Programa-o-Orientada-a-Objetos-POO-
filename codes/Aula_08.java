package codes;

import java.util.Scanner;

public class Aula_08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, fat;

        System.out.print("Valor: ");
        num = leitor.nextInt();

        fat = fatorial(num);

        System.out.println("O fatorial de " + num + " = " + fat);

        leitor.close();

    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n*fatorial(n-1);
        }
    }
}