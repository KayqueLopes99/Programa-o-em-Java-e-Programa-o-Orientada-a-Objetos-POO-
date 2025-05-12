package lista1;

import java.util.Scanner;

public class questao_05Cdu {
    public static void main(String[] args) {
       // int numero, centena, dezena, unidade; 
       int numero = 0;
       int unidade, dezena, centena;
       Scanner leitor = new Scanner(System.in); 

       while(true){
        System.out.println("Informe o Algarismo: ");
        numero = leitor.nextInt();
        if(numero < 0 || numero > 999){
            System.out.println("Número inválido, digite novamente.");
            continue;
        }else{
            unidade = numero % 10;
            dezena = (numero / 10) % 10;
            centena = (numero / 100) % 10; 
            break;
        }}

        int formatoUcd = (unidade * 100) + (dezena * 10) + centena;

        System.out.println("Numero: " + numero + "  Formato UCD: " + formatoUcd);

        


       leitor.close();
    }
    
}
