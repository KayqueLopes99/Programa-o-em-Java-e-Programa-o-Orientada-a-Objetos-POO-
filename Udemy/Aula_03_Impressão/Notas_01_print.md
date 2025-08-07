## Impressão de Dados no Java (`System.out` e `System.err`)
- A **impressão de dados** no console é feita com os objetos **`System.out`** e **`System.err`**.

###  `System.out` – Saída padrão (standard output)
- Usado para **mostrar mensagens normais** ou resultados no console.
- Padrão: **Mostrar dados ao usuário**.
- Há três métodos principais para imprimir dados: `print()`, `println()` e `printf()`.

- Sintaxe:
```java
System.out.print("Texto sem quebra de linha");
System.out.println("Texto com quebra de linha");
System.out.printf("Texto formatado: %d", 10);
```
- Exemplo:
```java
System.out.print("Olá ");        // imprime sem pular linha
System.out.println("Mundo!");    // imprime e pula para próxima linha
System.out.printf("Idade: %d anos\n", 22); // imprime com formatação
```
---

| Método      | Comportamento                          |
| ----------- | -------------------------------------- |
| `print()`   | Imprime sem quebrar a linha            |
| `println()` | Imprime e adiciona uma quebra de linha |
| `printf()`  | Imprime com formatação (como em C)     |

---

### `System.err` – Saída de erro (error output)
- Usado para mensagens de erro ou alertas.
- Sintaxe:

```java
System.err.print("Erro ocorreu");
System.err.println("Erro na leitura do arquivo!");
```

```java
int idade = -5;
if (idade < 0) {
    System.err.println("Erro: idade inválida!");
}
```


## Especificadores de formato (`%`) para o printf
| Tipo Primitivo | Especificador (`%`) | Descrição                                           | Exemplo de Uso                         |
| -------------- | ------------------- | --------------------------------------------------- | -------------------------------------- |
| `int`          | `%d`                | Inteiro decimal                                     | `System.out.printf("%d", 100);`        |
| `long`         | `%d` ou `%ld`       | Inteiro longo (pode usar `%d`)                      | `System.out.printf("%d", 100000L);`    |
| `float`        | `%f`                | Número decimal com casas decimais (ponto flutuante) | `System.out.printf("%.2f", 3.14f);`    |
| `double`       | `%f`                | Número decimal (ponto flutuante duplo)              | `System.out.printf("%.2f", 2.71828);`  |
| `char`         | `%c`                | Caractere único                                     | `System.out.printf("%c", 'A');`        |
| `boolean`      | `%b`                | Valor lógico (true/false)                           | `System.out.printf("%b", true);`       |
| `String`       | `%s`                | Texto (sequência de caracteres)                     | `System.out.printf("%s", "Olá");`      |
| `String`       | `%n`                | Nova linha (independente do sistema operacional)    | `System.out.printf("Linha1%nLinha2");` |



###  Caracteres de escape: \n e \t 
- \n : Nova linha (line break)
- \t : Tabulação horizontal (tab)
- Insere um espaço horizontal 4 ou 8.

### `+` Operador de Adição
- Usado para **concatenação de Strings**.

```java
String nome = "José";
String saudacao = "Olá " + nome; // concatenação → "Olá José"
```

## **Locale.setDefault(Locale.US);**:
- Usado para definir o **formato de números decimais** com ponto (.) ao invés de vírgula (,).
```java
import java.util.Locale;
```