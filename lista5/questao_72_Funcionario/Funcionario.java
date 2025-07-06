package lista5.questao_72_Funcionario;

public class Funcionario {
    private static int proximoId = 1;

    private final String funcionarioId;
    private String nome;
    private String cargo;
    private String departamento;
    private double salarioPorHora;
    private int horasTrabalhadas;


    public Funcionario(String nome, String cargo, String departamento, double salarioPorHora){
        this.funcionarioId = "ID" + proximoId++;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.salarioPorHora = salarioPorHora; 
        this.horasTrabalhadas = 0;
    }

    public Funcionario(String nome){
        this(nome, "Funcionario", "Geral", 2.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        System.out.println("Erro: A quantidade de horas registradas deve ser positiva.");
    }
    }

    public double calcularSalario() {
        return this.salarioPorHora * this.horasTrabalhadas;
    }


    @Override
    public String toString() {
        return "Funcionário ID: " + funcionarioId +
               ", Nome: " + this.nome +
               ", Salário por Hora: R$" + this.salarioPorHora +
               ", Horas Trabalhadas: " + this.horasTrabalhadas +
               ", Salário Mensal: R$" + calcularSalario() +
                ", Cargo: " + this.cargo +
                ", Departamento: " + this.departamento;
    }
}
