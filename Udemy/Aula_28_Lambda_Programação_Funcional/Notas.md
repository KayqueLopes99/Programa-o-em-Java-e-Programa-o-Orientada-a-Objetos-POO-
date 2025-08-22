## Programação Funcional e Expressões Lambda
> Comparator objeto de classe separada
> Comparator objeto de classe anônima
> Comparator objeto de expressão lambda com chaves
> Comparator objeto de expressão lambda sem chaves
> Comparator expressão lambda "direto no argumento"

`Comparator<T>` é **uma interface funcional** do pacote `java.util` usada para **definir regras de ordenação** de objetos que podem não ter uma ordenação natural ou quando você quer personalizar a ordenação.

* **Genérico:** `<T>` indica que o comparador funciona para qualquer tipo de objeto.
* **Usos principais:**

  * Ordenar listas: `Collections.sort(lista, comparador)`
  * Ordenar arrays: `Arrays.sort(array, comparador)`
  * Ordenar coleções especiais: `TreeSet`, `TreeMap`
* **É funcional:** pode ser usado com **expressões lambda** ou **referências de método**.

## Métodos
1. **`int compare(T o1, T o2)`**
   * Método principal que define como comparar dois objetos.
   * Retorna:

     * `< 0` se `o1` deve vir antes de `o2`
     * `0` se são equivalentes
     * `> 0` se `o1` deve vir depois de `o2`

2. **`Comparator<T> reversed()`**

   * Inverte a ordem do comparador atual.



## Formas de usar `Comparator` com programação funcional
### a) Objeto de classe separada

```java
class ComparadorNome implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}
```

```java
Collections.sort(listaPessoas, new ComparadorNome());
```

### b) Objeto de classe anônima

```java
Collections.sort(listaPessoas, new Comparator<Pessoa>() {
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
});
```

---

### c) Objeto de expressão lambda **com chaves**

```java
Collections.sort(listaPessoas, (p1, p2) -> {
    return p1.getNome().compareTo(p2.getNome());
});
```

---

### d) Objeto de expressão lambda **sem chaves** (quando tem apenas uma linha)

```java
Collections.sort(listaPessoas, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
```

---

### e) Expressão lambda **direto no argumento** (mais enxuto)

```java
listaPessoas.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
```

> Observação: `List.sort` já aceita `Comparator`, então você pode colocar direto no argumento.


## Stream: 
- É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
- Fonte de dados: coleção, array, função de iteração, recurso de E/S

- Processamento interno.
- O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
> Operações intermediarias: Produz uma nova streams (encadeamento)
```` md
+ filter
- Serve para filtrar elementos de um stream.
- Recebe um predicado (função que retorna true ou false).
- Só deixa passar os elementos que atendem à condição.

+ map
+ flatmap
+ peek
+ distinct
+ sorted
+ skip
+ limit (*)
````
> Operações terminais: Determina o fim do processamento da stream.
```` md
+ forEach
+ forEachOrdered
+ toArray
+ reduce
> Usado para reduzir todos os elementos do stream a um único valor.
+ collect
+ min
+ max
+ count
+ anyMatch (*)
+ allMatch (*)
+ noneMatch (*)
+ findFirst (*)
+ findAny (*)
- * short-circuit

````

### Criação:
- Basta chamar o método stream() ou parallelStream() a partir
de qualquer objeto Collection.
> Outra: Stream.iterate.

- Conversões:
- List para stream: .stream()
- Stream para List: .collect(Collectors.toList())

- OBS:
```
filter → seleciona elementos.

sorted → ordena elementos.

map → transforma elementos.

reduce → junta tudo em um único valor.
```