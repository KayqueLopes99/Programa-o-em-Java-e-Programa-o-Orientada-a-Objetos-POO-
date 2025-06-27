## Generalização e Especialização em Herança
- A generalização é o processo de identificar características e comportamentos comuns entre diversas classes e extraí-los para uma classe mais genérica, chamada de **superclasse** ou classe pai. A ideia é "subir" na hierarquia, criando uma abstração que engloba um conjunto de entidades.

**Pense em:** Identificar que `Carro`, `Moto` e `Ônibus` compartilham atributos como `placa`, `chassi` e `anoFabricacao`, e métodos como `acelerar()` e `frear()`. Em vez de repetir esse código em cada classe, generalizamos criando a classe `Veiculo`, que conterá esses membros comuns.

- A especialização é o caminho inverso. A partir de uma classe genérica (a superclasse), criamos novas classes, chamadas de **subclasses** ou classes filhas, que herdam tudo da superclasse e adicionam seus próprios atributos e métodos específicos. A ideia é "descer" na hierarquia, tornando uma classe mais específica.

**Continuando o exemplo:** A partir da classe `Veiculo`, podemos especializá-la. A classe `Carro` herdará tudo de `Veiculo` e adicionará um atributo `numeroDePortas` e um método `abrirPortaMalas()`. A classe `Moto` também herdará de `Veiculo`, mas adicionará um atributo `cilindradas` e um método `empinar()`.

### Relação e Exemplo

**1. Generalização: Criando a Superclasse `Funcionario`**

```java
// Superclasse (Generalização)
public class Funcionario {
    private String nome;
    private long matricula;

    public Funcionario(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }
}
```

**2. Especialização: Criando as Subclasses `Gerente` e `Vendedor`**

```java
// Subclasse (Especialização)
public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, long matricula, String setor) {
        super(nome, matricula); // Chama o construtor da superclasse
        this.setor = setor;
    }

    public void aprovarVerba() {
        System.out.println("O gerente " + getNome() + " aprovou a verba para o setor " + setor);
    }
}

// Outra Subclasse (Especialização)
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, long matricula, double comissao) {
        super(nome, matricula);
        this.comissao = comissao;
    }

    public void realizarVenda() {
        System.out.println("O vendedor " + getNome() + " realizou uma venda com comissão de " + comissao);
    }
}
```