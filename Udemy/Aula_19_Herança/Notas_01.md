## Herança e reuso de classes
> É um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra.
> RELAÇÃO: É-UM...
> ASSOCIAÇÃO ENTRE CLASSES E NÃO ENTRE OBJETOS.
- Reutilização e polimorfismo.
- Diminui a necessidade de escrever novos métodos e classes.
- Criação de classes baseadas em outras
- Classes criadas com esta técnica poderão conter os métodos das classes originais, além de poder adicionar comportamento específico da nova classe.

# Introdução à Herança

* Existem dois mecanismos básicos de reuso de classes em Java: delegação (ou composição) e herança  
  - *Com delegação, usamos uma instância da classe base como campo na nova classe*  
  - *Com herança, criamos a classe nova como uma extensão direta da classe base*

---

## Data
- **dia** : inteiro  
- **mes** : inteiro  
- **ano** : inteiro  
- **calcularAnos(Data d2)** : inteiro

## Funcionario

- **nome** : texto  
- **nasc** : *Data*  
- **salario** : real  
- **informarSalario(real valor)**  
- **calcularIdade()** : inteiro  

```

Funcionario
^
|
|
Programador

```

## Programador

- **linguagem** : texto  
- **informarLinguagem(texto nome)**


## Delegação ou Composição

- Podemos criar novas classes que estendem uma outra classe base se incluirmos uma instância da classe base como um dos campos da nova classe, que será então composta de campos específicos e de uma instância de uma classe base.  
- Para que os métodos da classe base possam ser executados, escreveremos métodos correspondentes na classe nova que chamam os da classe base, desta forma delegando a execução dos métodos.

---

## Exemplo
```java

// Classe base
class Funcionario {
    String nome;
    double salario;

    void informarSalario(double valor) {
        this.salario = valor;
    }

    double obterSalario() {
        return this.salario;
    }
}

// Classe que usa delegação
class Programador {
    Funcionario funcionario; // Composição
    String linguagem;

    Programador(String nome, double salario, String linguagem) {
        this.funcionario = new Funcionario();
        this.funcionario.nome = nome;
        this.funcionario.informarSalario(salario);
        this.linguagem = linguagem;
    }

    void informarLinguagem(String nome) {
        this.linguagem = nome;
    }

    double obterSalario() {
        return funcionario.obterSalario(); // delegando
    }
}
```