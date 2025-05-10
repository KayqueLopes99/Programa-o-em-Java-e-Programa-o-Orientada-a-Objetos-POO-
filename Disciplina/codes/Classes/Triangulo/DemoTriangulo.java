package Disciplina.codes.Classes.Triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.inicializaTriangulo(2.5, 2.5, 2.5, "Equilatero");
        t1.imprimeTriangulo();
        // t1.lado1 = 2.5
        // t1.lado2 = 2.5 
        // t1.lado3 = 2.5
        // t1.descricaoTextual = "Equulatero"
        Triangulo t2 = new Triangulo();
        t2.inicializaTriangulo(2.5, 3.5, 4.5, "Escaleno");
        t2.imprimeTriangulo();

        Triangulo t3;
        t3 = t1;

        System.out.println(t1 == t2); // false - Aponta para locais diferentes de memoria. 
        System.out.println(t1 == t3); // true - Aponta para o mesmo local de memória.




    }
}
