package Disciplina.codes.Abstratas.empresa;

public class Assalariado extends Empregado{
    private float salario;

    public Assalariado(String nome, String ctps, float salario) {
        super(nome, ctps);
        this.salario = salario;
    }
    
    public float obterValorPagamento() {
        return salario;
    } 


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Salario: " + salario;
    }
}
