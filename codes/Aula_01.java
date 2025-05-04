package codes;

import java.util.Scanner;

public class Aula_01 {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("Bem-Vindo(a): " + nome);
        }
    }
}
