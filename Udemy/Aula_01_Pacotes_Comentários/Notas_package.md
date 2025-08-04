## Os Pacotes - `package` em Java
- O **package** (pacote) é uma maneira de **organizar classes, interfaces e subpacotes** dentro de um projeto. 
- **Organizar o código-fonte** por funcionalidades ou módulos.
- **Evitar conflitos de nomes** entre classes com o mesmo nome.
- **Controlar o acesso** às classes com os modificadores de visibilidade (`public`, `protected`, `default`, `private`).

---

- A **declaração do pacote** (1ª linha do arquivo):

```java
package nome.do.pacote;
```

- O **nome do pacote** deve ser **único** e **descritivo**.
```
src/
└── br/
    └── com/
        └── jose/
            └── sistema/
                └── Main.java
```

- Cada nível no nome do pacote corresponde a uma **subpasta** no sistema de arquivos.
- Usamos o Ponto (`.`) para separar os níveis do pacote.
```java
package br.com.jose.sistema;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo dos pacotes!");
    }
}
```

> 🔸 O caminho do arquivo `Main.java` precisa estar em `br/com/jose/sistema/` para corresponder ao `package br.com.jose.sistema;`

- Use nomes de pacotes em **letras minúsculas**, por convenção.