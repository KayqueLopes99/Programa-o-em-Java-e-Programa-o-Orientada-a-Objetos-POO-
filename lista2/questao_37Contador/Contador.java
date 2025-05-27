package lista2.questao_37Contador;

public class Contador {
    private int valor;

    public Contador(int valorInicial){
        this.valor = valorInicial;
    }

    public void zerar(){
        valor = 0;
    }

    public void incrementar(){
        valor++;
    }

    public void imprimir() {
        System.out.println("Valor atual do contador: " + valor);
    }
      
}