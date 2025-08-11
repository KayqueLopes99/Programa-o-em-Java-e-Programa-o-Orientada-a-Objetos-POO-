## Listas
- **"Uma `List` é uma `Collection` indexada (cada elemento tem um índice)"**: Esta é a característica que define uma `List`. Significa que a coleção é **ordenada** e que podemos acessar qualquer elemento diretamente através de sua posição numérica (o índice), exatamente como faríamos com um array.
- **"Pode conter elementos duplicados"**.
- * **"O índice do primeiro elemento é zero"**.
- manipular elementos por meio de seus índices
- manipular um intervalo especificado de elementos
- procurar elementos
- obter um ListIterator para acessar os elementos
> Inicia vazia, e seus elementos são alocados sob demanda
> Tamanho variável
> Facilidade para se realizar inserções e deleções

> ``List<String> list = new ArrayList<>();``

### Implementações:
#### `ArrayList` e `Vector`:
- **"Implementações de arrays redimensionáveis"**.
- Ambas usam um array para armazenar os elementos. Quando esse array fica cheio e você tenta adicionar um novo elemento, elas criam um novo array maior e copiam todos os elementos do antigo para o novo.

- **"Comportamentos praticamente idênticos"**.

- **"`Vector` é do Java 1.0, antes da estrutura de coleções"**.
- **"Inserir um elemento entre os elementos existentes de uma `ArrayList` ou `Vector` é uma operação ineficiente"**.

##### `LinkedList`

- **"Permite a inserção (ou remoção) eficiente dos elementos no meio de uma coleção"**.
- **"É menos eficiente que uma `ArrayList` para pular para um elemento específico na coleção"**.

## Declaração LinkedList;
```java
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class ExemploLinkedList {
    public static void main(String[] args) {
        // Criando uma LinkedList com alguns elementos
        LinkedList<String> cores = new LinkedList<>(Arrays.asList("azul", "vermelho", "verde"));
        
        // Adicionando mais elementos
        cores.add("amarelo");
        cores.add("preto");
        
        // Exibindo a lista
        System.out.println(cores);
    }
}
```
- *aslist*: é um  método de fábrica da classe java.util.Arrays que permite criar rapidamente uma List a partir de um array existente ou de uma sequência de elementos.

- No *ITERATOR*:
- hasNext: verifica se há mais elementos na lista.
- next: retorna o próximo elemento na lista.
### Métodos da Interface `List`
Claro, Kayque. Aqui estão os 10 métodos mais utilizados e essenciais da interface `List` em Java, com exemplos práticos de suas sintaxes de chamada.

###  Métodos de `List`

1.  **`add(E element)`**
- **O que faz:** Adiciona um elemento ao final da lista.
- **Sintaxe da Chamada:** `minhaLista.add("Novo Item");`

2.  **`get(int index)`**
- **O que faz:** Retorna o elemento que está em uma posição (índice) específica.
- **Sintaxe da Chamada:** `String item = minhaLista.get(0);`

3.  **`size()`**
- **O que faz:** Retorna a quantidade total de elementos na lista.
- **Sintaxe da Chamada:** `int tamanho = minhaLista.size();`

4.  **`remove(int index)`**
- **O que faz:** Remove o elemento que está em uma posição específica.
- **Sintaxe da Chamada:** `minhaLista.remove(0);`
- *Variação comum: `remove(Object o)` remove a primeira ocorrência do objeto especificado.*

5.  **`set(int index, E element)`**
- **O que faz:** Substitui o elemento de uma posição específica por um novo elemento.
- **Sintaxe da Chamada:** `minhaLista.set(1, "Item Atualizado");`

6.  **`isEmpty()`**
- **O que faz:** Verifica se a lista está vazia. Retorna `true` ou `false`.
- **Sintaxe da Chamada:** `boolean estaVazia = minhaLista.isEmpty();`

7.  **`contains(Object o)`**
- **O que faz:** Verifica se a lista contém um determinado elemento.
- **Sintaxe da Chamada:** `boolean temOItem = minhaLista.contains("Item Procurado");`

8.  **`indexOf(Object o)`**
- **O que faz:** Procura por um elemento e retorna o índice de sua primeira ocorrência. Retorna -1 se não o encontrar.
- **Sintaxe da Chamada:** `int indice = minhaLista.indexOf("Item Procurado");`

9.  **`clear()`**
- **O que faz:** Remove **todos** os elementos da lista, deixando-a vazia.
- **Sintaxe da Chamada:** `minhaLista.clear();`

10. **`add(int index, E element)`**
- **O que faz:** Adiciona um elemento em uma posição específica, "empurrando" os elementos seguintes para a direita.
- **Sintaxe da Chamada:** `minhaLista.add(1, "Item Inserido");`

11. **`removeIf(condiçãoPredicado)`**
```java
   import java.util.ArrayList;
   import java.util.List;
   import java.util.function.Predicate;

   public class RemoveIfExample {
       public static void main(String[] args) {
           List<String> lista = new ArrayList<>();
           lista.add("A");
           lista.add("B");
           lista.add("C");
           lista.add("B");

           // Remove todos os elementos iguais a "B"
           lista.removeIf(elemento -> elemento.equals("B"));

           System.out.println(lista); // Output: [A, C]
       }
   }
```