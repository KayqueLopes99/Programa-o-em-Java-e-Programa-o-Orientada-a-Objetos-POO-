package lista4.Livro63;

public class TesteLivro {

    public static void main(String[] args){
    LivroLivraria livroVenda = new LivroLivraria("Sitio do pica pau amarelo", "Monteiro Lobato", 1920, 12, 15.00);

    System.out.println(livroVenda);

    LivroBiblioteca livroBiblioteca =  new LivroBiblioteca("Dom Casmurro", "Machado de Assis", 1899, "romance", true);
    System.out.println(livroBiblioteca);
    }
}

/* RESPOSTA: 
 As classes LivroLivraria e LivroBiblioteca herdam da classe Livro, compartilhando os atributos título, autor e ano, comuns a qualquer livro.
 
 A principal diferença entre elas está na finalidade:


 LivroLivraria representa livros destinados à venda, possuindo os atributos específicos preço e estoque.

LivroBiblioteca representa livros para empréstimo, com os atributos gênero e emprestado.
 */