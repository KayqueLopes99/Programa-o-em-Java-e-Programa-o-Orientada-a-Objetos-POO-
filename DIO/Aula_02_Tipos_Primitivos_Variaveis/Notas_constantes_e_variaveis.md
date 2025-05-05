## Variáveis e constantes
- Variável: espaço na memória designado para o armazenamento de um determinado valor
- *Constantes*: Espaço na memória para o armazenamento de um valor que não pode ser alterado durante o desenvolvimento do código.
- Escrita em letras maiúsculas, com palavras separadas por underline (snake_case).

### Regras para nomes de variáveis e constantes:
- Não pode iniciar com números
- Não pode possuir caracteres especiais
- Não pode possuir espaços em branco
- O padrão camelCase é uma convenção utilizada para variáveis e constantes em Java
- Nomes corretos: distanciaPercorrida, notaFinal, situacaoCadastral….
- Nomes incorretos: 1aresposta, soluç@o, x 1…

+ Variáveis e constantes precisam ser declaradas.
- Elas devem possuir um tipo associado.
- Tipos primitivos: boolean, byte, char, short, int, long, float e double.
- As variáveis locais não são inicializadas por padrão.

``` java
public class VariaveisConstantes{
    public static void main(String[] args) {
        // variaveis
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