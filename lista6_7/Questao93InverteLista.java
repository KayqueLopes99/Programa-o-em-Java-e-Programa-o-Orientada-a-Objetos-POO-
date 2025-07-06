package lista6_7;

import java.util.LinkedList;

public class Questao93InverteLista{
    public static void main(String[] args){
    // LinkedList<String> cores = new LinkedList<>(Arrays.asList("azul", "vermelho", "verde"));   
    
    LinkedList<Character> listaOriginal = new LinkedList<>();

    listaOriginal.add('A');
    listaOriginal.add('B');
    listaOriginal.add('C');
    listaOriginal.add('D');
    listaOriginal.add('E');
    listaOriginal.add('F');
    listaOriginal.add('G');
    listaOriginal.add('H');
    listaOriginal.add('I');
    listaOriginal.add('J');

    LinkedList<Character> listaInvertida = new LinkedList<>();

    for (int i = listaOriginal.size() - 1 ; i >= 0 ; i--) {
        listaInvertida.add(listaOriginal.get(i));
    }
    System.out.println("Lista Original: " + listaOriginal);
    System.out.println("Lista Invertida: " + listaInvertida);
}



}