package lista4.DataHora62;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca (int dia, int mes, int ano, int hora, int minuto, String evento) {
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento (Herança): " + this.evento + " em " + super.toString();
    }
}
