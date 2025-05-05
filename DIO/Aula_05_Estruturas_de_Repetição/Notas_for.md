## Estrutura de Repetição `for`
- Usada quando sabemos **quantas vezes queremos repetir** um bloco de código. Ela é ideal para **laços com contadores** (ex: repetir de 1 até 10).
- Pense no `for` como um **relógio programado para parar**: você define **o início**, **a condição de parada** e **como ele avança**.

- Sintaxe
```java
for (inicialização; condição; incremento/decremento) {
    // bloco de código a ser repetido
}
```

| Parte             | O que faz                                        | Exemplo                     |
| ----------------- | ------------------------------------------------ | --------------------------- |
| **inicialização** | Define a variável de controle                    | `int i = 0`                 |
| **condição**      | Condição que precisa ser verdadeira para repetir | `i < 5`                     |
| **incremento**    | Modo como a variável muda a cada repetição       | `i++` (soma 1 a cada volta) |

- Exemplo 

```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
    }
}
```


```java
for (int i = 5; i > 0; i--) {
    System.out.println("Contando: " + i);
}
```

---