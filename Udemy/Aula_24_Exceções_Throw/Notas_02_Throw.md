# `throw` 

- O `throw` é usado em Java para **lançar (disparar) uma exceção** quando ocorre uma condição de erro ou situação inesperada no código.  
- Ele **interrompe a execução normal** do método e envia a exceção para ser tratada em outro lugar (com `try/catch`) ou declarar que o método a lança (`throws`).

- Sintaxe 

```java
throw new ExceptionType("Mensagem de erro");
```

* **ExceptionType**: o tipo da exceção a ser lançada (pode ser uma exceção padrão do Java ou uma personalizada).
* **Mensagem de erro**: texto que descreve o motivo da exceção.


- Exemplo

```java
public void deposit(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
    }
    this.balance += amount;
}
```

* Aqui, se `amount` for menor ou igual a 0, a exceção `IllegalArgumentException` é lançada.

- Exemplo com exceção personalizada

```java
public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
    if (checkout.isBefore(checkin)) {
        throw new DomainException("Checkout não pode ser antes do check-in.");
    }
    this.checkin = checkin;
    this.checkout = checkout;
}
```

* `DomainException` é uma exceção criada pelo programador.
> EXEMPLOS NO CODIGO DE EXCEÇÕES