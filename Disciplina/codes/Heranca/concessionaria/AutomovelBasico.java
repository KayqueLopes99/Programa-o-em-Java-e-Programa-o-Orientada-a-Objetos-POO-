package Disciplina.codes.Heranca.concessionaria;

public class AutomovelBasico extends Automovel{
    protected boolean airbag;
    protected boolean radio;

    public AutomovelBasico(int ano, String modelo, String cor, boolean airbag, boolean radio){
        super(ano, modelo, cor);
        this.airbag = airbag;
        this.radio = radio;
    }


    public double quantoCusta(){
        return 0.0;
    }


}
