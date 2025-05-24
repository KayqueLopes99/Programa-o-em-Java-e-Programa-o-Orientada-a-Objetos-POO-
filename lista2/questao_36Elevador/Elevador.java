package lista2.questao_36Elevador;

public class Elevador {
    private int numeroAndar;
    private int totalAndares;
    private int capacidadeDoElevador;
    private int quantidadeDePessoas;

    public Elevador(int totalAndares, int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.totalAndares = totalAndares;
        this.numeroAndar = 0;
        this.quantidadeDePessoas = 0;
    }

    public void entrada() {
        if (quantidadeDePessoas < capacidadeDoElevador) {
            quantidadeDePessoas++;
            System.out.println(
                    "Uma Pessoa Entrou no Elevador!\nQuantidade de Pessoas no Elevador: " + quantidadeDePessoas);
        } else {
            System.out.println("Elevador está cheio!");
        }
    }

    public void sai() {
        if (quantidadeDePessoas > 0) {
            quantidadeDePessoas--;
            System.out.println(
                    "Uma Pessoa Saiu no Elevador! \nQuantidade de Pessoas no Elevador: " + quantidadeDePessoas);
        } else {
            System.out.println("Elevador está vazio!");
        }
    }

    public void sobe() {
        if (numeroAndar <= totalAndares) {
            numeroAndar++;
            System.out.println("Subindo!\nAndar N* " + numeroAndar);
            

        } else {
            System.out.println("Elevador já está no último andar!");
        }

    }

    public void desce() {
        if (numeroAndar != 0 && numeroAndar <= totalAndares) {
            numeroAndar--;
            System.out.println("Descendo!\nAndar N* " + numeroAndar);
            
        } else {
            System.out.println("Elevador já está no térreo!");
        }

    }
}
