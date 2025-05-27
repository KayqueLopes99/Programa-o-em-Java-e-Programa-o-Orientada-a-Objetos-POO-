package lista2.questao_41RegistroAcademico;

public class RegistroAcademico {
    String nome, matricula;
    private int codigoCurso, percentualDeCobranca;
    public static int numeroDeMatriculas = 0; 
    
    
    public RegistroAcademico(String n, int cc, int pc) {
        nome = n;
        codigoCurso = cc;
        percentualDeCobranca = pc;
        numeroDeMatriculas ++;
        this.matricula = "MAT" + "000" + numeroDeMatriculas;

    }
    public double calculaMensalidade(){
        return 100.0*codigoCurso *(percentualDeCobranca/100.0);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    
    public static int getNumeroDeMatriculas() {
        return numeroDeMatriculas;
    }


}
