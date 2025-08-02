# Questões de Lógica de Programação em Java
## Questão 23 – [UFPR - 2023 - IF-PR - Informática]

Assinale a alternativa correspondente à saída que será apresentada na tela ao executar o código abaixo, inserindo como entrada o valor **5** para a média e **0,75** para frequência.

```` java
import java.util.Scanner;

public class LogicaCondicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a media, de 0 a 10: ");
        float media_aluno = input.nextFloat();
        System.out.println("Entre com a frequencia de 0 a 1 (indicando 100%): ");
        float frequencia = input.nextFloat();
        float media = 7;
        float frequencia_minima = 0.75f;
        if (media_aluno >= media && frequencia >= frequencia_minima) {
            System.out.println("Voce foi aprovado!");
        } else if (media_aluno >= media) {
            System.out.println("Solicite aprovacao mediante justificativa de faltas.");
        } else if (frequencia >= frequencia_minima) {
            float recuperar = media * 2 - media_aluno;
            if (recuperar <= 10)
                System.out.println("Esta em recuperacao, tirar no minimo " + recuperar);
            else
                System.out.println("Nao esta apto para recuperacao.");
        } else {
            System.out.println("Voce esta reprovado.");
        }
    }
}
````

### Alternativas:

* (A) Você foi aprovado!
* (B) Solicite aprovação mediante justificativa de faltas.
* (C) Está em recuperação, tirar no mínimo 8.0 
* (D) Não está apto para recuperação.
* (E) Você está reprovado.
> Resposta: ( C )

## Questão 24 – \[IDECAN - 2023 - Técnico em Tecnologia da Informação]

```java
public class Main {
    public static void main (String[] args) {
        int x, y;
        y = 1;
        x = 1 + ++y;
        System.out.println(x--);
    }
}
```

### Qual o resultado mostrado na tela?

* (A) 0
* (B) 1
* (C) 2
* (D) 3
* (E) error in line 5: invalid operation
> Resposta: ( D )
---

## Questão 25 – \[FADE - UFPE - 2023 - Analista de TI - Sistemas]

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(proc(5));
    }

    public static int proc(int k) {
        if (k > 0) return proc(k - 2) + proc(k - 1);
        return 1;
    }
}
```

### A execução do código resulta em:

* (A) 13
* (B) 8
* (C) 10
* (D) 9
* (E) 12

> Resposta: ( A )

``` md
proc(5)
├── proc(3)
│   ├── proc(1)
│   │   ├── proc(-1) → 1
│   │   └── proc(0)  → 1
│   │   → proc(1) = 1 + 1 = 2
│   └── proc(2)
│       ├── proc(0)  → 1
│       └── proc(1)
│           ├── proc(-1) → 1
│           └── proc(0)  → 1
│           → proc(1) = 1 + 1 = 2
│       → proc(2) = 1 + 2 = 3
│   → proc(3) = 2 + 3 = 5
└── proc(4)
    ├── proc(2)
    │   ├── proc(0)  → 1
    │   └── proc(1)
    │       ├── proc(-1) → 1
    │       └── proc(0)  → 1
    │       → proc(1) = 1 + 1 = 2
    │   → proc(2) = 1 + 2 = 3
    └── proc(3)
        ├── proc(1)
        │   ├── proc(-1) → 1
        │   └── proc(0)  → 1
        │   → proc(1) = 1 + 1 = 2
        └── proc(2)
            ├── proc(0)  → 1
            └── proc(1)
                ├── proc(-1) → 1
                └── proc(0)  → 1
                → proc(1) = 2
            → proc(2) = 1 + 2 = 3
        → proc(3) = 2 + 3 = 5
    → proc(4) = 3 + 5 = 8
→ proc(5) = 5 + 8 = 13
```
---

## Questão 26 – \[FGV - 2023 - AL-MA - Programador - Superior]

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            } else if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

### Quantidade de valores exibidos:

* (a) 0
* (b) 2
* (c) 3
* (d) 5
* (e) 9
> Resposta: ( B )
---

## Questão 27 – \[IFRN - 2009 - Professor - Sistemas de Informação]

```java
public class Operador {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        double c = 10.5;
        a = b = (int) c;
        System.out.print(" | " + a++ + " | ");
        if (a++ < 12 || ++b > 5) {
            System.out.print(b + " | ");
        } else {
            System.out.println(c + " | ");
        }
    }
}
```

### Saída:

* (A) | 10 | 9 |
* (B) | 10 | 10 |
* (C) | 10 | 10.5 |
* (D) | 11 | 9 |
> Resposta: ( B )
---

## Questão 28 – \[UFC - 2013 - Analista TI / Engenharia de Software]

```java
public class Loop {
    public static void main(String[] args) {
        int a, b;
        a = 1; b = 2;
        while (a < 7) {
            a = b + a;
            do {
                b = a + b;
                a = a + 1;
            } while (b < 9);
        }
        System.out.println(a + " e " + b);
    }
}
```

### Resultado exibido:

* (A) 0 e 18
* (B) 1 e 19
* (C) 6 e 24
* (D) 9 e 17
* (E) 15 e 23
> Resposta: ( E )
- Justificativa:
```
a = 3 | b = 9 | a = 14
b = 5 | a = 5 | b = 23
a = 4 |       | a = 15
```

---

## Questão 29 – \[VUNESP - 2023 - EsFCEx - Oficial Quadro Complementar]

```java
class Main {
    public static void main(String[] args) {
        int x;
        x = 10 * 2 % 3 + 5;
        System.out.println("Valor: " + x++);
    }
}
```

### Valor impresso:
* (A) 25
* (B) 8
* (C) 4
* (D) 7
* (E) 26

> Resposta: ( D ): Esquerda -> Direita. 