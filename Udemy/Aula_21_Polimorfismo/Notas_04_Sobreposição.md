## Polimorfismo de sobreposição
> Ocorre quando redefinimos um método da classe mãe em uma classe filha.

- Para que isso aconteça, é obrigatório ter uma relação de herança (extends). A classe filha herda os métodos da classe mãe e decide que, para um deles, precisa de um comportamento mais específico, mais especializado.

> O método da classe filha se sobrepõe (sobrescreve) ao da classe mãe.

- Isso significa que, quando o método é chamado em um objeto da classe filha, a versão da filha é executada em vez da versão da mãe. A implementação da filha tem prioridade e "esconde" a implementação original da mãe.