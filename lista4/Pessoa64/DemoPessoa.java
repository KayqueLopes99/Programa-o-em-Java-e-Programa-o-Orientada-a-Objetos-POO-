package lista4.Pessoa64;

public class DemoPessoa {
    public static void main(String[] args){
        Prefeito prefeito = new Prefeito("Rai", 45, "Partido x", "Natal");

        Governador governador = new Governador("Maria", 35, "Partido y", "São Paulo");
        
        Politico politico = new Politico("Kaio", 35, "Vermelho");

        System.out.println(prefeito);
        System.out.println(governador);
        System.out.println(politico);
    }
}
