package Disciplina.codes.Heranca.concessionaria;

public class DemoAutomovel {
    public static void main(String[] args) {
        AutomovelLuxo automovelLuxo = new AutomovelLuxo(2023, "Ferrari", "Vermelho", true, true, true, true);

        System.out.println(automovelLuxo);
        System.out.println("Custo: " + automovelLuxo.quantoCusta());
    }
}
