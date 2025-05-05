package Disciplina.codes;

import java.util.Scanner;

public class Aula_03Data {

    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int dia, mes, ano, diasDoMes;

        System.out.print("Dia: ");
        dia = leitor.nextInt();

        System.out.print("Mes: ");
        mes = leitor.nextInt();


        System.out.print("Ano: ");
        ano = leitor.nextInt();

        System.out.print(dia + " de ");
        switch (mes) {
            case 1 -> System.out.print("Janeiro");
            case 2 -> System.out.print("Fevereiro");
            case 3 -> System.out.print("Marco");
            case 4 -> System.out.print("Abril");
            case 5 -> System.out.print("Maio");
            case 6 -> System.out.print("Junho");
            case 7 -> System.out.print("Julho");
            case 8 -> System.out.print("Agosto");
            case 9 -> System.out.print("Setembro");
            case 10 -> System.out.print("Outubro");
            case 11 -> System.out.print("Novembro");
            case 12 -> System.out.print("Desembro");
            default -> System.out.print("Mes não correspondente.");
        }

        System.out.println(" de " + ano);



        // Switch para os dias do mês.
        diasDoMes = switch (mes) {
            case 1, 3, 5, 8, 10, 12 -> 31;
            case 2 -> 28;
            default -> 30;
        };

        System.out.println("O mês " + mes + " Tem " + diasDoMes + " dias");
        // Imprimir para o usuario o dia!




        leitor.close();
    }}