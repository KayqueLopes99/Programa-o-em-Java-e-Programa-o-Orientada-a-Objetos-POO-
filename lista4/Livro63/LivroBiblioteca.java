package lista4.Livro63;

public class LivroBiblioteca extends Livro {
    private String genero;
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano);
        this.genero = genero;
        this.emprestado = false;
    }

    public String getGenero() {
        return genero;
    }
    
    public void emprestar() {
        if (!this.emprestado) {
            this.emprestado = true;
            System.out.println("O livro foi emprestado.");
        } else {
            System.out.println("O livro já se encontra emprestado.");
        }
    }

    public void devolver() {
        this.emprestado = false;
        System.out.println("O livro foi devolvido.");
    }


    @Override
    public String toString() {
        return super.toString() + 
                " Gênero: " + getGenero() +
                " Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
