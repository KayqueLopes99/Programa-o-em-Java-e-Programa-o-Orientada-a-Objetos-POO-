package lista2.questao_39NumeroComplexo;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    public NumeroComplexo(double real) {
        this.parteReal = real;
        this.parteImaginaria = 0;
    }

    public NumeroComplexo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    public String toString() {
        if (parteImaginaria == 0) {
            return parteReal + "";
        } else if (parteReal == 0) {
            return parteImaginaria + "i";
        } else if (parteImaginaria < 0) {
            return parteReal + " - " + (parteImaginaria * -1) + "i";
        } else {
            return parteReal + " + " + parteImaginaria + "i";

        }

    }

}
