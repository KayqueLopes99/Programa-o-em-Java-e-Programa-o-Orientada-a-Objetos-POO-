package Disciplina.codes.Circulo;

public class Circulo {
    private double raio;
    private static final double pi = 3.1415;


    public Circulo(double raio){
        this.raio = raio;
    }

    public double perimetro(){
        return 2*pi*raio;

    }


    @Override
    public String toString() {
        return "raio = " + raio;
    }


    
}
