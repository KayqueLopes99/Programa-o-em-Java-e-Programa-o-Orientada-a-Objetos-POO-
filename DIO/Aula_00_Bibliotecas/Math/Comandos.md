## Classe `Math` em Java – Principais Métodos
- A classe `Math` faz parte do pacote `java.lang`, por isso **não precisa importar nada** para usá-la.
### 1. `Math.abs(x)`
- Retorna o **valor absoluto** de `x` (sem sinal).
```java
int resultado = Math.abs(-10); // 10
```

### 2. `Math.max(a, b)`
- Retorna o **maior** entre dois valores.
```java
int maior = Math.max(5, 9); // 9
```

### 3. `Math.min(a, b)`
- Retorna o **menor** entre dois valores.
```java
int menor = Math.min(5, 9); // 5
```

### 4. `Math.pow(base, expoente)`
- Faz **potenciação**.
```java
double resultado = Math.pow(2, 3); // 8.0
```

### 5. `Math.sqrt(x)`
- Retorna a **raiz quadrada** de `x`.
```java
double raiz = Math.sqrt(16); // 4.0
```

### 6. `Math.cbrt(x)`
- Retorna a **raiz cúbica** de `x`.

```java
double raizCubica = Math.cbrt(27); // 3.0
```

### 7. `Math.round(x)`
- Arredonda para o **inteiro mais próximo**.
```java
long arredondado = Math.round(4.6); // 5
```

### 8. `Math.floor(x)`
- Arredonda para **baixo** (menor inteiro).
```java
double resultado = Math.floor(4.9); // 4.0
```

### 9. `Math.ceil(x)`
- Arredonda para **cima** (maior inteiro).
```java
double resultado = Math.ceil(4.1); // 5.0
```

### 10. `Math.toRadians(graus)`
- Converte de **graus para radianos**.
```java
double rad = Math.toRadians(180); // 3.1415...
```

### 11. `Math.toDegrees(radianos)`
- Converte de **radianos para graus**.
```java
double graus = Math.toDegrees(Math.PI); // 180.0
```

### 12. `Math.sin(x)`
- Retorna o **seno** de `x` (em radianos).
```java
double seno = Math.sin(Math.toRadians(30)); // 0.5
```

### 13. `Math.cos(x)`
- Retorna o **cosseno** de `x` (em radianos).
```java
double cosseno = Math.cos(Math.toRadians(60)); // 0.5
```

### 15. `Math.tan(x)`
- Retorna a **tangente** de `x` (em radianos).
```java
double t = Math.tan(Math.toRadians(45)); // ≈ 1.0
```

### 15. `Math.log(x)`
- Retorna o **logaritmo natural** (base *e*) de `x`.
```java
double log = Math.log(10); // ≈ 2.302
```

### 16. `Math.log10(x)`
- Retorna o **logaritmo de base 10** de `x`.

```java
double log10 = Math.log10(100); // 2.0
```

### 17. `Math.exp(x)`

- Calcula o **exponencial de `x`** (e^x).
```java
double exp = Math.exp(2); // ≈ 7.389
```

## Obs:
- `Math.E` → constante de Euler (≈ 2.718)
- `Math.PI` → valor de π (≈ 3.1415)