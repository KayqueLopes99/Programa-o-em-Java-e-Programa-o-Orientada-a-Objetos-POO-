package Disciplina.codes.Classes.ConvercaoUnidades;

public class DemoConvercaoUnidade {
    public static void main(String[] args) {
        System.out.println("5 polegadas = " + ConvercaoUnidade.polegadasParaCentimetros(5) + " Centimetros");
        System.out.println("5 pes: " + ConvercaoUnidade.pesParaCentimetros(5) + " Centimetros");
        System.out.println("5 milhas: " + ConvercaoUnidade.milhasParaQuilometos(5) + " Quilometros");

    }
}
