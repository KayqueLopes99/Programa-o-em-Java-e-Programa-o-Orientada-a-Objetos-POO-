package DIO.Code;

public class EstruturasCondicionais {
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

        }
    }
}
