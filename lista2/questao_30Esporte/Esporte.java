package lista2.questao_30Esporte;

public class Esporte {
    String nomeTime;
    int numeroJogadores;
    int pontuacaoRanking;
    String nomeEsporte;

    Esporte(String nomeTime, int numeroJogadores, int pontuacaoRanking, String nomeEsporte) {
        this.nomeTime = nomeTime;
        this.numeroJogadores = numeroJogadores;
        this.pontuacaoRanking = pontuacaoRanking;
        this.nomeEsporte = nomeEsporte;
    }

    void imprimeEsporte() {
        System.out.println("Nome do time: " + nomeTime);
        System.out.println("Número de jogadores: " + numeroJogadores);
        System.out.println("Pontuação no ranking: " + pontuacaoRanking);
        System.out.println("Nome do esporte: " + nomeEsporte);
        
    }

    void saberRanking() {
        if(pontuacaoRanking <= 100){
            System.out.println("O time " + nomeTime + " está no Ranking C com " + pontuacaoRanking + " pontos.");
        }else if (pontuacaoRanking > 100 && pontuacaoRanking <= 500) {
            System.out.println("O time " + nomeTime + " está no Ranking B com " + pontuacaoRanking + " pontos.");
        } else{
            System.out.println("O time " + nomeTime + " está no Ranking A com " + pontuacaoRanking + " pontos.");
        }
    
    }

    void atualizarRanking(int novaPontuacao) {
        this.pontuacaoRanking = novaPontuacao;
        System.out.println("A pontuação do time " + nomeTime + " foi atualizada para: " + pontuacaoRanking);
      
    }


}
