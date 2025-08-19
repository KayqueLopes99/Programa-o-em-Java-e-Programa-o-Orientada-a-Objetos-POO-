## Classe Object
- Esses métodos fornecem um "contrato" fundamental para todos os objetos, cobrindo funcionalidades essenciais como comparação, representação em texto, concorrência e gerenciamento de memória.

### Os Métodos `Object`

#### 1. `toString()`
- **O que faz?** Retorna uma representação do objeto em formato de `String`.
**Exemplo:**

```java
public class Produto {
    private String nome;
    private double preco;

    // Construtor e outros métodos...

    @Override
    public String toString() {
        return "Produto[Nome=" + nome + ", Preço=R$" + preco + "]";
    }
}

Produto p = new Produto("Notebook", 4500.00);
System.out.println(p); // Imprime: Produto[Nome=Notebook, Preço=R$4500.00]
```


#### 2. `equals(Object obj)`
- **O que faz?** Compara se o objeto atual é "igual" a outro objeto.
- **Comportamento Padrão:** A implementação em `Object` funciona como o operador `==`. Ele verifica a **igualdade de referência**, ou seja, se as duas variáveis apontam para o mesmo local na memória.
- Sintaxe: 
```java
object1.equals(object2);
```


#### 3. `hashCode()`
- **O que faz?** Retorna um valor de hash (um número inteiro) para o objeto.
- **Comportamento Padrão:** Geralmente, converte o endereço de memória interno do objeto em um inteiro.

 

#### 4, 5 e 6. `wait()`, `notify()` e `notifyAll()`

- Esses três métodos são a base para a comunicação entre threads em Java.

#### 7. `getClass()`
- **O que faz?** Retorna o objeto `Class` que representa a classe do objeto em tempo de execução.

**Exemplo:**

```java
String texto = "Olá";
System.out.println(texto.getClass().getName()); // Imprime: java.lang.String
```

