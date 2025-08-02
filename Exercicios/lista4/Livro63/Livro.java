package lista4.Livro63;

public class Livro {
    private String titulo;
    private String editora;
    private String autor;
    private int ano;

    public Livro(String titulo, String editora, String autor, int ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro: Título " + this.titulo +
                " Autor: " + this.autor +
                " Editora: " + this.editora +
                " Ano: " + this.ano;
    }
}
