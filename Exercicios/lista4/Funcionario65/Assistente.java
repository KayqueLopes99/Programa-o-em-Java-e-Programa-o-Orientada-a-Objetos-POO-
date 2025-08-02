package lista4.Funcionario65;
public class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String nome, double salario, String matricula){
        super(nome, salario);
        this.matricula = matricula;  
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return super.toString() + " ," + "Matrícula: "+ this.matricula;
    }
}