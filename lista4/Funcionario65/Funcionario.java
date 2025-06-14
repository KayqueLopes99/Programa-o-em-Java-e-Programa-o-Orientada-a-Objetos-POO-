package lista4.Funcionario65;

public class Funcionario {
    private String nome;
    private double salario; 

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentaSalario(double valor) {
        this.salario += valor;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double ganhoAtual(){
        return salario * 12 + salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + " nome: " + getNome() + ", salario: " + getSalario() +  ", ganho atual: " + ganhoAtual();
    }
}