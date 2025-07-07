package lista4.Pessoa64;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, int idade, String partido, String estado) {
        super(nome, idade, partido);
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "[Governador] Estado: " + this.estado + super.toString();
    }
}

