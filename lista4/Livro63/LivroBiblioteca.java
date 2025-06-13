package lista4.Livro63;

public class LivroBiblioteca extends Livro {
    private String genero;
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, int ano, String genero, boolean emprestado) {
        super(titulo, autor, ano);
        this.genero = genero;
        this.emprestado = emprestado;
    }

    public String getGenero() {
        return genero;
    }
    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public String toString() {
        return super.toString() + 
                " Gênero: " + getGenero() +
                " Emprestado: " + (isEmprestado() ? "Sim" : "Não");
    }
}
