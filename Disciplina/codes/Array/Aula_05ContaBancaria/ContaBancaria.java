package Disciplina.codes.Array.Aula_05ContaBancaria;

import java.util.ArrayList;
public class ContaBancaria {
    private double saldoFinal;
    private ArrayList<Float> translacoes;

    public ContaBancaria(){
        saldoFinal = 0;
        translacoes = new ArrayList<>();
    }

    public String toString(){
        String resposta = "==============\n";

        for (Float float1 : translacoes) {
            resposta += float1 + "\n";
        }

        resposta += "Saldo: "+ saldoFinal + "\n";
        resposta += "==============\n";
        return resposta;
    }



    
}
