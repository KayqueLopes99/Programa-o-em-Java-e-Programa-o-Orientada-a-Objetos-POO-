### 76\. [FCC - 2023 - Copergás - PE - Analista / Suporte de Informática]

A sobrecarga de métodos ocorre quando:

(A) um método de mesmo nome existe em classes diferentes em uma relação de herança.
> (B) há mais de um método com mesmo nome, recebendo parâmetros de tipos ou em quantidades diferentes, em uma classe.
(C) um método recebe mais parâmetros do que pode suportar.
(D) o mesmo método aparece na maioria das classes da aplicação.
(E) um método recebe como parâmetro um valor que extrapola a capacidade do tipo usado para o recebimento.

> Resposta (b)


### 77\. [IDECAN - 2019 - IF-PB - Professor - Informática]

Dadas as seguintes classes, todas no mesmo pacote:

```java
public class Mamifero {
    protected void andar() {
        System.out.print("Mamifero andando");
        ouvir();
    }
    protected void ver() {
        System.out.print("Mamifero vendo");
    }
    protected void ouvir() {
        System.out.print("Mamifero ouvindo");
        ver();
    }
}

public class Primata extends Mamifero {
    protected void andar() {
        System.out.print("Primata andando");
        ouvir();
    }
}

public class Homem extends Primata {
    protected void ver() {
        System.out.print("Homem vendo");
    }
    public static void main(String[] args) {
        Mamifero m = new Homem();
        m.andar();
    }
}
```

Qual é a saída deste programa?

(A) Mamífero andando Mamífero ouvindo Mamífero vendo
> (B) Primata andando Mamífero ouvindo Homem vendo
(C) Uma exception será lançada: MethodNotFoundException
(D) Mamífero andando Mamífero ouvindo Homem vendo
(E) Primata andando Mamífero ouvindo Mamífero vendo

> Resposta (b)
-----

### 78\. [PETROBRAS - 2012 - Analista de Sistemas Júnior - Engenharia de Software]

Suponha que as classes Circulo, Desenho e Figura ocupem arquivos separados. Em qual código Java elas serão compiladas sem erros?

**(A)**

```java
package P1;
import P2.*;
public class Figura {
    protected double x,y;
    protected final double PI=0;
    Desenho d;
    abstract protected double dist(double x1,double y1);
}
```

```java
package P1;
public class Circulo extends Figura {
    double r;
    public Circulo() {
        d.add(this);
        PI=3.14159;
    }
    public double raio() { return r; }
    public double centroX() { return x; }
    public double centroY() { return y; }
    protected double dist(double x1,double y1) {
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
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

**(B)**

```java
package P1;
import P2.*;
abstract public class Figura {
    protected double x,y;
    protected final double PI=0;
    Desenho d;
    abstract protected double dist(double x1,double y1);
}
```

```java
package P1;
public class Circulo extends Figura {
    double r;
    public Circulo() {
        d.add(this);
        PI=3.14159;
    }
    public double raio() { return r; }
    public double centroX() { return x; }
    public double centroY() { return y; }
    private double dist(double x1,double y1) {
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
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

**(C)**

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
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
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

**(D)**

```java
package P1;
import P2.*;
public class Circ implements ICirculo {
    double cx, cy, r;
    public double raio() { return r; }
    public double centroX() { return cx; }
}
```

```java
package P2;
public interface ICirculo {
    double PI;
    double raio();
    double centroX();
    double centroY();
}
```

**(E)**

```java
package P1;
import P2.*;
public class Circ extends ICirculo {
    double cx, cy, r;
    public double raio() { return r; }
    public double centroX() { return cx; }
    public double centroY() { return cy; }
}
```

```java
package P2;
public interface ICirculo {
    double PI=3.14159;
    double raio();
    double centroX();
    double centroY();
}
```


-----

### 79\. [PETROBRAS - 2011 - Analista de Sistemas Júnior - Engenharia de Software]

Analise os fragmentos de código dados abaixo:

```java
package javaapplication1;
public interface Interface1 {
    public int metodoComum();
}
```

```java
package javaapplication1;
public class Concreta1 implements Interface1 {
    public int metodoComum() {
        return(1);
    }
    public int metodoExotico() {
        return(2);
    }
}
```

```java
package javaapplication1;
public class Main {
    public static void main(String[] args) {
        Interface1 x = new Concreta1();
        System.out.println(x.metodoComum());
        System.out.println(x.metodoExotico());
    }
}
```

O resultado, obtido ao tentar compilar e executar esse conjunto de classes, será:

- (A) um erro de compilação, indicando que não é possível fazer uma conversão da classe Concreta1 para a classe Interface1.
> (B) um erro de compilação, indicando que, no contexto de x, não existe metodoExotico.
- (C) nenhuma saída e um erro em tempo de execução, indicando que, dada a conversão de Concreta1 para Interface1, não é possível acessar metodoExotico.
- (D) impressão do número 1, seguida de um erro de tempo de execução, indicando que, dada a conversão de Concreta1 para Interface1, não é possível acessar metodoExotico.
- (E) impressão dos números 1 e 2.

-----

### 80\. [UFC - 2013 - Analista de Tecnologia da Informação / Engenharia de Software]

Na programação orientada a objetos, a possibilidade de haver mais de um método com o mesmo nome na mesma classe denomina-se:

- (a) Herança.
- (b) Sobrescrita.
> (c) Sobrecarga.
- (d) Ligação tardia.
- (e) Encapsulamento.


### 81\. [UFSC - 2023 - Técnico de Tecnologia da Informação]

Considere as seguintes definições relacionadas à programação orientada a objetos, com lacunas a preencher, e assinale a alternativa que preencha corretamente as três definições, considerando sua ordem.

1.  \_\_\_\_\_ é a capacidade de objetos de classes distintas responderem a uma mesma chamada de método de maneiras diferentes. Isso permite que as subclasses redefinam o comportamento de métodos herdados da classe base.
2.  \_\_\_\_\_ é a capacidade de um objeto ter vários métodos com o mesmo identificador, mas com assinaturas de métodos diferentes. Isso permite que os objetos respondam a chamadas de métodos distintos, mas com identificadores idênticos, com base na quantidade e no tipo de argumentos fornecidos.
3.  \_\_\_\_\_ é a capacidade de uma subclasse substituir o comportamento de um método herdado da classe base. Isso permite que uma classe modifique o comportamento de um método para atender às suas próprias necessidades, mantendo a mesma assinatura de método.

(A) Sobrecarga – Polimorfismo – Herança
(B) Sobrescrita – Polimorfismo – Encapsulamento
(C) Polimorfismo – Sobrecarga – Herança
(D) Herança – Encapsulamento – Sobrescrita
> (E) Polimorfismo – Sobrecarga – Sobrescrita


### 82\. [FAB - CIAAR - 2023 - Oficial de Apoio da Aeronáutica - Análise de Sistemas]

Existe uma gama de definições sobre a orientação a objetos. No sentido da relação das classes e dos acessos aos métodos, preencha as lacunas abaixo.

Muitas classes podem ter acesso \_\_\_\_\_, porém, \_\_\_\_\_ esse método \_\_\_\_\_. A sequência de palavras que preenche corretamente as lacunas é:

> (A) a um mesmo método / cada classe executa / de maneira diferente
- (B) a um mesmo método / outras classes executam / da mesma maneira
- (C) somente a um método / outras classes executam / de maneira diferente
- (D) somente a um método / cada classe executa / da mesma maneira

-----

### 83\. [FGV - PGM Niterói - 2023 - RJ • Analista de Tecnologia da Informação]

Observe o método `liga()` do seguinte trecho de código escrito na linguagem Java.

```java
class Aparelho {
    public void liga() {}
}

class Geladeira extends Aparelho {
    public void liga() {
        System.out.println("Tomada");
    }
}

class TV extends Aparelho {
    public void liga() {
        System.out.println("Controle remoto");
    }
}

class Main {
    public static void main(String[] args) {
        Aparelho geladeira = new Geladeira();
        Aparelho tv = new TV();
        geladeira.liga();
        tv.liga();
    }
}
```

Em orientação a objeto, o uso de um método com comportamento diferente, como `liga()`, é realizado por meio do emprego de:

(A) Lean;
(B) Eventos;
(C) Recursão;
> (D) Polimorfismo;
(E) Encapsulamento.

-----

### 84\. [FAB - EEAR - 2023 - Sargento da Aeronáutica - Informática]

Assinale a alternativa que completa a lacuna do texto abaixo.

A POO oferece um tipo especial de classe que não pode ser instanciada. Trata-se da classe \_\_\_\_\_

(A) empacotada
(B) concreta
> (C) abstrata
(D) oculta

-----

### 85\. [Instituto Access - UFFS - 2023 - Técnico de Tecnologia da Informação]

No que diz respeito à orientação a objetos, um princípio é definido como aquele em que as classes derivadas de uma única classe base são capazes de invocar os métodos que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada uma das classes derivadas. É um mecanismo por meio do qual selecionam-se as funcionalidades utilizadas de forma dinâmica por um programa no decorrer de sua execução. Esse princípio é conhecido por

(A) encapsulamento.
> (B) polimorfismo.
(C) acoplamento.
(D) herança.
(E) coesão.

-----

### 86\. [UFPR - 2023 - IF-PR - Informática]

O polimorfismo permite que uma mesma mensagem, tratada por um mesmo método, enviada para diferentes objetos, apresente resultados diferentes. Isso também permite que objetos com tipos diferentes sejam tratados da mesma forma. A hierarquia de classes Java apresentada utiliza o conceito de polimorfismo. Cada classe está salva em seu arquivo específico com o nome da classe e a extensão .java.

```java
public interface Exame {
    public abstract void mostrarPreparo();
}
```

```java
public class ExameImagem implements Exame {
    @Override
    public void mostrarPreparo() {
        System.out.println("EXAME DE IMAGEM PREPARO:");
        System.out.println("Nenhum preparo necessario.");
    }
}
```

```java
public class EcografiaTireoide extends ExameImagem {
}
```

```java
public class ExameSangue implements Exame {
    @Override
    public void mostrarPreparo() {
        System.out.println("EXAMES DE SANGUE - PREPARO:");
    }
}
```

```java
public class GlicemiaJejum extends ExameSangue {
    @Override
    public void mostrarPreparo() {
        System.out.println("GLICEMIA EM JEJUM - PREPARO:");
        System.out.println("Nao ingerir bebidas alcoolicas 72 horas antes do exame.");
        System.out.println("Jejum de 8 a 12 horas");
    }
}
```

```java
import java.util.ArrayList;
import java.util.List;

public class AgendarExame {
    public static void main(String[] args) {
        List<Exame> examesPaciente = new ArrayList<>();
        examesPaciente.add(new GlicemiaJejum());
        examesPaciente.add(new EcografiaTireoide());
        for (Exame exame : examesPaciente) {
            exame.mostrarPreparo();
        }
    }
}
```

Qual o resultado da execução do código descrito no método main da classe AgendarExame?

(A) O método não pode ser executado, pois a classe EcografiaTireoide não tem implementação para o método mostrarPreparo.
> (B)
>GLICEMIA EM JEJUM - PREPARO:
>Não ingerir bebidas alcoólicas 72 horas antes do exame.
>Jejum de 8 a 12 horas
>EXAME DE IMAGEM PREPARO:
>Nenhum preparo necessário.
(C)
EXAMES DE SANGUE - PREPARO:
GLICEMIA EM JEJUM - PREPARO:
Não ingerir bebidas alcoólicas 72 horas antes do exame.
Jejum de 8 a 12 horas EXAME DE IMAGEM PREPARO:
Nenhum preparo necessário.
(D)
GLICEMIA EM JEJUM - PREPARO:
Não ingerir bebidas alcoólicas 72 horas antes do exame.
Jejum de 8 a 12 horas
(E) O método não pode ser executado, pois Exame não define um tipo para o objeto, já que não é uma classe e sim uma interface.

-----

### 87\. [BIO-RIO - 2016 - Prefeitura de São Gonçalo - RJ - Analista da Área Tecnológica]

No que diz respeito à Orientação a Objetos, dois princípios são caracterizados a seguir.

I. constitui um mecanismo que tem por objetivo organizar os dados que sejam relacionados, agrupando-os em objetos, reduzindo as colisões de nomes de variáveis e, da mesma forma, reunindo métodos relacionados às suas propriedades. Este padrão ajuda a manter um programa com centenas ou milhares de linhas de código mais legível e fácil de trabalhar e manter.
II. constitui um mecanismo a partir do qual as classes derivadas de uma única classe base são capazes de invocar os métodos que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada uma das classes derivadas. De acordo com este princípio, os mesmos atributos e objetos podem ser utilizados em objetos distintos, porém, com implementações lógicas diferentes.

Os princípios I e II são conhecidos respectivamente como

(A) coesão e herança.
(B) polimorfismo e coesão.
(C) herança e acoplamento.
(D) acoplamento e encapsulamento.
> (E) encapsulamento e polimorfismo.

-----

### 88\. [CESGRANRIO - 2024 - Banco da Amazônia - Técnico Científico - Tecnologia da Informação]

Considere um sistema bancário em Java que possui a classe Cliente e suas subclasses, ClientePessoaFisica e ClientePessoaJuridica, onde Cliente é uma classe abstrata. Nesse sistema, um método `getDesconto(valor)` deve fornecer o cálculo do desconto para um tipo de cliente, de forma que os clientes do tipo pessoa física e os clientes do tipo pessoa jurídica tenham descontos diferenciados. Suponha que, utilizando corretamente os mecanismos associados à herança e ao polimorfismo, se deseje implementar essas classes de modo que o método `getDesconto` possa ser aplicado indistintamente a qualquer instância que tenha sido declarada como da classe Cliente.

Para atender a essa condição, a implementação dessas classes deve possuir o método `getDesconto`

(A) apenas na classe Cliente, identificando a qual subclasse o cliente pertence e calculando o desconto por meio de uma estrutura se-então dentro da implementação.
> (B) em todas as três classes, sendo possível, nesse caso, que a função `getDesconto` da classe Cliente seja abstrata.
(C) apenas nas classes ClientePessoaFisica e ClientePessoaJuridica, pois não há instâncias da classe Cliente no sistema, já que é uma classe abstrata.
(D) fora das três classes, dado que uma estrutura do tipo se-então deve ser usada para descobrir qual é a classe adequada.
(E) implementada totalmente em todas as classes, sendo que a função `getDesconto` da classe Cliente chama a função `getDesconto` das classes ClientePessoaFisica e ClientePessoaJuridica de acordo com a necessidade.

-----

### 89\. [FGV - 2024 - DATAPREV - ATI - Arquitetura, Engenharia e Sustentação Tecnológica]

Em um sistema de gerenciamento de pagamentos, existem as classes Pagamento (classe base), PagamentoCartao e PagamentoBoleto (ambas herdam de Pagamento). A classe Pagamento define o método `realizarPagamento()`, que é sobrescrito tanto por PagamentoCartao quanto por PagamentoBoleto para implementar comportamentos específicos de cada tipo de pagamento. Considere o seguinte código:

```java
public void processarPagamento(Pagamento pagamento) {
    pagamento.realizarPagamento();
}
```

Assinale a opção que indica o conceito de orientação a objetos que está sendo aplicado quando o método `realizarPagamento()` é chamado em um objeto do tipo Pagamento, mas o comportamento específico é definido pelas subclasses (PagamentoCartao ou PagamentoBoleto).

(A) Encapsulamento, pois o método `realizarPagamento()` está escondido da implementação interna.
(B) Herança, pois as classes filhas estão herdando o método `realizarPagamento()` da classe Pagamento.
(C) Sobrecarga de métodos, pois o método `realizarPagamento()` está definido com diferentes assinaturas.
> (D) Polimorfismo, pois o método é definido na classe base, mas o comportamento é determinado pelas subclasses.
(E) Abstração, pois o método `realizarPagamento()` oculta a complexidade da lógica interna de pagamento.

Com certeza\! Seguem as questões que você enviou, formatadas em Markdown para o seu repositório.

-----

### 90\. [UFU-MG - 2023 - Analista de Tecnologia da Informação Área 1 - Desenvolvimento de Sites, Aplicações e Sistemas]

Considere o caso de orientação a objeto, apresentado no código abaixo, para analisar as asserções apresentadas.

```java
public class Phone{
    public void callNumber(long number) {
        System.out.println("Phone: Discando numero: " + number);
    }
    public boolean isRinging(){
        System.out.println("Phone: Verificar se telefone esta tocando");
        boolean ringing = false;
        return ringing;
    }
}

public class SmartPhone extends Phone{
    public void sendEmail(String message, String address){
        System.out.println("SmartPhone: Enviando E-mail");
    }
    public String retrieveEmail(){
        System.out.println("SmartPhone: Recuperando e-mail");
        String messages = new String();
        return messages;
    }
    public boolean isRinging() {
        System.out.println("SmartPhone: Verificar se smartphone esta tocando");
        boolean ringing = false;
        return ringing;
    }
}

public class App {
    public static void main(String[] args) {
        new App();
    }
    public App() {
        SmartPhone smartPhone = new SmartPhone();
        testPhone(smartPhone);
        testSmartPhone(smartPhone);
    }
    private void testPhone(Phone phone){
        phone.callNumber(34999999999L);
        phone.isRinging();
    }
    private void testSmartPhone(SmartPhone phone){
        phone.sendEmail("Oi", "teste@ufu.br");
        phone.retrieveEmail();
    }
}
```


I. O caso apresentado demonstra um exemplo simples de herança ao definir a classe “SmartPhone” com uma extensão da classe “Phone”; no entanto, há um erro no construtor App() quando é executada a linha `testPhone(smartPhone)`, visto que o método `testPhone()` requer como argumento um objeto do tipo Phone.

II. Sabendo-se que o polimorfismo é unidirecional, o método `testSmartPhone()` não pode ser usado com um objeto Phone como seu argumento.

III. A execução da linha `testPhone(smartPhone)`, descrita dentro do construtor `App()`, terá como resultado as respectivas mensagens: “Phone: Discando numero: 34999999999” e “SmartPhone: Verificar se smartphone está tocando”.

IV. A execução da linha `testPhone(smartPhone)`, descrita dentro do construtor `App()`, terá como resultado as respectivas mensagens: “Phone: Discando numero: 34999999999” e “Phone: Verificar se telefone está tocando”.

Estão corretas apenas as asserções:

(A) II e IV.
> (B) II e III.
(C) I e III
(D) I e IV.

-----

### 91\. [IFRN - 2009 - Professor - Sistemas de Informação]

O código, abaixo, apresenta a implementação de uma classe na linguagem de programação Java. Com base nessa classe, marque a alternativa verdadeira.

```java
public final class Password {
    private String senha;
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
```

(A) Esta classe não poderá ser estendida por outras classes, porém seus métodos poderão ser sobrescritos.
> (B) Esta classe não poderá ser estendida por outras classes.
(C) Esta classe poderá ser estendida por outra classe.
(D) Esta classe poderá ser estendida por outra classe, porém seus métodos não poderão ser sobrescritos.

-----

### 92\. [FGV - 2024 - Prefeitura de Caraguatatuba - SP - Técnico em Processamento de Dados]

(adaptada) Em um jogo de estratégia online, você tem diferentes classes de personagens, como “Guerreiro” e “Mago”, que herdam de uma classe base chamada “Personagem”. A classe base possui um método chamado “ExecutarHabilidade”, que funciona de maneira diferente quando chamado por um personagem guerreiro em comparação com um personagem mago.

Considerando princípios de programação orientada a objetos, assinale a abordagem mais adequada para implementar essa diferenciação.

(A) Utilizar variáveis de controle condicional dentro do método “ExecutarHabilidade” para verificar explicitamente o tipo da instância e ajustar o comportamento.
(B) Cria versões específicas do método “ExecutarHabilidade” para “Guerreiro” e “Mago” com implementações distintas.
> (C) Marcar o método “ExecutarHabilidade” como abstrata na classe base “Personagem” e fornecendo implementações específicas nas classes derivadas.
(D) Permitir que “Guerreiro” e “Mago” herdem métodos específicos de diferentes classes e personalizem o comportamento de “ExecutarHabilidade”.
(E) Ocultar a implementação do método “ExecutarHabilidade” na classe base “Personagem” e redefinindo-o nas classes derivadas para comportamentos específicos.