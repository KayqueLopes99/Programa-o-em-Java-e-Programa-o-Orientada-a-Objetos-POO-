package lista4.Funcionario65;

public class Administrativo extends Assistente{
    private String turno; 
    private double adicionalNortuno;

    public Administrativo(String nome,  double salario, String matricula, String turno, double adicionalNortuno){
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNortuno = adicionalNortuno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNortuno() {
        return adicionalNortuno;
    }

    @Override
    public double ganhoAtual(){
        double salario = getSalario();
        String turnoLower = turno.toLowerCase();

        switch (turnoLower) {
            case "noite": return (salario + adicionalNortuno) * 12 + salario;
            default: return salario * 12 + salario;
                
        }
    }

    @Override
    public String toString(){
        return super.toString() + " ,Turno: " + getTurno() + " ,Adicional Noturno: " + getAdicionalNortuno() + " ,Ganho : " + ganhoAtual();
    }



    
}
