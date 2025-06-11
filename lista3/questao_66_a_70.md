## Questão 66  
**[FGV - 2024 - INPE - Tecnologista Júnior I - Desenvolvimento de Software para Operação de Satélites]**  
Sobre a Linguagem Java, analise as afirmativas a seguir:

I. A palavra-chave `this` em Java é uma referência ao próprio objeto da classe e pode ser usada para acessar atributos e métodos da instância atual.  
II. Quando uma classe `ClasseB` estende `ClasseA` com `extends`, significa que `ClasseB` pode acessar membros privados e protegidos de `ClasseA`.  
III. A linguagem Java permite herança múltipla de classes.

Alternativas:  
(A) I, II e III  
(B) II e III, apenas  
(C) I e III, apenas  
(D) I e II, apenas  
> **(E) I, apenas**


---

## Questão 67  
**[FAB - EEAR - 2023 - Sargento da Aeronáutica - Informática]**  
Analise as afirmativas sobre herança em POO:

I. As classes inferiores da hierarquia não herdam automaticamente todas as propriedades e os métodos das classes superiores.  
II. A herança permite basear uma nova classe na definição de uma classe previamente existente.  
III. A classe filha é conhecida como superclasse e a classe progenitora como subclasse.  
IV. A herança permite o agrupamento de classes relacionadas.

Alternativas:  
(A) I e II  
>**(B) II e IV** 
(C) I e IV  
(D) II e III  


---

## Questão 68  
**[CESGRANRIO - 2024 - Banco da Amazônia - Técnico Científico - Tecnologia da Informação]**  
Hierarquia de classes:  
- `U` e `R` herdam diretamente de `S`  
- `S` e `T` herdam diretamente de `Q`  
- `P` herda de `T`  
- `Q` é abstrata

No contexto acima, é possível criar uma instância de:

(A) `P` e associar a uma variável da classe `S`  
(B) `Q` e associar a uma variável da classe `Q`  
(C) `Q` e associar a uma variável da classe `P`  
(D) `S` e associar a uma variável da classe `U`  
(E) `U` e associar a uma variável da classe `Q`


> **68 -> (E) U e associar a uma variável da classe Q.**


---

## Questão 69  
**[FGV - 2024 - CGM de Belo Horizonte - MG - Auditor Interno - Ciência da Computação - Manhã]**  
Considere o seguinte código em Java:

```java
public class Veiculo {
    private String marca;
    private String modelo;
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}

public class Mobi extends Veiculo {
    private int portas;
    public Mobi(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }
    public int getPortas() { return portas; }
}
```

Analise as afirmativas:

( ) A classe `Mobi` é um exemplo de herança, um dos fundamentos da programação orientada a objetos.
( ) A classe `Veiculo` não pode ser instanciada porque é uma classe abstrata.
( ) O método `getPortas()` é um exemplo de encapsulamento, outro fundamento da programação orientada a objetos.

Alternativas:
(A) V – V – F
(B) V – F – V
(C) F – V – V
(D) F – F – V

>**Gabarito: (B) V – F – V**

---

## Questão 70

**\[IV - UFG - 2024 - Prefeitura de Rio Branco - AC - Analista de Sistemas - Especialização em Desenvolvimento Front-End]**
No contexto da programação orientada a objetos, qual conceito permite que uma classe adquira as propriedades e métodos de outra classe?

(A) Encapsulamento
(B) Abstração
(C) Composição
(D) Herança


> **Gabarito: (D) Herança**
---

- Resumo:
- 66 -> V F F -> (E) Apenas I é verdadeira. 
- 67 -> F V F V -> (B) II E IV.
- 68 -> (E) U e associar a uma variável da classe Q.
- 69 ->  V – F – V. (B)
- 70 -> (D)