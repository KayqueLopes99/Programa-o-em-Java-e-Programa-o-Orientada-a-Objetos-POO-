package lista;

import java.util.Scanner;

public class questao_08Vendas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigoSetor;
        double precoProduto;

        System.out.println("\033[92m-------- Loja virtual --------\033[0m");
        System.out.println("Informe o setor da Loja que deseja:");
        codigoSetor = leitor.nextInt();

        System.out.println("Informe o preço do produto:");
        precoProduto = leitor.nextDouble();

        if (codigoSetor == 222) {
            if (precoProduto > 500) {
                precoProduto *= 0.9; // 10% de desconto
                System.out.printf("O código %d do Setor de Eletros. Preço final com 10%% de desconto: R$ %.2f\n", codigoSetor, precoProduto);
            } else {
                System.out.printf("O código %d do Setor de Eletros. Preço sem desconto: R$ %.2f\n", codigoSetor, precoProduto);
            }
        } else if (codigoSetor == 111) {
            if (precoProduto >= 50 && precoProduto <= 100) {
                precoProduto *= 0.8; // 20% de desconto
                System.out.printf("O código %d do Setor de Cama, mesa e banho. Preço final com 20%% de desconto: R$ %.2f\n", codigoSetor, precoProduto);
            } else if (precoProduto > 100) {
                precoProduto *= 0.6; // 40% de desconto
                System.out.printf("O código %d do Setor de Cama, mesa e banho. Preço final com 40%% de desconto: R$ %.2f\n", codigoSetor, precoProduto);
            } else {
                precoProduto *= 0.9; // 10% de desconto
                System.out.printf("O código %d do Setor de Cama, mesa e banho. Preço final com 10%% de desconto: R$ %.2f\n", codigoSetor, precoProduto);
            }
        } else {
            System.out.println("Setor inválido.");
        }

        leitor.close();
    }
}
