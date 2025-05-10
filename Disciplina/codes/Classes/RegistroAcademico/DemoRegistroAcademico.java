package Disciplina.codes.Classes.RegistroAcademico;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("Michael", "202512345", 1, 50);
        double valor = michael.calculaMensalidade();
        System.out.println("Mensalidade: " + valor);

        RegistroAcademico isabelly = new RegistroAcademico();
        isabelly.inicializaRegistroAcademico("Isabelly", "202512346", 2, 100); 





    }
}
