package Disciplina.codes.Abstratas.controle;

public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade){
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Capacidade: " + capacidade;
    }

    public abstract void moverFrente();

}
