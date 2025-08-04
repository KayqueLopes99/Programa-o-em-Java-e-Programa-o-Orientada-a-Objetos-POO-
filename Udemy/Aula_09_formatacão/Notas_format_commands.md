## Formatação em Java: String.format e DecimalFormat e seus métodos
+ **Formatação de Strings**
- `String.format(String formato, valores...)`
- Cria e **retorna uma string formatada** com base em um modelo.

```java
String resultado = String.format("Olá, %s! Você tem %d anos.", "José", 22);
System.out.println(resultado);
```
- O printf também faz isso.
```java
System.out.printf("Nome: %s | Idade: %d%n", "José", 22);
```


### **Formatando números com `DecimalFormat`**

- A classe `DecimalFormat` permite **personalizar a formatação de números**: casas decimais, separadores, zeros à esquerda, etc.
- Sintaxe:

```java
import java.text.DecimalFormat;

DecimalFormat df = new DecimalFormat("00.00");
System.out.println(df.format(4.5)); // Saída: 04.50
```


| Nº | Método                                    | Descrição                                               |
| -- | ----------------------------------------- | ------------------------------------------------------- |
| 1  | `format(double number)`                   | Formata um número `double` como `String`.               |
| 2  | `format(long number)`                     | Formata um número `long` como `String`.                 |
| 3  | `parse(String source)`                    | Converte uma string formatada de volta para número.     |
| 4  | `setMaximumFractionDigits(int)`           | Define o número máximo de casas decimais.               |
| 5  | `setMinimumFractionDigits(int)`           | Define o número mínimo de casas decimais.               |
| 6  | `setMaximumIntegerDigits(int)`            | Define o número máximo de dígitos antes do ponto.       |
| 7  | `setMinimumIntegerDigits(int)`            | Define o número mínimo de dígitos antes do ponto.       |
| 8 | `setRoundingMode(RoundingMode)`           | Define o modo de arredondamento.                        |


---