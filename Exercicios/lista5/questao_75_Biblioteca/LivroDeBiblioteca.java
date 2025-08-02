package lista5.questao_75_Biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String localizacaoBiblioteca;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacaoBiblioteca){
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = false;
        this.localizacaoBiblioteca = localizacaoBiblioteca;
    }

    @Override
    public boolean estaEmprestado(){
        return this.emprestado;
    }

    @Override
    public void empresta(){
        this.emprestado = true;
    }

    @Override
    public void devolve() {
        this.emprestado = false;
    }


    @Override
    public String localizacao(){
        return  this.localizacaoBiblioteca;
    }

    @Override
    public String descricao(){
        return "Descrição: " + qualTitulo() + " escrito por " + qualAutor() + ".";
    }

    @Override
    public String toString() {
        return super.toString() + " Localização na Biblioteca:" + localizacao() + " Emprestado: " + (estaEmprestado() ? "Sim" : "Não");
    }








}
