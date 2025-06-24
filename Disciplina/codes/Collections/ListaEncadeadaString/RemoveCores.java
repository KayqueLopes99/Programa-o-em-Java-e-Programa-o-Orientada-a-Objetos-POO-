package Disciplina.codes.Collections.ListaEncadeadaString;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveCores {
    public static void main(String[] args) {
        LinkedList<String> listaCores = new LinkedList<>(Arrays.asList(
                "azul", "vermelho", "verde", "amarelo", "preto", "branco", "roxo", "cinza", "laranja", "rosa", "marrom"
        ));

        LinkedList<String> listaRemover = new LinkedList<>(Arrays.asList(
                "azul", "vermelho", "verde"
        ));

        System.out.println(listaCores);
        remove(listaCores, listaRemover);
        System.out.println(listaCores);

    }

    public static void remove(LinkedList<String> listaCompleta, LinkedList<String> listaRemover) {
        Iterator<String> itera = listaCompleta.iterator();

        while (itera.hasNext()) {
            if (listaRemover.contains(itera.next())) {
                itera.remove();
            }
        }
    }
}
