package lista3.questao_1EntradaEmAgenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionaCompromisso(EntradaEmAgenda novaEntrada) {
        this.compromissos.add(novaEntrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        System.out.println("\n--- Compromissos para " + dia + "/" + mes + "/" + ano + " ---");
        
        boolean encontrado = false;
        for (EntradaEmAgenda dadosCadastrados : this.compromissos) {
            if (dadosCadastrados.ehNoDia(dia, mes, ano)) {
                System.out.print(dadosCadastrados);
                encontrado = true;
            } 
        }
        if (!encontrado) {
            System.out.println("Nenhum compromisso encontrado!");
        }
        System.out.println("------------------------------------------");
    }

}