package Udemy.Code.Colections.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {
    public static void main(String[] args) {
        // Rápido e sem ordem
        Set<String> set = new TreeSet<>();
        set.add("TV");

        // Colocando notebook 5 vezes mas so adiciona uma vez, pois não pode repetir
        // elementos.
        set.add("Notebook");
        set.add("Noteook");
        set.add("Notbook");
        set.add("Notbook");
        set.add("Ntebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        System.out.println(set.size() + 1);
        set.removeIf(element -> element.startsWith("N"));

        for (String p : set) {
            System.out.println(p);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union sem repetições
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);


        // intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);


        // difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
