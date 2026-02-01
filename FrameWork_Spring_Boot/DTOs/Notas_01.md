### 1. Definição (O que é?)
O DTO é um padrão de projeto simples. Ele é uma classe Java pura (POJO) que **não possui lógica de negócios** (não faz cálculos, não acessa banco de dados).
* **Função única:** Transportar dados de um lugar para outro (geralmente do seu Banco de Dados para a tela do usuário, ou vice-versa).

> Use DTO quando você quiser ter controle total sobre o que entra e o que sai da sua API, sem expor as "tripas" (estrutura interna) do seu banco de dados.

### 2. Quando Usar (Por que não usar a Entidade direto?)
Você deve usar DTOs em aplicações Spring Boot principalmente por 3 motivos:
1. **Segurança (Ocultar dados sensíveis):**
* Sua tabela de usuários tem `Nome`, `Email` e `Senha`. Se você retornar a Entidade inteira para o Front-end, a `Senha` vai junto no JSON. O DTO permite criar uma classe só com `Nome` e `Email` para enviar ao usuário.
2. **Performance (Economia de dados):**
* Sua entidade pode ter 50 campos e relacionamentos pesados. Se a tela do celular só precisa mostrar o "Título" e a "Foto", você cria um DTO só com esses dois campos, economizando internet do usuário.

### 3. Exemplo Explicativo (Contexto Spring Boot)
- **Cadastro de Usuário**.

#### A. A Entidade (O Banco de Dados)
Esta classe representa a tabela real. Ela tem dados que **não** podem sair do servidor (como a senha).

```java
@Entity
public class Usuario {
    @Id
    private Long id;
    private String nome;
    private String email;
    private String senha; // PERIGO: Nunca envie isso para o front-end!
    private LocalDateTime dataCriacao;
    
    // Getters e Setters...
}

```

#### B. O DTO (O que o usuário vê)
- Esta classe é o que sua API vai responder (JSON).

```java
// DTO limpo, sem senha e sem dados técnicos desnecessários
public class UsuarioResumoDTO {
    private String nome;
    private String email;

    // Construtor que aceita a Entidade para facilitar a conversão
    public UsuarioResumoDTO(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }
    
    // Getters apenas (DTOs de resposta geralmente são imutáveis)
}

```

#### C. Como funciona no Controller

```java
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public UsuarioResumoDTO buscarUsuario(@PathVariable Long id) {
        // 1. Busca a Entidade pesada no Banco
        Usuario usuarioEntidade = repository.findById(id).get();
        
        // 2. Converte para DTO (coloca na caixa de entrega)
        UsuarioResumoDTO dto = new UsuarioResumoDTO(usuarioEntidade);
        
        // 3. O Spring devolve apenas o JSON: { "nome": "Kayque", "email": "..." }
        return dto; 
    }
}

```