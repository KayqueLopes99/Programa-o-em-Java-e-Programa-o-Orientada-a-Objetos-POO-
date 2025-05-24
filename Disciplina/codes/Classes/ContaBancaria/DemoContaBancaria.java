package Disciplina.codes.Classes.ContaBancaria;

public class DemoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João"); // Construtor simplificado
        ContaBancaria conta2 = new ContaBancaria("Maria", 1500.00f, true); // Construtor completo

        System.out.println("Conta 1:");
        System.out.println(conta1);

        System.out.println("\nConta 2:");
        System.out.println(conta2);
    }
}
