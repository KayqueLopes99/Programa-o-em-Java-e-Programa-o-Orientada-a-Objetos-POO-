package lista1;

import java.util.Scanner;

public class questao_12Fevereiro {
    public static void main(String[] args) {  
        int diaFevereiro;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o dia da semana de fevereiro: ");
        diaFevereiro = leitor.nextInt();

        switch (diaFevereiro) {
            case 1, 8, 15, 22: System.out.println("Domingo"); break;
            case 2, 9, 16, 23: System.out.println("Segunda"); break;
            case 3, 10, 17, 24: System.out.println("Terça");  break;
            case 4, 11, 18, 25: System.out.println("Quarta"); break;
            case 5, 12, 19, 26: System.out.println("Quinta"); break;
            case 6, 13, 20, 27: System.out.println("Sexta");  break;
            case 7, 14, 21, 28: System.out.println("Sábado"); break;
            default: System.out.println("Dia inválido");      break;
        }
        leitor.close();

    }
    
}
