#  Classe `String` em Java
- A classe `String` em Java representa uma **sequência imutável de caracteres**.
- É uma das classes mais utilizadas, pois lida com textos e manipulação de strings.

## Métodos  
### 0.1. `length()`
* **Descrição:** Retorna o número total de caracteres da string.
* **Sintaxe:**  
```java
  int tamanho = string.length();
```
* **Exemplo:**
  ```java
  String nome = "Java";
  System.out.println(nome.length()); // Saída: 4
  ```

### 0.2. `charAt(int index)`
* **Descrição:** Retorna o caractere na posição indicada (índice inicia em 0).
* **Sintaxe:**
  ```java
  char caractere = string.charAt(indice);
  ```
* **Exemplo:**
  ```java
  String texto = "Olá";
  System.out.println(texto.charAt(1)); // Saída: 'l'
  ```

---

### 3. `substring(int beginIndex)`
* **Descrição:** Retorna a parte da string a partir do índice informado até o final.
* **Sintaxe:**
  ```java
  String nova = string.substring(inicio);
  ```
* **Exemplo:**
  ```java
  String palavra = "Exemplo";
  System.out.println(palavra.substring(3)); // Saída: "mplo"
  ```

### 0.4. `substring(int beginIndex, int endIndex)`
* **Descrição:** Retorna a substring entre dois índices (inclusive no início, exclusivo no final).
* **Sintaxe:**
  ```java
  String nova = string.substring(inicio, fim);
  ```
* **Exemplo:**
  ```java
  String palavra = "Computador";
  System.out.println(palavra.substring(0, 5)); // Saída: "Comput"
  ```

### 0.5. `equals(String anotherString)`
* **Descrição:** Compara o conteúdo de duas strings, considerando maiúsculas/minúsculas.
* **Sintaxe:**
  ```java
  boolean resultado = string.equals(outra);
  ```
* **Exemplo:**
```java
System.out.println("Java".equals("java")); // false
```

### 0.6. `equalsIgnoreCase(String anotherString)`
* **Descrição:** Compara duas strings ignorando letras maiúsculas/minúsculas.
* **Sintaxe:**
  ```java
  boolean resultado = string.equalsIgnoreCase(outra);
  ```
* **Exemplo:**
  ```java
  System.out.println("Java".equalsIgnoreCase("java")); // true
  ```

### 0.7. `toLowerCase()`
* **Descrição:** Retorna a string com todos os caracteres em minúsculo.
* **Sintaxe:**
  ```java
  String minuscula = string.toLowerCase();
  ```
* **Exemplo:**
  ```java
  System.out.println("JAVA".toLowerCase()); // "java"
  ```

### 0.8. `toUpperCase()`
* **Descrição:** Retorna a string com todos os caracteres em maiúsculo.
* **Sintaxe:**
  ```java
  String maiuscula = string.toUpperCase();
  ```
* **Exemplo:**
  ```java
  System.out.println("java".toUpperCase()); // "JAVA"
  ```

### 0.9. `trim()`
* **Descrição:** Remove espaços em branco no início e no fim da string.
* **Sintaxe:**
  ```java
  String limpa = string.trim();
  ```
* **Exemplo:**
  ```java
  String texto = "  Olá mundo  ";
  System.out.println(texto.trim()); // "Olá mundo"
  ```

### 0.10. `contains(CharSequence seq)`
* **Descrição:** Verifica se a string contém uma sequência de caracteres.
* **Sintaxe:**
  ```java
  boolean existe = string.contains("algo");
  ```
* **Exemplo:**
  ```java
  System.out.println("programação".contains("gram")); // true
  ```


### 0.11. `replace(CharSequence target, CharSequence replacement)`
* **Descrição:** Substitui todas as ocorrências de um trecho por outro.
* **Sintaxe:**
  ```java
  String nova = string.replace("antigo", "novo");
  ```
* **Exemplo:**
  ```java
  String frase = "Hoje está quente";
  System.out.println(frase.replace("quente", "frio")); // "Hoje está frio"
  ```

### 0.12. `indexOf(String str)`
* **Descrição:** Retorna o índice da primeira ocorrência da substring.
* **Sintaxe:**

  ```java
  int posicao = string.indexOf("texto");
  ```
* **Exemplo:**

  ```java
  System.out.println("universidade".indexOf("vers")); // 2
  ```

### 0.12.5 `lastIndexOf(String str)`
* **Descrição:** Retorna o índice da última ocorrência da substring.

* **Sintaxe:**
  ```java
  int posicao = string.lastIndexOf("texto");
  ```

* **Exemplo:**
  ```java
  System.out.println("banana".lastIndexOf("a")); // 5
  ```

### 0.13. `split(String regex)`
* **Descrição:** Divide a string com base em uma expressão regular e retorna um array.
* **Sintaxe:**
  ```java
  String[] partes = string.split("separador");
  ```
* **Exemplo:**
  ```java
  String nomes = "Ana,João,Lucas";
  String[] lista = nomes.split(",");
  // lista[0] = "Ana", lista[1] = "João", lista[2] = "Lucas"
  ```


## Observações

* Strings são **imutáveis**.
* Use `equals()` para comparar conteúdo. **Não use `==`** para isso.
* Métodos que modificam strings retornam **uma nova String**, não alteram a original.


## Referência
[Documentação da classe String (Oracle)](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

``` java
String original = "abcde FGHIJ ABC abc DEFG ";

String s01 = original.toLowerCase();
String s02 = original.toUpperCase();
String s03 = original.trim();
String s04 = original.substring(2);
String s05 = original.substring(2, 9);
String s06 = original.replace('a', 'x');
String s07 = original.replace("abc", "xy");
int i = original.indexOf("bc");
int j = original.lastIndexOf("bc");

System.out.println("Original: -" + original + "-");
System.out.println("toLowerCase: -" + s01 + "-");
System.out.println("toUpperCase: -" + s02 + "-");
System.out.println("trim: -" + s03 + "-");
System.out.println("substring(2): -" + s04 + "-");
System.out.println("substring(2, 9): -" + s05 + "-");
System.out.println("replace('a', 'x'): -" + s06 + "-");
System.out.println("replace('abc', 'xy'): -" + s07 + "-");
System.out.println("Index of 'bc': " + i);
System.out.println("Last index of 'bc': " + j);
```