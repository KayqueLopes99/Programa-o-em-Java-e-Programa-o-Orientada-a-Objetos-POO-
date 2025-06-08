package Disciplina.codes.Array.Aula_05ContaBancaria;

import java.util.Scanner;

public class DemoContaBancaria {
    public static void main(String[] args) {

        ContaBancaria extrato = new ContaBancaria();
        int opcao;
        float valorTransacao;
        Scanner leitor = new Scanner(System.in);

        do {

            System.out.println("------ Menu ------");
            System.out.println("1. Saque");
            System.out.println("2. Deposito");
            System.out.println("3. Visualizar extrato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do saque: ");
                    valorTransacao = leitor.nextFloat();
                    extrato.transacao(-valorTransacao);

                    break;

                case 2:
                    System.out.print("Digite o valor do Deposito: ");
                    valorTransacao = leitor.nextFloat();
                    extrato.transacao(valorTransacao);

                    break;
                case 3:
                    System.out.println("Extrato Bancário:");
                    System.out.println(extrato);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
        leitor.close();

    }
}
