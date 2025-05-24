package Disciplina.codes.Classes.Natal;

public class Natal {
    private int dia;
    private int mes;
    private int ano;

    public Natal (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!this.dataEhValida()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

        }

    }


    public static Natal fabricaDeData(int dia, int mes, int ano){
        if (dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && ano >= 0) {
            return new Natal(dia, mes, ano);
            
        }
        else {
            return null;
        }
    }


    public static Natal fabricaDeNatal(int ano){
        return new Natal(25, 12, ano);

    }

    private boolean dataEhValida() {
        return (dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && ano >= 0);
    }

    public void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public String toString(){
        return "Dia = " + dia + " Mês = " + mes + " Ano = " +  ano;
    }





    public int getDia() {
        return dia;
    }



    public void setDia(int dia) {
        this.dia = dia;
    }



    public int getMes() {
        return mes;
    }



    public void setMes(int mes) {
        this.mes = mes;
    }



    public int getAno() {
        return ano;
    }



    public void setAno(int ano) {
        this.ano = ano;
    }



    
}
