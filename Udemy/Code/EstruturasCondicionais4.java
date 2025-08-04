package Udemy.Code;

public class EstruturasCondicionais4 {
    public static void main(String[] args) {
        double salario_anual = 70000;
        double primeira_faixa = 9.70 / 100;
        double segunda_faixa = 37.35 / 100;
        double terceira_faixa = 49.50 / 100;
        double valor_imposto;

        if(salario_anual <= 34712){
          valor_imposto = salario_anual * primeira_faixa;
        }else if(salario_anual > 34713 && salario_anual <= 68507){
            valor_imposto = salario_anual * segunda_faixa;
        }else{
            valor_imposto = salario_anual * terceira_faixa;
        }
        System.out.println("Imposto: " + valor_imposto);
    }
    
}
