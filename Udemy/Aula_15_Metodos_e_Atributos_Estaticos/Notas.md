## Atributos estáticos (`static`)
* **Compartilhados por todas as instâncias** da classe.
* Existe **apenas um único valor armazenado**, **não importa quantos objetos sejam criados**.
* Se uma instância modificar esse valor, **todas as outras veem a modificação**.
* É como uma variável **global da classe**.

- Sintaxe:

```java
public class Exemplo {
    public static int contador; // atributo estático
}
```

- Acesso:

```java
Exemplo.contador = 5; // acesso sem instanciar
```

#### Para que servem atributos estáticos:
- **Manter informações comuns** a todas as instâncias (ex: quantidade de objetos criados).
- **Armazenar constantes** ou valores que **não mudam por objeto** (ex: PI = 3.14).

---

##  Métodos estáticos
* Podem ser **chamados sem precisar criar objetos** da classe.
* São usados para **funções utilitárias**, **rotinas matemáticas**, ou **fábricas de instâncias**.
* **Não acessam atributos não-estáticos diretamente** (porque não têm ligação com nenhum objeto específico).
- Sintaxe:
```java
public static void exibirMensagem() {
    System.out.println("Olá, mundo!");
}
```
- Acesso:
```java
Exemplo.exibirMensagem(); // sem precisar criar um objeto
```

#### Regras importantes:
* Se um **método estático** usar **atributos ou outros métodos da classe**, **esses também precisam ser estáticos**.
* O método `main`, por exemplo, é **estático** porque precisa ser executado **sem a criação de objetos**.

```java
public static void main(String[] args) {
    // ponto de entrada do programa Java
}
```

---

##  Fábricas de instância
* Um **método estático** que cria e retorna um **novo objeto da própria classe**.
* Útil quando você quer simplificar ou padronizar a criação de objetos.

- Exemplo:

```java
public class Usuario {
    private String nome;

    private Usuario(String nome) {
        this.nome = nome;
    }

    public static Usuario criarAdmin() {
        return new Usuario("Administrador");
    }
}
```
```java
Usuario admin = Usuario.criarAdmin();
```
---
## Resumo:

| Elemento             | Comportamento                                           |
| -------------------- | ------------------------------------------------------- |
| `static` atributo    | Compartilhado entre todas as instâncias da classe       |
| `static` método      | Chamado sem criar objeto, não usa dados da instância    |
| Fábrica de instância | Método `static` que retorna um objeto da própria classe |
| Acesso               | `NomeDaClasse.atributo` ou `NomeDaClasse.metodo()`      |


