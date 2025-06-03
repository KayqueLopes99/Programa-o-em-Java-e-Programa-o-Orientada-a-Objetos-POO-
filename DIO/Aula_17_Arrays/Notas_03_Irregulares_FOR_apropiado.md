## Arrays Irregulares
- Arrays multidimensionais em Java **não precisam ter o mesmo número de valores em cada linha (dimensão interna)**.

- São chamados de **arrays irregulares** ou **jagged arrays**.
- Em Java, um array multidimensional é, na verdade, um **array de arrays**.

- Isso significa que cada linha pode ser de **tamanhos diferentes**.
- Em Java, ao criar um array 2D, você só precisa definir quantas linhas ele terá. As colunas de cada linha podem ser definidas depois, individualmente. Isso permite criar arrays irregulares, com linhas de tamanhos diferentes.

### Declaração de arrays irregulares
- Pode-se inicializar arrays irregulares de duas formas:

#### Exemplo com inicialização direta:
```java
int[][] b = { {1, 2}, {3, 4, 5} };
```
#### Exemplo com alocação posterior:

```java
int[][] matriz = new int[5][];  // Cria um array com 5 linhas (não inicializadas)
matriz[3] = new int[4];         // Inicializa a linha de índice 3 com 4 colunas
```

## Representação Visual de um Array Irregular
``` md
`matriz[0][]` [7] [1] [5] [8] [3] [6]
`matriz[1][]` [5] [11] [2]
`matriz[2][]` [7]
`matriz[3][]` [12] [7] [6] [9]
`matriz[4][]` [6] [9] [4] [5] [5] [10] [4] [1]
```

> Observe como cada linha tem um **tamanho diferente**, confirmando o conceito de array irregular.

---

## A Instrução `for` Aprimorada (`for-each`)
* É uma forma simplificada de percorrer os elementos de um array ou coleção.
* Evita o uso manual de índices.
* **Não permite alterar diretamente os valores do array.**
- Sintaxe:

```java
for (tipo elemento : nomeDoArray) {
    // instruções com o elemento
}
```

### Exemplo:

```java
public class ForAprimorado {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for (int num : array) {
            total += num;  // Soma os elementos
        }

        System.out.printf("Soma dos elementos: %d%n", total);
    }
}
```

| Característica       | `for` Tradicional | `for-each`       |
| -------------------- | ----------------- | ---------------- |
| Usa índice           | Sim               | Não              |
| Permite modificar    | Sim               | Não (só leitura) |
| Ideal para leitura   | Sim               | Sim              |
| Ideal para alteração | Sim               | Não              |
| Sintaxe mais simples | Não               | Sim              |
