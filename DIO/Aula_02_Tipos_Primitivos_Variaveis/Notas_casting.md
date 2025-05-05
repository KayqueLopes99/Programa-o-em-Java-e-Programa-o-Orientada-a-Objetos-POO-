## Casting
- Casting é o processo de conversão de um tipo de dado para outro.
- Sintaxe: `<tipo_destino> <variavel> = (<tipo_destino>) <variavel_a_ser_convertida>;`
- Exemplo:
```java
int numero = 10;
double decimal = (double) numero; // Casting de int para double
System.out.println(decimal); // Saída: 10.0
```
- Não é muito bom.
### Tabela de tipos
| Tipo     | Tamanho (bits) | Intervalo de Valores                          | Exemplo                  |
|----------|----------------|----------------------------------------------|--------------------------|
| `byte`   | 8              | -128 a 127                                   | `byte idade = 25;`       |
| `short`  | 16             | -32.768 a 32.767                             | `short temperatura = 30;` |
| `int`    | 32             | -2.147.483.648 a 2.147.483.647               | `int populacao = 1000000;` |
| `long`   | 64             | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | `long distancia = 10000000000L;` |
| `float`  | 32             | Aproximadamente -3.40282347E+38 a 3.40282347E+38 | `float altura = 1.75f;`   |
| `double` | 64             | Aproximadamente -1.79769313486231570E+308 a 1.79769313486231570E+308 | `double pi = 3.14159;`    |
| `char`   | 16             | Caracteres Unicode (0 a 65.535)              | `char letra = 'A';`      |
| `boolean`| 1              | `true` ou `false`                            | `boolean ativo = true;`  |
| `String` | -              | Sequência de caracteres                       | `String nome = "João";`  |
