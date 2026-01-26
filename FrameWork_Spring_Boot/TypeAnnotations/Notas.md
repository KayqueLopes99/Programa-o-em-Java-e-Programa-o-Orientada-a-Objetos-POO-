## (Annotations) no Spring Boot

### O que são Annotations?

Em Java e Spring Boot, **Anotações** são metadados (dados sobre dados) que fornecem instruções ao compilador ou ao framework em tempo de execução. Elas evitam a necessidade de escrever códigos repetitivos ou arquivos de configuração XML complexos. Basicamente, elas dizem ao Spring: *"Olhe para esta classe/método/atributo e trate-o de uma maneira especial"*.

---

## Tabela de Anotações

Abaixo estão todas as anotações listadas, organizadas por funcionalidade.

### 1. Configuração e Injeção de Dependência (Spring Core)

Estas anotações gerenciam a inicialização da aplicação e a criação de objetos.

| Anotação | Sintaxe (Exemplo) | Definição |
| --- | --- | --- |
| **`@SpringBootApplication`** | `@SpringBootApplication` | Ponto de partida da aplicação. Combina configuração automática, escaneamento de componentes e definição de propriedades. Fica na classe principal `main`. |
| **`@Service`** | `@Service` | Marca uma classe como um componente de **Serviço** (camada de regras de negócio). O Spring gerencia essa classe para injeção de dependência. |
| **`@Autowired`** | `@Autowired` | Realiza a **Injeção de Dependência** automática. O Spring procura um objeto gerenciado compatível e o "injeta" onde essa anotação estiver (construtor ou atributo). |

### 2. Controladores Web (Spring Web)

Estas anotações definem como sua API responde a requisições HTTP (URL).

| Anotação | Sintaxe (Exemplo) | Definição |
| --- | --- | --- |
| **`@RestController`** | `@RestController` | Combinação de `@Controller` e `@ResponseBody`. Diz que a classe é um controlador REST e que os retornos dos métodos devem ser serializados direto no corpo da resposta (geralmente JSON). |
| **`@GetMapping`** | `@GetMapping` | Mapeia requisições HTTP **GET** (buscar dados) para o método. Usado para listar todos os recursos. |
| **`@GetMapping` (com ID)** | `@GetMapping(value="/{id}")` | Mapeia requisições HTTP **GET** com um parâmetro na URL (ex: `/users/5`). Busca um recurso específico. |
| **`@PostMapping`** | `@PostMapping` | Mapeia requisições HTTP **POST** (criar dados). Usado para salvar novos recursos. |
| **`@PutMapping`** | `@PutMapping(value = "/{id}")` | Mapeia requisições HTTP **PUT** (atualizar dados). Usado para substituir/atualizar um recurso existente identificado pelo ID. |
| **`@DeleteMapping`** | `@DeleteMapping(value = "/{id}")` | Mapeia requisições HTTP **DELETE** (remover dados). Usado para apagar um recurso identificado pelo ID. |

### 3. Entidades e Persistência (JPA / Hibernate)

Estas anotações mapeiam suas classes Java para tabelas no Banco de Dados.

| Anotação | Sintaxe (Exemplo) | Definição |
| --- | --- | --- |
| **`@Entity`** | `@Entity` | Diz que a classe é uma entidade JPA, ou seja, representa uma tabela no banco de dados. |
| **`@Table`** | `@Table(name = "tb_user")` | Permite customizar o nome da tabela no banco de dados (ex: mudar de `User` para `tb_user` para evitar conflitos com palavras reservadas do SQL). |
| **`@Id`** | `@Id` | Define qual atributo da classe é a **Chave Primária** (Primary Key) da tabela. |
| **`@GeneratedValue`** | `@GeneratedValue(strategy = GenerationType.IDENTITY)` | Define como o ID será gerado. `IDENTITY` deixa o banco de dados responsável pelo autoincremento (1, 2, 3...). |
| **`@EmbeddedId`** | `@EmbeddedId` | Usado para **Chaves Compostas**. Indica que o ID é uma classe auxiliar embutida (ex: `OrderItemPK`). |
| **`@MapsId`** | `@MapsId` | Usado em relacionamentos `@OneToOne` ou chaves compostas para dizer que a chave primária desta entidade é a mesma chave estrangeira do relacionamento. |

### 4. Relacionamentos entre Tabelas (JPA)

Estas anotações definem como as tabelas se conectam (Foreign Keys).

| Anotação | Sintaxe (Exemplo) | Definição |
| --- | --- | --- |
| **`@OneToMany`** | `@OneToMany(mappedBy = "client")` | Relacionamento **Um-para-Muitos**. Um usuário tem muitos pedidos. `mappedBy` indica o lado "fraco" (inverso) da relação. |
| **`@ManyToOne`** | `@ManyToOne` | Relacionamento **Muitos-para-Um**. Muitos pedidos pertencem a um usuário. Geralmente onde fica a chave estrangeira (`@JoinColumn`). |
| **`@ManyToMany`** | `@ManyToMany` | Relacionamento **Muitos-para-Muitos**. Produtos têm muitas categorias e vice-versa. Exige uma tabela intermediária. |
| **`@OneToOne`** | `@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)` | Relacionamento **Um-para-Um**. Um pedido tem um pagamento. `cascade=ALL` propaga ações (se deletar pedido, deleta pagamento). |
| **`@JoinColumn`** | `@JoinColumn(name = "client_id")` | Define o nome da coluna que será a **Chave Estrangeira** (Foreign Key) no banco de dados. |
| **`@JoinTable`** | `@JoinTable(name = "tb_...", joinColumns = ..., inverseJoinColumns = ...)` | Configura a **tabela de associação** (intermediária) em relacionamentos `@ManyToMany`. Define as duas chaves estrangeiras que formam a tabela. |

### 5. Utilitários e Código Boilerplate (Lombok)

Anotações que geram código repetitivo automaticamente em tempo de compilação.

| Anotação | Sintaxe (Exemplo) | Definição |
| --- | --- | --- |
| **`@Getter`** | `@Getter` | Gera automaticamente os métodos `getAtributo()` para todos os campos da classe. |
| **`@Setter`** | `@Setter` | Gera automaticamente os métodos `setAtributo()` para todos os campos da classe. |
| **`@Setter` (Bloqueado)** | `@Setter(AccessLevel.NONE)` | Impede a criação do Setter para um atributo específico (usado em coleções para obrigar o uso de métodos `add`/`remove` em vez de substituir a lista toda). |
| **`@NoArgsConstructor`** | `@NoArgsConstructor` | Cria um construtor vazio (obrigatório para o JPA/Hibernate funcionar). |
| **`@AllArgsConstructor`** | `@AllArgsConstructor` | Cria um construtor com argumentos para todos os atributos da classe. |
| **`@EqualsAndHashCode`** | `@EqualsAndHashCode(onlyExplicitlyIncluded = true)` | Gera os métodos `equals()` e `hashCode()`. O parâmetro diz para usar apenas os campos marcados explicitamente. |
| **`@EqualsAndHashCode.Include`** | `@EqualsAndHashCode.Include` | Marca um campo específico (geralmente o `id`) para ser usado na comparação do `equals` e `hashCode`. |

### 6. Serialização JSON (Jackson)

Controlam como o objeto Java vira JSON (e vice-versa) na resposta da API.

| Anotação | Sintaxe (Exemplo) | Definição |
| --- | --- | --- |
| **`@JsonIgnore`** | `@JsonIgnore` | **Crucial:** Impede que um atributo seja enviado no JSON. Usado para evitar **Loop Infinito** (referência cíclica) em relacionamentos bidirecionais ou para esconder dados sensíveis (senha). |
| **`@JsonFormat`** | `@JsonFormat(pattern = "yyyy-MM-dd...", timezone = "GMT")` | Formata como datas e horas (`Instant`, `Date`) são exibidas no JSON. Define o padrão de texto e o fuso horário. |