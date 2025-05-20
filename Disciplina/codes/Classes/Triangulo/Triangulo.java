package Disciplina.codes.Classes.Triangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String descricaoTextual;

    void inicializaTriangulo(double l1, double l2, double l3, String desc){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        descricaoTextual = desc;

    }

    public double calculaPerimetro(){
        return (lado1 + lado2 + lado3);
    }

    public void imprimeTriangulo(){
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Descricao: " + descricaoTextual);
        System.out.println("Perimetro: " + calculaPerimetro());
    }


    
}
