package lista4.Livro63;

public class TesteLivro {

    public static void main(String[] args){
    Livro livro = new Livro("O Pequeno Príncipe", "Estrela", "Antonio", 1943);
    System.out.println(livro);


    LivroLivraria livroVenda = new LivroLivraria("Sitio do pica pau amarelo", "Coral", "Monteiro Lobato", 1920, 12, 15.00);
    System.out.println(livroVenda);
    livroVenda.vender(1);
    


    LivroBiblioteca livroBiblioteca =  new LivroBiblioteca("Dom Casmurro", "Record", "Machado de Assis", 1899, "2 andar - prateleira 3");
    System.out.println(livroBiblioteca);
    livroBiblioteca.emprestar();
    livroBiblioteca.devolver();
    
    }
}

/* RESPOSTA: 
 As classes LivroLivraria e LivroBiblioteca herdam da classe Livro, compartilhando os atributos título, autor, editora e ano, comuns a qualquer livro.
 
 A principal diferença entre elas está na finalidade:


 LivroLivraria representa livros destinados à venda

LivroBiblioteca representa livros para empréstimo.
 */