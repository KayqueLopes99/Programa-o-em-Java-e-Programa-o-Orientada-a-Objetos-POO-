package Disciplina.codes.Classes.RegistroAcademico;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    int percentualDeCobranca;
    
    
    void inicializaRegistroAcademico(String n, String m, int cc, int pc) {
        nome = n;
        matricula = m;
        codigoCurso = cc;
        percentualDeCobranca = pc;

    }
    double calculaMensalidade(){
        return 100.0*codigoCurso *(percentualDeCobranca/100.0);
    }


}
