package Disciplina.codes.Abstratas.empresa;

public abstract class Empregado implements Pagavel{
    private String nome;
    private String carteiraTrabalho;

    public Empregado(String nome, String carteiraTrabalho){
        this.nome = nome;
        this.carteiraTrabalho = carteiraTrabalho;

    }


    @Override
    public String toString() {
    
        return "Nome do Trabalhador: " + nome + "Carteira de Trabalho: " + carteiraTrabalho;
    }
}
