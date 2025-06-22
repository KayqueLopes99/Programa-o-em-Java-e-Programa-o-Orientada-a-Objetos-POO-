package lista5.questao_74_Desenho;

public class DemoDesenho {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();

        Desenho desenho1 = new Desenho(circulo, 1, 1, quadrado, 2, 2);

        Desenho desenho2 = new Desenho(quadrado, 3, 3, triangulo, 4, 4);

        desenho1.apresenta();
        desenho2.apresenta();


    }
}
