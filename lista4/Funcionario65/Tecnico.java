package lista4.Funcionario65;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, String matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double ganhoAtual(){
        return (getSalario() + bonus) * 12 + getSalario();
    }

    @Override
    public String toString(){
        return super.toString() + " ,Bônus: " + getBonus() + " ,Salario com bônus: " + ganhoAtual();
    }
    
}
