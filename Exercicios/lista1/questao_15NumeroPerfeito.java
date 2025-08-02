package lista1;

public class questao_15NumeroPerfeito {
    public static void main(String[] args) {
        int numero = 2, contador = 0;
        System.out.println("Os quatro primeiros numeros perfeitos");

        while (contador < 4) {
            if (ehPerfeito(numero)) {
                System.out.println("O número " + numero + " é um número perfeito.");
                contador++;
                
            }           
            numero++;
        }
    }

    public static boolean ehPerfeito(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if(numero % i == 0){
                somaDivisores += i;
            }
        }       
        return somaDivisores == numero;
    }
}
