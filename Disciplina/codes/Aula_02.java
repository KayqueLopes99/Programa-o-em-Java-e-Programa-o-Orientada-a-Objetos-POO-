package Disciplina.codes;

import java.util.Scanner;

public class Aula_02 {
    // Distância entre dois pontos.
    public static void main(String[] args){
        double x1, y1, x2, y2, dist;
        Scanner ent = new Scanner(System.in);

        System.out.print("x1: ");
        x1 = ent.nextDouble();

        System.out.print("y1: ");
        y1 = ent.nextDouble();

        System.out.print("x2: ");
        x2 = ent.nextDouble();

        System.out.print("y2: ");
        y2 = ent.nextDouble();

        dist = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));

        System.out.println(dist);
        // System.out.println("Distancia entre (" + x1 + "," + y1 + ") e (" + x2 + "," + y2 + "): ", dist);

        ent.close();


        
    }
}