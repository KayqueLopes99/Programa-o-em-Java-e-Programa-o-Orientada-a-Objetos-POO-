package lista4.DataHora62;

public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return this.dia + "-" + this.mes + "-" + this.ano + " " + this.hora + ":" + this.minuto;
    }
}

