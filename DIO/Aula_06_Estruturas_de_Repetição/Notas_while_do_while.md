## Estruturas de Repetição em Java: `while` e `do-while`
- As **estruturas de repetição** são usadas quando precisamos **repetir um bloco de código várias vezes**, dependendo de uma **condição lógica**.


## 1. Estrutura `while`
- A estrutura `while` repete o código **enquanto** a condição for verdadeira.
Antes de cada repetição, ele **verifica a condição**.
- Se for falsa **logo na primeira verificação**, o bloco **nem é executado**.
- Sintaxe:

```java
while (condição) {
    // bloco de código
}
```

- Exemplo:
```java
int contador = 0;

while (contador < 3) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### Loop Infinito com `while`:

```java
import java.util.Scanner;

public class ExemploMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break; // termina o loop
            } else {
                System.out.println("Você escolheu: " + opcao);
            }
        }
        sc.close();
    }
}
```

---

## 2. Estrutura `do-while`
- O bloco de código **é executado pelo menos uma vez**, **antes** de testar a condição.
- 
- Sintaxe:

```java
do {
    // bloco de código
} while (condição);
```
- A condição é verificada **após** a execução do bloco.
- Exemplo:

```java
int numero = 1;

do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero <= 3);
```



### Comparação

```java
int n = 10;

while (n < 5) {
    System.out.println("Não executa porque a condição é falsa logo no início.");
}

do {
    System.out.println("Executa pelo menos uma vez, mesmo que n < 5 seja falso.");
} while (n < 5);
```

---

## Loop Infinito com `do-while`:

```java
int tentativas = 0;
boolean senhaCorreta = false;

do {
    System.out.println("Tentando senha... tentativa " + tentativas);
    tentativas++;

    if (tentativas == 3) {
        senhaCorreta = true; // simula acerto
    }

} while (!senhaCorreta);
```
