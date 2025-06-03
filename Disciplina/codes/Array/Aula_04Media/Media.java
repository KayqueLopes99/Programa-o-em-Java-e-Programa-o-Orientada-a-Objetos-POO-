package Disciplina.codes.Array.Aula_04Media;

public class Media {
    public static void main(String[] args) {
        double media2 = media(2.5, 3.5);
        System.out.println("Media de dois elementos: " + media2);       
    
    }

    public static double media(double... numeros) {
        double soma = 0;
        for (double d : numeros) {
            soma += d;
        }
        return soma / numeros.length;
    }
}
