package Disciplina.codes.Classes.Triangulo;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    String descricaoTextual;

    void inicializaTriangulo(double l1, double l2, double l3, String desc){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        descricaoTextual = desc;

    }

    double calculaPerimetro(){
        return (lado1 + lado2 + lado3);
    }

    void imprimeTriangulo(){
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Descricao: " + descricaoTextual);
        System.out.println("Perimetro: " + calculaPerimetro());
    }


    
}
