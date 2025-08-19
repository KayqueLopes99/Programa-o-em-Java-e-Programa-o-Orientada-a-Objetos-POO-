## **Interface `Comparable` no Java**

### **O que é**

* É uma **interface genérica** (`Comparable<T>`) usada para definir uma **ordem natural** entre objetos de uma classe.
* Ela obriga a implementar o método:

  ```java
  public int compareTo(T other);
  ```
* Esse método retorna:

  * **Negativo** → se o objeto atual é "menor" que `other`.
  * **Zero** → se são **iguais**.
  * **Positivo** → se o objeto atual é "maior" que `other`.

---

### **Quando usar**

* Quando você quer **ordenar objetos de uma classe** (ex: lista de pessoas por nome ou idade).
* Funciona junto com métodos como `Collections.sort()` ou `Arrays.sort()`.

---

### **Sintaxe**

Exemplo simples com `Pessoa`:

```java
class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Implementação da comparação pela idade
    @Override
    public int compareTo(Pessoa outra) {
        return Integer.compare(this.idade, outra.idade);
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }
}
```

Uso:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Ana", 25));
        lista.add(new Pessoa("Carlos", 20));
        lista.add(new Pessoa("Beatriz", 30));

        Collections.sort(lista); // Usa compareTo()

        for (Pessoa p : lista) {
            System.out.println(p);
        }
    }
}
```

---

### **Resumo**

* `Comparable<T>` → define ordem **natural** da classe.
* Método obrigatório:

  ```java
  int compareTo(T obj);
  ```
* Usado com `Collections.sort()` e `Arrays.sort()` para ordenar.

---