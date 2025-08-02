package lista4.Livro63;
public class LivroLivraria extends Livro{
    private double preco;
    private int estoque;

    public LivroLivraria(String titulo, String editora, String autor, int ano, int estoque, double preco) {
        super(titulo, editora, autor, ano);
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println("Venda realizada.");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "[LIVRARIA] "  + super.toString() + " Preço: " + this.preco +  " Estoque: " + this.estoque;
    }
    
}
