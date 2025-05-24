# Questões de Programação Orientada a Objetos (POO)

## Questão 33 – [FAB - EEAR - 2023 - Sargento da Aeronáutica - Informática]

Relacione as colunas quanto aos conceitos de POO.  
Em seguida, assinale a alternativa com a sequência correta.

**1 – Classe**  
**2 – Objeto**  
**3 – Construtor**

- ( ) É uma estrutura dinâmica que encapsula estado e comportamento.  
- ( ) É executado automaticamente quando um objeto é instanciado utilizando o operador `new`.  
- ( ) Trata-se de modelo ou template que permite a criação de idênticas estruturas dinâmicas.

### Gabarito:
**(B) 2 – 3 – 1**

- **Objeto** é uma instância que encapsula estado e comportamento.
- **Construtor** é chamado automaticamente ao usar `new`.
- **Classe** é o molde usado para criar objetos.

---

## Questão 34 – [UFES - 2023 - Técnico de Tecnologia da Informação]

### Código:
```java
class Conta {
    double saldo;
    void sacar(double qtd) { saldo -= qtd; }
    void depositar(double qtd) { saldo += qtd; }
}

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(1000);
        Conta c2 = c1;
        c1.sacar(500);
        System.out.println(c1.saldo);
    }
}
```

Ao compilar e executar esse programa, o valor impresso na tela é:

(A) 1000.0
(B) 500.0
(C) 500
(D) 1000
(E) Indeterminado, pois o saldo não foi inicializado.

### Gabarito:

**(B) 500.0**

---

## Questão 35 – \[Instituto Consulplan - 2023 - Técnico de Informática]

Relacione as colunas a seguir:

**1. Classe**
**2. Objeto**
**3. Método**
**4. Atributo**

* ( ) Define-se dentro de uma classe para descrever o comportamento de um objeto. Programadores podem reutilizar ou manter a funcionalidade encapsulada dentro de um objeto.
* ( ) Tipo de dados definido pelo usuário que atua como um modelo para objetos, atributos e métodos individuais.
* ( ) Define-se na classe e representa o estado de um objeto; pertence à própria classe.
* ( ) Instância de uma classe criada com dados definidos; pode corresponder a objetos do mundo real ou a uma entidade abstrata.

**(D) 3, 1, 4, 2**
* **3. Método**: descreve comportamento do objeto.
* **1. Classe**: é o modelo.
* **4. Atributo**: representa o estado.
* **2. Objeto**: é a instância da classe.
