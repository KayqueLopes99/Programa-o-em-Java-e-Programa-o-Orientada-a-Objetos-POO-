
- 76) > (B) há mais de um método com mesmo nome, recebendo parâmetros de tipos ou em quantidades diferentes, em uma classe.
- 77) > (B) Primata andando Mamífero ouvindo Homem vendo

- 78) > (C)
**(C)**
> *Exemplo no erro (A): public class Figura tinha um método abstrato, mas a classe não era. Eliminada.

> *Exemplo nos erros (A) e (B): PI=3.14159; tentava modificar a variável PI que era final. Eliminadas.

> *Exemplo no erro (D): Circ implementava ICirculo mas não fornecia o método centroY(). Eliminada.

> *Exemplo no erro (E): public class Circ extends ICirculo tentava herdar de uma interface.
```java
package P1;
import P2.*;
abstract public class Figura {
    double x,y;
    final double PI=3.14159;
    Desenho d;
    abstract protected double dist(double x1,double y1);
}
```

```java
package P1;
public class Circulo extends Figura {
    double r;
    public Circulo() { d.add(this); }
    public double raio() { return r; }
    public double centroX() { return x; }
    public double centroY() { return y; }
    public double dist(double x1,double y1) {
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y)); // X
    }
}
```

```java
package P2;
import java.util.List;
import P1.Figura;
public class Desenho {
    List f;
    public void add(Figura p) { f.add(p); }
}
```

- 79) > (B) um erro de compilação, indicando que, no contexto de x, não existe metodoExotico.
- 80) > (C) Sobrecarga.

- 81) > (E) Polimorfismo – Sobrecarga – Sobrescrita
- 82) > (A) a um mesmo método / cada classe executa / de maneira diferente
- 83) > (D) Polimorfismo;
- 84) > (C) abstrata
- 85) > (B) Polimorfismo
- 86) 
> (B) 5 LINHAS COM GLICEMIA EM JEJUM - PREPARO: a Necessario.
>GLICEMIA EM JEJUM - PREPARO:
>Não ingerir bebidas alcoólicas 72 horas antes do exame.
>Jejum de 8 a 12 horas
>EXAME DE IMAGEM PREPARO:
>Nenhum preparo necessário.

- 87) > (E) encapsulamento e polimorfismo.

- 88) > (B) em todas as três classes, sendo possível, nesse caso, que a função `getDesconto` da classe Cliente seja abstrata. 
- 89) > (D) Polimorfismo, pois o método é definido na classe base, mas o comportamento é determinado pelas subclasses.

- 90) > (B) II e III.

- 91) > (B) Esta classe não poderá ser estendida por outras classes.
- 92) > (C) Marcar o método “ExecutarHabilidade” como abstrata na classe base “Personagem” e fornecendo implementações específicas nas classes derivadas.

