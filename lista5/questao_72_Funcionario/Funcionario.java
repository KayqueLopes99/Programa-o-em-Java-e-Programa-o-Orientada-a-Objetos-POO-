package lista5.questao_72_Funcionario;

public class Funcionario {
    private static int proximoId = 1;

    private final String funcionarioId;
    private String nome;
    private double salarioPorHora;
    private double horasTrabalhadas;



    public Funcionario(String nome, double salarioPorHora){
        this.funcionarioId = "ID" + proximoId++;
        this.nome = nome;
        this.salarioPorHora = salarioPorHora; 
        this.horasTrabalhadas = 0;
    }

    public Funcionario(String nome){
        this(nome, 2.0);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        }
    }

    public double calcularSalario() {
        return this.salarioPorHora * this.horasTrabalhadas;
    }


    @Override
    public String toString() {
        return "Funcionário ID: " + funcionarioId +
               ", Nome: " + nome +
               ", Salário por Hora: R$" + salarioPorHora +
               ", Horas Trabalhadas: " + horasTrabalhadas +
               ", Salário Mensal: R$" + calcularSalario() + "]";
    }
}
