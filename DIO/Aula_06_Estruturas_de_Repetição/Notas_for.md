## Contadores
- Variáveis que recebem um valor inicial e são modificadas a cada iteração de uma estrutura de repetição.
- Contadores podem ser variáveis de qualquer tipo numérico.
+ Estas variáveis devem:
- receber um valor inicial
- ser alteradas a cada iteração do laço ter seu valor verificado a cada iteração a fim de saber se um valor final foi alcançado.

- Por exemplo, para fazer uma estrutura que conte de um até dez, pode-se utilizar um contador que receberá o valor inicial de um, sendo acrescido de um em um até que o valor deste contador seja igual a dez, interrompendo então a repetição do laço.

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

