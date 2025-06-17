package Disciplina.codes.Abstratas.controle;

public class DemoVeiculo {
   
    public static void main(String[] args) {
        Aviao aviao = new Aviao(10, 26464, "asa798");
        Barco barco = new Barco(50.5f, 10, "jkhvbs98");
        Carro carro = new Carro(5, 4, "qui7809");
        Carro carro2 = new Carro("ty7809");

        System.out.println(aviao);
        System.out.println(barco);
        System.out.println(carro);
        System.out.println(carro2);

        Controle controle = new Controle();
        controle.controlar(aviao);
        controle.controlar(barco);
        controle.controlar(carro);

    }
}
    

