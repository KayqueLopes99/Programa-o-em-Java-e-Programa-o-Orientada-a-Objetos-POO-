package lista2.questao_32Aluno;

public class Aluno {
    int matricula;
    String nome;
    double notaProva1, notaProva2, notaTrabalho;


    
    Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;

    }

    double calculaMedia() {
        double mediaParcial = ((2.5 * notaProva1) + (2.5 * notaProva2) + (2 * notaTrabalho)) / 7;

        return mediaParcial;
    }

    double notaExameFinal() {
        double mp = calculaMedia();
        if (mp < 3 || mp >= 7) {
            return 0.0;
        }
            return (50 - 6 * mp) / 4;
    }

    void imprimeDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota da Primeira Prova: " + notaProva1);
        System.out.println("Nota da Segunda Prova: " + notaProva2);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.printf("Média Parcial: %.2f\n", calculaMedia());

        double ef = notaExameFinal();
        if (ef == 0.0) {
            System.out.println("Dispensado do exame final.");
        } else {
            System.out.printf("Necessita tirar %.2f no exame final para ser aprovado.\n", ef);
        }
    }
}
