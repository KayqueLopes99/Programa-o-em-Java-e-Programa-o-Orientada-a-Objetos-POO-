# Visão geral do JDBC
- JDBC (Java Database Connectivity): API padrão do Java para acesso a dados (Banco de Dados).

- Usando a API JDBC, você pode acessar praticamente qualquer fonte de dados, desde bancos de dados relacionais até planilhas e arquivos simples. 
> Formada por:
- ``java.sql``
- ``javax.sql`

> Necessita de um driver baseado na tecnologia JDBC para mediar entre a tecnologia JDBC e o banco de dados. 

---
# Resumo JDBC

## Interface Summary
| Interface            | Descrição |
|----------------------|-----------|
| Array                | Mapeamento em Java para o tipo SQL ARRAY. |
| Blob                 | Representação em Java de um valor SQL BLOB. |
| CallableStatement    | Interface usada para executar procedimentos armazenados em SQL. |
| Clob                 | Mapeamento em Java para o tipo SQL CLOB. |
| ``Connection``           | Uma conexão (sessão) com um banco de dados específico. |
| DatabaseMetaData     | Informações abrangentes sobre o banco de dados como um todo. |
| ``Driver``               | Interface que toda classe de driver deve implementar. |
| ``DriverAction``         | Interface implementada quando o Driver quer ser notificado pelo DriverManager. |
| NClob                | Mapeamento em Java para o tipo SQL NCLOB. |
| ParameterMetaData    | Usado para obter informações sobre tipos e propriedades de cada parâmetro em um PreparedStatement. |
| ``PreparedStatement``    | Representa uma instrução SQL pré-compilada. |
| Ref                  | Mapeamento em Java de um valor SQL REF, referência para um tipo estruturado no banco. |
| ``ResultSet``            | Tabela de dados representando um conjunto de resultados de uma consulta. |
| ResultSetMetaData    | Fornece informações sobre tipos e propriedades das colunas em um ResultSet. |
| RowId                | Representação em Java de um valor SQL ROWID. |
| Savepoint            | Representação de um ponto de salvamento dentro de uma transação. |
| SQLData              | Interface usada para mapear um tipo definido pelo usuário (UDT) em Java. |
| SQLInput             | Fluxo de entrada contendo valores de um tipo SQL estruturado ou distinto. |
| SQLOutput            | Fluxo de saída para gravar atributos de um tipo definido pelo usuário de volta no banco. |
| SQLType              | Objeto usado para identificar tipos SQL genéricos (JDBC ou específicos de fornecedor). |
| SQLXML               | Mapeamento em Java para o tipo SQL XML. |
| Statement            | Objeto usado para executar uma instrução SQL estática. |
| Struct               | Mapeamento em Java para um tipo SQL estruturado. |
| Wrapper              | Interface que permite recuperar a instância delegada quando esta é um proxy. |

---

## Class Summary
| Classe              | Descrição |
|---------------------|-----------|
| Date                | Envoltório fino em torno de um valor de milissegundos, identificando como um SQL DATE. |
| ``DriverManager``       | Serviço básico para gerenciar um conjunto de drivers JDBC. |
| DriverPropertyInfo  | Propriedades de driver para realizar uma conexão. |
| SQLPermission       | Permissão verificada pelo SecurityManager em chamadas específicas relacionadas a conexões e drivers. |
| Time                | Envoltório em torno de java.util.Date para identificar como um SQL TIME. |
| Timestamp           | Envoltório em torno de java.util.Date para identificar como um SQL TIMESTAMP. |
| Types               | Classe que define constantes usadas para identificar tipos SQL genéricos (JDBC types). |

---

## Enum Summary
| Enum                | Descrição |
|---------------------|-----------|
| ClientInfoStatus    | Enumeração para status do motivo pelo qual uma propriedade não pôde ser definida via setClientInfo. |
| JDBCType            | Constantes que identificam tipos SQL genéricos (JDBC types). |
| PseudoColumnUsage   | Enumeração para uso de colunas pseudo/ocultas. |
| RowIdLifetime       | Enumeração para tempo de vida de um RowId. |

---

## Exception Summary
| Exceção                               | Descrição |
|---------------------------------------|-----------|
| BatchUpdateException                  | Lançada quando ocorre erro durante uma atualização em lote. |
| DataTruncation                        | Exceção de truncamento de dados inesperado em leitura ou gravação. |
| SQLClientInfoException                | Lançada quando propriedades de cliente não puderam ser definidas em uma Connection. |
| SQLDataException                      | Lançada quando SQLState é '22' ou sob condições específicas do fornecedor. |
| ``SQLException``                          | Fornece informações sobre erros de acesso a banco de dados. |
| SQLFeatureNotSupportedException       | Lançada quando SQLState é '0A'. |
| SQLIntegrityConstraintViolationException | Lançada quando SQLState é '23'. |
| SQLInvalidAuthorizationSpecException  | Lançada quando SQLState é '28'. |
| SQLNonTransientConnectionException    | Lançada quando SQLState é '08' em falhas de conexão não transitórias. |
| SQLNonTransientException              | Lançada quando a repetição da operação falharia sem corrigir a causa. |
| SQLRecoverableException               | Lançada quando uma operação pode ter sucesso se a aplicação executar passos de recuperação. |
| SQLSyntaxErrorException               | Lançada quando SQLState é '42'. |
| SQLTimeoutException                   | Lançada quando expira o tempo definido de consulta/conexão. |
| SQLTransactionRollbackException       | Lançada quando SQLState é '40'. |
| SQLTransientConnectionException       | Lançada em falhas transitórias de conexão (SQLState '08'). |
| SQLTransientException                 | Lançada quando a operação pode ter sucesso se repetida sem intervenção extra. |
| SQLWarning                            | Fornece informações sobre avisos de acesso a banco de dados. |

> ClassNotFoundException;


### Nivelamento: Álgebra relacional e SQL

**Álgebra Relacional** é um conjunto de operações matemáticas usadas para manipular e consultar dados em bancos de dados relacionais. Ela define operações como seleção, projeção, união, diferença, produto cartesiano e junção, que permitem combinar e filtrar dados de tabelas de forma lógica e estruturada. É a base teórica para a construção de linguagens de consulta de bancos de dados.

tured Query Language)** é a linguagem padrão utilizada para interagir com bancos de dados relacionais. Com SQL, é possível criar, modificar, consultar e gerenciar dados e estruturas de tabelas. SQL implementa conceitos da álgebra relacional, permitindo realizar operações como seleção de registros (`SELECT`), projeção de colunas, junção de tabelas (`JOIN`), agrupamento (`GROUP BY`), entre outras.


###  Operações Básicas da Álgebra Relacional

1. **Restrição (σ – seleção)**

   * Filtra **linhas (tuplas)** de uma tabela com base em uma condição.
   * Exemplo: selecionar apenas alunos com nota > 7.
   * `σ nota > 7 (ALUNO)`

2. **Projeção (π)**

   * Escolhe apenas **colunas (atributos)** desejadas de uma tabela.
   * Exemplo: pegar só os nomes dos alunos.
   * `π nome (ALUNO)`

3. **Produto Cartesiano (×)**

   * Combina **todas as tuplas** de uma tabela com **todas as tuplas** de outra.
   * Gera muitos resultados, usado geralmente como base para junções.
   * `ALUNO × CURSO`

4. **Junção (⨝)**

   * É o **produto cartesiano** seguido de uma **restrição** para relacionar tabelas.
   * Junta tabelas em atributos que fazem sentido (chaves correspondentes).
   * Exemplo: alunos com o curso que eles estão matriculados.
   * `ALUNO ⨝ ALUNO.idCurso = CURSO.idCurso CURSO`

---



* **Restrição → filtra linhas**
* **Projeção → escolhe colunas**
* **Produto cartesiano → combina tudo**
* **Junção → combina tabelas de forma lógica (chaves)**

> Definir no librares o drive do sql + java.

### **Recuperar dados**
- Statement
- ResultSet
- first() [move para posição 1, se houver]
- beforeFirst() [move para posição 0]
- next() [move para o próximo, retorna false se já estiver no último]
- absolute(int) [move para a posição dada, lembrando que dados reais começam em 1]


### **Transações**

* **`setAutoCommit(false)`** → desliga o auto commit, para controlar quando salvar.
* **`commit()`** → confirma as mudanças no banco.
* **`rollback()`** → desfaz as mudanças se der erro.


### **Inserir dados**

* **`PreparedStatement`** → usado para comandos SQL parametrizados.
* **`executeUpdate`** → executa INSERT/UPDATE/DELETE, retorna nº de linhas afetadas.
* **`Statement.RETURN_GENERATED_KEYS`** → pede para o banco retornar as chaves (IDs) geradas.
* **`getGeneratedKeys`** → recupera esses IDs depois do `executeUpdate`.

