package lista2.questao_42Generico;

public class DemoTrio {
    public static void main(String[] args) {
        Trio <String> trioStr = new Trio<> ("Java", "Python", "Java");
        trioStr.imprimir();
        
        Trio <Integer> trioInt = new Trio<>(1, 2, 1);
        trioInt.imprimir();

        Trio <Double> trioDbl = new Trio<>(3.14, 2.71, 3.14);
        trioDbl.imprimir();


        System.out.println("Iguais: " + trioInt.contarIguais());
        System.out.println("Iguais: " + trioDbl.contarIguais());
        System.out.println("Iguais: " + trioStr.contarIguais());
    }
}
