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
- HashSet: Implementa a interface `Set` e usa uma tabela hash para armazenar os elementos.
- TreeSet: Implementa a interface `Set` e usa uma árvore binária balanceada (geralmente uma árvore vermelha-preta) para armazenar os elementos em ordem crescente.

### métodos:
- `add`: Adiciona um elemento ao conjunto, se ele ainda não estiver presente.
- `remove`: Remove um elemento do conjunto, se ele estiver presente.
- `contains`: Verifica se um elemento está presente no conjunto.
- `size`: Retorna o número de elementos no conjunto.
- `isEmpty`: Verifica se o conjunto está vazio.
- `clear`: Remove todos os elementos do conjunto.

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
