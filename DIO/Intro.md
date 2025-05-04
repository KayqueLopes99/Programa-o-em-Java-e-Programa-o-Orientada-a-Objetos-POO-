## Introdução ao Java 
- Java é uma linguagem de programação orientada a objetos, desenvolvida pela Sun Microsystems (atualmente parte da Oracle Corporation) em 1995.
- Linguagem de programação de propósito geral, projetada para ser simples, segura e portátil.

- Java é amplamente utilizada para desenvolvimento de aplicativos corporativos, aplicativos móveis (Android), sistemas embarcados e muito mais

- Java é uma linguagem compilada e interpretada, o que significa que o código-fonte é compilado em bytecode, que é executado pela Java Virtual Machine (JVM).

- Compilador Java converte o código-fonte em bytecode, que é uma representação intermediária do código.

- *JDK* (Java Development Kit) é um conjunto de ferramentas necessárias para desenvolver aplicativos Java. Inclui o compilador, a JVM e outras bibliotecas e ferramentas úteis.

- Compilação passos:
    1. Escrever o código-fonte em um arquivo com a extensão `.java`.
    2. Compilar o código-fonte usando o compilador Java (`javac`), que gera um arquivo `.class` contendo o bytecode.
    3. Executar o bytecode usando a JVM (`java`), que interpreta e executa o código.

```bash
javac MeuPrograma.java # Compila o código-fonte
java MeuPrograma # Executa o bytecode
```
- Download:
    - [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (Java Development Kit)

+ IDE: INTELLIJ COMUNITY EDITION
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (IDE para desenvolvimento Java)
   

## Regras de escrita do Java:
- Snake case: `minhaVariavel` (variáveis e métodos)
- Pascal case: `MinhaClasse` (classes e interfaces)
- Nome do pacote: sempre em letras minúsculas, separadas por pontos (ex: `br.com.exemplo`).
- Nome do arquivo: deve correspondeA funcionalidade do código. 