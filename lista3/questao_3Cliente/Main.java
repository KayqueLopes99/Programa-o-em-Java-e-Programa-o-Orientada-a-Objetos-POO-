package lista3.questao_3Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        int idCliente, idadeCliente;
        String nomeCliente, telefoneCliente;
        int indice = 0;

        System.out.println("--- Cadastro de Clientes ---");
        System.out.println("Digite um ID negativo para sair.");

        while (true) {
            indice++;
            System.out.println("Cliente: " + indice);
            System.out.print("Id: ");
            idCliente = leitor.nextInt();
            leitor.nextLine(); 
            
            if (idCliente < 0) {
                System.out.print("Saindo ...");
                break;
            }
            System.out.print("Nome: ");
            nomeCliente = leitor.nextLine();
            
            System.out.print("Idade: ");
            idadeCliente = leitor.nextInt();
            leitor.nextLine(); 
            
            System.out.print("Telefone: ");
            telefoneCliente = leitor.nextLine();

            Cliente novoCliente = new Cliente(idCliente, idadeCliente, nomeCliente,telefoneCliente);
            listaDeClientes.add(novoCliente);
            System.out.println("Cliente adicionado!");
        }

        if (listaDeClientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n--- Lista de Clientes Cadastrados ---");
            for (Cliente cliente : listaDeClientes) {
                System.out.println(cliente);
            }
        }
        leitor.close();
    }
}
