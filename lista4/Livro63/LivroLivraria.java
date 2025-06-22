package lista4.Livro63;

public class LivroLivraria extends Livro{
    private double preco;
    private int estoque;

    public LivroLivraria(String titulo, String autor, int ano, int estoque, double preco) {
        super(titulo, autor, ano);
        this.preco = preco;
        this.estoque = estoque;
    }


    public double getPreco() {
        return preco;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void vender(int quantidade) {
        if (quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println("Venda do livro realizada com sucesso.");
        } else {
            System.out.println("Estoque insuficiente para vender o livro.");
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Preço: " + getPreco() +  " Estoque: " + getEstoque();
    }
    
}
