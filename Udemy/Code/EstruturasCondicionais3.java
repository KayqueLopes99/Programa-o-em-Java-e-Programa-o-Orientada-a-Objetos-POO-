package Udemy.Code;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensaegem_doar = "Doacao de 500.";
        String mensagem_nao_doar = "Sem condicoes";
        String resultado = (salario > 5000) ? mensaegem_doar : mensagem_nao_doar;
        System.out.println(resultado);
    }
}
