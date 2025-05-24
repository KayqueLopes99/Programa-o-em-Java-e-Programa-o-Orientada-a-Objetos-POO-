package lista2.questao_38Lampada;

public class DemoLampada {
    public static void main(String [] args){
        Lampada lampada = new Lampada();
        lampada.acende();
        lampada.acende();

        lampada.apaga();
        lampada.acende();
        
        lampada.mostrarTotalDeVezesAcesa();
    }
}
