package Udemy.Code;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {

        double nota1 = 100;
        double nota2 = 70;
        double nota3 = 80.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 70){
            System.out.println("Aprovado!");

        }else if ((media >= 50) && (media < 70)) {
            System.out.println("Recuperação!");
    
        }else{
            System.out.println("Reprovado");

        int idade = 18;
        boolean isMaiorDeIdade = idade >= 18;

        if (isMaiorDeIdade) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }







        }
    }
}
