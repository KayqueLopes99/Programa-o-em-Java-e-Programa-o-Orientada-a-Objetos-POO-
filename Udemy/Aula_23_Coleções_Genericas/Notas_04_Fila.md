## Fila 
- Definição: Estrutura de dados que segue o princípio FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser removido.
- A interface Queue estende a interface Collection e fornece operações adicionais para inserção, remoção e inspeção de elementos em uma fila

- Implementações comuns: `java.util.LinkedList`, `java.util.ArrayDeque`, `java.util.PriorityQueue`.
### Métodos:
- `offer`: Adiciona um elemento ao final da fila.
- `poll`: Remove e retorna o elemento do início da fila.
- `peek`: Retorna o elemento do início da fila sem removê-lo.
- `isEmpty`: Verifica se a fila está vazia. herdado da classe Collection, determina se a fila está vazia.
- `clear`: Remove todos os elementos da fila. herdado da classe Collection, remove todos os elementos da fila.
- `size`: Retorna o número de elementos na fila. herdado da classe Collection, retorna o tamanho da fila.
- `contains`: Verifica se a fila contém um elemento específico. herdado da classe Collection, verifica se a fila contém um elemento específico.

### Obs:
- *PriorityQueue*, que implementa a interface Queue, *ordena elementos por sua ordem natural*.
- Ao adicionar elementos a uma PriorityQueue, os elementos são inseridos na ordem de prioridade de tal modo que o elemento de maior prioridade (isto é, o menor valor) será o primeiro elemento removido da PriorityQueue.