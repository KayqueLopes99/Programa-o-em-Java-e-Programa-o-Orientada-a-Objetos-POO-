package Disciplina.codes.Heranca.reuso;

public class DemoAcademico {
    public static void main(String[] args) {
        RegistroAcademico alunoGrad = new RegistroAcademico("Ricardo", "2023113907", "BTI");

        RegistroAcademicoPosGraduacao alunoPos = new RegistroAcademicoPosGraduacao("Kayque", "2022178798", "Tecnologia da Informação", "Estudo do semi-arido", "Lucas");

        RegistroAcademicoPosGraduacao alunoPos2 = new RegistroAcademicoPosGraduacao(alunoGrad, "Arquitetura e Hurbanismo", "Samuel");

        System.out.println(alunoGrad);
        System.out.println(alunoPos);
        System.out.println(alunoPos2);
    }
}
