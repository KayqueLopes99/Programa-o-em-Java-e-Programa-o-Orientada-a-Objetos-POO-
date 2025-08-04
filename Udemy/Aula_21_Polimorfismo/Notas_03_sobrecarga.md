## 0.2 Polimorfismo de Sobrecarga (Compile-time)
- É a capacidade de ter, na **mesma classe**, vários métodos com o **mesmo nome**, desde que suas **listas de parâmetros sejam diferentes** (seja no número de parâmetros ou no tipo deles).

- Ocorre quando definimos múltiplas funções com o mesmo nome porém tipos/quantidades diferentes de parâmetros;

- Técnica comum para construtores;


### Sintaxe

```java
public class MinhaClasse {
    // Mesmos nomes, mas assinaturas diferentes
    public void meuMetodo() { ... }
    public void meuMetodo(String texto) { ... }
    public void meuMetodo(int numero) { ... }
    public void meuMetodo(String texto, int numero) { ... }
}
```

### Exemplo Prático

Uma classe `Calculadora` é um exemplo clássico.

**Arquivo: `Calculadora.java`**

```java
public class Calculadora {

    // Método 'somar' para dois inteiros
    public int somar(int a, int b) {
        System.out.println("Usando a versão para inteiros!");
        return a + b;
    }

    // MESMO NOME, mas com parâmetros diferentes (doubles)
    public double somar(double a, double b) {
        System.out.println("Usando a versão para doubles!");
        return a + b;
    }

    // MESMO NOME, com três parâmetros
    public int somar(int a, int b, int c) {
        System.out.println("Usando a versão para três inteiros!");
        return a + b + c;
    }
}
```

O compilador sabe qual método `somar` chamar com base nos argumentos que você passa na hora de usar.

