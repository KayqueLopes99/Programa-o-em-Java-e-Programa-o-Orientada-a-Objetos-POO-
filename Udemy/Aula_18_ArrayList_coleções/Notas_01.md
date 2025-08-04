## Coleções
- A Java API fornece várias estruturas de dados predefinidas, chamadas coleções, usadas para armazenar grupos de objetos relacionados Essas classes fornecem métodos eficientes que organizam, armazenam e recuperam seus dados de forma transparente. 

## ArrayList

- Arrays não mudam automaticamente o tamanho em tempo de execução.
- Objetos da classe de coleção `ArrayList<T>` (pacote `java.util.ArrayList`) **podem alterar dinamicamente seu tamanho** para acomodar mais elementos.
- O `T` representa um espaço reservado: ao declarar um novo `ArrayList`, substitua-o pelo tipo dos elementos que você deseja que o `ArrayList` armazene.

```java
ArrayList<String> list;
```
* Como vimos, classes com esse tipo de espaço reservado que podem ser usadas com qualquer tipo são chamadas **classes genéricas**.

## Sintaxe e Exemplo

```java
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println(frutas); // [Maçã, Banana, Laranja]
    }
}
```

---

## Classe Genérica

* **Somente tipos não primitivos** podem ser usados para declarar variáveis e criar objetos das classes genéricas.
* Mas o Java fornece um mecanismo conhecido como **boxing**, que permite que **valores primitivos sejam empacotados como objetos** para uso com classes genéricas.

### Exemplo:

```java
ArrayList<Integer> inteiros = new ArrayList<>();
inteiros.add(10); // boxing automático: int → Integer
int valor = inteiros.get(0); // unboxing automático: Integer → int
```

###  Classes empacotadoras de tipo:

* `Boolean`
* `Byte`
* `Character`
* `Double`
* `Float`
* `Integer`
* `Long`
* `Short`

---

## Métodos de ArrayList

| Método     | Descrição                                                             | Exemplo de uso                                 |
| ---------- | --------------------------------------------------------------------- | ---------------------------------------------- |
| `add`      | Adiciona um elemento ao final do `ArrayList`                          | `lista.add("Valor");`                          |
| `clear`    | Remove todos os elementos do `ArrayList`                              | `lista.clear();`                               |
| `contains` | Retorna `true` se o `ArrayList` contém o elemento especificado        | `lista.contains("Valor");`                     |
| `get`      | Retorna o elemento no índice especificado                             | `lista.get(0);`                                |
| `indexOf`  | Retorna o índice da **primeira ocorrência** do elemento especificado  | `lista.indexOf("Valor");`                      |
| `remove`   | Remove a **primeira ocorrência** do valor ou o **elemento no índice** | `lista.remove("Valor");` ou `lista.remove(0);` |
| `size`     | Retorna o número de elementos armazenados em `ArrayList`              | `lista.size();`                                |

---

### Exemplos

```java
ArrayList<String> nomes = new ArrayList<>();

// add
nomes.add("João");
nomes.add("Maria");

// size
System.out.println(nomes.size()); // 2

// get
System.out.println(nomes.get(1)); // Maria

// contains
System.out.println(nomes.contains("João")); // true

// indexOf
System.out.println(nomes.indexOf("Maria")); // 1

// remove por valor
nomes.remove("João"); // Remove "João"

// remove por índice
nomes.remove(0); // Remove o elemento no índice 0

// clear
nomes.clear(); // Remove todos os elementos
```

---

## Inicialização de um ArrayList

```java
ArrayList<String> itens = new ArrayList<String>();
ArrayList<String> itens = new ArrayList<>();
```

* Cria um novo `ArrayList` vazio de Strings com uma **capacidade inicial padrão de 10 elementos**.
* A **capacidade** indica quantos itens o `ArrayList` pode armazenar **sem crescer**.
* Um `ArrayList` é implementado usando um **array convencional** internamente.
* Para crescer, ele deve criar um array interno **maior** e copiar cada elemento para a nova estrutura.
