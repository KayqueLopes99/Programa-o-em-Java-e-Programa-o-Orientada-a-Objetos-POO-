package Disciplina.codes.Abstratas.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Fatura f = new Fatura(5.89F, 5);
        Assalariado a = new Assalariado("Lucas", "98639909", 9783.76F);
        
        imprimeValorPagamento(a);
        imprimeValorPagamento(f);
    }

    public static void imprimeValorPagamento(Pagavel pag) {
        System.out.println(pag.obterValorPagamento());
    }
}
