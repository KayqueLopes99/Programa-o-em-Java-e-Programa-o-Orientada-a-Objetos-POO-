package lista;

import java.util.Scanner;

public class questao_01AreaQuadrado {
    public static void main(String[] args) {
        float lado, area;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Lado do Quadrado: ");
        lado = leitor.nextFloat();


        area = lado * lado;
        System.out.println("Lado do Quadrado: " + lado);
        System.out.println("Área do Quadrado: " + area);

        leitor.close();
    }
}
