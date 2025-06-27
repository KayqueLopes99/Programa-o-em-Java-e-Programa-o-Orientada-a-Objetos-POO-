package Disciplina.codes.Collections.Fila;

import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args){
        PriorityQueue<Double> filaComPrioridade = new PriorityQueue<>();
        filaComPrioridade.offer(10.0);
        filaComPrioridade.offer(9.5);
        filaComPrioridade.offer(8.6);
        filaComPrioridade.offer(6.7);
        filaComPrioridade.offer(5.5);
        filaComPrioridade.offer(6.5);
        System.out.println("Fila: " + filaComPrioridade);

        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll()); // JA ORDENA. 
        }

    }
}
