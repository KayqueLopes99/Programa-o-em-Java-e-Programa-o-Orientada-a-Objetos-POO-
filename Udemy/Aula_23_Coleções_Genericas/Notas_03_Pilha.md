## Pilha
- Definição: Estrutura de dados que segue o princípio LIFO (Last In, First Out), onde o último elemento adicionado é o primeiro a ser removido.
- A classe Stack estende a classe Vector para implementar uma estrutura de dados de pilha

### métodos:
  - `push`: Adiciona um elemento ao topo da pilha.
  - `pop`: Remove e retorna o elemento do topo da pilha.
  - `peek`: Retorna o elemento do topo sem removê-lo.
  - `isEmpty`: Verifica se a pilha está vazia. herdado da classe Vector, determina se a pilha está vazia.

- Implementação comum: Usando `java.util.Stack` ou `java.util.ArrayDeque`.

- Sintaxes: 
```java
import java.util.Stack;
public class ExemploPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        // Adicionando elementos
        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");
        pilha.push("Quarto");

        pilha.pop(); // Remove o último elemento adicionado (Quarto)

        // Exibindo o topo da pilha
        System.out.println("Topo da pilha: " + pilha.peek());

        // Removendo elementos
        while (!pilha.isEmpty()) {
            System.out.println("Removendo: " + pilha.pop());
        }
    }
}
```

## Obs:
-  *Metodos*:   
- addFirst : adiciona um elemento no início da lista.
- addLast  : adiciona um elemento no final da lista.
- removeFirst : remove o primeiro elemento da lista.
- removeLast : remove o último elemento da lista.
- Estes acima devem ser implementados na estrutura de dados `LinkedList` como pilha.

- Pilha segue o princípio LIFO (Last In, First Out), onde o último elemento adicionado é o primeiro a ser removido.

