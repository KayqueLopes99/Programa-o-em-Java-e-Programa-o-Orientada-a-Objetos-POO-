##  Operadores Lógicos
- Usados para **combinar ou inverter valores booleanos** (verdadeiro ou falso) em expressões lógicas, como em `if`, `while`, ...
- Valores do tipo boolean e resultados de operações ou métodos que retornem valores booleanos podem ser combinados entre si através dos operadores lógicos:
- `&&` (AND) - E lógico
- `||` (OR) - OU lógico
- Exemplo: ((a >= b) && (a>=c))
- Há também o operador de negação ! ( NÃO ) que inverte o valor de um booleano
``!(2>3) retorna true``
## 0.1 Operador AND (`&&`)
-  **Só retorna `true` se as duas condições forem verdadeiras.**
-  É como dizer: "**isto E aquilo**".
- Tabela verdade:

| Condição 1 | Condição 2 | Resultado |
| ---------- | ---------- | --------- |
| `true`     | `true`     | `true`    |
| `true`     | `false`    | `false`   |
| `false`    | `true`     | `false`   |
| `false`    | `false`    | `false`   |

- Sintaxe:

```java
if (condicao1 && condicao2) {
    // só entra aqui se as duas forem verdadeiras
}
```

- Exemplo:

```java
int idade = 20;
boolean temCarteira = true;

if (idade >= 18 && temCarteira) {
    System.out.println("Pode dirigir.");
}
```


## 0.2 Operador OR (`||`)
- **Retorna `true` se pelo menos uma condição for verdadeira.**
- É como dizer: "**isto OU aquilo**".

- Tabela verdade:

| Condição 1 | Condição 2 | Resultado |
| ---------- | ---------- | --------- |
| `true`     | `true`     | `true`    |
| `true`     | `false`    | `true`    |
| `false`    | `true`     | `true`    |
| `false`    | `false`    | `false`   |

- Sintaxe:
```java
if (condicao1 || condicao2) {
    // entra se pelo menos uma for verdadeira
}
```
- Exemplo:

```java
boolean feriado = true;
boolean fimDeSemana = false;

if (feriado || fimDeSemana) {
    System.out.println("Hoje não tem aula!");
}
```


## 0.3 Operador NOT (`!`)
- **Inverte o valor da condição.**
- Se for `true`, vira `false`, e vice-versa.
- É como dizer: "**NÃO isso**".

- Tabela verdade:

| Condição | `!Condicao` |
| -------- | ----------- |
| `true`   | `false`     |
| `false`  | `true`      |

- Sintaxe:

```java
if (!condicao) {
    // entra se condicao for falsa
}
```

- Exemplo:

```java
boolean temChave = false;

if (!temChave) {
    System.out.println("Você precisa da chave para entrar.");
}
```

---

