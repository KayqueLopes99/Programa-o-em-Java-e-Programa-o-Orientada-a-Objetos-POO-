package lista3.questao_5Dados;

import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUMERO_DE_LANÇAMENTOS = 36000000; 
        int frequenciaSomas[] = new int[13];

        for (int i = 0; i < NUMERO_DE_LANÇAMENTOS; i++) {
            int dado1 = 1 + random.nextInt(6);
            int dado2 = 1 + random.nextInt(6);
            int somaDados = dado1 + dado2;
            frequenciaSomas[somaDados]++;
            // vai ter um contador individual para cada uma dessas somas: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 e 12. 
    
        }

        System.out.println("Soma\tFrequência");
        System.out.println("--------------------");
        for (int soma = 2; soma <= 12; soma++) {
        
            System.out.printf("%d\t%,d\n", soma, frequenciaSomas[soma]);
    }
    
}
}
