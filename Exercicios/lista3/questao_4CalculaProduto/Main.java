package lista3.questao_4CalculaProduto;

public class Main {
    public static void main(String[] args) {

        CalculaProduto calculaProdutos = new CalculaProduto();

        System.out.println("--- Testes do Método Produto ---");

        int prod1 = calculaProdutos.produto();
        System.out.println("Produto de nenhum número: " + prod1);

        int prod2 = calculaProdutos.produto(5, 10, 10, 10);
        System.out.println("Produto: " + prod2);

        int prod3 = calculaProdutos.produto(2, 3, 4);
        System.out.println("Produto: " + prod3);
    }
}
