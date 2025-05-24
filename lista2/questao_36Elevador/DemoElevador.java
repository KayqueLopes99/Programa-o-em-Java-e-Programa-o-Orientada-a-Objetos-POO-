package lista2.questao_36Elevador;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5);
        elevador.entrada();
        elevador.sobe();
        elevador.sobe();

        elevador.entrada();
        elevador.entrada();
        elevador.entrada();

        elevador.sai();
        elevador.desce();




    }
}
