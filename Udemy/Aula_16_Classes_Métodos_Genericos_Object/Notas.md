## Métodos e Classes Genericas:
- **Genéricos** permitem que você escreva **métodos e classes reutilizáveis**, onde o **tipo de dado** é **especificado no momento do uso**, e **não fixo no código**.
> Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo.
> Uso em coleções

###  Motivação: 
Imagina que você quer criar um método para retornar o **maior valor** entre dois dados. Sem genéricos, você precisaria sobrecarregar o método:

```java
public static Integer maximo(Integer a, Integer b) { ... }

public static Double maximo(Double a, Double b) { ... }
```

- Isso **repetiria código**. Com genéricos, você cria um método **único**, que **funciona para qualquer tipo de objeto comparável**:

---

## Métodos Genéricos

###  Sintaxe:

```java
public static <T> T maximo(T a, T b) {
    // bloco
}
```

* `<T>` antes do tipo de retorno define que o método é **genérico**.
* `T` é o **parâmetro de tipo**, como se fosse um **marcador de posição** para o tipo real.
* Pode ser `Integer`, `Double`, `String`, etc. (qualquer **tipo por referência** – **não funciona com primitivos como `int` ou `double`** diretamente).

---

### Parâmetros de tipo em métodos podem:

* Ser usados como **tipo de retorno**
* Ser usados como **tipo de parâmetro**
* Ser usados como **tipo de variáveis locais**

- Exemplo de método genérico real:

```java
public class Util {
    public static <T> void imprimir(T valor) {
        System.out.println("Valor: " + valor);
    }
}
```


```java
public class Teste {
    public static void main(String[] args) {
        Util.imprimir("Texto");
        Util.imprimir(123);
        Util.imprimir(5.5);
    }
}
```

---

## Classes Genéricas
- Elas funcionam de forma semelhante aos métodos genéricos, mas aplicadas **à classe inteira**.

---

### Exemplo: Pilha Genérica

```java
public class Caixa<T> {
    private T item;  // tipo genérico T

    public void guardar(T novoItem) {
        item = novoItem;
    }

    public T mostrar() {
        return item;
    }
}

```

```java
public class TesteCaixa {
    public static void main(String[] args) {
        // Caixa que guarda texto
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Bombom");
        System.out.println("Texto na caixa: " + caixaTexto.mostrar());

        // Caixa que guarda número
        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(10);
        System.out.println("Número na caixa: " + caixaNumero.mostrar());

    }
}

```

## Obs:
- Métodos e Classes Genericas é ma maneira de fazer o código se adptar a diferentes tipos de dados, sem precisar criar várias versões do mesmo código.
- Isso ajuda a **reduzir a duplicação de código** e **aumentar a reutilização**.