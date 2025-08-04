## Operadores Aritméticos em Java
- Realizar operações matemáticas básicas como adição, subtração, multiplicação, divisão e resto da divisão (módulo). Eles funcionam com os tipos numéricos primitivos: `byte`, `short`, `int`, `long`, `float` e `double`.
- Lista de Operadores Aritméticos

| Operador | Nome           | Uso     | Descrição                                     |
| -------- | -------------- | ------- | --------------------------------------------- |
| `+`      | Adição         | `a + b` | Soma dois valores                             |
| `-`      | Subtração      | `a - b` | Subtrai o segundo valor do primeiro           |
| `*`      | Multiplicação  | `a * b` | Multiplica dois valores                       |
| `/`      | Divisão        | `a / b` | Divide o primeiro valor pelo segundo          |
| `%`      | Módulo (resto) | `a % b` | Retorna o resto da divisão entre dois valores |


### 1. `+` Operador de Adição
- Soma dois números.
- Também é usado para **concatenação de Strings**.

```java
int a = 10;
int b = 5;
int resultado = a + b;  // resultado = 15

String nome = "José";
String saudacao = "Olá " + nome; // concatenação → "Olá José"
```


### 2. `-` Operador de Subtração

- Subtrai o segundo valor do primeiro.

```java
int a = 10;
int b = 4;
int resultado = a - b;  // resultado = 6
```

### 3. `*` Operador de Multiplicação
- Multiplica dois valores numéricos.
```java
int a = 6;
int b = 3;
int resultado = a * b;  // resultado = 18
```

### 4. `/` Operador de Divisão
- Divide o primeiro valor pelo segundo.
- CUIDADO: se ambos os operandos forem `int`, o resultado será inteiro!
- A divisão de inteiros produz um quociente inteiro. Por exemplo, a expressão 7 / 4 é avaliada como 1.

```java
int a = 10;
int b = 4;
int resultado = a / b;  // resultado = 2 (divisão inteira)

double c = 10;
double d = 4;
double resultado2 = c / d;  // resultado = 2.5 (divisão real)
```


### 5. `%` Operador Módulo (Resto da Divisão)
- Retorna o **resto** da divisão.
- Muito usado para saber se um número é **par ou ímpar**, por exemplo.

```java
int a = 10;
int b = 3;
int resto = a % b;  // resto = 1

// Exemplo de par ou ímpar
int numero = 7;
if (numero % 2 == 0) {
    System.out.println("Par");
} else {
    System.out.println("Ímpar");
}
```


---
### Precedência dos Operadores Aritméticos

| Prioridade | Operador    | Descrição                       | Associatividade            |
| ---------- | ----------- | ------------------------------- | -------------------------- |
| 1          | `()`        | Parênteses (forçam a ordem)     | Da esquerda para a direita |
| 2          | `*` `/` `%` | Multiplicação, divisão e módulo | Da esquerda para a direita |
| 3          | `+` `-`     | Adição e subtração              | Da esquerda para a direita |
- Ultimo avaliado é o ``=``.

- *Para multiplicar a String usa-se  método repeat(int count) da classe String*.
```java
String texto = "Olá! ";
String repetido = texto.repeat(3); // "Olá! Olá! Olá! "
```
- Biblioteca Math e seus comandos são usados para outras operações matemáticas mais complexas, como potência, raiz quadrada, ...

### Parenteses
- Os parênteses são utilizados para agrupar termos em expressões Java da mesma maneira como em expressões algébricas.
- Para multiplicar a por b + c escrevemos a * (b + c).
- Se uma expressão contiver parênteses aninhados, como ((a + b) * c), a expressão no conjunto mais interno dentro dos parênteses é avaliada primeiro
- Parênteses tem precedência com relação as operações aritméticas.


