package lista5.questao_74_Desenho;

public class DemoDesenho {
    public static void main(String[] args){
        Quadrado figura1 = new Quadrado();
        Triangulo figura2 = new Triangulo();
        Circulo figura3 = new Circulo();

        Desenho desenho1 = new Desenho(figura3, 1, 1, figura1, 2, 2);
        Desenho desenho2 = new Desenho(figura1, 3, 3, figura2, 4, 4);

        desenho1.apresenta();
        desenho2.apresenta();
    }
}
