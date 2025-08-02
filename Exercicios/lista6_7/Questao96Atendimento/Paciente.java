package lista6_7.Questao96Atendimento;

public class Paciente {

    private int rg;
    private int idade;
   

    public Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;

    }

    public int getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente:" + "RG: " + this.rg + ", Idade: " + this.idade;
    }
}
