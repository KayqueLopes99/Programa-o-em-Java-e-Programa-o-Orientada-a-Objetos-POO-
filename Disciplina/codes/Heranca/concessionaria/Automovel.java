package Disciplina.codes.Heranca.concessionaria;

public class Automovel {

    protected int ano;
    protected String modelo, cor;

    public Automovel(int ano, String modelo, String cor){
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public double quantoCusta(){
        return (ano < 2000? 20000 : 40000);
    }


}