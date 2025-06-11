package Disciplina.codes.Heranca.concessionaria;

public class AutomovelLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean derecaoHidraulica;

    public AutomovelLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean derecaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.derecaoHidraulica = derecaoHidraulica;
    }


    public double quantoCusta(){
        double custo = super.quantoCusta();
        if (arCondicionado) custo += 10000;
        if (derecaoHidraulica) custo += 15000;

        return custo;

    }

    public String toString(){

        String resp = "ArCondicionado=" + (arCondicionado ? "Sim" : "Não");
        resp +=", DirecaoHidraulica=" + (derecaoHidraulica ? "Sim" : "Não");
        resp += ", custo=" + quantoCusta();
        resp += ", ano=" + getAno();
        resp += ", modelo=" + getModelo();
        resp += ", cor=" + getCor();
        resp += ", Airbag=" + isAirbag();
        resp += ", Radio=" + isRadio();

        

        return resp;
    }
}
