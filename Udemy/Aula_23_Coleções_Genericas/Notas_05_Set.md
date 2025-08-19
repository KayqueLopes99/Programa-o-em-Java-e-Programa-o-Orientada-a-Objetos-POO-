## Set
- Definição: Uma coleção que não permite elementos duplicados.
- A interface `Set` estende a interface `Collection` e não permite elementos duplicados.
- importação:
```java
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
```

### obs:
> Não admite repetições
> Elementos não possuem posição
> Acesso, inserção e remoção de elementos são rápidos
> Oferece operações eficientes de conjunto: interseção, união, diferença.

> Principais implementações:

> **HashSet** - mais rápido (operações O(1) em tabela hash) e não ordenado

> **TreeSet** - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)

> **LinkedHashSet** - velocidade intermediária e elementos na ordem em que são adicionados

- HashSet: Implementa a interface `Set` e usa uma tabela hash para armazenar os elementos.
- TreeSet: Implementa a interface `Set` e usa uma árvore binária balanceada (geralmente uma árvore vermelha-preta) para armazenar os elementos em ordem crescente.

### métodos:
- `add`: Adiciona um elemento ao conjunto, se ele ainda não estiver presente.
- `remove`: Remove um elemento do conjunto, se ele estiver presente.
- `contains`: Verifica se um elemento está presente no conjunto.
- `size`: Retorna o número de elementos no conjunto.
- `isEmpty`: Verifica se o conjunto está vazio.
- `clear`: Remove todos os elementos do conjunto.
- `removeIf(predicate)`: remove quem atende a condição no predicado.
- ``addAll(other)`` - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
- ``retainAll(other)`` - interseção: remove do conjunto os elementos não contitos em other
- ``removeAll(other)`` - diferença: remove do conjunto os elementos contidos em other

- `get()` - pegar um elemento

### Outros:
- *headSet*: Retorna uma visão do conjunto que contém todos os elementos menores ou iguais a um determinado elemento.
- *tailSet*: Retorna uma visão do conjunto que contém todos os elementos maiores ou iguais a um determinado elemento.
- *subSet*: Retorna uma visão do conjunto que contém todos os elementos entre dois elementos especificados.
- *first*: Retorna o primeiro elemento do conjunto.
- *last*: Retorna o último elemento do conjunto.

```java
import java.util.*;
public class ExemploSet {
    public static void main(String[] args) {
        // Criando um HashSet
        Set<String> conjunto = new HashSet<>();
        
        // Adicionando elementos
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");
        conjunto.add("Java"); // Duplicado, não será adicionado
        
        // Exibindo o conjunto
        System.out.println("Conjunto: " + conjunto); // Saída: [Java, Python, C++]
        
        // Verificando se um elemento está presente
        System.out.println("Contém 'Java'? " + conjunto.contains("Java")); // Saída: true
        
        // Removendo um elemento
        conjunto.remove("Python");
        System.out.println("Após remover 'Python': " + conjunto); // Saída: [Java, C++]
        
        // Tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + conjunto.size()); // Saída: 2
        
        // Verificando se o conjunto está vazio
        System.out.println("Está vazio? " + conjunto.isEmpty()); // Saída: false
        
        // Limpando o conjunto
        conjunto.clear();
        System.out.println("Após limpar, está vazio? " + conjunto.isEmpty()); // Saída: true
    }
}
```


## Comparação de elemento com o set:
> Necessita de um método equals e hashcode na classe associada a estrutura e dados.

## Como TreeSet compara os elementos:
> Uso do método compareTo() na classe associada