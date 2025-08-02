package lista1;

import java.util.Scanner;

public class questao_03Angulo {

   public static void main(String[] args) {

      
      double angulo, radianos, seno, cosseno, tangente, cossecante, secante, contangente;
      Scanner leitor = new Scanner(System.in);;

      System.out.print("Informe o angulo: ");
      angulo = leitor.nextDouble();
      radianos = Math.toRadians(angulo);
      seno = Math.sin(radianos);
      cosseno = Math.cos(radianos);
      tangente = Math.tan(radianos);
      cossecante = 1 / seno;
      secante = 1 / cosseno;
      contangente = 1 / tangente;

      System.out.printf("O angulo %.1f em radianos: %.2f\n", angulo, radianos);
      System.out.printf("Seno: %.2f\n", seno);
      System.out.printf("Cosseno: %.2f\n", cosseno);
      System.out.printf("Tangente: %.2f\n", tangente);
      System.out.printf("Cossecante: %.2f\n", cossecante);
      System.out.printf("Secante: %.2f\n", secante);
      System.out.printf("Contangente: %.2f\n", contangente);

      leitor.close();

   }

}
