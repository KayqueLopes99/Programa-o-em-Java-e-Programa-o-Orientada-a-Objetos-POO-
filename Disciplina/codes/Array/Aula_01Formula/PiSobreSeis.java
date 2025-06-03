package Disciplina.codes.Array.Aula_01Formula;

public class PiSobreSeis {
    public static void main(String[] args) {
        double termosDaSerie[] = new double[1000000];
        for (int i = 0; i < termosDaSerie.length; i++) {
            termosDaSerie[i] = 1 / Math.pow(i + 1, 2);

        }

        for (int numero = 10; numero < 1000000; numero *= 10) {
            calculaMostraSomatoria(termosDaSerie, numero);

        }
        calculaMostraSomatoria(termosDaSerie, 10);

    }

    public static void calculaMostraSomatoria(double array[], int conjuntoNumero) {

        double soma = 0.0;

        for (int i = 0; i < conjuntoNumero; i++) {
            soma += array[i];
        }
        System.out.printf("Somatória dos termos %d da série: %.6f%n", conjuntoNumero, soma);

    }

}
