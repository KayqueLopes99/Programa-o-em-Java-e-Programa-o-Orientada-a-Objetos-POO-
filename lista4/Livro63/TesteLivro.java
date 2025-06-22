package lista4.Livro63;

public class TesteLivro {

    public static void main(String[] args){
    Livro livro = new Livro("O Pequeno Príncipe", "Antoine", 1943);
    System.out.println(livro);


    LivroLivraria livroVenda = new LivroLivraria("Sitio do pica pau amarelo", "Monteiro Lobato", 1920, 12, 15.00);
    System.out.println(livroVenda);
    livroVenda.vender(1);


    LivroBiblioteca livroBiblioteca =  new LivroBiblioteca("Dom Casmurro", "Machado de Assis", 1899, "romance");
    livroBiblioteca.emprestar();
    livroBiblioteca.devolver();
    System.out.println(livroBiblioteca);
    }
}

/* RESPOSTA: 
 As classes LivroLivraria e LivroBiblioteca herdam da classe Livro, compartilhando os atributos título, autor e ano, comuns a qualquer livro.
 
 A principal diferença entre elas está na finalidade:


 LivroLivraria representa livros destinados à venda, possuindo os atributos específicos preço e estoque, realizando a venda do livro.

LivroBiblioteca representa livros para empréstimo, com os atributos gênero e emprestado, realizando o emprestimo e devolução do livro.
 */