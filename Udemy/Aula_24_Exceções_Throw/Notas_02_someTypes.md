## Algumas exceções

| Exceção           | Tipo       | Quando usar                                           | Exemplo de uso |
|------------------|-----------|-----------------------------------------------------|----------------|
| ParseException    | Checked   | Quando ocorre erro ao converter ou interpretar dados de entrada (ex.: datas ou números). | `SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");`<br>`Date date = sdf.parse("32/13/2025");` |
| DomainException   | Checked   | Exceção **personalizada pelo programador**, usada para violar regras de negócio ou domínio do problema. | `if (withdrawAmount > balance) { throw new DomainException("Saldo insuficiente!"); }` |
| RuntimeException  | Unchecked | Para erros de programação ou argumentos inválidos que não precisam ser declarados. | `if (amount <= 0) { throw new IllegalArgumentException("O valor deve ser positivo."); }` |
