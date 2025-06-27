package Disciplina.codes.Collections.Pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();
        System.out.println("Adicionando 1 elemento à pilha");
        pilha.push(1);
        System.out.println("Adicionando 2 elemento à pilha");
        pilha.push(2.5F);
        System.out.println("Adicionando 3 elemento à pilha");

        pilha.push(3.5432);
        System.out.println("Pilha: " + pilha);
        pilha.pop();
        System.out.println("Pilha após pop 1: " + pilha);
        pilha.pop();
        System.out.println("Pilha após pop 2:  " + pilha);
        pilha.pop();
        System.out.println("Pilha após pop 3: " + pilha);
    }

}
