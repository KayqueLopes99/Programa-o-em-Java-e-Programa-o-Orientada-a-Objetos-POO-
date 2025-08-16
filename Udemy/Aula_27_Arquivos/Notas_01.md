## Lendo arquivo texto com classes File e Scanner:
> Classes: 
- File - Representação abstrata de um arquivo e seu caminho
- Scanner - Leitor de texto
- (Exception) IOException é uma exceção verificada em Java que indica erros de entrada e saída, como falhas ao ler, gravar ou acessar arquivos e fluxos de dados.

### **Construtores da Classe `File`**
> 1.0 **`File(String pathname)`**
-  Cria um novo objeto `File` a partir de uma **String de caminho completo** (path absoluto ou relativo).
- Exemplo:

```java
     File arquivo = new File("C:/Users/documento.txt");
```


> 2.0 **`File(String parent, String child)`**

-  Cria um novo objeto `File` a partir de um caminho de diretório pai (como `String`) e de um caminho filho (arquivo ou subdiretório, também como `String`).
- Exemplo:

```java
     File arquivo = new File("C:/Users", "documento.txt");
```
- Representa `C:/Users/documento.txt`.

## Obs: 
+ Use `File(String)` quando já tiver o caminho completo.
+ Use `File(String, String)` ou `File(File, String)` quando quiser montar o caminho separando diretório e nome do arquivo.


Perfeito 👌 vou organizar em tabelas no formato **Markdown** com:

* Nome do método
* Explicação simples
* Sintaxe (bem clara)
* Exemplo


## Métodos de Permissão
| Método           | Explicação                                                         | Sintaxe                                  | Exemplo                                                                       |
| ---------------- | ------------------------------------------------------------------ | ---------------------------------------- | ----------------------------------------------------------------------------- |
| **canExecute()** | Verifica se o arquivo pode ser **executado** (ex.: `.exe`, `.sh`). | `boolean resultado = file.canExecute();` | `java File f = new File("programa.exe"); System.out.println(f.canExecute());` |
| **canRead()**    | Verifica se o arquivo pode ser **lido**.                           | `boolean resultado = file.canRead();`    | `java File f = new File("texto.txt"); System.out.println(f.canRead());`       |
| **canWrite()**   | Verifica se o arquivo pode ser **modificado** (escrito).           | `boolean resultado = file.canWrite();`   | `java File f = new File("texto.txt"); System.out.println(f.canWrite());`      |


## Métodos de Criação e Exclusão

| Método              | Explicação                                               | Sintaxe                                  | Exemplo                                                                                     |
| ------------------- | -------------------------------------------------------- | ---------------------------------------- | ------------------------------------------------------------------------------------------- |
| **createNewFile()** | Cria um **novo arquivo vazio** se ele ainda não existir. | `boolean criado = file.createNewFile();` | `java File f = new File("novo.txt"); if(f.createNewFile()){System.out.println("Criado!");}` |
| **delete()**        | Apaga o arquivo ou diretório (se estiver vazio).         | `boolean apagado = file.delete();`       | `java File f = new File("velho.txt"); System.out.println(f.delete());`                      |



##  Métodos de Verificação

| Método       | Explicação                                     | Sintaxe                           | Exemplo                                                                |
| ------------ | ---------------------------------------------- | --------------------------------- | ---------------------------------------------------------------------- |
| **exists()** | Verifica se o arquivo ou diretório **existe**. | `boolean existe = file.exists();` | `java File f = new File("texto.txt"); System.out.println(f.exists());` |
| **length()** | Retorna o **tamanho do arquivo em bytes**.     | `long tamanho = file.length();`   | `java File f = new File("texto.txt"); System.out.println(f.length());` |



## Métodos de Caminho

| Método                | Explicação                                 | Sintaxe                                    | Exemplo                                                                         |
| --------------------- | ------------------------------------------ | ------------------------------------------ | ------------------------------------------------------------------------------- |
| **getAbsolutePath()** | Retorna o **caminho completo** do arquivo. | `String caminho = file.getAbsolutePath();` | `java File f = new File("texto.txt"); System.out.println(f.getAbsolutePath());` |

## Definições:
- FileReader: é uma classe usada para ler caracteres diretamente de um arquivo.
- BufferedReader: envolve um Reader (como FileReader) e fornece leitura mais rápida e eficiente, permitindo ler linhas inteiras com readLine().

### **FileReader**

Usado para abrir e ler caracteres de um arquivo.

```java
FileReader fr = new FileReader("arquivo.txt");
int c;
while ((c = fr.read()) != -1) {
    System.out.print((char) c);
}
fr.close();
```

### **BufferedReader**

Usado junto com `FileReader` para leitura mais eficiente (linha por linha).

```java
BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
String linha;
while ((linha = br.readLine()) != null) {
    System.out.println(linha);
}
br.close();
```

Beleza, José! Vou resumir de forma bem clara:

---

## Escrever
>  **FileWriter**
- **escrever dados em arquivos de texto** (caractere por caractere).

* Se o arquivo **não existir**, ele cria.
* Se já existir, ele **substitui o conteúdo** (a menos que você ative o modo de **append**).

-sintaxe:
```java
FileWriter fw = new FileWriter("arquivo.txt"); // sobrescreve
FileWriter fw = new FileWriter("arquivo.txt", true); // adiciona (append)
fw.write("Texto exemplo");
fw.close();
```

> **BufferedWriter**
* Ideal para escrever **muitas linhas** de forma eficiente.
* Usa `newLine()` para pular linha.

-sintaxe:
```java
FileWriter fw = new FileWriter("arquivo.txt", true);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Primeira linha");
bw.newLine(); // quebra de linha
bw.write("Segunda linha");
bw.close();
```
