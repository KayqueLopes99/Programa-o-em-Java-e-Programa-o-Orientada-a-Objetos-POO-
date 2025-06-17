package Disciplina.codes.Abstratas.controle;

public class Aviao extends Aereo {
    private int cadAviao;

    public Aviao(int capacidade, int cadAviao, String cadANAC) {
        super(capacidade, cadANAC);
        this.cadAviao = cadAviao;
    }
    @Override
    public void moverFrente() {
        System.out.println("Aviao movendo para frente");
    }   

    @Override
    public String toString(){
        return super.toString() + ", cadAviao: " + cadAviao;
    }


}
