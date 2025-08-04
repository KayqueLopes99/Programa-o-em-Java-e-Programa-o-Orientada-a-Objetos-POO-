## Estrutura Condicional `switch` no Java
- A estrutura `switch` é usada para **escolher entre múltiplos caminhos de execução** com base no valor de uma **variável ou expressão**. É uma alternativa ao uso de múltiplos `if-else` quando se testa o mesmo valor contra diferentes possibilidades.
- Você tem uma variável ou expressão com valores conhecidos (ex: número, caractere, `String`).
- Há muitos `if-else if` encadeados comparando igualdade (`==`).
- Você quer um código mais limpo e legível.
+ Sintaxe:

```java
switch (variavel) {
    case valor1:
        // código se variavel == valor1
        break;

    case valor2:
        // código se variavel == valor2
        break;

    // ... mais cases se necessário

    default:
        // código se nenhum case anterior for satisfeito (opcional)
}
```

- `switch`: inicia a estrutura de seleção múltipla.
- `case`: define um valor possível para a variável.
- `break`: encerra o bloco do `case`. Sem ele, a execução continua no próximo `case` (isso se chama *fall-through*).
- `default`: executa se **nenhum `case` combinar** com o valor da variável.

---

- Exemplo

```java
public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
```

---

###  `switch` com `->`
- O **switch expression**, que permite o uso de `->` para tornar o código mais limpo e moderno.
- Sintaxe

```java
switch (variavel) {
    case valor1 -> comando1;
    case valor2 -> comando2;
    default -> comandoPadrao;
}
```

---