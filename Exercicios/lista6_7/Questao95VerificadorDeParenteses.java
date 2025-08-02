package lista6_7;

import java.util.Stack;

public class Questao95VerificadorDeParenteses {
    public static void main(String[] args) {
        String[] exemplos = {
                "(()()()())", 
                "((((((())", 
                "()))", 
        };

        for (String exemplo : exemplos) {

            System.out.println(exemplo + ":" + (verificaParenteses(exemplo) ? "balanceadao" : "não balanceado"));
        }

    }

    public static boolean verificaParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (Character caractere : expressao.toCharArray()) {
            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();

    }

}
