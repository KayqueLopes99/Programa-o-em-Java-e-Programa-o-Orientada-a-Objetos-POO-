package lista3.questao_2Matriz;

public class Main {
    public static void main( String[] args){
        // f -> DEPOIS DE 2.5 REPRESENTA FLOAT
        Matriz matriz1 = new Matriz(2.5f, 2.5f, 2.5f, 1.5f);
        matriz1.imprimeMatriz();
        matriz1.calculaDeterminate();
    }
}
