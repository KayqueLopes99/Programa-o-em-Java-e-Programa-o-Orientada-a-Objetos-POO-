package lista2.questao_41RegistroAcademico;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("Ana", 3, 75);
        RegistroAcademico aluno2 = new RegistroAcademico("Bruno", 2, 80);

        System.out.println(aluno1.getNome() + " - Matrícula: " + aluno1.getMatricula() + " - Mensalidade: R$ " + aluno1.calculaMensalidade());
        System.out.println(aluno2.getNome() + " - Matrícula: " + aluno2.getMatricula() + " - Mensalidade: R$ " + aluno2.calculaMensalidade());

        System.out.println("Número total de matrículas: " + RegistroAcademico.getNumeroDeMatriculas());
    }

    }

