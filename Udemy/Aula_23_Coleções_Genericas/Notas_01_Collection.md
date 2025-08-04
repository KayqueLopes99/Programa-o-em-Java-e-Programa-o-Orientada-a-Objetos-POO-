## Framework collection
- Uma coleção é um objeto que pode armazenar referências a outros objetos
- As classes e interfaces da estrutura das coleções são membros do pacote java.util
- definição de coleção: é um objeto que agrupa múltiplos elementos em uma única unidade

collection | A interface-raiz na hierarquia de coleções a partir da qual as interfaces Set, Queue e List são derivadas
*set* | Uma coleção que não permite elementos duplicados
*list* | Uma coleção ordenada que pode conter elementos duplicados
*queue* | Uma coleção que representa uma fila, onde os elementos são processados na ordem em que foram adicionados (Em geral, uma coleção “primeiro a entrar, primeiro a sair” que modela uma fila de espera; outras ordens podem ser especificadas)
*map* | Uma coleção que associa chaves a valores, onde cada chave é única e mapeada para um único valor

### RELEMBRANDO as classes empacotadoras de tipo
- As classes empacotadoras de tipo são usadas para converter tipos primitivos em objetos
- As classes empacotadoras de tipo são: Byte, Short, Integer, Long, Float, Double, Character e Boolean
- Manipular valores de tipo primitivo como objetos.
- Os métodos relacionados a um tipo primitivo estão localizados na classe empacotadora de tipo correspondente
- Exemplo: o método parseInt, que converte uma String em um valor int, está localizado na classe Integer.

## Autoboxing e Auto-unboxing
- Autoboxing é o processo de conversão automática de um tipo primitivo em seu tipo empacotador correspondente
- Auto-unboxing é o processo de conversão automática de um tipo empacotador em seu tipo primitivo correspondente
+ Autoboxing: tipo primitivo 🠆 objeto em pacotador de tipo
+ Auto-unboxing: objeto em pacotador de tipo 🠆 tipo primitivo
- Exemplo de autoboxing: `Integer i = 10;` (o valor int 10 é convertido automaticamente em um objeto Integer)
- Exemplo de auto-unboxing: `int j = i;` (o objeto Integer i é convertido automaticamente em um valor int)

## Interface Collection e classe Collections
- Contém operações comuns a todas as coleções.
- adicionar, limpar, comparar objetos, determinar tamanho, determinar se a coleção está vazia...
- Poder ser convertida em um array
- Fornece um método que retorna um objeto Iterator
permite percorrer a coleção e remover seus elementos durante a iteração

- A classe Collections fornece métodos static que pesquisam, classificam e realizam outras operações sobre as coleções.
### Declaração de toda collection
```java
import java.util.Collection;
public class ExemploCollection {
    public static void main(String[] args) {
        Collection<ClasseDoTipoPrimitivo> minhaColecao = new ColecaoEscolhida<>();
        // ClasseDoTipoPrimitivo é o tipo dos elementos que a coleção irá armazenar
        // ColecaoEscolhida é uma classe que implementa a interface Collection, como ArrayList, HashSet, etc.
        // Exemplo: Collection<Integer> minhaColecao = new ArrayList<>();
    }
}
```


### Métodos comuns da interface Collection

### 1. `sort`
> **Sua explicação:** "Classifica os elementos de uma List"

- Essa operação modifica a lista original (é uma operação *in-place*), ordenando seus elementos. 
- Sintaxe: 
```java
objetos.sort(List<T> list)
// explicação:
// `objetos` é o nome da classe que contém o método `sort`
// `List<T> list` é a lista que será ordenada, onde T é o tipo dos elementos da lista
```
- A ordenação pode ser feita de duas maneiras:
  - Usando a "ordem natural" dos elementos, definida pela interface `Comparable`.
  - Usando uma ordem customizada definida por um `Comparator`.


### 2. `binarySearch`

> **Sua explicação:** "Localiza um objeto em uma List usando o algoritmo de pesquisa binária"
- **a lista deve estar previamente ordenada**. Se o elemento for encontrado, ele retorna seu índice. Caso contrário, retorna um valor negativo.

- Sintaxe
```java
Collextios.binarySearch(lista, objeto);

// `lista` é a lista onde o objeto será pesquisado
// `objeto` é o elemento que estamos procurando na lista
```


### 3. `reverse`

> **Sua explicação:** "Inverte os elementos de uma List"
- Esta operação também é *in-place*. O primeiro elemento se torna o último, o segundo se torna o penúltimo, e assim por diante.

- Sintaxe

```java
Collections.reverse(lista);
// `lista` é a lista cujos elementos serão invertidos
```


### 4. `shuffle`

> **Sua explicação:** "Ordena aleatoriamente os elementos de uma List"
- Funciona como embaralhar um baralho de cartas, reorganizando os elementos da lista em uma ordem aleatória. A operação é *in-place*.

- Sintaxe
```java
Collections.shuffle(List<?> list);
// `list` é a lista que será embaralhada`
```


### 5. `fill`
> **Sua explicação:** "Configura todo elemento List para referir-se a um objeto especificado"

- Este método substitui todos os elementos existentes na lista por uma referência ao mesmo objeto fornecido.

- Sintaxe
```java
Collections.fill(List<? super T> list, T obj);
// `list` é a lista cujos elementos serão preenchidos
// `obj` é o objeto que será usado para preencher a lista
```


- Exemplo 
```java
import java.util.*;

public class ExemploFill {
    public static void main(String[] args) {
        List<String> vagas = new ArrayList<>(Arrays.asList("Livre", "Livre", "Livre"));
        System.out.println("Vagas antes: " + vagas);

        Collections.fill(vagas, "Ocupada");

        System.out.println("Vagas depois: " + vagas); // Saída: [Ocupada, Ocupada, Ocupada]
    }
}
```

### 6. `copy`

> **Sua explicação:** "Copia referências de uma List em outra"

- Copia os elementos da lista de origem (`src`) para a lista de destino (`dest`). **Atenção:** A lista de destino já deve ter um tamanho igual ou maior que a de origem, pois o método não aumenta o tamanho dela, apenas sobrescreve os elementos existentes.

- Sintaxe e exemplo

```java
import java.util.*;

public class ExemploCopy {
    public static void main(String[] args) {
        List<String> origem = Arrays.asList("A", "B", "C");
        List<String> destino = Arrays.asList("X", "Y", "Z", "W"); // Precisa ter tamanho >= 3

        System.out.println("Destino antes: " + destino);

        Collections.copy(destino, origem);

        System.out.println("Destino depois: " + destino); // Saída: [A, B, C, W]
    }
}
```


### 7. `min` e 8. `max`

> **Sua explicação:** "Retorna o menor/maior elemento em uma Collection"

#### Sintaxe e exemplo de Código
```java
import java.util.*;

public class ExemploMinMax {
    public static void main(String[] args) {
        Collection<Integer> numeros = Arrays.asList(8, 2, 10, 4, 9);

        Integer minimo = Collections.min(numeros);
        Integer maximo = Collections.max(numeros);

        System.out.println("Coleção: " + numeros);
        System.out.println("Menor elemento: " + minimo); // Saída: 2
        System.out.println("Maior elemento: " + maximo); // Saída: 10
    }
}
```


### 9. `addAll`

> **Sua explicação:** "Acrescenta todos os elementos de um array a uma Collection"

- É um método conveniente para adicionar vários elementos de uma vez a uma coleção, a partir de um array ou de uma lista de argumentos variáveis.

#### Sintaxe e exemplo de Código
```java
import java.util.*;

public class ExemploAddAll {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Item 1");
        System.out.println("Lista antes: " + lista);

        Collections.addAll(lista, "Item 2", "Item 3", "Item 4");

        System.out.println("Lista depois: " + lista); // Saída: [Item 1, Item 2, Item 3, Item 4]
    }
}
```


### 10. `frequency`

> **Sua explicação:** "Calcula quantos elementos da coleção são iguais ao elemento especificado"

- O método percorre a coleção e conta quantas vezes um determinado objeto aparece, usando o método `.equals()` para a comparação.

#### Sintaxe e Exemplo de Código

```java
import java.util.*;

public class ExemploFrequency {
    public static void main(String[] args) {
        Collection<String> palavras = Arrays.asList("java", "é", "legal", "java", "é", "poderoso", "java");

        int contagem = Collections.frequency(palavras, "java");

        System.out.println("A palavra 'java' aparece " + contagem + " vezes."); // Saída: 3
    }
}
```



### 11. `disjoint`

> **Sua explicação:** "Determina se duas coleções não têm nenhum elemento em comum"

- Retorna `true` se as duas coleções não tiverem absolutamente nenhum elemento em comum. Retorna `false` assim que encontra o primeiro elemento compartilhado entre elas.

#### Sintaxe e Exemplo de Código

```java
import java.util.*;

public class ExemploDisjoint {
    public static void main(String[] args) {
        Collection<Integer> grupo1 = Arrays.asList(1, 2, 3);
        Collection<Integer> grupo2 = Arrays.asList(4, 5, 6);
        Collection<Integer> grupo3 = Arrays.asList(3, 7, 8);

        // Não têm elementos em comum
        boolean semComum = Collections.disjoint(grupo1, grupo2);
        System.out.println("grupo1 e grupo2 são disjuntos? " + semComum); // Saída: true

        // Têm o elemento '3' em comum
        boolean comComum = Collections.disjoint(grupo1, grupo3);
        System.out.println("grupo1 e grupo3 são disjuntos? " + comComum); // Saída: false
    }
}
```