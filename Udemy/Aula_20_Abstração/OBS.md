## Métodos, Classes e Variáveis `final`

- **Variáveis `final`**:  
    Uma variável declarada como `final` não pode ser modificada após ser inicializada.  
    Exemplo:
    ```java
    final int x = 10;
    // x = 20; // Erro! Não pode alterar o valor de x
    ```

- **Métodos `final`**:  
    Um método declarado como `final` não pode ser sobrescrito (overridden) por subclasses.  
    Exemplo:
    ```java
    class Pai {
            final void metodoFinal() { }
    }
    class Filho extends Pai {
            // void metodoFinal() { } // Erro! Não pode sobrescrever
    }
    ```

- **Classes `final`**:  
    Uma classe declarada como `final` não pode ser estendida (herdada) por outras classes.  
    Exemplo:
    ```java
    final class MinhaClasse { }
    // class OutraClasse extends MinhaClasse { } // Erro!
    ```

---

## Operador `instanceof`

- O operador `instanceof` verifica se um objeto é uma instância de uma classe específica ou de suas subclasses.
- Retorna `true` se o objeto for do tipo especificado, caso contrário retorna `false`.

Exemplo:
```java
if (empregado instanceof Empregado) {
        // empregado é uma instância de Empregado ou de uma subclasse
}
```

**Resumo:**  
- Use `final` para impedir modificações, sobrescritas ou heranças.
- Use `instanceof` para checar o tipo de um objeto em tempo de execução.
