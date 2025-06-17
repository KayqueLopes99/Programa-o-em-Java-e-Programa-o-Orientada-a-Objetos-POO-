package Disciplina.codes.Abstratas.empresa;

public class Fatura implements Pagavel{
    private float preco;
    private int quantidade;

    public Fatura(float preco, int quantidade){
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public float obterValorPagamento(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Preco: " + preco + "Quantidade: " + quantidade;
    }


}
