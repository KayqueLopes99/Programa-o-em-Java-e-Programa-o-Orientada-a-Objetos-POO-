package lista4.DataHora62;

public class EventoHeranca extends DataHora {
    String evento;

    public EventoHeranca (int dia, int mes, int ano, int hora, int minuto, String evento) {
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }
    
    @Override
    public String toString() {
        return "Evento: " + getEvento() + " em " + super.toString();
    }
}
