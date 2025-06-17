package Disciplina.codes.Abstratas.controle;

public class Barco extends Aquatico{
    private String codBarco;

    public Barco(float profundidade, int capacidade, String codBarco) {
        super(capacidade, profundidade);
        this.codBarco = codBarco;
    }
    @Override
    public void moverFrente() {
        System.out.println("Barco movendo para frente");
    }

    @Override
    public String toString(){
        return super.toString() + ", CodBarco: " + codBarco;
    }


}
