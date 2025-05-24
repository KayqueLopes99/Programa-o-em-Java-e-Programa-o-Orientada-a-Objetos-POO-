package lista2.questao_41RegistroAcademico;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("Michael", 1, 50);

        System.out.println("Aluno 1: " + michael.getNome() + ", Matrícula: " + michael.getMatricula() + ", Mensalidade: " + michael.calculaMensalidade());

        System.out.println("Total de matrículas criadas: " + RegistroAcademico.getNumeroDeMatriculas());
    }

    }

