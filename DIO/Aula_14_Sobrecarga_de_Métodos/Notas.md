## **Sobrecarga de métodos (Method Overloading)**
- É quando você cria dois ou mais métodos (ou construtores) com o **mesmo nome**, mas com **parâmetros diferentes**.

- Essa técnica é útil quando você quer **executar uma mesma ação de jeitos diferentes**, dependendo dos **valores passados** para o método.

---

###  **Regras para que haja sobrecarga:

* O **nome do método** deve ser **igual**.
* A **assinatura** (quantidade e/ou tipos dos parâmetros) deve ser **diferente**.
* O **tipo de retorno** (como `int`, `String`, `void`) **não importa para a sobrecarga**.

---

```java
public class Calculadora {

    // Método 1: soma dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método 2: soma três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método 3: soma dois números reais
    public double somar(double a, double b) {
        return a + b;
    }
}
```