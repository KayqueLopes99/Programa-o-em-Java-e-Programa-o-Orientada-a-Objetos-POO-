package codes;

import java.util.Scanner;

public class Aula_06 {
    public static void main(String[] args) {
        // fatorial
        Scanner leitor = new Scanner(System.in);
        int n, fatorial; 

        System.out.print("n: ");
    
        n = leitor.nextInt();
       
       for (int numero = 0; numero <= n; numero++){
        
        fatorial=1;
        for (int i = 1; i <= n; i++){
            fatorial *= i;
           

        }
        System.out.println("Fatorial de " + numero + " = " + fatorial);

       }



        
        


        leitor.close();
    }
}
