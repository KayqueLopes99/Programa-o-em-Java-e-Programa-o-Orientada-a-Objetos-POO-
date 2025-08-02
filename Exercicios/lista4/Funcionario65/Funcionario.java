package lista4.Funcionario65;

public class Funcionario {
    private String nome;
    private double salario; 

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentaSalario(double aumento) {
        this.salario += aumento;
    }

    public double ganhoAtual(){
        return salario * 12 + salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "[Funcionario] nome: " + this.nome + ", salário: R$" + this.salario +  " ganho atual: " + ganhoAtual();
    }
}