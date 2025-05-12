package lista1;

import java.util.Scanner;


public class questao_09Carta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da carta (1 a 13):");
        int valorCarta = leitor.nextInt();
        
        System.out.println("Digite o número do naipe (1 a 4):");
        int numeroNaipe = leitor.nextInt();

        boolean cartaValida = true;
        boolean naipeValido = true;

        System.out.print("Carta: ");
        switch (valorCarta) {
            case 1:
                System.out.println("Ás");
                break;
            case 11:
                System.out.println("Valete");
                break;
            case 12:
                System.out.println("Dama");
                break;
            case 13:
                System.out.println("Rei");
                break;
            case 2,3,4,5,6,7,8,9,10:
                System.out.println(valorCarta);
                break;
            default:
                System.out.println("inválida");
                cartaValida = false;
        }

        System.out.print("Naipe: ");
        switch (numeroNaipe) {
            case 1:
                System.out.println("ouros");
                break;
            case 2:
                System.out.println("paus");
                break;
            case 3:
                System.out.println("copas");
                break;
            case 4:
                System.out.println("espadas");
                break;
            default:
                System.out.println("inválido");
                naipeValido = false;
        }

        if (cartaValida && naipeValido) {
            System.out.printf("A carta é: ");
            switch (valorCarta) {
                case 1:  System.out.print("Ás"); break;
                case 11: System.out.print("Valete"); break;
                case 12: System.out.print("Dama"); break;
                case 13: System.out.print("Rei"); break;
                default: System.out.print(valorCarta); break;
            }

            System.out.print(" de ");
            switch (numeroNaipe) {
                case 1:  System.out.println("ouros"); break;
                case 2:  System.out.println("paus"); break;
                case 3:  System.out.println("copas"); break;
                case 4:  System.out.println("espadas"); break;
            }
        } else {
            System.out.println("Não foi possível identificar a carta.");
        }

        leitor.close();
    }
}
