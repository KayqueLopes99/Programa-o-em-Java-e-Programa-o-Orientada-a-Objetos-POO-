package lista3.questao_3Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        int idCliente;
        String nomeCliente;
        int idadeCliente;
        String telefoneCliente;
        int indice = 0;

        System.out.println("--- Cadastro de Clientes ---");
        System.out.println("Digite um ID negativo para sair a qualquer momento.");

        while (true) {
            indice++;
            System.out.printf("------- Cliente %d --------\n", indice);

            System.out.print("Id: ");
            idCliente = leitor.nextInt();

            if (idCliente < 0) {
                System.out.print("Saindo ...");
                break;
            }

            System.out.print("Nome: ");
            nomeCliente = leitor.next();

            System.out.print("Idade: ");
            idadeCliente = leitor.nextInt();

            System.out.print("Telefone: ");
            telefoneCliente = leitor.next();

            Cliente novoCliente = new Cliente(idCliente, idadeCliente, nomeCliente,telefoneCliente);

            listaDeClientes.add(novoCliente);

            System.out.println("Cliente " + nomeCliente + " adicionado com sucesso!");

        }



        
        if (listaDeClientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n--- Lista de Clientes Cadastrados ---");
            for (Cliente cliente : listaDeClientes) {
                System.out.println(cliente.toString());
            }
        }

        leitor.close();

    }
}
