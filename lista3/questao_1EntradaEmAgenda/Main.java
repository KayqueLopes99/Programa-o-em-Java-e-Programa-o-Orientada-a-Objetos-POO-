package lista3.questao_1EntradaEmAgenda;

public class Main {
    public static void main(String[] args) {
        Agenda minhsAgenda = new Agenda();

        EntradaEmAgenda compromisso1 = new EntradaEmAgenda(22, 12, 2004, "10:00", "Reunião dos magos");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda(22, 12, 2004, "14:00", "Reunião dos bruxos");

        minhsAgenda.adicionaCompromisso(compromisso1);
        minhsAgenda.adicionaCompromisso(compromisso2);

        minhsAgenda.listaDia(22, 12, 2004);
        minhsAgenda.listaDia(23, 12, 2004); // Teste para data sem compromissos



    }
}
