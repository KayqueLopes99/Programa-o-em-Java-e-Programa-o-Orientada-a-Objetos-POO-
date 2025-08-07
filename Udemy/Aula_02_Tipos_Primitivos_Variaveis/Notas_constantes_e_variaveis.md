## Variáveis e constantes
- Variável: espaço na memória designado para o armazenamento de um determinado valor
- *Constantes*: Espaço na memória para o armazenamento de um valor que não pode ser alterado durante o desenvolvimento do código.
- Escrita em letras maiúsculas, com palavras separadas por underline (snake_case).
- ou camelCase.

### Regras para nomes de variáveis e constantes:
- Não pode iniciar com números
- Não pode possuir caracteres especiais
- Não pode possuir espaços em branco
- O **padrão camelCase** é uma convenção utilizada para variáveis e constantes em Java
- Nomes corretos: *distanciaPercorrida*, *notaFinal*, *situacaoCadastral…*.
- Nomes incorretos: 1aresposta, solução, x 1…

+ Variáveis e constantes precisam ser declaradas.
- Elas devem possuir um tipo associado.
- Tipos primitivos: boolean, byte, char, short, int, long, float e double.
- As variáveis locais não são inicializadas por padrão.

``` java
public class VariaveisConstantes{
    public static void main(String[] args) {
        // variaveis
        // <tipo> <nome_variavel> = <valor>;
        int numero = 2, n2;
        float valor1, v1 = 3.68F;
        double valor2, v2 = 3.68;
        String palavra = "Orientacao a Objetos", palavra2;
        char letra = 'w', outraLetra;
        boolean resposta1 = true, resposta2 = false, resposta3;
        // constantes
        final double ACELERACAO_GRAVIDADE = 9.78;
        final String msg = "Bem vindo(a)!\n";
        // O algoritmo continua aqui
    }
}

```
### Palavra-chave `final` em Java

No Java, a palavra-chave `final` é utilizada para indicar que um valor não pode ser alterado após ser atribuído. Quando aplicada a variáveis, transforma-as em constantes, impedindo que recebam um novo valor posteriormente. Também pode ser usada em métodos (impedindo que sejam sobrescritos) e em classes (impedindo que sejam estendidas).

### Exemplo 

```java
final int DIAS_DA_SEMANA = 7;
DIAS_DA_SEMANA = 8; // Isso causará um erro de compilação, pois o valor não pode ser alterado
```

No exemplo acima, a variável `DIAS_DA_SEMANA` é declarada como constante usando `final`. Qualquer tentativa de modificar seu valor resultará em erro.
- 