### `length` para Arrays
- Para arrays, `length` é um **campo (atributo) público final** que pertence à instância do array. Isso significa que você o acessa diretamente após o nome da variável do array, sem parênteses. Ele retorna o número de elementos no array.

- **Sintaxe:**

```java
nomeDoArray.length
```

**Valor Retornado:**

Um inteiro (`int`) que representa o número de elementos no array.

**Exemplo:**

```java
public class ExemploArrayLength {
    public static void main(String[] args) {
        // Exemplo 3: Array bidimensional (matriz)
        // Para uma matriz, length no primeiro nível dá o número de linhas
        // e length em uma linha específica dá o número de colunas dessa linha.
        int[][] matriz = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        int numeroDeLinhas = matriz.length; // numeroDeLinhas será 3
        System.out.println("A matriz tem " + numeroDeLinhas + " linhas.");

        // Para obter o número de colunas da primeira linha:
        int colunasPrimeiraLinha = matriz[0].length; // colunasPrimeiraLinha será 3
        System.out.println("A primeira linha da matriz tem " + colunasPrimeiraLinha + " colunas.");

        // Para iterar e mostrar o tamanho de cada linha
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("A linha " + i + " tem " + matriz[i].length + " colunas.");
        }
    }
}
```