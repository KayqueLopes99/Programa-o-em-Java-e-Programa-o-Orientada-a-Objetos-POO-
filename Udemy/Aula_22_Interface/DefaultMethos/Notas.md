## Default methods (defender methods):
* A intenção básica é prover implementação padrão para métodos, de modo
a evitar: 
> 1) repetição de implementação em toda classe que implemente a interface
> 2) a necessidade de se criar classes abstratas para prover reuso da implementação 

* Outras vantagens:
> Manter a retrocompatibilidade com sistemas existentes
> Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis

- Implementação de um método na interface com default depois do tipo de encapsulamento.

- Exemplo no código.

- Sim: agora temos uma forma de herança múltipla
- Mas o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescreve-lo.

> Interfaces ainda são bem diferentes de classes abstratas. Interfaces não possuem recursos tais como construtores e atributos.