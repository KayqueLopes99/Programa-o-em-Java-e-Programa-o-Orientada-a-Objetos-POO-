package Disciplina.codes.Collections.Conjunto;
import java.util.TreeSet;
public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Azul");
        
        conjunto.add("Branco");
        conjunto.add("Ciano");
        conjunto.add("Dourado");
        conjunto.add("Fúcsia");
        conjunto.add("Escarlate");

        // ADIÇÃO NA POSIÇÃO CORRETA. ORDENA AUTOMATICAMENTE


        System.out.println("Conjunto: " + conjunto);
        System.out.println("Tamanho do conjunto: " + conjunto.size());
        System.out.println("Conjunto contém Azul: " + conjunto.contains("Azul"));

        System.out.println("Antes: " + conjunto.headSet("Dourado"));
        System.out.println("Depois: " + conjunto.tailSet("Dourado"));
        System.out.println("Primeiro: " + conjunto.first());
        System.out.println("Último: " + conjunto.last());

        
    
    }
}
