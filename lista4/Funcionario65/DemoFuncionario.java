package lista4.Funcionario65;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000.00);
        System.out.println(funcionario);

        Assistente assistente = new Assistente("Maria", 2500.5, "12345");
        assistente.aumentaSalario(200);
        System.out.println(assistente);

        Tecnico tecnico = new Tecnico("Carlos", 4000.5, "12345", 300.5);
        System.out.println(tecnico);

        Administrativo administrativo1 = new Administrativo("Ana", 3500.5, "12345", "noite", 200);
        System.out.println(administrativo1);

        Administrativo administrativo2 = new Administrativo("Paula", 3500.5, "44444", "dia", 200);
        System.out.println(administrativo2);

    }
}
