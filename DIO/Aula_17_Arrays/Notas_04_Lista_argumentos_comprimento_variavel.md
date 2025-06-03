## Listas de Argumentos de Comprimento Variável (`varargs`)
- Um tipo seguido por **reticências (`...`)** na lista de parâmetros de um método indica que o método **recebe um número variável de argumentos desse tipo**.
- Esses argumentos são tratados internamente como um **array unidimensional**.
- O tamanho do array é **determinado pela quantidade de argumentos passados**.

```java
double media(int n, double... numeros)
```

- No exemplo acima:

* `numeros` é um **array `double[]`**
* Ele será criado automaticamente com **quantidade de elementos igual ao número de argumentos passados**

### Regras 

* Pode haver **somente um parâmetro `varargs`** em um método.
* Ele deve estar **obrigatoriamente no final da lista de parâmetros**.
* O exemplo abaixo é **inválido**:

```java
double media(int... pesos, double... numeros); // Inválido: dois varargs
```

---

### ✅ Exemplo completo em Java

```java
public class VarArgsExemplo {

    // Método que calcula a média de números double
    public static double media(String titulo, double... numeros) {
        double soma = 0.0;

        for (double num : numeros) {
            soma += num;
        }

        double media = (numeros.length > 0) ? soma / numeros.length : 0.0;
        System.out.printf("%s - Média: %.2f%n", titulo, media);
        return media;
    }

    public static void main(String[] args) {
        media("Notas do aluno", 8.5, 7.0, 9.0);           // 3 argumentos
        media("Notas de matemática", 10.0, 8.5);          // 2 argumentos
        media("Nenhuma nota inserida");                   // Nenhum argumento
    }
}
```
