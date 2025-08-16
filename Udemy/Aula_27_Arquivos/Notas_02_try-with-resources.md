## Bloco try-with-resources
> **Bloco `try-with-resources`** é um jeito de garantir que recursos (como arquivos, conexões, etc.) sejam **fechados automaticamente**, sem você precisar escrever `close()`.

### Sintaxe:

```java
try (Recurso r = new Recurso()) {
    // usa o recurso aqui
} catch (Exception e) {
    e.printStackTrace();
}
```

### Exemplo com arquivo:

```java
try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
    String linha;
    while ((linha = br.readLine()) != null) {
        System.out.println(linha);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

