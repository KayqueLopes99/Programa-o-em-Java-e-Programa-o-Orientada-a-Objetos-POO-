package lista;

import java.util.Scanner;

public class questao_02Media {
    public static void main(String[] args) {
        float media, nota_01, nota_02, nota_03;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a Nota da Primeira Unidade: ");
        nota_01 = leitor.nextFloat();
        System.out.print("Informe a Nota da Segunda Unidade: ");
        nota_02 = leitor.nextFloat();
        System.out.print("Informe a Nota da Terceira Unidade: ");
        nota_03 = leitor.nextFloat();

        media = media(nota_01, nota_02, nota_03);

        System.out.printf("A media das notas %.2f, %.2f e %.2f é: %.2f\n", nota_01, nota_02, nota_03, media);
        leitor.close();
    }

    public static float media(float nota01, float nota02, float nota03){

        return (nota01 + nota02 + nota03) / 3;

    }
    
}
