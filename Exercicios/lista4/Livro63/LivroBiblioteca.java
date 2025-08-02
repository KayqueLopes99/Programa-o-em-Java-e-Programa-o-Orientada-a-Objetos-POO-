package lista4.Livro63;
public class LivroBiblioteca extends Livro {
    private String localizacao;
    private boolean estaEmprestado;
    
    public LivroBiblioteca(String titulo, String editora,  String autor, int ano, String localizacao) {
        super(titulo, editora, autor, ano);
        this.localizacao = localizacao;
        this.estaEmprestado = false;
    }

    public void emprestar() {
        if (!this.estaEmprestado) {
            this.estaEmprestado = true;
            System.out.println("O livro foi emprestado.");
        } else {
            System.out.println("Livro já emprestado.");
        }
    }

    public void devolver() {
        this.estaEmprestado = false;
        System.out.println("O livro foi devolvido.");
    }
    @Override
    public String toString() {
        return "[BIBLIOTECA] " + super.toString() + 
                " Localização: " + this.localizacao +
                " Emprestado: " + (this.estaEmprestado ? "Sim" : "Não");
    }
}
