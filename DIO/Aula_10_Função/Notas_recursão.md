##  Funções Recursivas em Java
- **Recursão** é quando uma função chama **ela mesma** para resolver um problema.
- Cada chamada resolve **parte do problema**, até que atinja um **caso base** (condição de parada).
- Caso base é a condição que interrompe a recursão, evitando chamadas infinitas.
-  Estrutura de uma função recursiva

```java
tipo nomeFuncao(parâmetros) {
    if (casoBase) {
        return valorFinal;
    } else {
        return nomeFuncao(chamadaRecursiva); // chamada a si mesma
    }
}
```

---

## 📌 Exemplo Clássico: Fatorial de um número

```java
public class Recursao {

    public static int fatorial(int n) {
        if (n == 0) {          // caso base
            return 1;
        } else {
            return n * fatorial(n - 1); // chamada recursiva
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5)); // Saída: 120
    }
}
```
