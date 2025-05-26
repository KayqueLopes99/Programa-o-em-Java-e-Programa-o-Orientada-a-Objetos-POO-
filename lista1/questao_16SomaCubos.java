package lista1;

public class questao_16SomaCubos {
    public static void main(String[] args) {
        for (int numero = 100; numero <= 999; numero++) {

            int unidade = numero % 10;
            int dezena = (numero / 10) % 10;
            int centena = (numero / 100) % 10;

            if (numero == Math.pow(unidade, 3) + Math.pow(dezena, 3) + Math.pow(centena, 3)) {
                System.out.println("O número " + numero + " é igual a soma dos cubos de seus dígitos.");
            }   
        }
    }   
}