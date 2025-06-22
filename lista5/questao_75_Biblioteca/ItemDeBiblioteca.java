package lista5.questao_75_Biblioteca;

public interface ItemDeBiblioteca {
    public static final int maximoDeDiasParaEmprestimo = 14;

    boolean estaEmprestado();

    void empresta();

    void devolve();

    String localizacao();

    String descricao();
}
