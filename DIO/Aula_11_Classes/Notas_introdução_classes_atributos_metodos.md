## Introdução à Programação Orientada a Objetos (POO)
- A Programação Orientada a Objetos (POO) é um paradigma de programação que utiliza "objetos" para representar dados e métodos.

- Orientação a objetos:
- Dados e as operações que serão realizadas sobre estes formam um conjunto único (objeto).
- A resolução de um problema é dada em termos de interações realizadas entre esses objetos.
- Benefícios:
   - Modularidade: o código é dividido em partes menores e mais gerenciáveis.
   - Reutilização: classes podem ser reutilizadas em diferentes partes do código ou em projetos diferentes.
   - Encapsulamento: os detalhes internos de uma classe podem ser ocultados, expondo apenas o que é necessário.
   - Encapsulamento: os detalhes internos de uma classe podem ser ocultados, expondo apenas o que é necessário.

## Criação de Classes
- Uma classe é uma estrutura que define um tipo de objeto, incluindo seus atributos (dados) e métodos (funções).
- *Classes* são estruturas que contém, para determinado modelo, os dados que devem ser representados e as operações que devem ser efetuadas com estes dados.
- Exemplos de classes: Pessoa, Imovel, Produto…

- Sintaxe: **uma classe é declarada com a palavra-chave `class`**, seguida do nome da classe:

```java
class NomeDaClasse {
    // atributos e métodos
}
```

### Regras para o nome da classe:
* Deve começar com uma letra;
* Não pode conter espaços ou acentos;
* Pode conter números (mas não no início);
* Não pode ser igual a palavras reservadas da linguagem;
* Por convenção, utiliza-se **letra maiúscula no início de cada palavra** (ex: `CadastroDeFuncionarios`).

> **Importante:** Cada **arquivo `.java` deve conter apenas uma classe pública e o nome do arquivo deve ser o mesmo da classe.**



## **2. Atributos**
- Os **atributos** (ou campos) são as **variáveis declaradas dentro de uma classe**, representando os dados que cada objeto daquela classe poderá armazenar.
- Sintaxe:
```java
tipo nomeDoAtributo;
```

### Tipos possíveis:

* Tipos primitivos da linguagem Java (`int`, `float`, `boolean`...);
* Classes existentes na linguagem (`String`, `Scanner`...);
* Outras classes criadas pelo programador (`Data`, `Pessoa`...).

### Convenção de nomenclatura:

* Começa com letra minúscula;
* Usa letra maiúscula para separar palavras internas (ex: `dataDeNascimento` – chamado de *camelCase*).

- Exemplo:

```java
class CadastroDeFuncionariosDeSupermercado {
    String nome;
    int matricula;
    float salario;
    Data dataDeNascimento;
}
```



## **3. Métodos**
- São **as ações ou comportamentos da classe** — ou seja, funções associadas a objetos daquela classe.
- Sintaxe:

```java
tipoDeRetorno nomeDoMetodo(parâmetros) {
    // corpo do método
}
```

* O `tipoDeRetorno` pode ser `void` (quando o método não retorna nada) ou um tipo de dado (`int`, `float`, `String`, etc.).
* Para retornar um valor, usa-se a palavra-chave `return`.

-  Regras:
* Métodos **não podem ser criados dentro de outros métodos**.
* Sempre devem estar **dentro de uma classe**.
* Nomes seguem a mesma convenção dos atributos.

- Exemplo de método sem retorno:

```java
void mostraDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Matricula: " + matricula);
    System.out.println("Salario: " + salario);
}
```


## **4. Classe Executável – Método `main`**

- Para executar um programa em Java, é preciso ter **uma classe com o método `main`**, que é o **ponto de entrada da aplicação**.

### 🔹 Sintaxe do `main`:

```java
public static void main(String[] args) {
    // código principal
}
```

* O método `main` pode criar objetos, chamar métodos e iniciar o fluxo do programa.
* Muitas vezes, cria-se uma **classe separada** apenas para conter o `main`.

- Exemplo

```java
class CadastroDeFuncionariosDeSupermercado {
    String nome;
    int matricula;
    float salario;
    Data dataDeNascimento;

    void mostraDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario);
    }
}
```

```java
// Classe com método main para executar
public class Principal {
    public static void main(String[] args) {
        CadastroDeFuncionariosDeSupermercado funcionario = new CadastroDeFuncionariosDeSupermercado();
        funcionario.nome = "João";
        funcionario.matricula = 1234;
        funcionario.salario = 2500.00f;

        funcionario.mostraDados();
    }
}
```