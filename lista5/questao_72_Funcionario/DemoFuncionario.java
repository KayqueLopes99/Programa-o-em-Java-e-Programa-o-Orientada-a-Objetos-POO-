package lista5.questao_72_Funcionario;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Lucas", "Desenvolvedor", "TI", 1500);
        Funcionario funcionario2 = new Funcionario("Pedro");

        System.out.println(funcionario1.getNome());
        funcionario1.setNome("Kayque");

        System.out.println(funcionario1.getSalarioPorHora());

        funcionario1.setSalarioPorHora(1600);
        funcionario1.registrarHoras(4);
        System.out.println(funcionario1);
        

        funcionario2.setSalarioPorHora(1200);
        funcionario2.registrarHoras(4);
        System.out.println(funcionario2);

    }
}
