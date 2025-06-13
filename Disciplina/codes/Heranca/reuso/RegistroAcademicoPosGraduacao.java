package Disciplina.codes.Heranca.reuso;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico academico;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(String nomeDoAluno, String matricula, String curso, String tituloTese, String orientador) {
        this.academico = new RegistroAcademico(nomeDoAluno, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(RegistroAcademico academico, String tituloTese, String orientador) {
        this.academico = academico;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return academico.toString() + ", tituloTese=" + tituloTese + ", orientador="+ orientador;
    }
}
