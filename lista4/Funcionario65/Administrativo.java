package lista4.Funcionario65;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNortuno;

    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNortuno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNortuno = adicionalNortuno;
    }

    @Override
    public double ganhoAtual() {
        switch (turno.toLowerCase()) {
            case "noite":
                return (getSalario() + this.adicionalNortuno) * 12 + getSalario();
            default:
                return getSalario() * 12 + getSalario();

        }
        
    }

    @Override
    public String toString() {
        return "[ADMINISTRATIVO] " + super.toString() + " - Turno: " + this.turno + " - Adicional Noturno: " + this.adicionalNortuno + " - Ganho : " + ganhoAtual();
    }

}
