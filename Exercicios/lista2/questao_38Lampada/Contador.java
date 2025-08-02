package lista2.questao_38Lampada;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void imprimir() {
        System.out.println("Valor atual do contador: " + valor);
    }

    public int getValor() {
        return valor;
    }

}
