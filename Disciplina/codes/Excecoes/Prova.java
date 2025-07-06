package Disciplina.codes.Excecoes;
public class Prova {
    public static void main(String[] args) {
        int respostas[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int contador[] = new int[6];
    
        for (int index = 0; index < contador.length; index++) {
            contador[index] = 0;
        }

        for (int resposta : respostas) {
            try {
                contador[resposta]++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Qualquer execeção coloca-se Exception exececao.
                //System.out.println("Resposta inválida: " + e.getMessage());
                
                System.out.println("Resposta inválida: " + resposta);
            }
        }

        for (int j = 0; j < contador.length; j++) {
            System.out.println("A quantidade de respostas " + j + " é: " + contador[j]);
        }
    }
}
