package lista5.questao_72_Funcionario;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salarioPorHora;
    private double horasTrabalhadas;

    private static int proximoId = 1;
    private String funcionarioId;

    public Funcionario(String nome, String departamento, double salarioPorHora){
        this.funcionarioId = "ID" + proximoId++;
        this.nome = nome;
        this.departamento = departamento;
        this.salarioPorHora = salarioPorHora; 
        this.horasTrabalhadas = 0.0;
    }

    public Funcionario(String nome){
        this.funcionarioId = "ID" + proximoId++;
        this.nome = nome;
        this.departamento = "Geral";
        this.salarioPorHora = 2.0; 
        this.horasTrabalhadas = 0.0;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }   

    public void setSalarioPorHora(double novoSalario) {
    if (novoSalario > this.salarioPorHora) {
        this.salarioPorHora = novoSalario;
    } else {
        System.out.println("O novo salário deve ser maior que o atual.");
    } 
    }

    public void registrarHoras(double horas) {
        if (horas > 0) {
            this.horasTrabalhadas += horas;
            System.out.println(horas + " horas registradas para " + this.nome);
        }
        else { 
        System.out.println("Horas deve ser positiva.");
    }
    }

    public double calcularSalario() {
        return this.salarioPorHora * this.horasTrabalhadas;
    }


    @Override
    public String toString() {
        return "Funcionário ID: " + funcionarioId +
               ", Nome: " + this.nome + 
               ", Departamento: " + this.departamento +
               ", Salário por Hora: R$" + this.salarioPorHora +
               ", Horas Trabalhadas: " + this.horasTrabalhadas +
               ", Salário Mensal: R$" + calcularSalario();
    }
}
