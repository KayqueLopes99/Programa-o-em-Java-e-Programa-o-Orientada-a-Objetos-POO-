package lista5.questao_75_Biblioteca;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca("Sitio do pica pau amarelo", "Monteiro Lobato", 600, 1920, "corredor 2, prateleira D");

        System.out.println(livro);
        System.out.println("Autor do livro: " + livro.qualAutor());
        System.out.println("Descrição: " + livro.descricao());

        System.out.println("EMPRESTANDO O LIVRO");
        livro.empresta();
        System.out.println("DEVOLVENDO O LIVRO");
        livro.devolve();
    

        System.out.println("Prazo máximo de empréstimo: " + ItemDeBiblioteca.maximoDeDiasParaEmprestimo + " dias.");

    }
}
