package lista4.Funcionario65;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000);
        System.out.println(funcionario);

        Assistente assistente = new Assistente("Maria", 2500, "12345");
        assistente.aumentaSalario(200);
        System.out.println(assistente);

        Tecnico tecnico = new Tecnico("Carlos", 4000, "12345", 300);
        System.out.println(tecnico);

        Administrativo administrativo = new Administrativo("Ana", 3500, "12345", "noite", 200);
        System.out.println(administrativo);

    }
}
