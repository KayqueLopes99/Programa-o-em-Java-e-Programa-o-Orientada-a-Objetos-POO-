## Comandos `break` e `continue` em Java
- Usados **dentro de estruturas de repetição (`for`, `while`, `do-while`)** ou **switch**, para controlar o **fluxo do laço** ou **interromper** parte dele.

### `break`
- **interrompe completamente** o laço em execução. Quando o `break` é executado, o programa **sai do laço** e **continua após ele**.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

```
0
1
2
3
4
```

### `continue`: Pula para a próxima repetição
- Ele **pula o restante do código do laço** e **volta para a próxima repetição**, **sem encerrar o laço**.


```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println(i);
}
```


```
0
1
2
3
4
6
7
8
9
```

---