## Métodos Estáticos Comuns para Manipulação de Arrays em Java
A classe `java.util.Arrays` e a classe `java.lang.System` fornecem **métodos estáticos** muito úteis para realizar operações comuns com arrays. 

---

### 1. `Arrays.sort(array)`
-  Ordena os elementos do array em **ordem crescente**.
- **Exemplo**:
```java
int[] numeros = {5, 3, 9, 1};
Arrays.sort(numeros); // [1, 3, 5, 9]
```

### 2. `Arrays.binarySearch(array, valor)`

*  Realiza uma **busca binária** em um array ordenado.
* **Retorna**: índice do valor se encontrado, ou um número negativo se não existir.
* **Exemplo**:

```java
int[] numeros = {1, 3, 5, 9};
int pos = Arrays.binarySearch(numeros, 5); // pos = 2
```

---

### 3. `Arrays.equals(array1, array2)`

* Compara dois arrays e retorna `true` se todos os elementos forem iguais e na mesma ordem.
* **Exemplo**:

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
boolean iguais = Arrays.equals(a, b); // true
```

---

### 4. `Arrays.fill(array, valor)`
* Preenche todo o array com um valor.
* **Exemplo**:

```java
int[] array = new int[5];
Arrays.fill(array, 7); // [7, 7, 7, 7, 7]
```
