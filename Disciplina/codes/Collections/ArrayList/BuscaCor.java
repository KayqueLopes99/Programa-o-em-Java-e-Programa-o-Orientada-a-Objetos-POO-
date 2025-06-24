package Disciplina.codes.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuscaCor {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("azul");
        cores.add("vermelho");
        cores.add("verde");
        cores.addAll(Arrays.asList("amarelo", "preto", "branco", "roxo", "cinza", "laranja", "rosa", "marrom"));

        System.out.println(cores);
        Collections.sort(cores);
        System.out.println(cores);


        buscaSring(cores, "azul");
        buscaSring(cores, "amarelo");


    }
    
    public static void buscaSring(ArrayList<String> arrayList, String alvo){

        if (arrayList.contains(alvo)) {
            int posicao = Collections.binarySearch(arrayList, alvo);
            System.out.println("O alvo " + alvo + " está na lista na posição: " + posicao);
        }
        else{
            System.out.println("O alvo " + alvo + "não está na lista.");
        }


    }
}
