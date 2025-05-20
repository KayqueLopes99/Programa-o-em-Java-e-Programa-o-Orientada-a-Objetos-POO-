package Disciplina.codes.Classes.Pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kayque", 1.75);
        System.out.println(pessoa.getNome());

        pessoa.setNome("Samuel");
        System.out.println(pessoa.getNome());

        System.out.println(pessoa);
        System.out.println(pessoa.toString());

    }
}
