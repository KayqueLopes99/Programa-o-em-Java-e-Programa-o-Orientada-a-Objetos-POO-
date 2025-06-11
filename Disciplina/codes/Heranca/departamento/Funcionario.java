package Disciplina.codes.Heranca.departamento;

public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String nome, String identidade, double salario) {
        super(nome, identidade);
        this.salario = salario;
    }


    public double getSalario(){
        return salario;
    }

    @Override
    public String toString() {
         return "nome=" + getNome() + ", identidade=" + getIdentidade() + ", salario=" + salario;
     }



}
