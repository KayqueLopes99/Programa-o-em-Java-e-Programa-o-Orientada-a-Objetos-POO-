## 01. Operadores de Atribuição
- Usados para **atribuir valores** a variáveis.

| Operador | Significado          | Exemplo  |
| -------- | -------------------- | -------- |
| `=`      | Atribuição simples   | `x = 10` |
| `+=`     | Soma e atribui       | `x += 5` |
| `-=`     | Subtrai e atribui    | `x -= 2` |
| `*=`     | Multiplica e atribui | `x *= 3` |
| `/=`     | Divide e atribui     | `x /= 2` |
| `%=`     | Módulo e atribui     | `x %= 3` |


## 02. Operadores Relacionais (Comparação)

- Usados para comparar dois valores. O resultado sempre será `true` ou `false`.

| Operador | Significado      | Exemplo  |
| -------- | ---------------- | -------- |
| `==`     | Igual a          | `x == y` |
| `!=`     | Diferente de     | `x != y` |
| `>`      | Maior que        | `x > y`  |
| `<`      | Menor que        | `x < y`  |
| `>=`     | Maior ou igual a | `x >= y` |
| `<=`     | Menor ou igual a | `x <= y` |


## 03. Operadores Unários
- Operam em apenas **um operando**.

| Operador | Significado    | Exemplo           |
| -------- | -------------- | ----------------- |
| `+`      | Valor positivo | `+x`              |
| `-`      | Negativo       | `-x`              |
| `++`     | Incremento     | `x++` ou `++x`    |
| `--`     | Decremento     | `x--` ou `--x`    |
| `!`      | Negação lógica | `!true` → `false` |

### Pós e Pré-incremento/decremento	
- `x++` (pós-incremento): Retorna o valor de `x` antes de incrementar.
- `++x` (pré-incremento): Incrementa `x` e retorna o novo valor.
- `x--` (pós-decremento): Retorna o valor de `x` antes de decrementar.
- `--x` (pré-decremento): Decrementa `x` e retorna o novo valor.
- Exemplo:

```java
public class IncrementoExemplo {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pós-incremento: " + (a++)); // 5
        System.out.println("Agora a vale: " + a);       // 6

        int b = 5;
        System.out.println("Pré-incremento: " + (++b)); // 6
        System.out.println("Agora b vale: " + b);       // 6
    }
}

```


## 04. Operador Ternário
- Usado como uma forma curta de `if-else`.
- Sintaxe:

``` java
condição ? valor_se_verdadeiro : valor_se_falso;

```
- Exemplo: 

```java
int idade = 20;
String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
```