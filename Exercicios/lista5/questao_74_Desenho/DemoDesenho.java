package lista5.questao_74_Desenho;

public class DemoDesenho {
    public static void main(String[] args){
        Quadrado figura1 = new Quadrado();
        Triangulo figura2 = new Triangulo();
        Circulo figura3 = new Circulo();

        System.out.println("--- Apresentando um Desenho 1 ---");
        Desenho desenho1 = new Desenho(figura3, 1.3, 1.3, figura1, 2.3, 2.3);
        desenho1.apresenta();


        System.out.println("--- Apresentando um Desenho 2 ---");

        Desenho desenho2 = new Desenho(figura1, 3.5, 3.5, figura2, 4.5, 4.5);
        desenho2.apresenta();
    }
}
