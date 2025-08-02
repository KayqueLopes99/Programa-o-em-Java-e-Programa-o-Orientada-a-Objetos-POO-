package lista1;

import java.util.Scanner;

public class questao_06Periodo {
    public static void main(String[] args) {
       int intervaloMinutos, minutos, dias, horas;
       Scanner leitor = new Scanner(System.in);

       System.out.println("Minutos: ");
       intervaloMinutos = leitor.nextInt();
       minutos = intervaloMinutos % 60;
       horas = (intervaloMinutos / 60) % 24;
       dias = intervaloMinutos / 1440;

       System.out.printf("O Intervalo em minutos: %d -- Equivale: %d dias // %d horas // %d minutos", intervaloMinutos, dias, horas, minutos);

       leitor.close();

    }
    
}
