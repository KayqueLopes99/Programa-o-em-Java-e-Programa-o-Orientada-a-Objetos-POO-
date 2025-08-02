## 71. Explique por que não podemos ter construtores declarados com a palavra-chave abstract.
- Construtores não podem ser declarados como `abstract` porque eles são responsáveis por inicializar uma instância de uma classe. 
- A palavra-chave `abstract` é usada para declarar métodos que não têm implementação na classe base e devem ser implementados nas subclasses. 
- Como os construtores são chamados quando uma instância é criada, não faria sentido ter um construtor sem implementação, pois isso impediria a criação de objetos da classe. 
- Construtores devem sempre ter uma implementação concreta para garantir que a instância da classe seja corretamente inicializada.