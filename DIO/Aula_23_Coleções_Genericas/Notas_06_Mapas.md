## Mapas
- Definição: Estrutura de dados que associa chaves a valores, permitindo acesso rápido aos valores através das chaves.
- A interface `Map` não estende a interface `Collection`, mas é uma parte importante da estrutura de coleções em Java.
- Importação:
```java
import java.util.Map;
```
- *Associam chaves a valores*
- *As chaves em um Map devem ser únicas, mas os valores associados não precisam ser.*
- Exemplos de classes que implementam a interface Map: 
- Hashtable, HashMap, SortedMap (interface) e TreeMap
- Hashtable e HashMap armazenam elementos em tabelas de hash
- TreeMaps armazenam elementos em árvores
- implementação de SortedMap (mantém as chaves ordenadas)

- **TreeMap** é uma implementação de SortedMap que mantém as chaves ordenadas de acordo com a ordem natural ou com um comparador fornecido.


### Métodos:
- `put(chave, valor)`: Adiciona um par chave-valor ao mapa.
- `get(chave)`: Retorna o valor associado a uma chave específica.
- `remove(chave)`: Remove o par chave-valor associado a uma chave específica.
- `containsKey(chave)`: Verifica se o mapa contém uma chave específica.
- `keySet()`: Retorna um conjunto contendo todas as chaves do mapa.
- `values()`: Retorna uma coleção contendo todos os valores do mapa.

## Obs
- Ele ordena os elementos de acordo com a ordem natural das chaves ou com um comparador fornecido.
- A classe `TreeMap` é uma implementação de `SortedMap` que mantém as chaves ordenadas de acordo com a ordem natural ou com um comparador fornecido.