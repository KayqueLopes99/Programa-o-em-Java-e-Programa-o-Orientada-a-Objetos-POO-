## Entrada de Dados - Scanner no Java
- O `Scanner` é uma **classe da linguagem Java** (do pacote `java.util`) usada para 
**ler entradas de dados do usuário** (como teclado, arquivos, etc.). O mais comum é 
usar para ler dados digitados no **teclado** via `System.in`.
-  **Importar a classe**
```java
import java.util.Scanner;
```
-**Criar um objeto Scanner**
- Ler os dados: usamos `System.in` (entrada padrão).

```java
Scanner nome_da_entrada = new Scanner(System.in);

nome_da_entrada.close(); // sempre feche o scanner no final
```

### 3. **Usar os métodos de leitura** 
- Com o objeto `entrada` para chamar os métodos e ler dados.
## Métodos mais usados da classe `Scanner` 

| Nº | Método            | Tipo retornado | Descrição                                | Exemplo                                  |
| -- | ----------------- | -------------- | ---------------------------------------- | ---------------------------------------- |
| 1  | `nextInt()`       | `int`          | Lê um número inteiro.                    | `int idade = entrada.nextInt();`         |
| 2  | `nextDouble()`    | `double`       | Lê um número decimal. Usa **ponto**.     | `double nota = entrada.nextDouble();`    |
| 3  | `nextFloat()`     | `float`        | Lê um número decimal (menor precisão).   | `float peso = entrada.nextFloat();`      |
| 4  | `nextLong()`      | `long`         | Lê um número inteiro grande.             | `long populacao = entrada.nextLong();`   |
| 5  | `nextShort()`     | `short`        | Lê um número inteiro curto.              | `short idade = entrada.nextShort();`     |
| 6  | `nextByte()`      | `byte`         | Lê um número muito pequeno.              | `byte valor = entrada.nextByte();`       |
| 7  | `next()`          | `String`       | Lê **uma palavra** (até o espaço).       | `String nome = entrada.next();`          |
| 8  | `nextLine()`      | `String`       | Lê uma **linha completa** (com espaços). | `String frase = entrada.nextLine();`     |
| 9  | `nextBoolean()`   | `boolean`      | Lê `true` ou `false`.                    | `boolean ativo = entrada.nextBoolean();` |
| 10 | `useDelimiter()`  | `Scanner`      | Define um delimitador personalizado.     | `entrada.useDelimiter(",");`             |
| 11 | `close()`         | `void`         | Fecha o Scanner. **Importante!**         | `entrada.close();`                       |
---

> nextLine: Para ler um texto ATÉ A QUEBRA DE LINHA
### Exemplo:

```java
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        entrada.nextLine(); // limpar buffer

        System.out.print("Digite sua profissão: ");
        String profissao = entrada.nextLine();

        System.out.print("Você está empregado? (true/false): ");
        boolean empregado = entrada.nextBoolean();

        System.out.println("\n--- DADOS INSERIDOS ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Profissão: " + profissao);
        System.out.println("Empregado: " + empregado);

        entrada.close();
    }
}
```
---