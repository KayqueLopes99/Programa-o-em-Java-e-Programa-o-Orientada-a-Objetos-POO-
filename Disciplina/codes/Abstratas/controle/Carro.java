package Disciplina.codes.Abstratas.controle;

public class Carro extends Terrestre {
    private String placa;

    public Carro(int capacidade, int qtdRodas, String placa) {
        super(capacidade, qtdRodas);
        this.placa = placa;
    }

    public Carro(String placa) {
        super(5, 4);
        this.placa = placa;
    }

    @Override
    public void moverFrente() {
        System.out.println("Carro movendo para frente");
    }

    @Override
    public String toString() {
        return "Carro [placa: " + placa + super.toString() + "]";
    }    

    
}
