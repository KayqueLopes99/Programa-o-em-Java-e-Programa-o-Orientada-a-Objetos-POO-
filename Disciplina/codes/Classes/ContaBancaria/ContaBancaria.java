package Disciplina.codes.Classes.ContaBancaria;

public class ContaBancaria {
    private String nome;
    private float saldo;
    private boolean especial;



    public ContaBancaria(String nome, float saldo, boolean especial){
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;

    }

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0f;
        this.especial = false;
    }


    public String toString(){
        return "Nome = "  + nome + "\nSaldo = " + saldo + "\nEspecial = " + (especial ? " Sim": " Não");
    }

    




}
