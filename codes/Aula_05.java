package codes;

import java.util.Calendar;
import java.util.Scanner;

public class Aula_05 {
       public static void main(String[] args) {
        // Valida cartão 

        Calendar calendario = Calendar.getInstance();

        String nome, numero, codigo;
        boolean invalido;
        int mes, ano;
        int anoAtual = calendario.get(Calendar.YEAR);
        int mesAtual = calendario.get(Calendar.MONTH) + 1; // Janeiro é 0, então adicionamos 1





        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = leitor.nextLine();
        System.out.print("Numero: ");
        numero = leitor.nextLine();
        System.out.print("Codigo: ");
        codigo = leitor.nextLine();


       do {
       
        System.out.print("Mes: ");
        mes = leitor.nextInt();
        System.out.print("Ano: ");
        ano = leitor.nextInt();
        invalido = (ano < anoAtual || (ano == anoAtual && mes < mesAtual));
        if (invalido){
            System.out.println("Cartao invalido - Insira os Dados novamente!");
        }

       } while(invalido);

       System.out.print("Cartao validado" + "\t");
       System.out.print("Nome: " + nome + "\t");
       System.out.print("Numero: " + numero  + "\t");
       System.out.println("Codigo: " + codigo);

       leitor.close();

       }
}
