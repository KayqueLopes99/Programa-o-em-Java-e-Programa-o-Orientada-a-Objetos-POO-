package lista1;

import java.util.Scanner;

public class questao_22Polinomio {
    public static void main(String[] args) {
        int grau, valorDeX;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o grau do polinômio: ");
        grau = leitor.nextInt();

        System.out.print("Informe o valor de x: ");
        valorDeX = leitor.nextInt();
        int resultado = calcularPolinomio(grau, valorDeX, leitor);
        System.out.println("Resultado do polinômio: " + resultado);

        leitor.close();
    }

    /**
     * A forma geral de um polinômio é:
     *
     * P(x) = a₀xⁿ + a₁xⁿ⁻¹ + a₂xⁿ⁻² + ⋯ + aₙ₋₁x + aₙ
     *
     * x é a variável do polinômio (pode ser um valor específico, como 2, 3, etc.).
     *
     * a₀, a₁, ..., aₙ são os coeficientes (valores que multiplicam as potências de
     * x).
     *
     * n é o grau do polinômio, ou seja, a maior potência de x.
     */

    public static int calcularPolinomio(int grauAtual, int x, Scanner leitor) {
        System.out.print("Informe o coeficiente de grau " + grauAtual + ": ");
        int coeficiente = leitor.nextInt();

        if (grauAtual == 0) {
            return coeficiente;
        }

        return x * calcularPolinomio(grauAtual - 1, x, leitor) + coeficiente;
    }
}
