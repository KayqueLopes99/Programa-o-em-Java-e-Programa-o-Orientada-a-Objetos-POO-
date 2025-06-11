## Questão 53 — FCC - 2022 - Analista Judiciário - Tecnologia da Informação
Considere o código Java abaixo:

```java
public class Main {
    public static void main(String args[]) {
        int dados[][] = new int[5][];
        for(int i = 0; i < 5; i++) {
            dados[i] = new int[5];
            for(int j = 0; j < 5; j++) {
                dados[i][j] = i + j;
                System.out.println(dados[i][j]);
            }
        }
    }
}
```

**Sobre o código:**

* (A) Ocorrerá uma exceção do tipo NullPointerException, pois na terceira linha não foi definido o número de linhas da array dados.
* (B) Ao tirar o comando `dados[i] = new int[5];` o programa executará normalmente.
* (C) O comando `int[][] dados = new int[5][];` precisa obrigatoriamente ser substituído por `int[][] dados = new int[5][5];`.
* (D) `i < 5` na quarta linha pode ser substituído por `i < dados.length` sem afetar a lógica de execução.
* (E) Ocorrerá uma exceção do tipo NullPointerException no comando `dados[i][j] = i + j;`.

> **-- > (D) i < 5 na quarta linha pode ser substituído por i < dados.length sem afetar a lógica de execução.**

---

## Questão 54 — UFMA - 2023 - Analista de Tecnologia da Informação

Na linguagem Java, qual das alternativas representa uma declaração válida?

* (A) `char[] ch = new char[5]`
* (B) `char[] ch = new char(5)`
* (C) `char[] ch = new char()`
* (D) `char[] ch = new char[]`
* (E) `char[] ch = new [5]`

> **-- > (A) char[] ch = new char[5]**
---

## Questão 55 — CONSULPLAN - 2017 - TRF - 2ª REGIÃO - Analista Judiciário - Informática Desenvolvimento

Considere os valores digitados: `14, 40, 16, 22, 60`.

Trecho de código:

```java
for (i = 0; i < 5; i++) {
    for (j = 0; j < 4; j++) {
        if (vetor[j] < vetor[j + 1]) {
            aux = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = aux;
        }
    }
}
```

**Qual valor será exibido ao final?**

* (A) 14, 16, 22, 40 e 60.
* (B) 28, 32, 44, 80 e 120.
* (C) 60, 40, 22, 16 e 14.
* (D) 120, 80, 44, 32 e 28.

> **-- > (C) 60, 40, 22, 16 e 14.**
---

## Questão 56 — CS-UFG - 2024 - Câmara de Anápolis - GO - Analista de Sistemas

Trecho de código:

```java
int index, aux, i, j;
for (i = 0; i <= 3; i++) {
    index = i;
    for (j = i + 1; j <= 4; j++) {
        if (v[j] < v[index]) {
            index = j;
        }
    }
    if (index != i) {
        aux = v[index];
        v[index] = v[i];
        v[i] = aux;
    }
}
```

Vetor de entrada: `v = [3, 7, 2, 3, 10]`

**Saída esperada:**

* (A) `[10, 7, 3, 3, 2]`
* (B) `[2, 3, 10, 3, 7]`
* (C) `[3, 3, 2, 10, 7]`
* (D) `[2, 3, 3, 7, 10]`

> **-- > (D) [2, 3, 3, 7, 10]**
---

## Questão 57 — FADE - UFPE - 2023 - Analista de TI - Sistemas

Código:

```java
public class Main {
    public static void main(String[] args) {
        Integer[] A = new Integer[3];
        A[0] = 2;
        A[1] = 3;
        A[2] = 9;
        proc(A, A[2]);
        System.out.println(A[0] + A[1] + A[2]);
    }

    private static void proc(Integer[] B, Integer c) {
        B[0] = c;
        B[2] = B[0] + B[1];
    }
}
```

**Valor impresso:**

* (A) 14
* (B) 17
* (C) 24
* (D) 11
* (E) 21

> **-- > (C) 24**

---

## Questão 58 — FADE - UFPE - 2023 - Analista de TI - Sistemas

Código:

```java
public class Main {
    public static void main(String[] args) {
        int[] A = {12, 25, 16, 11, 9, 31, 23, 27, 22};
        System.out.println(A[A[2] - A[4]] - A[6]);
    }
}
```

**Valor impresso:**

* (A) 4
* (B) 3
* (C) 2
* (D) 1
* (E) 0

> **-- > (A) 4**
---

## Questão 59 — UFU-MG - 2023 - Analista de TI - Desenvolvimento de Sistemas

Código:

```java
public class App {
    public static void main(String[] args) {
        int[] j = new int[6];
        for (int i = 0; i < 6; i++)
            j[i] = i;
        App func = new App();
        System.out.println(func.f(j, 6));
    }

    public int f(int j[], int n) {
        if (n <= 0) return 1;
        return j[n - 1] * f(j, n - 2) + 1;
    }
}
```

**Resultado da execução:**

* (A) 36
* (B) 42
* (C) 33
* (D) 26

> **-- > (A) 36**
---

## Questão 60 — IFRN - 2009 - Professor - Sistemas de Informação

Código:

```java
public class test {
    public static void main(String[] SSn10) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5,6,7,8,9,10};
        final int tam = a.length;
        for(int f = 0; f < tam; f++)
            a[f] = a[f] * f;
        tam = b.length;
        for(int f = 0; f < tam; f++)
            b[f] += a[f / 2] % (f + 1);
    }
}
```

**Linha com erro de compilação:**

* (A) 2
* (B) 7
* (C) 8
* (D) 10

> **-- > (C) 8**

## Resumo:
**53** - (D) i < 5 na quarta linha pode ser substituído por i < dados.length sem afetar a lógica de execução.
**54** - (A) char[ ] ch = new char[5]
**55** - (C) 60, 40, 22, 16 e 14.
**56** - (D) 2, 3, 3, 7, 10
**57** - (C) 24
**58** - (A) 4
**59** - (A) 36
**60** - (C) 8