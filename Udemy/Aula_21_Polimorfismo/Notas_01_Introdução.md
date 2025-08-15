## Polimorfismo
- A palavra **Polimorfismo** vem do grego: "Poli" (muitas) e "Morfos" (formas). Em POO, é a capacidade de um objeto poder se comportar de múltiplas formas.

- A ideia central é que podemos nos referir a objetos de classes diferentes através de uma mesma referência (a da classe pai ou de uma interface) e, ao chamar um método, a execução correta (a da classe específica do objeto) será acionada.

- Pense em um controle remoto universal (a referência). Ele tem um botão "Ligar". Quando você aponta para uma TV Samsung e aperta "Ligar", ele liga a TV. Quando você aponta para um aparelho de som da Sony, o **mesmo botão** "Ligar" executa a ação de ligar o som. A mensagem é a mesma ("Ligar"), mas o comportamento (a "forma" da ação) muda de acordo com o objeto.

> A associação do tipo específico com o tipo genérico é feita em tempo de
execução (upcasting).
> O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account) 

### O polimorfismo se manifesta principalmente de três formas. 
- listada nos proximos arquivos.