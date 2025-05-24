package lista2.questao_37Contador;

public class DemoContador {
    public static void main(String[] args) {
        Contador contador = new Contador(0);

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        contador.imprimir();

        contador.zerar();

        contador.imprimir();
        
    }
}
