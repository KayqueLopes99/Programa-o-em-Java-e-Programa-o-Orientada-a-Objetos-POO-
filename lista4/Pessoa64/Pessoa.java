package lista4.Pessoa64;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "Pessoa: Nome: '" + this.nome +
               ", Idade: " + this.idade + " anos";
    }
}
