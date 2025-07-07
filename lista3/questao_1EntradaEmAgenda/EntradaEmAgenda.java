package lista3.questao_1EntradaEmAgenda;

public class EntradaEmAgenda {
    private int dia, mes, ano;
    private String hora, assunto;

    public EntradaEmAgenda(int dia, int mes, int ano, String hora, String assunto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.assunto = assunto;
    }

    public String toString(){
        String dados;
        dados = "Data: " + dia + "/" + mes + "/" + ano + "\n";
        dados += "Hora: " + hora + "\n";
        dados += "Assunto: " + assunto + "\n";
        return dados;
    } 


    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
  
}
