package lista4.Funcionario65;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, String matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAtual(){
        return (getSalario() + this.bonus) * 12 + getSalario();
    }

    @Override
    public String toString(){
        return  "[TÉCNICO] " + super.toString() + " - Bônus: " + this.bonus + " - Salario com bônus: " + ganhoAtual();
    }
    
}
