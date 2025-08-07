##  Tipos primitivos no Java
- Em Java, tipos primitivos são os tipos de dados mais simples, usados para representar valores básicos como números, caracteres e valores lógicos. 
- Escrita por snake case: `minhaVariavel` (variáveis e métodos).

+ Java possui 8 tipos primitivos, divididos em 4 grupos:
- *Inteiros* (byte, short, int, long)
- *Reais ou Ponto Flutuante* (float, double)
- *Caractere* (char)
- *Booleano* (boolean) 
- Sintaxe:
- Lembrando que a atribuição de valores `=` é opcional.
``` md
<tipo> <nome_da_variavel> = <valor>;
<tipo> <nome_da_variavel>, <nome_da_variavel>;
<tipo> <nome_da_variavel>;```

### Tipos Inteiros
- São usados para armazenar números sem casas decimais, positivos ou negativos.
### 1. `byte`
- Usado quando sabemos que os valores estarão dentro de um intervalo pequeno.
- -128 a 127.

### 2. `short`
- Menos usado que `int`, mas útil quando o espaço de memória é restrito.
- -32768 a 32767.

### 3. `int`
- Inteiro padrão em Java.
- Usado para armazenar números inteiros comuns.
- Tipo mais utilizado para valores inteiros.
-  -2147483648 a 2147483647.
- Exemplo:
```java
  int populacao = 210000000;
```

### 4. `long`
- Usado para armazenar números inteiros maiores que o `int`.
- Ideal para valores que podem ultrapassar o limite do `int`.
- usar `L` no final do valor literal para indicar que é um `long`.
- Exemplo:
```java
  long distancia = 15000000000L;
```

### 5. `float`
- Usado para armazenar números com casas decimais.
- Menos preciso que o `double`, mas ocupa menos espaço.
- números decimais em Java são representados com ponto (`.`) e não vírgula (`,`).
- É necessário usar **`f`** ou **`F`** ao final do número para indicar que é `float`.
- Exemplo:
```java
  float altura = 1.75f;
```

- Modo de arendodar o número com `.2f` para limitar a 2 casas decimais:
```java
  System.out.printf("%.2f", altura); // Saída: 1.75
```


### 6. `double`
- Usado para armazenar números com casas decimais.
- Mais preciso que o `float`, mas ocupa mais espaço.

- Exemplo:
```java
  double peso = 65.8;
  double pi = 3.141592653589793;
```
- Use `double` quando precisar de **maior precisão** em cálculos com casas decimais.



### 7. `char`
- Usado para armazenar **um único caractere**.
- Exemplo:
  ```java
  char letra = 'J';
  char simbolo = '\u00A9'; // ©
  ```

- Sempre entre **aspas simples**: `'A'`, `'1'`, `'%'`


### 8. `boolean`
- Usado para armazenar valores lógicos: verdadeiro (`true`) ou falso (`false`).
- Condições lógicas, controle de fluxo (`if`, `while`, etc).
- Exemplo:

  ```java
  boolean estudante = true;
  ```

### Tipo String 
- Em Java, para armazenar mais de um caractere, como uma palavra ou frase, você não usa um tipo primitivo, mas sim um objeto da classe String (com "S" maiúsculo, porque é uma classe).
- Não há limite de tamanho. 
- Uma sequência (frase, palavra).
- Exemplo:
```java
String cidade = "São Paulo";
String nome = "José Kayque";
String frase = "Estudando Java com foco e dedicação!";
```
- Aspas duplas (" "), ao contrário do char, que usa aspas simples (' ').