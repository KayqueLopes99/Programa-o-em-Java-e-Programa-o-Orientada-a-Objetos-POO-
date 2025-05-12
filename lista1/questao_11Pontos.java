package lista1;

import java.util.Scanner;

public class questao_11Pontos {
    public static void main(String[] args) {
        int px1, px2, py1, py2;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o Ponto A x: ");
        px1 = leitor.nextInt();
        System.out.print("Informe o Ponto A y: ");
        py1 = leitor.nextInt();

        System.out.print("Informe o Ponto B x: ");
        px2 = leitor.nextInt();
        System.out.print("Informe o Ponto B y: ");
        py2 = leitor.nextInt();

        if (py1 > py2) {
            System.out.println("\nO ponto A(" + px1 + ", " + py1 + ") está acima do ponto B(" + px2 + ", " + py2 + ").");
        } else if (py1 < py2) {
            System.out.println("O ponto A(" + px1 + ", " + py1 + ") está abaixo do ponto B(" + px2 + ", " + py2 + ").");
        } else {
            System.out.println("O ponto A(" + px1 + ", " + py1 + ") está na mesma altura com o ponto B(" + px2 + ", "
                    + py2 + ").");
        }

        if (px1 > px2) {
            System.out.println(
                    "O ponto A(" + px1 + ", " + py1 + ") está a direita do ponto B(" + px2 + ", " + py2 + ").");
        } else if (px1 < px2) {
            System.out.println(
                    "O ponto A(" + px1 + ", " + py1 + ") está a esquerda do ponto B(" + px2 + ", " + py2 + ").");
        } else {
            System.out.println("O ponto A(" + px1 + ", " + py1 + ") está na mesma largura com o ponto B(" + px2 + ", "
                    + py2 + ").");
        }

        leitor.close();
    }
}
