package Disciplina.codes.Classes.FilaCaixa;

public class FilaCaixa {
    public static int clientesAtendidos = 0;
    private int numeroCaixa;

    FilaCaixa (int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa: " + numeroCaixa + "\nAtendendo o Cliente " + ++clientesAtendidos);
    }

    public String toString(){
        return "\nCaixaBanco [numeroCaixa=" + numeroCaixa + "]";


    }



}
