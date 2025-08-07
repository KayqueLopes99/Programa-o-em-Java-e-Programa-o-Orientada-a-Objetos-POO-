## As três operações básicas de programação
- Entrada, Processamento e Saída.
- Entrada: Receber dados do usuário ou de outra fonte.

- Processamento: Manipular os dados recebidos.

> Saída: Exibir ou armazenar os resultados do processamento.
- Exemplo simples em Java:

```java
import java.util.Scanner;
public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Processamento
        int dobro = numero * 2;
        int triplo = numero * 3;
        int quadrado = numero * numero;

        // Saída
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);
        System.out.println("Quadrado: " + quadrado);

        scanner.close();
    }
}
```