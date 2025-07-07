package lista3.questao_2Matriz;

public class Matriz {
    private float matriz[][];

    public Matriz(float elemento1, float elemento2, float elemento3, float elemento4) {
        this.matriz = new float[2][2];
        this.matriz[0][0] = elemento1;
        this.matriz[0][1] = elemento2;
        this.matriz[1][0] = elemento3;
        this.matriz[1][1] = elemento4;

    }

    public void calculaDeterminate(){
        float determinante = (this.matriz[0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]);
        System.out.println("Determinante: " + determinante);
        
    }

    public void imprimeMatriz(){
        System.out.println("Matriz:");
        // this.matriz.length retorna o número total de linhas da matriz.
        for (int l = 0; l < this.matriz.length; l++) {
            // this.matriz[l].length retorna o número total de colunas para aquela linha específica.
            for (int c = 0; c < this.matriz[l].length; c++) {
                System.out.print("["+this.matriz[l][c] + "]" + " ");
            }
            System.out.println();
        }
    }

}
