## Declaração de cada Collection
```java
import java.util.*;

public class ExemploCollections {
    public static void main(String[] args) {
        // 1. List
        List<String> lista = new ArrayList<>();
        lista.add("Item 1");
        lista.add("Item 2");
        System.out.println("Lista: " + lista);

        // 2. Set
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Elemento A");
        conjunto.add("Elemento B");
        System.out.println("Conjunto: " + conjunto);

        // 3. Queue
        Queue<String> fila = new LinkedList<>();
        fila.offer("Primeiro");
        fila.offer("Segundo");
        System.out.println("Fila: " + fila);

        // 4. Map
        // Map<ClasseTipoChave, ClasseTipoValor>
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Valor 1");
        mapa.put(2, "Valor 2");
        System.out.println("Mapa: " + mapa);

        // 5. Stack
        Stack<String> pilha = new Stack<>();
        pilha.push("Topo 1");
        pilha.push("Topo 2");
        System.out.println("Pilha: " + pilha);
    }
}
```