package lista6_7;
import java.util.Scanner;

public class Questao103Meses {
    public static void main(String[] args) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero do mês (1-12): ");
        try {
            int numero = leitor.nextInt();
            System.out.println("Mês correspondente: " + meses[numero - 1]);

        } catch (ArrayIndexOutOfBoundsException excecao) {
            System.out.println("Valor inválido! informe um número entre 1 e 12.");

        } catch (Exception excecao) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            
        } finally {
            leitor.close();
        }
    }
}
