## Funções no Java
- Funções são blocos de código que realizam uma tarefa específica e podem ser reutilizados em diferentes partes do programa.
- É (chamada de **método**) é um **bloco de código que executa uma tarefa específica**.
- Estrutura de uma função em Java

```java
modificador static tipoRetorno nomeDoMetodo(parâmetros) {
    // corpo do método
    // instruções
    return valor; // se o tipoRetorno não for void
}
```
- *Chamar a função*: `nomeDoMetodo(argumentos);`
### Componentes explicados:

| Parte               | O que é                            | Exemplo                       |
| ------------------- | ---------------------------------- | ----------------------------- |
| **modificador**     | Define a visibilidade do método    | `public`, `private`, `static` |
| **tipoRetorno**     | Tipo do valor que o método retorna | `int`, `String`, `void`       |
| **nomeDoMetodo**    | Nome que você dá ao método         | `soma`, `mostrarMensagem`     |
| **parâmetros**      | Entradas para o método             | `(int a, int b)`              |
| **corpo do método** | Bloco de código a ser executado    | `{ ... }`                     |

###  Tipos de métodos em Java

| Tipo de método     | Descrição                                                          |
| ------------------ | ------------------------------------------------------------------ |
| **`void`**         | Não retorna valor                                                  |
| **Com retorno**    | Retorna valor de tipo específico (`int`, `double`, `String`, etc.) |
| **`static`**       | Pertence à classe, e não ao objeto                                 |
| **Com parâmetros** | Recebe valores de entrada                                          |
| **Sem parâmetros** | Não recebe entradas                                                |

- Exemplo:

```java
public class Calculadora {

    // Método sem retorno
    public void mostrarBoasVindas() {
        System.out.println("Bem-vindo à calculadora!");
    }

    // Método com retorno
    public int multiplicar(int x, int y) {
        return x * y;
    }

    // Método com retorno double
    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Divisão por zero!");
            return 0;
        }
    }
}
```

### Como usar os métodos:

```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.mostrarBoasVindas();

        int produto = calc.multiplicar(3, 4);
        System.out.println("Produto: " + produto);

        double resultado = calc.dividir(10, 2);
        System.out.println("Resultado da divisão: " + resultado);
    }
}
```

## Modificadores de Acesso

| Modificador | Acesso                               |
| ----------- | ------------------------------------ |
| `public`    | Qualquer classe pode acessar         |
| `private`   | Somente dentro da mesma classe       |
| `protected` | Dentro do mesmo pacote ou subclasses |
| (default)   | Somente dentro do mesmo pacote       |

---