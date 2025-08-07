## Escopo e Visibilidade de Variáveis
- Escopo de uma variável: é a região do programa onde a variável é
válida, ou seja, onde ela pode ser referenciada.
- Uma variável não pode ser usada se não for iniciada.
- Variáveis declaradas dentro de um bloco (como um `if`, `for`, etc.) só são visíveis dentro desse bloco.

- Variáveis declaradas fora de blocos (no nível da classe) são visíveis em todo o escopo da classe.


````java
public class ExemploEscopo {
    public static void main(String[] args) {
        int x = 10; // variável no escopo da classe

        if (x > 5) {
            int y = 20; // variável no escopo do bloco if
            System.out.println("x é maior que 5, y = " + y);
        }

        // System.out.println(y); // Erro: y não é visível aqui
        System.out.println("x = " + x); // x é visível aqui
    }
}
````