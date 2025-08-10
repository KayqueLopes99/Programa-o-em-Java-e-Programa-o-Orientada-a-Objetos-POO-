## Palavra-chave `this` em Java
- No Java, **cada instância de uma classe possui, internamente, uma "auto-referência"**, ou seja, uma **referência a si mesma**.
Essa auto-referência é representada pela **palavra-chave `this`**.

* **Referenciar atributos** e **métodos** da **própria instância** atual.
* Diferenciar entre **atributos da classe** e **parâmetros do método** que têm o mesmo nome.
* Chamar **outros construtores** da mesma classe.
> this serve diferenciar os atributos da classe dos parâmetros do método.

- Exemplo 
```java
void setNome(String nome) {
  this.nome = this.converteParaMaiuscula(nome);
}
```

* `this.nome`: refere-se ao **atributo** da instância atual.
* `nome` (sem o `this`): é o **parâmetro** do método.
* `this.converteParaMaiuscula(nome)`: chama um **método da própria instância** para converter o nome recebido.

- Esse uso é importante para evitar ambiguidades quando nomes de variáveis e parâmetros se repetem.

---

### Outros usos do `this`

1. **Chamar outro construtor da mesma classe:**

   ```java
   public Pessoa(String nome) {
       this(nome, 0); // chama o construtor Pessoa(String nome, int idade)
   }

   public Pessoa(String nome, int idade) {
       this.nome = nome;
       this.idade = idade;
   }
   ```

- Passar o proprio objeto como argumento para outro método ou construtor:

```java 
public void processar() {
    this.armazenar(this);
}

public void armazenar(Pessoa pessoa) {
    // lógica de armazenamento
}

// Explicação clara:
// Aqui, `this` é usado para passar a própria instância do objeto `Pessoa` para o método `armazenar`, permitindo que ele trabalhe com os dados da instância atual.
```