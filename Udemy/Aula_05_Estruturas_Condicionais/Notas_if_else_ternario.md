## Estrutura condicional If e Else
- Permitem que o programa tome decisões lógicas com base em condições booleanas (true ou false). São fundamentais para controlar o fluxo de execução do código.
- Use `{}` para delimitar os blocos

### `if` (se)
- O bloco `if` **executa um código somente se a condição for verdadeira** (`true`).
- Se desejar que todas as condições sejam verificadas, use vários ifs. 
- Sintaxe:
```java
// se a condição for uma varíavel é o mesmo de falar se é true. 
if (condicao) {
    // código executado se condicao for verdadeira
}
```
- Exemplo:
```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

### `else` (senão)
- O bloco `else` é **executado quando a condição do `if` é falsa**.
- Sintaxe:
```java
if (condicao) {
    // se for verdadeiro
} else {
    // se for falso
}
```
- Exemplo:

```java
int idade = 16;

if (idade >= 18) {
    System.out.println("Pode votar.");
} else {
    System.out.println("Ainda não pode votar.");
}
```


### `else if` (senão se)
- Permite testar **várias condições diferentes**.
- **mais de dois caminhos possíveis**.
- Sintaxe:

```java
if (condicao1) {
    // se condicao1 for verdadeira
} else if (condicao2) {
    // se condicao2 for verdadeira
} else {
    // se nenhuma for verdadeira
}
```

- Exemplo:
```java
int nota = 75;

if (nota >= 90) {
    System.out.println("Aprovado com excelência");
} else if (nota >= 60) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

### If Aninhado (Nested if)
- **`if` dentro de outro `if`**.
- Serve para verificar uma **condição dentro de outra**.

- Sintaxe:
```java
if (condicao1) {
    if (condicao2) {
        // ambos são verdadeiros
    }
}
```
## Encadeamento de estruturas condicionais
``` java
if (condicao1) {
    // código se condicao1 for verdadeira
} else if (condicao2) {
    // código se condicao2 for verdadeira
} else if (condicao3) {
    // código se condicao3 for verdadeira
} else {
    // código se nenhuma das condições anteriores for verdadeira
}
```



## O Operador Ternário
- Usado como uma forma curta de `if-else`.
- Sintaxe:

``` java
condição ? valor_se_verdadeiro : valor_se_falso;

```
- Exemplo: 

```java
int idade = 20;
String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";


