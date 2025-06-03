package Disciplina.codes.Array.Aula_02Tabuleiro;

public class Tabuleiro {
    private char tabuleiro[][];
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;

    public Tabuleiro() {
        tabuleiro = new char[LINHAS][COLUNAS];
        // tabuleiro.length no 1 laço é o número de linhas
        // ta
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = '.';
            }
        }
    }


    public String toString(){
        String rep = "";
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                rep += tabuleiro[l][c] + " ";
            }
            rep += "\n";
        }
        return rep;
    }

}
