package lista;

public class questao_13MegaCena {
    public static void main(String[] args) {
        System.out.println("\u001B[34m" + " Os números da Mega Sena variam de 1 a 60." + "\u001B[0m");

        for (int i = 1; i <= 60; i++) {
            if (i % 10 == 0) {
                System.out.printf(" [%d] \n", i);
            } else if (i <= 9) {
                System.out.printf(" [0%d] ", i);
            } else {
                System.out.printf(" [%d] ", i);
            }
        }
    }

}
