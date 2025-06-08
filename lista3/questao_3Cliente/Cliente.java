package lista3.questao_3Cliente;

public class Cliente {
    private int id, idade;
    private String nome, telefone;

    public Cliente(int id, int idade, String nome, String telefone){
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;

    }


    public String toString(){
        return "ID: " + id + " Idade: " + idade + " Nome: " + nome + " Telefone: " + telefone;
    }



}
