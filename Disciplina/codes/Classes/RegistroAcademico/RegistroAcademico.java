package Disciplina.codes.Classes.RegistroAcademico;

public class RegistroAcademico {
    String nome;
    String matricula;
    private int codigoCurso;
    private int percentualDeCobranca;
    
    
    public void inicializaRegistroAcademico(String n, String m, int cc, int pc) {
        nome = n;
        matricula = m;
        codigoCurso = cc;
        percentualDeCobranca = pc;

    }
    public double calculaMensalidade(){
        return 100.0*codigoCurso *(percentualDeCobranca/100.0);
    }


}
