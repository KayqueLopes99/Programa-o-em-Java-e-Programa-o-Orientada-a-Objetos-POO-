package Disciplina.codes.Abstratas.controle;

public abstract class Aquatico extends Veiculo{
    private float profundidade;

    public Aquatico(int capacidade, float profundidade){
        super(capacidade);
        this.profundidade = profundidade;
    }

    public String toString() {
        return super.toString() + ", Profundidade: " + profundidade;
    }

    public abstract void moverFrente();

}
