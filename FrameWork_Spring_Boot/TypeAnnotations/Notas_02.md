## No mong DB
### 1. `@Document` 

* **Onde vai:** Em cima da classe.
* **Para que serve:** Diz ao Spring: "Essa classe Java representa uma **Collection** (tabela) lá no MongoDB".
* **Dica:** Você pode definir o nome da coleção. Se não definir, ele usa o nome da classe.
* `@Document(collection = "usuarios_vip")`

### 2. `@Id` 

* **Onde vai:** Em cima do atributo identificador.
* **Para que serve:** Indica qual campo será a **Chave Primária** (`_id`) no MongoDB.
* **Importante:** No Mongo, o ID geralmente é uma `String` (aqueles códigos loucos tipo "507f1f77bcf86cd799439011"), mas pode ser `Long` ou `UUID` também.

### 3. `@Field` 

* **Onde vai:** Em cima de qualquer atributo.
* **Para que serve:** Serve para mudar o nome do campo quando ele for salvo no banco.
* **Exemplo:** No Java você usa `nomeCompleto` (CamelCase), mas no banco você quer salvar como `nome_completo` (SnakeCase).
* `@Field("nome_completo")`

### 4. `@Transient` 

* **Onde vai:** Em cima de atributos que **não** devem ser salvos.
* **Para que serve:** Dados temporários. O Spring ignora esse campo na hora de salvar no banco, mas você pode usar ele na lógica do código.
* **Exemplo:** Um campo `idade` que é calculado a partir da `dataNascimento`. Você não salva a idade, você calcula ela na hora.

### 5. `@DBRef` (O Link - Use com moderação!)

* **Onde vai:** Em cima de um atributo que é outra classe.
* **Para que serve:** Funciona como uma "Chave Estrangeira" (Foreign Key) do SQL. Em vez de salvar os dados do cliente dentro do pedido, você salva apenas o ID dele e o Mongo "busca" a referência.
* **Atenção:** No NoSQL, geralmente preferimos **aninhar** (salvar o objeto dentro do outro) do que usar `@DBRef`, por questões de performance.

---

### Exemplo Prático (Contexto do seu Projeto)

Imagine que você está modelando o sistema da clínica odontológica ("KLIJ Dental Clinic"):

```java
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

// 1. Define que isso vai virar uma coleção chamada 'pacientes' no Mongo
@Document(collection = "pacientes")
public class Paciente {

    // 2. Esse é o _id do documento no Mongo
    @Id
    private String id;

    // 3. No Java é 'nomeCompleto', mas no banco salva como 'nome'
    @Field("nome")
    private String nomeCompleto;

    private String email; // Se não tiver anotação, salva como 'email' mesmo

    // 4. Esse campo o Java usa, mas NÃO salva no banco de dados
    @Transient
    private boolean isOnlineAgora;

    // Construtores, Getters e Setters...
}

```

**Resumo:**

* Use `@Document` para nomear a tabela.
* Use `@Id` para dizer quem manda.
* Use `@Field` se quiser nomes diferentes no banco.
* Use `@Transient` para campos calculados ou temporários.
