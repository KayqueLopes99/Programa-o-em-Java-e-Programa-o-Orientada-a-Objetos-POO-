## `get` e `set`?

- Os métodos **getter (`get`)** e **setter (`set`)** são usados para acessar e modificar **atributos `private`** de uma classe, respeitando o **encapsulamento**.

### Se o atributo fosse `public`:

> Qualquer um poderia acessar ou modificar sem controle:

```java
public class Produto {
    public double preco;
}

// Em outra classe
Produto p = new Produto();
p.preco = -10.0; // ❌ Preço negativo? Incorreto!
```

---

### Por isso usamos `private` + `get` e `set`

```java
public class Produto {
    private double preco;

    // Setter: controla a modificação do valor
    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            preco = novoPreco;
        } else {
            System.out.println("Preço inválido. Deve ser >= 0.");
        }
    }

    // Getter: controla como o valor é exibido
    public double getPreco() {
        return preco;
    }
}
```

---

## Sintaxe:

```java
// Atributo privado
private Tipo nomeDoAtributo;

// Setter
public void setNomeDoAtributo(Tipo valor) {
    // lógica para validar
    this.nomeDoAtributo = valor;
}

// Getter
public Tipo getNomeDoAtributo() {
    // lógica para retornar
    return this.nomeDoAtributo;
}
```

---

### Exemplo: Data (dia entre 1 e 31 em março)

```java
public class Data {
    private int dia;

    public void setDia(int d) {
        if (d >= 1 && d <= 31) {
            dia = d;
        } else {
            System.out.println("❌ Dia inválido para março.");
        }
    }

    public int getDia() {
        return dia;
    }
}
```

| Método | Função    | Permite...                           |
| ------ | --------- | ------------------------------------ |
| `set`  | Modificar | Validar se o novo valor é aceitável  |
| `get`  | Acessar   | Controlar como o valor é apresentado |
