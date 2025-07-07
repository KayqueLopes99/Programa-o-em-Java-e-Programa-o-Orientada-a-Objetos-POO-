package lista4.DataHora62;

public class TesteEvento {
    public static void main(String[] args) {

        DataHora dataHora = new DataHora(2, 2, 2002, 2, 20);
        System.out.println(dataHora);



        EventoHeranca evento1 = new EventoHeranca(22, 12, 2004, 14, 30, "Reunião de equipe");
        System.out.println(evento1);

        EventoDelegacao evento2 = new EventoDelegacao(1, 1, 2026, 0, 0, "Feliz Ano Novo");
        System.out.println(evento2);
    }
}