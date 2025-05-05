// Removed package declaration to match the default package
package Disciplina.codes;
import java.util.Scanner;

public class Aula_01BoasVindas {
    public static void main(String[] args){
       String nome;
       Scanner entrada = new Scanner(System.in); 
       System.out.print("Nome: ");
       nome = entrada.nextLine();
        System.out.println("Bem-Vindo(a): " + nome);
        entrada.close();
        
    }
}
