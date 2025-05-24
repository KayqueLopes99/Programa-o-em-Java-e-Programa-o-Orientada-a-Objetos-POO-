package lista2.questao_42Generico;

public class DemoTrio {
    public static void main(String[] args) {
        Trio <String> trioStr = new Trio<>("Java", "Python", "Java");
        trioStr.imprimir();
        System.out.println("Iguais: " + trioStr.contarIguais());
    }
}
